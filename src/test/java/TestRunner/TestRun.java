package TestRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	        features= ".//Features/Mars.feature",
			glue= "StepDefenition",
			dryRun= false,
			monochrome = true,			
			plugin = {"pretty", "html:test-output/result1.html"}	    	
)

public class TestRun {
	
}
