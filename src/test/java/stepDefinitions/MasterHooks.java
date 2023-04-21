package stepDefinitions;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {

    @BeforeAll
    public static void beforeAll() {
        logger.info("Automation test suite is started");
    }

    @AfterAll
    public static void afterAll() {
        logger.info("Completed running all the scenarios");
    }

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
