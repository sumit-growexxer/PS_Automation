package steps;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.actions.OperationsSalesReportsMyOrderActions;
import page.locators.OperationsSalesReportsMyOrderLocators;
import utils.SeleniumDriver;

public class OperationsSalesReportsMyOrderSteps {
	
	OperationsSalesReportsMyOrderActions OperationsSalesReportsMyOrderActions = new OperationsSalesReportsMyOrderActions();
	OperationsSalesReportsMyOrderLocators OperationsSalesReportsMyOrderLocators= new OperationsSalesReportsMyOrderLocators();
	@Given("user is on dashboard")
	public void user_is_on_dashboard() {
		
	
	    
	}

	@When("Click on Operation")
	public void click_on_operation() {
		
		//SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(OperationsSalesReportsMyOrderLocators.OperationsMenuBtn));
		
		OperationsSalesReportsMyOrderActions.ClickOnOperationsLink();

	}

	@And("Click on Sales reports")
	public void click_on_sales_reports() {
		
		//SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(OperationsSalesReportsMyOrderLocators.SalesreportsBtn));

	    OperationsSalesReportsMyOrderActions.HoverToSalesorders();
	}

	@And("Click on My orders")
	public void click_on_my_orders() {
	    OperationsSalesReportsMyOrderActions.ClickOnMyOrdersLink();
	}

	@Then("user is on My orders page")
	public void user_is_on_my_orders_page() {
	   System.out.println("user is on My order page");
	   
	   
	   
	   
	}

}
