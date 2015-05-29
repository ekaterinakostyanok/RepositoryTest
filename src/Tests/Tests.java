package Tests;

import org.junit.Test;
import org.testng.annotations.Listeners;
import workspace.*;


/**
 * Created by kostyanok on 24.04.2015.
 */
@Listeners(CaptureScreenShotOnFailureListener.class)
public class Tests extends ConfigurationManager {


//    @Test
//    public void login(){
//        WebElement emailField = driver.findElement(Locators.LOGIN);
//        WebElement passwordField = driver.findElement(Locators.PASSWORD);
//        WebElement loginButton = driver.findElement(Locators.AUTH_BUTTON);
//        emailField.sendKeys(Locators.USERNAME);
//        passwordField.sendKeys(Locators.PASSWORD);
//        loginButton.click();
//    }
//    @Test
//    public void openEmail() throws InterruptedException {
//        Thread.sleep(1000);
//        WebElement email = driver.findElement(Locators.MAIL);
//        email.click();
//        Thread.sleep(500);
//        assertEquals(driver.getTitle(), "Spring");
//    }
//    @Test
//    public void checkElement() throws InterruptedException {
//        Thread.sleep(1000);
//        boolean isDisplayed;
//        isDisplayed = Methods.checkThatElementPresent();
//        Assert.assertTrue(isDisplayed);
//    }
//    @Test
//    public void testUntitled2() throws Exception {
//        //preparation
//        Data data = new Data();
//        LoginPage loginPage = new LoginPage();
//        //test
//        Inbox inbox = loginPage.fillInLoginField(data.getLogin())
//                .fillInPasswordField(data.getPassword())
//                .clickAuth();
//        assertTrue(inbox.isAvatarPresent());
//    }

    @Test
    public void registrationFrom() throws Exception{
        //preparation
        RegistrationData registrationData = new RegistrationData();
        LoginPage loginPage = new LoginPage();
        //test
        RegistrationPage registrationPage = loginPage.openRegistrationPage();
        registrationPage.fillRegistrationForm(registrationData);
        registrationPage.clickReady();
        //assertTrue(registrationPage.isCaptchaPresent());
    }
}
