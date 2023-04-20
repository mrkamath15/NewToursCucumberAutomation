package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsResultPage extends BasePage{
    @FindBy(xpath = "//*[text()[contains(.,'After flight finder - No Seats Avaialble')]]")
    private WebElement flightResults_label;

    public boolean isFlightResultsDisplayed() {
        return waitUntilWebElementIsVisible(flightResults_label);
    }
}
