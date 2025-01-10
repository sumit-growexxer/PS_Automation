package steps;

import page.actions.SalesOrdersActions;
import page.locators.SalesOrdersLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SalesOrdersSteps {
	
	SalesOrdersLocators SalesOrdersLocators = new SalesOrdersLocators();
	SalesOrdersActions SalesOrdersActions = new SalesOrdersActions();
	
	@Given("user is on dashboard")
	public void user_is_on_dashboard() {
	  
	}

	
	
	@And("Click on Sales orders")
	public void click_on_sales_orders() throws InterruptedException {
		Thread.sleep(2000);
		SalesOrdersActions.ClickOnsalesOrders();
	 
	}
	@Then("User is on Sales orders page")
	public void user_is_on_sales_orders_page() {
		
		SalesOrdersActions.VerifySalesOrders();
		
	System.out.println("User is on Sales orders");
	}
	
	

	
	

}
