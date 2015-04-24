package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import workspace.SeleniumInit;

/**
 * Created by kostyanok on 24.04.2015.
 */
public class Tests extends SeleniumInit {

    @Test
    public void openEmail() throws InterruptedException {
        Thread.sleep(1000);
        WebElement firstEmail = driver.findElement(By.xpath("//div[@class='b-datalist__item__subj'][contains(text(),'Spring')]"));
        firstEmail.click();
        Thread.sleep(500);
    }
}
