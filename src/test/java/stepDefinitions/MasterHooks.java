package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {

    @Before
    public void setUp() {
        driver = getDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
