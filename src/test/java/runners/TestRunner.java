package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {".//src//test//resources//features"},
        glue = {"stepDefinitions"},
        dryRun = true,
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}