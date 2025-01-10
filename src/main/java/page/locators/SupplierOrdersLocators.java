package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierOrdersLocators {
	
	@FindBy(xpath = "//span[normalize-space()='Supplier Orders']")
	public WebElement SupplierOrdersBtn;

}
