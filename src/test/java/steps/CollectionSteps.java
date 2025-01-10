package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.CollectionActions;
import page.locators.CollectionLocators;

public class CollectionSteps {

	
	CollectionLocators CollectionLocators = new CollectionLocators();
	CollectionActions CollectionActions = new CollectionActions();
	
	@And("Click on Collection")
	public void click_on_collection() {
		
		CollectionActions.ClickOnCollection();
	 
	}
	@Then("User is on Collection")
	public void user_is_on_collection() {
		CollectionActions.VerifyCollection();
	System.out.println("User is on Collection");
	
	}
}
