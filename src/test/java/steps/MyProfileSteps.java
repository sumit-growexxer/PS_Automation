package steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.actions.LoginActions;
import page.actions.MyProfileActions;

public class MyProfileSteps {
	
	MyProfileActions MyProfileActions = new MyProfileActions();
	LoginActions LoginActions = new LoginActions();
	
	
	@Given("User is on dashboard page")
	public void user_is_on_dashboard_page() {
		
	//	SeleniumDriver.Wait().until(ExpectedConditions.urlContains("dashboard"));
		
	//Assert.assertEquals(LoginActions.verifyDashboardPage(), "Park Street | Dashboard");
		
		
	  
	}

	@When("Click on profile dropdown")
	public void click_on_profile_dropdown() throws InterruptedException {
	    MyProfileActions.HoverToProfileMenu();
	}

	@And("Cick on Myprofile link")
	public void cick_on_myprofile_link() {
	    MyProfileActions.clickOnMyProfileLink();
	}

	@Then("Myprofile page is displayed")
	public void myprofile_page_is_displayed() throws InterruptedException {
		
		
		Thread.sleep(3000);
		
		//SeleniumDriver.Wait().until(ExpectedConditions.urlContains("my-profile"));
		
		//System.out.println("myprofile page is displayed");
		System.out.println("User is on "+MyProfileActions.verifyMyProfilePagetitle());
		assertEquals(MyProfileActions.verifyMyProfilePagetitle(), "Park Street | My Profile");
	   
		//MyProfileActions.clickOnProfileMenu();
		
		Thread.sleep(1000);
		
		//MyProfileActions.clickOnlogout();
		
	}
	

}
