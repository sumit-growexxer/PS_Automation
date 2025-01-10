package page.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.locators.MyProfileLocators;
import utils.SeleniumDriver;

public class MyProfileActions {
	
	MyProfileLocators MyProfileLocators = null;
	
	
public MyProfileActions() {
		
		this.MyProfileLocators= new MyProfileLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), MyProfileLocators);
		
	}
	
	public void clickOnProfileMenu() throws InterruptedException {
		Thread.sleep(5000);
		MyProfileLocators.ProfileMenu.click();
		
	}
	
public void HoverToProfileMenu() {
	
	
	SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(MyProfileLocators.ProfileMenu));
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		
		action.moveToElement(MyProfileLocators.ProfileMenu).perform();
		
	}
	
	
     public void clickOnMyProfileLink() {
		
		MyProfileLocators.MyProfileLink.click();
		
	}
     
     public void clickOnlogout() {
 		
 		MyProfileLocators.logout.click();
 		
 	}
     
     public String verifyMyProfilePagetitle() {
    	 
    	 
    	// SeleniumDriver.Wait().until(ExpectedConditions.titleContains("My Profile") );
    	 
    	return SeleniumDriver.getDriver().getTitle();
    	
 		 		
 	}

}
