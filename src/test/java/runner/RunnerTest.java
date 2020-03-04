package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = "src/test/java/features/Sprint12_Escenarios.feature" ,
        glue = {"stepdefs","base","ScreenShots"},
        monochrome = true,
        format = {"json:target/cucumber-json-report.json"},
        tags = {"@wip"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
