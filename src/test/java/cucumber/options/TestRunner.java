	package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue={"stepDefinition","helper"}, tags= "@Reg", plugin="html:target/reports/test.html")


public class TestRunner {

	//dryrun 
	//monochrome
	//plugin="json:target/jsonReports/test.json"
	
	
	
}




