package workspace;
import org.openqa.selenium.By;

public enum Locators {;
    public static By LOGIN = By.name("Login");
    public static By PASSWORDFIELD = By.name("Password");
    public static By AUTH_BUTTON = By.className("mailbox__auth__button");
    public static String USERNAME = "kate4130";
    public static String PASSWORD = "18h262fq";
    public static By MAIL = By.xpath("//div[@class='b-datalist__item__subj'][contains(text(),'Spring')]");
    public static By ELEMENT = By.className("b-letter__head__avatar js-contact-informer");
}
