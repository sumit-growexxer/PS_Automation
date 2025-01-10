package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectionLocators {
	
	@FindBy(xpath = "//span[normalize-space()='Collections']")
	public WebElement CollectionBtn;
	
	@FindBy(xpath = "//td[normalize-space()='Totals']")
	public WebElement TotalTxt;
	
	

}
