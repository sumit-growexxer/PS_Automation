package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrdersLocators {
	
	
	@FindBy(xpath = "//li[@id='626-628']")
	public WebElement SalesBtn;
	
	@FindBy(xpath = "//li[@id='570-626-628']")
	public WebElement SalesOrdersBtn;

	
	@FindBy(xpath = "//li[@id='628']")
	public WebElement operationsBtn;
}
