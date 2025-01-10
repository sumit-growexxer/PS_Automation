package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.AccountsReceivableLocators;
import utils.SeleniumDriver;

public class AccountsReceivableActions {

	AccountsReceivableLocators AccountsReceivableLocators = null;

	public AccountsReceivableActions() {
		this.AccountsReceivableLocators = new AccountsReceivableLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), AccountsReceivableLocators);

	}

	public void ClickOnAccountsReceivable() {
		
		SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(AccountsReceivableLocators.AccountsReceivableBtn));

		AccountsReceivableLocators.AccountsReceivableBtn.click();
	}

	public void VerifyAccountsReceivable() {

		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("invoice"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgappnavigator.parkstreet.com/invoice-management?FromDashboard");

	}

}
