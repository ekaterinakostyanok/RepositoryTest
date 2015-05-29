package workspace;

/**
 * Created by kostyanok on 25.05.2015.
 */
public class RegistrationPage {
    private TextInput firstNameInput = new TextInput(Locators.FIRST_NAME);
    private TextInput lastNameInput = new TextInput(Locators.LAST_NAME);
    private Dropdown dayOfBirthSelect = new Dropdown(Locators.DAY_OF_BIRTH);
    private Dropdown monthOfBirthSelect = new Dropdown(Locators.MONTH_OF_BIRTH);
    private Dropdown yearOfBirthSelect = new Dropdown(Locators.YEAR_OF_BIRTH);
    private RadioButton maleRadioButton = new RadioButton(Locators.MALE_RADIO_BUTTON);
    private TextInput emailAddressInput = new TextInput(Locators.EMAIL_ADDRESS);
    private Button registerButton = new Button(Locators.REGISTER_BUTTON);
    private Button registered = new Button(Locators.CAPTCHA_LABEL);
    private TextInput passwordInput = new TextInput(Locators.PASSWORD_FIELD);
    private TextInput repeatedPassword = new TextInput(Locators.REPEATEDPASSWORD);
    private String randomPassword;
    private Dropdown countrySelect = new Dropdown(Locators.COUNTRY);

    public RegistrationPage fillRegistrationForm(RegistrationData data) throws InterruptedException {
        firstNameInput.sendKeys(data.getFirstName());
        lastNameInput.sendKeys(data.getLastName());
        dayOfBirthSelect.select(data.getDayOfBirth());
        monthOfBirthSelect.select(data.getDayOfBirth());
        yearOfBirthSelect.select(data.getDayOfBirth());
        maleRadioButton.click();
        emailAddressInput.sendKeys(data.getEmail());
        randomPassword = data.getPassword();
        passwordInput.sendKeys(randomPassword);
        repeatedPassword.sendKeys(randomPassword);
        countrySelect.select(data.getCountry());
        return this;
        }

    public RegistrationPage clickReady(){
        registerButton.click();
        return this;
        }

//    public boolean isCaptchaPresent(){
//        return registered.getText().equals("¬ведите код на картинке");
//        }

}
