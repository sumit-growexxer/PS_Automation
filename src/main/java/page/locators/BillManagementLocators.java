package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillManagementLocators {
	
	
	@FindBy(xpath = "//span[normalize-space()='Bill Management']")
	public WebElement BillManagementBtn;
	
	@FindBy(xpath = "//input[@class='input-search form-control ng-untouched ng-pristine ng-valid']")
	public WebElement SearchBarBillManagement;
	
	@FindBy(xpath = "//button[@class='u-pg-s-5 u-fs16 search-icon']")
	public WebElement SearchBtnBillManagement;
	
	@FindBy(xpath = "//app-cmp-excel-export[@ng-reflect-config='[object Object]']")
	public WebElement ExcelBtnBillManagement;
	
	@FindBy(xpath = "(//span[@class='fas u-v2-base-primary fa-comment notes-icon u-pg-ml-1 u-pointer'])[1]")
	public WebElement NoteBtnBillManagement;
	//div[contains(@class,'ag-row ag-row-no-focus ag-row-odd ag-row-level-0 ag-row-hover')]//div[contains(@role,'gridcell')]//span//span[contains(@class,'attachments-notes')]//span//i[contains(@class,'fal fa-comment note-modal')]

	@FindBy(xpath = "//div[contains(@role,'textbox')]")
	public WebElement NoteFieldBillManagement;
	
	@FindBy(xpath = "//button[contains(@class,'btn psi-button large primary')]")
	public WebElement NoteSaveBtnBillManagement;
	
	@FindBy(xpath = "//div[@id='multi_select_dropdown_entity_permissions']")
	public WebElement NotePrivacyDropdownBillManagement;
	//button[contains(@class,'psi-select btn btn-default')]//i[contains(@class,'far fa-chevron-down')]
	
	@FindBy(xpath = "(//div[@class='parent-option'])[2]")
	public WebElement NotePrivacyAsPvtBillManagement;

	
	//app[@class='ng-isolate-scope']//span[@class='ng-scope']
}
