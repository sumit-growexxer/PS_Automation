package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperationsSalesReportsMyOrderLocators {
	
	@FindBy(xpath = "//a[normalize-space()='Operations']")
	public WebElement OperationsMenuBtn;
	
	
	@FindBy(xpath = "//a[normalize-space()='Sales Reports']")
	public WebElement SalesreportsBtn;
	
	@FindBy(xpath = "//a[normalize-space()='My Orders']")
	public WebElement MyOrdersBtn;

	
}
