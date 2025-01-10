package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.ShipmentsActions;
import page.locators.ShipmentsLocators;
public class ShipmentsSteps {
	
	ShipmentsLocators ShipmentsLocators = new ShipmentsLocators();
	ShipmentsActions ShipmentsActions = new ShipmentsActions();
	
	@And("Click on Shipments")
	public void click_on_shipments() {
		
		ShipmentsActions.ClickOnShipments();
	 
	}
	@Then("User is on Shipments")
	public void user_is_on_shipments() {
		ShipmentsActions.VerifyShipments();
	System.out.println("User is on Shipments");
	
	}

}
