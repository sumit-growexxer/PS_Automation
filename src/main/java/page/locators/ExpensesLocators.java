package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpensesLocators {
	
	@FindBy(xpath = "//span[normalize-space()='Expenses']")
	public WebElement ExpensesBtn;

}
