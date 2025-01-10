package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShipmentsLocators {
	
	
	@FindBy(xpath = "//span[normalize-space()='Shipments']")
	public WebElement ShipmentsBtn;
	
	//li[@id='622-628']//a[@class="sidebar-menu-item {'sub-menu' : submenu.type == 'submenu'}"]

}
