package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.AccountsReceivableActions;
import page.locators.AccountsReceivableLocators;

public class AccountsReceivableSteps {
	
	AccountsReceivableLocators AccountsReceivableLocators = new AccountsReceivableLocators();
	AccountsReceivableActions AccountsReceivableActions = new AccountsReceivableActions();
	
	
	@And("Click on Accounts receivable")
	public void click_on_accounts_receivable() {
		
		AccountsReceivableActions.ClickOnAccountsReceivable();
	 
	}
	@Then("User is on Accounts receivable page")
	public void user_is_on_accounts_receivable_page() {
		AccountsReceivableActions.VerifyAccountsReceivable();
	System.out.println("User is on Accounts Receivable");
	
	}

}
