package workspace;

import org.openqa.selenium.WebElement;

/**
 * Created by kostyanok on 27.04.2015.
 */
public class Methods extends ConfigurationManager {
    public static boolean checkThatElementPresent(){
        WebElement checkedElement = null;
        try {
           checkedElement = driver.findElement(Locators.ELEMENT);

        }catch ( NullPointerException e){
        }
        return checkedElement.isDisplayed();
    }

}
