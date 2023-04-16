package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInModule extends BasePage {
    @FindBy(xpath = "//input[@name='userName']")
    private WebElement username_textField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password_textField;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submit_button;

    @FindBy(xpath = "//input[@name='password']/following-sibling::span")
    private WebElement loginError_label;

    public void enterUsername(String username) {
        waitAndSendTextToWebElement(username_textField, username);
    }

    public void enterPassword(String password) {
        waitAndSendTextToWebElement(password_textField, password);
    }

    public void clickSubmitButton() {
        waitAndClickWebElement(submit_button);
    }

    public String getLoginErrorMessage() {
        return getTextFromWebElement(loginError_label);
    }
}
