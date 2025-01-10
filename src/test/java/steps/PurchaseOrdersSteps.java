package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.PurchaseOrdersActions;
import page.locators.PurchaseOrdersLocators;

public class PurchaseOrdersSteps {
	
	
	PurchaseOrdersLocators PurchaseOrdersLocators = new PurchaseOrdersLocators();
	PurchaseOrdersActions PurchaseOrdersActions = new PurchaseOrdersActions();
	
	
	@And("Click on Purchase orders")
	public void click_on_purchase_orders() {
		
		PurchaseOrdersActions.ClickOnPurchaseOrders();
	 
	}
	@Then("User is on Purchase orders page")
	public void user_is_on_purchase_orders_page() {
		PurchaseOrdersActions.VerifyPurchaseOrders();
	System.out.println("User is on Purchase orders");
	
	}
	
	
	
	
}
