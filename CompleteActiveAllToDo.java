package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import TodosPage;
import utilities.BaseTest;

public class CompleteActiveAllToDo extends BaseTest {

    @Test(description = "Test to check the 'Filter Active, All and Complete' functionality.")
    public void verifyCompleteActiveToDoCount() {

        WebDriver driver = getDriverInstance();

        log.info("Adding 6 todos");
        TodosPage angularJsPage = new TodosPage(driver)
                .enterTodo("Verischerungen")
                .enterTodo("KFZ")
                .enterTodo("Baufi")
                .enterTodo("Reise")
                .enterTodo("Focus Group")
                .enterTodo("Check24 Automation");

        log.info("Selecting todos # 4 from my list");
        angularJsPage.selectNthTodo(4).selectNthTodo(2);

        log.info("Clicking option 'Completed' and asserting count");
        angularJsPage.filterCompleted();
        Assert.assertTrue(angularJsPage.seeNumberOfTodos() == 2);
        Assert.assertTrue(angularJsPage.getCountTodos() == 4);

        log.info("Clicking option 'Active' and asserting count");
        angularJsPage.filterActive();
        Assert.assertTrue(angularJsPage.seeNumberOfTodos() == 4);
        Assert.assertTrue(angularJsPage.getCountTodos() == 4);

        log.info("Clicking option 'All' and asserting count");
        angularJsPage.filterAll();
        Assert.assertTrue(angularJsPage.seeNumberOfTodos() == 6);
        Assert.assertTrue(angularJsPage.getCountTodos() == 4);
    }
}
