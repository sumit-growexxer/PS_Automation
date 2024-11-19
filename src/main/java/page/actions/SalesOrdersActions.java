package page.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import page.locators.SalesOrdersLocators;
import utils.SeleniumDriver;

public class SalesOrdersActions {
	
	 SalesOrdersLocators SalesOrdersLocators = null;
		
		public SalesOrdersActions() {
			this.SalesOrdersLocators= new SalesOrdersLocators();
			PageFactory.initElements(SeleniumDriver.getDriver(), SalesOrdersLocators);
			
		}
		
		public void HoverOnOprations() {
			Actions action = new Actions(SeleniumDriver.getDriver());
			
			action.moveToElement(SalesOrdersLocators.operationsBtn).perform();
		}
		
		
		public void HoverOnsales() {
			
			
			
			Actions action = new Actions(SeleniumDriver.getDriver());
			
			action.moveToElement(SalesOrdersLocators.SalesBtn).perform();
			

			
		}
		
		public void ClickOnsalesOrders() {
			
			SalesOrdersLocators.SalesOrdersBtn.click();
		}
		
		
		
		
		

}
