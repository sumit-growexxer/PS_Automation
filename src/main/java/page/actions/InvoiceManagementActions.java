package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.InvoiceManagementLocators;
import utils.SeleniumDriver;

public class InvoiceManagementActions {
	
	
	InvoiceManagementLocators InvoiceManagementLocators = null;
		
		public InvoiceManagementActions() {
			this.InvoiceManagementLocators= new InvoiceManagementLocators();
			PageFactory.initElements(SeleniumDriver.getDriver(), InvoiceManagementLocators);
			
		}
		
		
		
		
		
		public void ClickOnInvoices() {
			
			if(SeleniumDriver.getDriver().getCurrentUrl().contains("stgnavigator")) {
				
				InvoiceManagementLocators.InvoicesABtn.click();
				
			}else {
				
			
			
			InvoiceManagementLocators.InvoicesBtn.click();
		}
		}
		public void VerifyInvoiceManagement() {
			
			
			SeleniumDriver.Wait().until(ExpectedConditions.urlContains("invoice"));
			Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(), "https://stgappnavigator.parkstreet.com/invoice-management");
			
		}

}
