package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import workspace.Locators;
import workspace.Methods;
import workspace.SeleniumInit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by kostyanok on 24.04.2015.
 */
public class Tests extends SeleniumInit{


    @Test
    public void login(){
        WebElement emailField = driver.findElement(Locators.LOGIN);
        WebElement passwordField = driver.findElement(Locators.PASSWORDFIELD);
        WebElement loginButton = driver.findElement(Locators.AUTH_BUTTON);
        emailField.sendKeys(Locators.USERNAME);
        passwordField.sendKeys(Locators.PASSWORD);
        loginButton.click();
    }
    @Test
    public void openEmail() throws InterruptedException {
        Thread.sleep(1000);
        WebElement email = driver.findElement(Locators.MAIL);
        email.click();
        Thread.sleep(500);
        assertEquals(driver.getTitle(), "Spring");
    }
    @Test
    public void checkElement() throws InterruptedException {
        Thread.sleep(1000);
        boolean isDisplayed;
        isDisplayed = Methods.checkThatElementPresent();
        Assert.assertTrue(isDisplayed);
    }
}
