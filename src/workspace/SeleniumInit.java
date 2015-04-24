package workspace;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by kostyanok on 24.04.2015.
 */
public class SeleniumInit {
    public FirefoxDriver driver;


    @Before
    public void setupAndLogin() {
        driver = new FirefoxDriver();
        driver.get("https://mail.ru/");
        driver.manage().window().maximize();
        WebElement emailField = driver.findElement(By.name("Login"));
        WebElement passwordField = driver.findElement(By.name("Password"));
        WebElement loginButton = driver.findElement(By.className("mailbox__auth__button"));
        emailField.sendKeys("kate4130");
        passwordField.sendKeys("18h262fq");
        loginButton.click();
    }

    @After
    public void tearDown() {

        driver.quit();
    }
}
