package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.ChargebacksLocators;
import utils.SeleniumDriver;

public class ChargebacksActions {
	
	ChargebacksLocators ChargebacksLocators = null;
	
	public ChargebacksActions() {
		this.ChargebacksLocators= new ChargebacksLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ChargebacksLocators);
		
	}
	
	
	public void ClickOnChargebacks() {
		
		SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(ChargebacksLocators.ChargebacksBtn));
		
		ChargebacksLocators.ChargebacksBtn.click();
	}
	
public void VerifyChargebacks() {


		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("charge-backs"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(), "https://stgappnavigator.parkstreet.com/charge-backs");
		
	}

}
