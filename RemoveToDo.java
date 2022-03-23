package de.check24.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import de.check24.pageobjects.TodosPage;
import de.check24.utilities.BaseTest;

public class RemoveToDo extends BaseTest {

    @Test(description = "Test to check the 'Remove To Do' functionality.")
    public void verifyRemoveTodoFunctionality() {

        WebDriver driver = getDriverInstance();

        log.info("Adding 4 todos");
        TodosPage angularJsPage = new TodosPage(driver)
                .enterTodo("foo")
                .enterTodo("bar")
                .enterTodo("baz")
                .enterTodo("Focus Group");

        log.info("Deleting todos # 2 from my list");
        angularJsPage.deleteNthTodo(2);

        log.info("Asserting 3 todos are visible after deleting one");
        Assert.assertTrue(angularJsPage.seeNumberOfTodos() == 3);

        log.info("Asserting todods count which is now 3");
        Assert.assertTrue(angularJsPage.getCountTodos() == 3);
    }
}
