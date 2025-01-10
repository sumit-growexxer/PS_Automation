package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.SupplierOrdersActions;
import page.locators.SupplierOrdersLocators;

public class SupplierOrdersSteps {
	
	SupplierOrdersLocators SupplierOrdersLocators = new SupplierOrdersLocators();
	SupplierOrdersActions SupplierOrdersActions = new SupplierOrdersActions();
	
	
	@And("Click on Supplier orders")
	public void click_on_supplier_orders() {
		
		SupplierOrdersActions.ClickOnSupplierOrders();
	 
	}
	@Then("User is on Supplier orders page")
	public void user_is_on_supplier_orders_page() {
		SupplierOrdersActions.VerifySupplierOrders();
	System.out.println("User is on SupplierOrders");
	
	}

}
