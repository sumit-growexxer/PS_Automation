package steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.actions.LoginActions;
import page.actions.MyProfileActions;
import utils.SeleniumDriver;

public class MyProfileSteps {
	
	MyProfileActions MyProfileActions = new MyProfileActions();
	LoginActions LoginActions = new LoginActions();
	
	
	@Given("User is on dashboard page")
	public void user_is_on_dashboard_page() {
		
	//	Assert.assertEquals(LoginActions.verifyDashboardPage(), "Park Street | Dashboard");
		
		
	  
	}

	@When("Click on profile dropdown")
	public void click_on_profile_dropdown() throws InterruptedException {
	    MyProfileActions.clickOnProfileMenu();
	}

	@And("Cick on Myprofile link")
	public void cick_on_myprofile_link() throws InterruptedException {
	    MyProfileActions.clickOnMyProfileLink();
	    
	    Thread.sleep(2000);
	}

	@Then("Myprofile page is displayed")
	public void myprofile_page_is_displayed() throws InterruptedException {
		
		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("my-profile"));
		
		//System.out.println("myprofile page is displayed");
		System.out.println("User is on "+MyProfileActions.verifyMyProfilePagetitle());
		assertEquals(MyProfileActions.verifyMyProfilePagetitle(), "Park Street | My Profile");
	   
		//MyProfileActions.clickOnProfileMenu();
		
		Thread.sleep(2000);
		//TEST
	//	MyProfileActions.clickOnlogout();
		
	}
	

}
