package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstName_textField;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastName_textField;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phone_textField;

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement email_textField;

    @FindBy(xpath = "//input[@name='address1']")
    private WebElement address_textField;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement city_textField;

    @FindBy(xpath = "//input[@name='state']")
    private WebElement state_textField;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement postalCode_textField;

    @FindBy(xpath = "//select[@name='country']")
    private WebElement country_dropdown;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement username_textField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password_textField;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    private WebElement confirmPassword_textField;

    @FindBy(name = "submit")
    private WebElement submit_button;

    public void enterFirstName(String firstName) {
        waitAndSendTextToWebElement(firstName_textField, firstName);
    }

    public void enterLastName(String lastName) {
        waitAndSendTextToWebElement(lastName_textField, lastName);
    }

    public void enterPhoneNumber(String phone) {
        waitAndSendTextToWebElement(phone_textField, phone);
    }

    public void enterEmailAddress(String email) {
        waitAndSendTextToWebElement(email_textField, email);
    }

    public void enterAddress(String address) {
        waitAndSendTextToWebElement(address_textField, address);
    }

    public void enterCity(String city) {
        waitAndSendTextToWebElement(city_textField, city);
    }

    public void enterState(String state) {
        waitAndSendTextToWebElement(state_textField, state);
    }

    public void enterPostalCode(String postalCode) {
        waitAndSendTextToWebElement(postalCode_textField, postalCode);
    }

    public void selectCountry(String country) {
        waitAndSelectByVisibleText(country_dropdown, country);
    }

    public void enterUsername(String username) {
        waitAndSendTextToWebElement(username_textField, username);
    }

    public void enterPassword(String password) {
        waitAndSendTextToWebElement(password_textField, password);
    }

    public void enterConfirmPassword(String password) {
        waitAndSendTextToWebElement(confirmPassword_textField, password);
    }

    public void clickSubmitButton() {
        waitAndClickWebElement(submit_button);
    }
}
