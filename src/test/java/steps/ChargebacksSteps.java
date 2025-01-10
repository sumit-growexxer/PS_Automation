package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.ChargebacksActions;
import page.locators.ChargebacksLocators;

public class ChargebacksSteps {
	
	ChargebacksLocators ChargebacksLocators = new ChargebacksLocators();
	ChargebacksActions ChargebacksActions = new ChargebacksActions();
	
	@And("Click on Chargebacks")
	public void click_on_chargebacks() {
		
		ChargebacksActions.ClickOnChargebacks();
	 
	}
	@Then("User is on Chargebacks")
	public void user_is_on_chargebacks() {
		ChargebacksActions.VerifyChargebacks();
	System.out.println("User is on Chargebacks");
	
	}

}
