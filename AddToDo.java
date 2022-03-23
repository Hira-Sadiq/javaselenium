package de.check24.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import de.check24.pageobjects.TodosPage;
import de.check24.utilities.BaseTest;

public class AddToDo extends BaseTest {

    @Test(description = "Test to check the 'Add To Do' functionality.")
    public void verifyAddTodoFunctionality() {

        WebDriver driver = getDriverInstance();

        log.info("Adding 4 todos");
        TodosPage angularJsPage = new TodosPage(driver)
                .enterTodo("KFZ")
                .enterTodo("Baufi")
                .enterTodo("Kredite")
                .enterTodo("Reise");

        log.info("Asserting 4 todos on my list");
        Assert.assertTrue(angularJsPage.seeNumberOfTodos() == 4);

        log.info("Asserting todods count");
        Assert.assertTrue(angularJsPage.getCountTodos() == 4);
    }
}
