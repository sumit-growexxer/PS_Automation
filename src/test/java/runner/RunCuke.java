package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"html:target/cucumber-reports/cucumber-html-report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter: "},
		features = {"src/test/resources/Featuresfile"},
		glue = "steps", 
		monochrome = true 
				)

public class RunCuke extends AbstractTestNGCucumberTests{
	

	

}
