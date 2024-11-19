package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfileLocators {
	
	@FindBy(xpath = "/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/side-bar-menu[1]/div[1]/aside[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]/img[1]")
	public WebElement ProfileMenu;
	
	@FindBy(xpath = "//li[@data-ng-class=\"{'active-profile': $ctrl.sideBarMenuService.activePath.isFromProfile}\"]//li[1]//a[1]")
	public WebElement MyProfileLink;
	
	@FindBy(xpath = "//span[@class='ng-binding'][normalize-space()='Sign Out']")
	public WebElement logout;
	
	

}
