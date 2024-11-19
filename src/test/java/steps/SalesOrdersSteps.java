package steps;

import page.actions.SalesOrdersActions;
import page.locators.MenuLocators;
import page.locators.SalesOrdersLocators;
import utils.SeleniumDriver;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesOrdersSteps {
	
	SalesOrdersLocators SalesOrdersLocators = new SalesOrdersLocators();
	SalesOrdersActions SalesOrdersActions = new SalesOrdersActions();
	MenuLocators MenuLocators= new MenuLocators();
	
	
	
	@When("Hover to Operations")
	public void hover_to_operations() {
		
		SalesOrdersActions.HoverOnOprations();
		
	 
	}
	@And("Hover to sales")
	public void hover_to_sales() {
		
		SalesOrdersActions.HoverOnsales();
	
	}
	@And("Click on Sales orders")
	public void click_on_sales_orders() {
		
		SalesOrdersActions.ClickOnsalesOrders();
	 
	}
	@Then("User is on Sales orders page")
	public void user_is_on_sales_orders_page() {
		
	System.out.print("User is on Sales orders");
	}


}
