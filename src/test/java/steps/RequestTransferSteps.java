package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.RequestTransferActions;
import page.locators.RequestTransferLocators;

public class RequestTransferSteps {
	
	RequestTransferLocators AccountsPayableLocators = new RequestTransferLocators();
	RequestTransferActions RequestTransferActions = new RequestTransferActions();
	
	@And("Click on Request transfer")
	public void click_on_request_transfer() throws InterruptedException {
		Thread.sleep(1000);
		RequestTransferActions.ClickOnRequestTransfer();
	 
	}
	@Then("User is on Request transfer page")
	public void user_is_on_request_transfer_page() {
		
		RequestTransferActions.VerifyRequestTransfer();
		
	System.out.println("User is on Request Transfer");
	}


}
