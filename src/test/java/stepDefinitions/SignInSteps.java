package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.DriverFactory;

public class SignInSteps extends DriverFactory {

    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        driver.get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        signInModule.enterUsername(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        signInModule.enterPassword(password);
    }
    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        signInModule.clickSubmitButton();
    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        Assert.assertTrue(signInSuccessPage.isLoginSuccessLabelDisplayed(), "Login success label NOT displayed");
    }

    @Then("validation message {string} is returned")
    public void validation_message_is_returned(String message) {
        Assert.assertEquals(signInModule.getLoginErrorMessage(), message);
    }
}
