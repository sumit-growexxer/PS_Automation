package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.RequestTransferLocators;
import utils.SeleniumDriver;

public class RequestTransferActions {

	RequestTransferLocators RequestTransferLocators = null;

	public RequestTransferActions() {
		this.RequestTransferLocators = new RequestTransferLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), RequestTransferLocators);

	}

	public void ClickOnRequestTransfer() {

		RequestTransferLocators.RequestTransferBtn.click();
	}

	public void VerifyRequestTransfer() {

		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("request"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgappnavigator.parkstreet.com/request-transfer");

	}

}
