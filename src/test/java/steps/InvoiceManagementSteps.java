package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.InvoiceManagementActions;
import page.locators.InvoiceManagementLocators;

public class InvoiceManagementSteps {
	
	InvoiceManagementLocators InvoiceManagementLocators = new InvoiceManagementLocators();
	InvoiceManagementActions InvoiceManagementActions = new InvoiceManagementActions();

	@And("Click on Invoice management")
	public void click_on_invoice_management() throws InterruptedException {
		Thread.sleep(2000);
		
		InvoiceManagementActions.ClickOnInvoices();
		
	 
	}
	@Then("User is on Invoice management page")
	public void user_is_on_invoice_management__page() {
		
		InvoiceManagementActions.VerifyInvoiceManagement();
		
		System.out.println("User is on Invoice Management");
	}

}
