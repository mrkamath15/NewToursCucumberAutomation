package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnderConstructionPage extends BasePage{

    @FindBy(xpath = "//img[@src='images/mast_construction.gif']")
    private WebElement underConstruction_banner;

    @FindBy(xpath = "//img[@src='images/home.gif']")
    private WebElement backToHome_link;

    public boolean isUnderConstructionBannerDisplayed() {
        return waitUntilWebElementIsVisible(underConstruction_banner);
    }

    public boolean isBackToHomeLinkDisplayed() {
        return waitUntilWebElementIsVisible(backToHome_link);
    }
}
