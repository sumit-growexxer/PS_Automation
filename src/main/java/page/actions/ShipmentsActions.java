package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import page.locators.ShipmentsLocators;
import utils.SeleniumDriver;

public class ShipmentsActions {

	ShipmentsLocators ShipmentsLocators = null;

	public ShipmentsActions() {
		this.ShipmentsLocators = new ShipmentsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ShipmentsLocators);

	}

	public void ClickOnShipments() {
		
		SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(ShipmentsLocators.ShipmentsBtn));

		ShipmentsLocators.ShipmentsBtn.click();
	}

	public void VerifyShipments() {

		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("shipments"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgappnavigator.parkstreet.com/shipments");

	}

}
