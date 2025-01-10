package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.CustomersActions;
import page.locators.CustomersLocators;

public class CustomersSteps {

	CustomersLocators CustomersLocators = new CustomersLocators();
	CustomersActions CustomersActions = new CustomersActions();

	@And("Click on Customers")
	public void click_on_customers() {

		CustomersActions.ClickOnCustomers();

	}

	@Then("User is on Customers")
	public void user_is_on_customers() {
		CustomersActions.VerifyCustomers();
		System.out.println("User is on Customers");

	}

}
