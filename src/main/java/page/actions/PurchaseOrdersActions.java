package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.PurchaseOrdersLocators;
import utils.SeleniumDriver;

public class PurchaseOrdersActions {

	PurchaseOrdersLocators PurchaseOrdersLocators = null;

	public PurchaseOrdersActions() {
		this.PurchaseOrdersLocators = new PurchaseOrdersLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), PurchaseOrdersLocators);

	}

	public void ClickOnPurchaseOrders() {

		PurchaseOrdersLocators.PurchaseOrderBtn.click();
	}

	public void VerifyPurchaseOrders() {

		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("purchase"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgappnavigator.parkstreet.com/purchase-orders?type=operations");

	}

}
