package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class RegisterPageSteps extends DriverFactory {
    @When("user enters first name {string}")
    public void user_enters_first_name(String firstName) {
        registerPage.enterFirstName(firstName);
    }

    @When("user enters last name {string}")
    public void user_enters_last_name(String lastName) {
        registerPage.enterLastName(lastName);
    }

    @When("user enters phone number {string}")
    public void user_enters_phone_number(String phone) {
        registerPage.enterPhoneNumber(phone);
    }

    @When("user enters email address {string}")
    public void user_enters_email_address(String email) {
        registerPage.enterEmailAddress(email);
    }

    @When("user enters address {string}")
    public void user_enters_address(String address) {
        registerPage.enterAddress(address);
    }

    @When("user enters city {string}")
    public void user_enters_city(String city) {
        registerPage.enterCity(city);
    }

    @When("user enters state {string}")
    public void user_enters_state(String state) {
        registerPage.enterState(state);
    }

    @When("user enters postal code {string}")
    public void user_enters_postal_code(String postalCode) {
        registerPage.enterPostalCode(postalCode);
    }

    @When("user selects country {string}")
    public void user_selects_country(String country) {
        registerPage.selectCountry(country);
    }

    @When("user enters registration username {string}")
    public void user_enters_registration_username(String username) {
        registerPage.enterUsername(username);
    }

    @When("user enters registration password {string}")
    public void user_enters_registration_password(String password) {
        registerPage.enterPassword(password);
    }

    @When("user enters registration confirm password {string}")
    public void user_enters_registration_confirm_password(String password) {
        registerPage.enterConfirmPassword(password);
    }

    @When("user clicks on submit registration")
    public void user_clicks_on_submit_registration() {
        registerPage.clickSubmitButton();
    }

    @Then("registration success page is displayed")
    public void registration_success_page_is_displayed() {

    }
}


