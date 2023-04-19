package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterSuccessPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(), 'Thank you for registering')]")
    private WebElement registrationSuccess_label;

    public boolean isRegistrationSuccess() {
        return waitUntilWebElementIsVisible(registrationSuccess_label);
    }
}
