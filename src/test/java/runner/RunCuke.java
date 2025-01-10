package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"html:target/cucumber-reports/cucumber-html-report.html"},
		features = {
				"src/test/resources/Featuresfile/Login", 
				"src/test/resources/Featuresfile/Others"},
		glue = "steps", 
		monochrome = true 
				)

public class RunCuke extends AbstractTestNGCucumberTests{ 
	

	

}
