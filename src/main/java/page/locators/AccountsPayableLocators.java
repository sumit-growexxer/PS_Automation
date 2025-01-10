package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPayableLocators {
	
	@FindBy(xpath = "//span[normalize-space()='Accounts Payable']")
	public WebElement AccountsPayableBtn;

}
