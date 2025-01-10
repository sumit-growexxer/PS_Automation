package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersLocators {
	
	@FindBy(xpath = "//span[normalize-space()='Customers']")
	public WebElement CustomersBtn;

}
