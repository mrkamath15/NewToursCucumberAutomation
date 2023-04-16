package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInSuccessPage extends BasePage {
    @FindBy(xpath = "//h3[text()='Login Successfully']")
    private WebElement loginSuccess_label;

    public boolean isLoginSuccessLabelDisplayed() {
        return waitUntilWebElementIsVisible(loginSuccess_label);
    }

}
