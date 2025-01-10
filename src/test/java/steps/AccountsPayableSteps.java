package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.AccountsPayableActions;
import page.locators.AccountsPayableLocators;

public class AccountsPayableSteps {
	
	AccountsPayableLocators AccountsPayableLocators = new AccountsPayableLocators();
	AccountsPayableActions AccountsPayableActions = new AccountsPayableActions();
	
	@And("Click on Accounts payable")
	public void click_on_accounts_payable() throws InterruptedException {
		Thread.sleep(1000);
		AccountsPayableActions.ClickOnAccountsPayable();
	 
	}
	@Then("User is on Accounts payable page")
	public void user_is_on_accounts_payable_page() {
		
		AccountsPayableActions.VerifyAccountsPayable();
		
	System.out.println("User is on AccountsPayable");
	}


}
