package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/CreateLead.feature",glue = "Steps",monochrome=true, publish=true )
public class CucumberRunner extends AbstractTestNGCucumberTests {
	

}