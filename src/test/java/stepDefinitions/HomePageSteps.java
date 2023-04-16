package stepDefinitions;

import io.cucumber.java.en.When;
import utils.DriverFactory;

public class HomePageSteps extends DriverFactory {

    @When("user clicks on sign-on link")
    public void user_clicks_on_sign_on_link() {
        homePage.clickSignOnLink();
    }

    @When("user clicks on support link")
    public void user_clicks_on_support_link() {
        homePage.clickSupportLink();
    }

    @When("user clicks on contact link")
    public void user_clicks_on_contact_link() {
        homePage.clickContactLink();
    }

    @When("user clicks on hotels link")
    public void user_clicks_on_hotels_link() {
        homePage.clickHotelsLink();
    }

    @When("user clicks on car rentals link")
    public void user_clicks_on_car_rentals_link() {
        homePage.clickCarRentalsLink();
    }

    @When("user clicks on destinations link")
    public void user_clicks_on_destinations_link() {
        homePage.clickDestinationsLink();
    }

    @When("user clicks on vacations link")
    public void user_clicks_on_vacations_link() {
        homePage.clickVacationsLink();
    }
}
