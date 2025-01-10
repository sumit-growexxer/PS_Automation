package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.BalanceAccountActions;
import page.locators.BalanceAccountLocators;

public class BalanceAccountSteps {
	
	
	BalanceAccountLocators BalanceAccountLocators = new BalanceAccountLocators();
	BalanceAccountActions BalanceAccountActions = new BalanceAccountActions();
	
	@And("Click on Balance account")
	public void click_on_balance_account() throws InterruptedException {
		Thread.sleep(1000);
		BalanceAccountActions.ClickOnBalanceAccount();
	 
	}
	@Then("User is on Balance account page")
	public void user_is_on_balance_account_page() {
		
		BalanceAccountActions.VerifyBalanceAccount();
		
	System.out.println("User is on BalanceAccount");
	}

}
