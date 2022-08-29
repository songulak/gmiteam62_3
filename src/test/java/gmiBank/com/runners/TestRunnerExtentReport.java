
package gmiBank.com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "summary"},
        features = "src/test/resources/features",
        glue = "src/test/java/gmiBank/com/stepdefinitions",

        tags = "@token",

        dryRun = true,
        stepNotifications = true, // to see report gherkin step level
        monochrome = false, // outputların daha okunabilir olması ıcın
        publish = false  // it is to get online report
)
public class TestRunnerExtentReport {
}