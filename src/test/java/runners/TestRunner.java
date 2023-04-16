package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {".//src//test//resources//features"},
        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json", "junit:target/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
