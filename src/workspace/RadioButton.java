package workspace;

import org.openqa.selenium.By;

/**
 * Created by kostyanok on 25.05.2015.
 */
public class RadioButton extends Element{
public RadioButton(By by){
        this.by = by;
        }

public void click() {
        element().click();
        }
}