package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseOrdersLocators {
	
	
	@FindBy(xpath = "//li[@id='628']")
	public WebElement operationsBtn;
	
	@FindBy(xpath = "//span[normalize-space()='Purchase Orders']")
	public WebElement PurchaseOrderBtn;


}
