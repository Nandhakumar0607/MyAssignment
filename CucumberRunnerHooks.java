package hooks_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/hooks_feature",glue = "hooks_steps",monochrome=true, publish=true )
public class CucumberRunnerHooks extends AbstractTestNGCucumberTests {
	

}