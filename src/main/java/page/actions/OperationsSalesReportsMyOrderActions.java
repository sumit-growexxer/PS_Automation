package page.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import page.locators.OperationsSalesReportsMyOrderLocators;
import utils.SeleniumDriver;

public class OperationsSalesReportsMyOrderActions {
	
 OperationsSalesReportsMyOrderLocators OperationsSalesReportsMyOrderLocators = null;
	
	public OperationsSalesReportsMyOrderActions() {
		this.OperationsSalesReportsMyOrderLocators= new OperationsSalesReportsMyOrderLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), OperationsSalesReportsMyOrderLocators);
		
	}
	
	public void ClickOnOperationsLink() {
		
		OperationsSalesReportsMyOrderLocators.OperationsMenuBtn.click();
		
	}
	public void HoverToSalesorders() {
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		
		action.moveToElement(OperationsSalesReportsMyOrderLocators.SalesreportsBtn).perform();
		
	}

	public void ClickOnMyOrdersLink() {
		
		OperationsSalesReportsMyOrderLocators.MyOrdersBtn.click();
		
	}
	

}
