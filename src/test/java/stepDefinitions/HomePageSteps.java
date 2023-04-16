package stepDefinitions;

import io.cucumber.java.en.When;
import utils.DriverFactory;

public class HomePageSteps extends DriverFactory {

    @When("user clicks on sign-on link")
    public void user_clicks_on_sign_on_link() {
        homePage.clickSignOnLink();
    }
}
