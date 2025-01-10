package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.AccountsPayableLocators;
import utils.SeleniumDriver;

public class AccountsPayableActions {
	
	AccountsPayableLocators AccountsPayableLocators = null;

	public AccountsPayableActions() {
		this.AccountsPayableLocators = new AccountsPayableLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), AccountsPayableLocators);

	}

	public void ClickOnAccountsPayable() {

		AccountsPayableLocators.AccountsPayableBtn.click();
	}

	public void VerifyAccountsPayable() {

		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("upcoming"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgappnavigator.parkstreet.com/upcoming-payments/report");

	}

}
