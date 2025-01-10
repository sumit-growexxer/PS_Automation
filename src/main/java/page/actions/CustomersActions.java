package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.CustomersLocators;
import utils.SeleniumDriver;

public class CustomersActions {

	CustomersLocators CustomersLocators = null;

	public CustomersActions() {
		this.CustomersLocators = new CustomersLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CustomersLocators);

	}

	public void ClickOnCustomers() {

		CustomersLocators.CustomersBtn.click();
	}

	public void VerifyCustomers() {

		// SeleniumDriver.Wait().until(ExpectedConditions.invisibilityOf(SeleniumDriver.getDriver().findElement(By.id("myframe"))));
		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("customer"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgnavigator.parkstreet.com/router.php/app#!/customer-entry");
	}

}
