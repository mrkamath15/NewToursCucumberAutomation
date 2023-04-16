package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.DriverFactory;

public class UnderConstructionSteps extends DriverFactory {

    @Then("under construction page is displayed")
    public void under_construction_page_is_displayed() {
        Assert.assertTrue(underConstructionPage.isUnderConstructionBannerDisplayed(), "Under Construction Banner NOT displayed");
        Assert.assertTrue(underConstructionPage.isBackToHomeLinkDisplayed(), "Back to Home link NOT displayed");
    }
}
