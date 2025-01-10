package steps;



import org.testng.annotations.AfterSuite;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterActions {
	
	 @AfterSuite
	    public static void tearDown(Scenario scenario) {
	    	
	    	//WebDriver driver=SeleniumDriver.getDriver();
	    	System.out.println(scenario.isFailed());
	    	/*	 if (scenario.isFailed()) {
	             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	             scenario.embed(screenshotBytes, "image/png");
	          
	         } */
	    SeleniumDriver.tearDown();
	    }

}
