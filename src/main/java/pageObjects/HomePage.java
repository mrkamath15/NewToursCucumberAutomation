package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(linkText = "SIGN-ON")
    private WebElement signOn_Link;

    @FindBy(xpath = "//iframe[contains(@name,'google_ads_iframe')]")
    private WebElement advertisement_frame;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    private WebElement closeAd_button;

    public void clickSignOnLink() {
        waitAndClickWebElement(signOn_Link);
        handleAd();
    }

    public void handleAd() {
        if(driver.getCurrentUrl().endsWith("google_vignette")) {
            waitAndSwitchToFrameByWebElement(advertisement_frame);
            waitAndClickWebElement(closeAd_button);
        }
    }
}
