package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoiceManagementLocators {
	
	@FindBy(xpath = "//li[@id='597-626-628']")
	public WebElement InvoicesBtn;
	
	@FindBy(xpath = "//li[@id='li-597-626-628']")
	public WebElement InvoicesABtn;

}
