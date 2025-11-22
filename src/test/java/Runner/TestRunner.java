package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
   features = "src/test/resources/features/",
   glue     = {"StepDefinitions"},
   dryRun   = false,
   //tags     = "@searchFlights",
   plugin   = {"pretty","json:target/cucumber.json","html:target/cucumber-html-reports","junit:target/cucumber-junit.xml"},    			
   monochrome = true
)
public class TestRunner {

}
