package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.BalanceAccountLocators;
import utils.SeleniumDriver;

public class BalanceAccountActions {
	
	BalanceAccountLocators BalanceAccountLocators = null;

	public BalanceAccountActions() {
		this.BalanceAccountLocators = new BalanceAccountLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BalanceAccountLocators);

	}

	public void ClickOnBalanceAccount() {

		BalanceAccountLocators.BalanceAccountBtn.click();
	}

	public void VerifyBalanceAccount() {

		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("balance"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgappnavigator.parkstreet.com/balance-account");

	}

}
