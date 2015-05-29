package workspace;
import org.openqa.selenium.By;

public interface Locators {;
    By LOGIN = By.id("mailbox__login");
    By PASSWORD = By.id("mailbox__password");
    By AUTH_BUTTON = By.id("mailbox__auth__button");
    By LETTER_LINK = By.cssSelector(".js-href.b-datalist__item__link");
    By AVATAR = By.cssSelector(".b-letter__head__avatar.js-contact-informer");
    By REGISTRATION_BUTTON = By.className("mailbox__register__link");
    By FIRST_NAME = By.cssSelector(".qc-firstname-row input");
    By LAST_NAME = By.cssSelector(".qc-lastname-row input");
    By DAY_OF_BIRTH = By.className("qc-select-day");
    By MONTH_OF_BIRTH = By.className("qc-select-month");
    By YEAR_OF_BIRTH = By.className("qc-select-year");
    By MALE_RADIO_BUTTON = By.id("man1");
    By EMAIL_ADDRESS = By.cssSelector("input[class*=\"inPut fll\"]");
    By REGISTER_BUTTON = By.className("btn_signup");
    By CAPTCHA_LABEL = By.xpath("//div[@class='is-captcha_in']//div[contains(text(), '¬ведите код на картинке')]");
    By ELEMENT = By.className("b-letter__head__avatar js-contact-informer");
    By PASSWORD_FIELD = By.cssSelector(".qc-pass-row input");
    By REPEATEDPASSWORD = By.cssSelector("./*qc-passverify-row input*/");
    By COUNTRY = By.id("country_ver");
}
