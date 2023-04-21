package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {

    @Before
    public void setUp(Scenario scenario) {
        logger.info("Running the scenario: " + scenario.getName());
        driver = getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            logger.error("Scenario Failed: " + scenario.getName());
        }
        else {
            logger.info("Scenario Passed: " + scenario.getName());
        }
        scenario.attach(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
        driver.quit();
        logger.info("Close the browser successfully");
        logger.info("======================================================================");
    }
}
