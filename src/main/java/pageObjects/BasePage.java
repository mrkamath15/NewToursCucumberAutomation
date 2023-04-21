package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.DriverFactory;

public class BasePage extends DriverFactory {
    private WebDriverWait wait;
    private JavascriptExecutor jsScript;

    public BasePage() {
        wait = new WebDriverWait(driver, 20);
        jsScript = ((JavascriptExecutor) driver);
    }

    public boolean waitUntilWebElementIsVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            logger.info("Element is visible : " + element.toString());
            return true;
        }
        catch (Exception e) {
            logger.error("Element is not visible : " + element.toString());
            logger.debug("Exception: " + e.getMessage());
            Assert.fail("Element not visible exception: " + e.getMessage());
            return false;
        }
    }

    public void waitUntilWebElementIsVisibleNoAssert(WebElement element) {
            wait.until(ExpectedConditions.visibilityOf(element));
            logger.info("Element is visible : " + element.toString());
    }

    public void waitAndSendTextToWebElement(WebElement element, String text) {
        try {
            waitUntilWebElementIsVisible(element);
            element.click();
            element.sendKeys(text);
            logger.info("Successfully sent text: " + text + ", to element: " + element.toString());
        }
        catch (Exception e) {
            logger.error("Unable to send text: " + text + ", to element: " + element.toString());
            logger.debug("Exception: " + e.getMessage());
            Assert.fail("Unable to send text to web element exception, " + element.getText());
        }
    }

    public void waitAndClickWebElement(WebElement element) {
        boolean clicked = false;
        int count = 0;
        try {
            while (count < 2 && !clicked) {
                waitUntilWebElementIsVisible(element);
                element.click();
                clicked = true;
                logger.info("Successfully clicked the web element: " + element.toString());
                count++;
            }
        }
        catch (Exception e) {
            clicked = false;
            logger.error("Unable to click the web element: " + element.toString());
            logger.debug("Exception: " + e.getMessage());
            Assert.fail("Unable to click the web element exception, " + e.getMessage());
        }
    }

    public void waitAndClickWebElementNoAssert(WebElement element) {
        boolean clicked = false;
        int count = 0;
            while (count < 1 && !clicked) {
                waitUntilWebElementIsVisibleNoAssert(element);
                element.click();
                clicked = true;
                logger.info("Successfully clicked the web element: " + element.toString());
                count++;
            }
        }

    public String getTextFromWebElement(WebElement element) {
        try {
            waitUntilWebElementIsVisible(element);
            logger.info("Successfully retrieved the text from element: " + element.toString());
            return element.getText();
        }
        catch (Exception e) {
            logger.error("Unable to retrieve the text from element: " + element.toString());
            logger.debug("Exception: " + e.getMessage());
            Assert.fail("Unable to retrieve the text from element exception, " + e.getMessage());
            return null;
        }
    }

    public String getCurrentUrl() {
        String url = null;
        try {
            url = driver.getCurrentUrl();
            logger.info("Successfully retrieved the current URL");
            return url;
        }
        catch (Exception e) {
            logger.error("Unable to retrieve the URL");
            logger.debug("Exception: " + e.getMessage());
            Assert.fail("Unable to retrieve the URL exception, " + e.getMessage());
            return url;
        }
    }

    public void waitAndSwitchToFrameByWebElement(WebElement element) {
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
            logger.info("Successfully switched frame by web element: " + element.toString());
        }
        catch (Exception e) {
            logger.error("Unable to switch to frame by web element exception, " + e.getMessage());
            logger.debug("Exception: " + e.getMessage());
        }
    }

    public void waitAndSelectByVisibleText(WebElement element, String visibleText) {
        try {
            waitUntilWebElementIsVisible(element);
            Select select = new Select(element);
            select.selectByVisibleText(visibleText);
            logger.info("Successfully selected drop down value: " + visibleText + " from web element : " + element.toString());
        }
        catch (Exception e) {
            logger.error("Unable to select drop down value: " + visibleText + " from web element : " + element.toString());
            logger.debug("Exception: " + e.getMessage());
            Assert.fail("Unable to select drop down value exception: " + e.getMessage());
        }
    }
}