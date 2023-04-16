package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.SignInModule;
import pageObjects.SignInSuccessPage;


public class DriverFactory {
    public static WebDriver driver;
    public ConfigReader configReader;
    public static SignInModule signInModule;
    public static SignInSuccessPage signInSuccessPage;

    public DriverFactory() {
        configReader = new ConfigReader();
    }

    public WebDriver getDriver() {
        try {
            String browser = configReader.getBrowser().toUpperCase();
            switch (browser) {
                case "CHROME":
                    System.setProperty("webdriver.chrome.driver", configReader.getChromeDriverPath());
                    driver = new ChromeDriver();
                    break;
                case "IE":
                    System.setProperty("webdriver.ie.driver", configReader.getIEDriverPath());
                    driver = new InternetExplorerDriver();
                    break;
                case "FIREFOX":
                    System.setProperty("webdriver.gecko.driver", configReader.getFirefoxDriverPath());
                    driver = new FirefoxDriver();
                    break;
                default:
                    break;
            }
        }
        catch (Exception e) {
            System.out.println("Unable to set up driver: " + e.getMessage());
        }
        finally {
            driver.manage().window().maximize();
            signInModule = PageFactory.initElements(driver, SignInModule.class);
            signInSuccessPage = PageFactory.initElements(driver, SignInSuccessPage.class);
        }
        return driver;
    }
}
