package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		plugin={
				"html:target/cucumber-html-reports",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml",
		},
		features= {"src/test/resources/features"},
		glue= {"steps"},
		tags= {"@BNSPOM"}
		
		
		
		)
public class TestRunnerClass extends AbstractTestNGCucumberTests {

}