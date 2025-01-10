package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.ExpensesActions;
import page.locators.ExpensesLocators;

public class ExpensesSteps {
	
	ExpensesLocators ExpensesLocators = new ExpensesLocators();
	ExpensesActions ExpensesActions = new ExpensesActions();
	
	@And("Click on Expenses")
	public void click_on_expenses() throws InterruptedException {
		Thread.sleep(1000);
		ExpensesActions.ClickOnExpenses();
	 
	}
	@Then("User is on Expenses page")
	public void user_is_on_expenses_page() {
		
		ExpensesActions.VerifyExpenses();
		
	System.out.println("User is on Expenses");
	}

}
