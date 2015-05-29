package workspace;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.fail;

public class Lesson2 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://mail.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@Test
    public void testUntitled() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("mailbox__login")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.id("mailbox__login")).clear();
        driver.findElement(By.id("mailbox__login")).sendKeys("dsgsdag");
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.id("mailbox__password")).clear();
        driver.findElement(By.id("mailbox__password")).sendKeys("fdgdg");
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.id("mailbox__auth__button")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
