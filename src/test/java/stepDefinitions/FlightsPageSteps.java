package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.DriverFactory;

public class FlightsPageSteps extends DriverFactory {

    @When("user selects trip type as round trip")
    public void user_selects_trip_type_as_round_trip() {
        flightsPage.selectTripTypeRoundTrip();
    }
    @When("user select {string} passengers")
    public void user_select_passengers(String count) {
        flightsPage.selectPassengerCount(count);
    }

    @When("user selects departing from as {string}")
    public void user_selects_departing_from_as(String city) {
        flightsPage.selectDepartingFromCity(city);
    }

    @When("user selects departing on month {string} and day {string}")
    public void user_selects_departing_on_month_and_day(String month, String day) {
        flightsPage.selectDepartingOnMonth(month);
        flightsPage.selectDepartingOnDay(day);
    }

    @When("user selects arriving in as {string}")
    public void user_selects_arriving_in_as(String city) {
        flightsPage.selectArrivingInCity(city);
    }

    @When("user selects returning on month {string} and day {string}")
    public void user_selects_returning_on_month_and_day(String month, String day) {
        flightsPage.selectReturningOnMonth(month);
        flightsPage.selectReturningOnDay(day);
    }

    @When("user selects service class as business class")
    public void user_selects_service_class_as_business_class() {
        flightsPage.selectBusinessServiceClass();
    }

    @When("user selects airline {string}")
    public void user_selects_airline(String airline) {
        flightsPage.selectAirline(airline);
    }

    @When("user clicks on continue button")
    public void user_clicks_on_continue_button() {
        flightsPage.clickContinueButton();
    }

    @Then("flights results page is displayed")
    public void flights_results_page_is_displayed() {
        Assert.assertTrue(flightsResultPage.isFlightResultsDisplayed(), "Flight Results Page not displayed");
    }
}
