package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.actions.BillManagementActions;
import page.locators.BillManagementLocators;

public class BillManagementSteps {
	
	

	BillManagementLocators BillManagementLocators = new BillManagementLocators();
	BillManagementActions BillManagementActions = new BillManagementActions();
	
	@And("Click on Bill management")
	public void click_on_bill_management() throws InterruptedException {
		
		BillManagementActions.ClickOnBillManagement();
	 
	}
	@Then("User is on Bill management")
	public void user_is_on_Bill_management() {
		BillManagementActions.VerifyBillManagement();
	System.out.println("User is on bill management");
	
	}
	
	@When("User clicks on Download excel on Bill management")
	public void user_clicks_on_download_excel_on_bill_management() throws InterruptedException {
		
		//SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(SalesOrdersLocators.ExcelBtn));
		//SeleniumDriver.Wait().until(d -> SalesOrdersLocators.ExcelBtn.isDisplayed());
		
		BillManagementActions.ClickOnExcelButtonOnBillManagement();
	    
	
	}
	@Then("Excel is downloaded on Bill management")
	public void excel_is_downloaded_on_Bill_management() {
	    
		System.out.println("Excel downloaded");
	}
	
	@When("Click on Searchbar on Bill management")
	public void click_on_searchbar_on_bill_management() {
		
		BillManagementActions.ClickOnSearchbarOnBillManagement();
	   
	}
	
	@And ("Enter Text in searchbar on Bill management")
	public void enter_text_in_searchbar_on_bill_management() {
		
		BillManagementActions.EnterTextInSearchbarOnBillManagement();
		   
	}
	
	@And("Click on Search button on Bill management")
	public void click_on_search_button_on_bill_management() {
		
		BillManagementActions.ClickOnsearchButtonOnBillManagement();
	   
	}
	
	@Then("Searched record is displayed on Bill management")
	public void searched_record_is_displayed_on_bill_management() {
		
		System.out.println("Searched record displayed");

	  
	}
	
	@When("Click on Note icon on Bill management")
	public void click_on_note_icon_on_bill_management() {
		BillManagementActions.ClickOnNoteIconOnBillManagement();
	}
	@And("Enter text on note on Bill management")
	public void enter_text_on_note_on_bill_management() throws InterruptedException{
		
		BillManagementActions.EnterTextOnNoteOnBillManagament();
	    
	}
	@And("Select privacy as private on Bill management")
	public void select_privacy_as_private_on_bill_management() throws InterruptedException {
		
		BillManagementActions.SelectPrivacyOnNoteOnBillManagement();
	  
	}
	@And("Click on save on note popup on Bill management")
	public void click_on_save_on_note_popup_on_bill_management() {
		
		BillManagementActions.ClickOnSaveOnNoteOnBillManagement();
		
		
	   
	}
	@Then("Note should be displayed to list on Bill management")
	public void note_should_be_displayed_to_list_on_bill_management() {
	   
	}


}
