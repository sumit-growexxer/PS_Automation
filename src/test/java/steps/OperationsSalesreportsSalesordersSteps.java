package steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.actions.OperationsSalesReportsMyOrderActions;
import page.actions.OperationsSalesreportsSalesordersActions;
import page.locators.OperationsSalesReportsMyOrderLocators;
import page.locators.OperationsSalesreportsSalesordersLocators;
import utils.SeleniumDriver;

public class OperationsSalesreportsSalesordersSteps {
	
	OperationsSalesReportsMyOrderLocators OperationsSalesReportsMyOrderLocators = new OperationsSalesReportsMyOrderLocators();
	OperationsSalesreportsSalesordersActions OperationsSalesreportsSalesordersActions = new OperationsSalesreportsSalesordersActions();
	OperationsSalesreportsSalesordersLocators OperationsSalesreportsSalesordersLocators= new OperationsSalesreportsSalesordersLocators();
	

	
	@And("Click on Sales orders")
	public void click_on_sales_orders() {
		
		//SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(OperationsSalesReportsMyOrderLocators.OperationsMenuBtn));
	
	    OperationsSalesreportsSalesordersActions.ClickOnSalesOrderslink();
	}
	
	@Then("user is on sales orders page")
	public void user_is_on_sales_orders_page() {
		
		SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(OperationsSalesreportsSalesordersLocators.ExcelExportBtn));
		
	    
	}
	
	@When("Click on Exxcel export icon")
	public void click_on_exxcel_export_icon() {
		
		OperationsSalesreportsSalesordersActions.ClickOnExcelExportBtn();
	    
	}

	@Then("Loader should be display untill excel is downloads")
	public void loader_should_be_display_untill_excel_is_downloads() {
		
		
		if( OperationsSalesreportsSalesordersLocators.ExcelExportLoader.isDisplayed()){
			System.out.println("Excel start downloading");
			}else{
			System.out.println("Excel download not starts");
			}
		
		
	 if(OperationsSalesreportsSalesordersLocators.ExcelExportBtn.isDisplayed()) {
		 System.out.println("Excel download completed");
		}else{
		System.out.println("Excel download not working");
		}
	 
	}
	

}
