package accessoriseSteps;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features = "use_cases", 
plugin = { "summary", "html:target/cucumber/wikipedia.html"}, 
	glue = "accessoriseSteps")

public class ConfigTest {

}
