package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.ExpensesLocators;
import utils.SeleniumDriver;

public class ExpensesActions {
	
	ExpensesLocators ExpensesLocators = null;

	public ExpensesActions() {
		this.ExpensesLocators = new ExpensesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ExpensesLocators);

	}

	public void ClickOnExpenses() {

		ExpensesLocators.ExpensesBtn.click();
	}

	public void VerifyExpenses() {

		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("expense"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgnavigator.parkstreet.com/router.php/app#!/expense-report");

	}

}
