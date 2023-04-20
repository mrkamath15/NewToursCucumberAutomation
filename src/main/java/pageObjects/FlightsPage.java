package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsPage extends BasePage {

    @FindBy(xpath = "//input[@value='roundtrip']")
    private WebElement roundTrip_radioButton;

    @FindBy(xpath = "//input[@value='oneway']")
    private WebElement oneWayTrip_radioButton;

    @FindBy(xpath = "//select[@name='passCount']")
    private WebElement passengers_dropDown;

    @FindBy(xpath = "//select[@name='fromPort']")
    private WebElement departingFrom_dropDown;

    @FindBy(xpath = "//select[@name='fromMonth']")
    private WebElement departingOnMonth_dropDown;

    @FindBy(xpath = "//select[@name='fromDay']")
    private WebElement departingOnDay_dropDown;

    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement arrivingIn_dropDown;

    @FindBy(xpath = "//select[@name='toMonth']")
    private WebElement returningOnMonth_dropDown;

    @FindBy(xpath = "//select[@name='toDay']")
    private WebElement returningOnDay_dropDown;

    @FindBy(xpath = "//input[@value='Coach']")
    private WebElement economyServiceClass_radioButton;

    @FindBy(xpath = "//input[@value='Business']")
    private WebElement businessServiceClass_radioButton;

    @FindBy(xpath = "//input[@value='First']")
    private WebElement firstServiceClass_radioButton;

    @FindBy(xpath = "//select[@name='airline']")
    private WebElement airline_dropDown;

    @FindBy(xpath = "//input[@name='findFlights']")
    private WebElement continue_button;

    public void selectTripTypeRoundTrip() {
        waitAndClickWebElement(roundTrip_radioButton);
    }

    public void selectTripTypeOneWayTrip() {
        waitAndClickWebElement(oneWayTrip_radioButton);
    }

    public void selectPassengerCount(String count) {
        waitAndSelectByVisibleText(passengers_dropDown, count);
    }

    public void selectDepartingFromCity(String from) {
        waitAndSelectByVisibleText(departingFrom_dropDown, from);
    }

    public void selectDepartingOnMonth(String month) {
        waitAndSelectByVisibleText(departingOnMonth_dropDown, month);
    }

    public void selectDepartingOnDay(String day) {
        waitAndSelectByVisibleText(departingOnDay_dropDown, day);
    }

    public void selectArrivingInCity(String to) {
        waitAndSelectByVisibleText(arrivingIn_dropDown, to);
    }

    public void selectReturningOnMonth(String month) {
        waitAndSelectByVisibleText(returningOnMonth_dropDown, month);
    }

    public void selectReturningOnDay(String day) {
        waitAndSelectByVisibleText(returningOnDay_dropDown, day);
    }

    public void selectEconomyServiceClass() {
        waitAndClickWebElement(economyServiceClass_radioButton);
    }

    public void selectBusinessServiceClass() {
        waitAndClickWebElement(businessServiceClass_radioButton);
    }

    public void selectFirstServiceClass() {
        waitAndClickWebElement(firstServiceClass_radioButton);
    }

    public void selectAirline(String airline) {
        waitAndSelectByVisibleText(airline_dropDown, airline);
    }

    public void clickContinueButton() {
        waitAndClickWebElement(continue_button);
    }
}
