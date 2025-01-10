package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.actions.CommonActions;
import page.locators.CommonLocators;
public class CommonSteps {
	
	CommonLocators CommonLocators = new CommonLocators();
	CommonActions CommonActions = new CommonActions();
	
	@When("Hover to Operations")
	public void hover_to_operations() {
		
		CommonActions.HoverOnOprations();
		
	 
	}
	
	
	@And("Hover to sales")
	public void hover_to_sales() throws InterruptedException {
		
		
		
		CommonActions.HoverOnsales();
	
	}
	
	
	@When("Hover to Account")
	public void hover_to_account() {
		
		CommonActions.HoverOnAccount();
		
	 
	}
	
	
	@And("Hover to Accounting and Wallet")
	public void hover_to_accounting_and_wallet() throws InterruptedException {
		
		
		
		CommonActions.HoverOnAccountingAndWallet();
	
	}
	
	
	
	@When("User clicks on Download excel page")
	public void user_clicks_on_download_excel_page() {
		
		//SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(SalesOrdersLocators.ExcelBtn));
		//SeleniumDriver.Wait().until(d -> SalesOrdersLocators.ExcelBtn.isDisplayed());
		
		CommonActions.ClickOnExcelButton();
	    
	
	}
	@Then("Excel is downloaded")
	public void excel_is_downloaded() {
	    
		System.out.println("Excel downloaded");
	}
	
	@When("Click on Searchbar")
	public void click_on_searchbar() {
		
		CommonActions.ClickOnSearchbar();
	   
	}
	
	@And ("Enter Text")
	public void enter_Text() {
		
		CommonActions.EnterText();
		   
	}
	
	@And("Click on Search button")
	public void click_on_search_button() {
		
		CommonActions.ClickOnsearchButton();
	   
	}
	
	@Then("Searched record is displayed")
	public void searched_record_is_displayed() {
		
		System.out.println("Searched record displayed");

	  
	}
	
	@When("Click on Note icon")
	public void click_on_note_icon() {
	   CommonActions.ClickOnNoteIcon();
	}
	@And("Enter text on note")
	public void enter_text_on_note() throws InterruptedException{
		
		CommonActions.EnterTextOnNote();
	    
	}
	@And("Select privacy as private")
	public void select_privacy_as_pvt () throws InterruptedException {
		
		CommonActions.SelectPrivacyOnNote();
	  
	}
	@And("Click on save on note popup")
	public void click_on_save_on_note_popup() {
		
		CommonActions.ClickOnSaveOnNote();
		
		
	   
	}
	@Then("Note should be displayed to list")
	public void note_should_be_displayed_to_list() {
	   
	}
	
	
	


}
