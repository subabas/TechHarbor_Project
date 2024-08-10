package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "feature",
        glue = "steps"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
