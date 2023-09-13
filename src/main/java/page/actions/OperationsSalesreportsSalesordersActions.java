package page.actions;

import org.openqa.selenium.support.PageFactory;

import page.locators.OperationsSalesreportsSalesordersLocators;
import utils.SeleniumDriver;

public class OperationsSalesreportsSalesordersActions{
	
	OperationsSalesreportsSalesordersLocators OperationsSalesreportsSalesordersLocators = null;
	
	public OperationsSalesreportsSalesordersActions(){
		
		this.OperationsSalesreportsSalesordersLocators= new OperationsSalesreportsSalesordersLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), OperationsSalesreportsSalesordersLocators);
	}
	
	
	public void ClickOnSalesOrderslink() {
		OperationsSalesreportsSalesordersLocators.SalesOrdersBtn.click();
	}
	
	public void ClickOnExcelExportBtn() {
		OperationsSalesreportsSalesordersLocators.ExcelExportBtn.click();
	}
	
	
}