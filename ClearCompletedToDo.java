package de.check24.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import de.check24.pageobjects.TodosPage;
import de.check24.utilities.BaseTest;

public class ClearCompletedToDo extends BaseTest {

    @Test(description = "Test to check the 'Clear Completed' functionality.")
    public void verifyClearCompletedFunctionality() {

        WebDriver driver = getDriverInstance();

        log.info("Adding 6 todos");
        TodosPage todosPage = new TodosPage(driver)
                .enterTodo("KFZ")
                .enterTodo("Baufi")
                .enterTodo("Reise")
                .enterTodo("Kredite");

        log.info("Selecting todos # 4 from my list");
        todosPage.selectNthTodo(2).selectNthTodo(3);

        log.info("Clicking option 'Completed' and asserting count");
        todosPage.clearCompleted().filterCompleted();
        Assert.assertTrue(todosPage.getCountTodos() == 3, "Expecting count 3 but actual is 2.");
    }
}
