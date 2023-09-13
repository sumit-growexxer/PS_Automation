package page.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperationsSalesreportsSalesordersLocators {
	
	@FindBy(xpath = "//ul[@class='dropdown-menu ng-scope']//a[@class='ng-binding'][normalize-space()='Sales Orders']")
	public WebElement SalesOrdersBtn;
	
	@FindBy(xpath = "//cmp-excel-export[@class='ng-isolate-scope']//i[@class='fas fa-file-excel export-icon']")
	public WebElement ExcelExportBtn;
	
	@FindBy(xpath = "//div[@class='downloading-loader v3']//i[@class='fas fa-spinner fa-spin']")
	public WebElement ExcelExportLoader;

}
