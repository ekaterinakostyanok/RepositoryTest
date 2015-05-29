package workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by hp on 27.04.2015.
 */
public abstract class Element {
    protected By by;

    public WebElement element(){
        return ConfigurationManager.getDriver().findElement(by);
    }
}