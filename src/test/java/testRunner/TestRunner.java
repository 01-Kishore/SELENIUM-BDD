package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/featureFile/ZZ001_ParameterTypeLearning.feature",
        glue = {"stepDefinition"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/report.html"},
        monochrome = true
)

public class TestRunner {
}
