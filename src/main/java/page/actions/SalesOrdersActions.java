package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.SalesOrdersLocators;
import utils.SeleniumDriver;

public class SalesOrdersActions {

	SalesOrdersLocators SalesOrdersLocators = null;

	public SalesOrdersActions() {
		this.SalesOrdersLocators = new SalesOrdersLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), SalesOrdersLocators);

	}

	public void ClickOnsalesOrders() {

		SalesOrdersLocators.SalesOrdersBtn.click();
	}

	public void VerifySalesOrders() {

		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("sales"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgappnavigator.parkstreet.com/sales-orders?type=sales_orders");

	}

}
