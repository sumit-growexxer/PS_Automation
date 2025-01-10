package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.SupplierOrdersLocators;
import utils.SeleniumDriver;

public class SupplierOrdersActions {
	
	
	SupplierOrdersLocators SupplierOrdersLocators = null;

	public SupplierOrdersActions() {
		this.SupplierOrdersLocators = new SupplierOrdersLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), SupplierOrdersLocators);

	}

	public void ClickOnSupplierOrders() {

		SupplierOrdersLocators.SupplierOrdersBtn.click();
	}

	public void VerifySupplierOrders() {

		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("sales"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgappnavigator.parkstreet.com/sales-orders?type=supplier_orders");

	}
	
	

}
