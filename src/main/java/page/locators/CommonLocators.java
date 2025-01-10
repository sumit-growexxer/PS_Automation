package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonLocators {
	
	@FindBy(xpath = "//li[@id='628']")
	public WebElement operationsBtn;
	
	@FindBy(xpath = "//li[@id='li-628']")
	public WebElement operationABtn;
	
	@FindBy(xpath = "//li[@id='626-628']")
	public WebElement SalesBtn;
	
	@FindBy(xpath = "//li[@id='li-626-628']")
	public WebElement SalesABtn;
	
	@FindBy(xpath = "//li[@id='627']")
	public WebElement AccountBtn;
	
	@FindBy(xpath = "//li[@id='li-627']")
	public WebElement AccountABtn;
	
	@FindBy(xpath = "//span[normalize-space()='Accounting & Wallet']")
	public WebElement AccountingAndWalletBtn;
		
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")
	public WebElement SearchBar;
	
	@FindBy(xpath = "//button[@data-ng-click='$ctrl.onEnter({text: $ctrl.topBarConfig.searchText})']")
	public WebElement SearchBtn;
	
	@FindBy(xpath = "//cmp-excel-export[@class='ng-isolate-scope']")
	public WebElement ExcelBtn;
	
	@FindBy(xpath = "//i[contains(@class,'note-modal')]")
	public WebElement NoteBtn;
	//div[contains(@class,'ag-row ag-row-no-focus ag-row-odd ag-row-level-0 ag-row-hover')]//div[contains(@role,'gridcell')]//span//span[contains(@class,'attachments-notes')]//span//i[contains(@class,'fal fa-comment note-modal')]

	@FindBy(xpath = "//div[contains(@role,'textbox')]")
	public WebElement NoteField;
	
	@FindBy(xpath = "//button[@class='btn psi-button psi-primary']")
	public WebElement NoteSaveBtn;
	
	@FindBy(xpath = "//button[contains(@class,'psi-select btn btn-default')]")
	public WebElement NotePrivacyDropdown;
	//button[contains(@class,'psi-select btn btn-default')]//i[contains(@class,'far fa-chevron-down')]
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/widget-notes-v2[1]/div[1]/div[2]/form[1]/div[2]/psi-multiselect-dropdown-v2[1]/div[1]/div[1]/ul[1]/div[1]/li[2]/a[1]")
	public WebElement NotePrivacyAsPvt;
	
}
