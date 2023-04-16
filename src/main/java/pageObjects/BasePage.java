package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
            System.out.println("Element is visible : " + element.toString());
            return true;
        }
        catch (Exception e) {
            System.out.println("Element is not visible : " + element.toString());
            Assert.fail("Element not visible exception: " + e.getMessage());
            return false;
        }
    }

    public void waitAndSendTextToWebElement(WebElement element, String text) {
        try {
            waitUntilWebElementIsVisible(element);
            element.click();
            element.sendKeys(text);
            System.out.println("Successfully sent text: " + text + ", to element: " + element.toString());
        }
        catch (Exception e) {
            System.out.println("Unable to send text: " + text + ", to element: " + element.toString());
            Assert.fail("Unable to send text to web element exception, " + element.getText());
        }
    }

    public void waitAndClickWebElement(WebElement element) {
        boolean clicked = false;
        int count = 0;
        try {
            while (count < 5 && !clicked) {
                waitUntilWebElementIsVisible(element);
                element.click();
                clicked = true;
                System.out.println("Successfully clicked the web element: " + element.toString());
            }
        }
        catch (Exception e) {
            clicked = false;
            System.out.println("Unable to click the web element: " + element.toString());
            Assert.fail("Unable to click the web element exception, " + e.getMessage());
        }
    }

    public String getTextFromWebElement(WebElement element) {
        try {
            waitUntilWebElementIsVisible(element);
            System.out.println("Successfully retrieved the text from element: " + element.toString());
            return element.getText();
        }
        catch (Exception e) {
            System.out.println("Unable to retrieve the text from element: " + element.toString());
            Assert.fail("Unable to retrieve the text from element exception, " + e.getMessage());
            return null;
        }
    }

    public String getCurrentUrl() {
        String url = null;
        try {
            url = driver.getCurrentUrl();
            System.out.println("Successfully retrieved the current URL");
            return url;
        }
        catch (Exception e) {
            System.out.println("Unable to retrieve the URL");
            Assert.fail("Unable to retrieve the URL exception, " + e.getMessage());
            return url;
        }
    }

    public void waitAndSwitchToFrameByWebElement(WebElement element) {
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
            System.out.println("Successfully switched frame by web element: " + element.toString());
        }
        catch (Exception e) {
            System.out.println("Unable to switch to frame by web element exception, " + e.getMessage());
        }
    }
}