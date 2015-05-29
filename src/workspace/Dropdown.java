package workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.lang.String;

/**
 * Created by kostyanok on 25.05.2015.
 */
public class Dropdown extends Element{
        Select clickThis;
        public Dropdown(By by){

                this.by = by;
                clickThis = new Select(element());

        }

        public void select(int value) {
                clickThis.selectByIndex(value);
        }
}
