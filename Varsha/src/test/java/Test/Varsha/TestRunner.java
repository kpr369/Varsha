package Test.Varsha;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Resources\\first.feature",glue= {" "}, dryRun =true)
public class TestRunner {

	
}
