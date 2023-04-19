package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(linkText = "SIGN-ON")
    private WebElement signOn_Link;

    @FindBy(linkText = "REGISTER")
    private WebElement register_Link;

    @FindBy(linkText = "SUPPORT")
    private WebElement support_Link;

    @FindBy(linkText = "CONTACT")
    private WebElement contact_Link;

    @FindBy(linkText = "Flights")
    private WebElement flights_Link;

    @FindBy(linkText = "Hotels")
    private WebElement hotels_Link;

    @FindBy(linkText = "Car Rentals")
    private WebElement carRentals_Link;

    @FindBy(linkText = "Cruises")
    private WebElement cruises_Link;

    @FindBy(linkText = "Destinations")
    private WebElement destinations_Link;

    @FindBy(linkText = "Vacations")
    private WebElement vacations_Link;

    @FindBy(xpath = "//iframe[contains(@name,'google_ads_iframe') or contains(@title,'3rd party ad content')]")
    private WebElement advertisement_frame;

    @FindBy(xpath = "//iframe[@id='ad_iframe']")
    private WebElement adInner_frame;

    @FindBy(xpath = "//*[@id='dismiss-button' or text()='Close']")
    private WebElement closeAd_button;

    public void clickSignOnLink() {
        waitAndClickWebElement(signOn_Link);
        handleAd();
    }

    public void clickRegisterLink() {
        waitAndClickWebElement(register_Link);
        handleAd();
    }

    public void clickSupportLink() {
        waitAndClickWebElement(support_Link);
        handleAd();
    }

    public void clickContactLink() {
        waitAndClickWebElement(contact_Link);
        handleAd();
    }

    public void clickFlightsLink() {
        waitAndClickWebElement(flights_Link);
        handleAd();
    }

    public void clickHotelsLink() {
        waitAndClickWebElement(hotels_Link);
        handleAd();
    }

    public void clickCarRentalsLink() {
        waitAndClickWebElement(carRentals_Link);
        handleAd();
    }

    public void clickCruisesLink() {
        waitAndClickWebElement(cruises_Link);
        handleAd();
    }

    public void clickDestinationsLink() {
        waitAndClickWebElement(destinations_Link);
        handleAd();
    }

    public void clickVacationsLink() {
        waitAndClickWebElement(vacations_Link);
        handleAd();
    }

    public void handleAd() {
        if(driver.getCurrentUrl().endsWith("google_vignette")) {
            waitAndSwitchToFrameByWebElement(advertisement_frame);
            try {
                waitAndClickWebElementNoAssert(closeAd_button);
            }
            catch (Exception e) {
                System.out.println("Unable to close Ad! Switching to Inner frame!!");
                waitAndSwitchToFrameByWebElement(adInner_frame);
                System.out.println("Switched to inner frame successfully");
                waitAndClickWebElementNoAssert(closeAd_button);
                System.out.println("Closed the ad!!!");
            }
        }
    }
}
