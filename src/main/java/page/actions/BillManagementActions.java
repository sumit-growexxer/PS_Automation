package page.actions;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.BillManagementLocators;
import utils.SeleniumDriver;

public class BillManagementActions {

	BillManagementLocators BillManagementLocators = null;

	public BillManagementActions() {
		this.BillManagementLocators = new BillManagementLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BillManagementLocators);

	}

	public void ClickOnBillManagement() throws InterruptedException {

		BillManagementLocators.BillManagementBtn.click();
		// SeleniumDriver.getDriver().switchTo().frame(SeleniumDriver.getDriver().findElement(By.id("myframe")));
		// Thread.sleep(5000);
		// SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(SeleniumDriver.getDriver().findElement(By.xpath("(//div[@class='text-ellipsis'])[8]"))));
		// SeleniumDriver.getDriver().switchTo().defaultContent();
		// SeleniumDriver.Wait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(SeleniumDriver.getDriver().findElement(By.id("myframe"))));
	}

	public void VerifyBillManagement() {
		// SeleniumDriver.Wait().until(ExpectedConditions.invisibilityOf(SeleniumDriver.getDriver().findElement(By.id("myframe"))));

		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("bill-management"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(),
				"https://stgappnavigator.parkstreet.com/bill-management");
		// SeleniumDriver.getDriver().switchTo().frame(SeleniumDriver.getDriver().findElement(By.id("myframe")));
		// SeleniumDriver.Wait().until(ExpectedConditions.invisibilityOf(SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='text-ellipsis']"))));
		// SeleniumDriver.getDriver().switchTo().defaultContent();
		// SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(SeleniumDriver.getDriver().findElement(By.xpath("(//div[@class='text-ellipsis'])[8]"))));

	}

	public void ClickOnExcelButtonOnBillManagement() throws InterruptedException {
		
		boolean retry = true;
		int attempts = 0;
		while (retry && attempts < 3) {
		
		try {
			
			Thread.sleep(5000);
			SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(BillManagementLocators.ExcelBtnBillManagement));
			SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(BillManagementLocators.ExcelBtnBillManagement));
		
		BillManagementLocators.ExcelBtnBillManagement.click();
		
		 retry = false;

		 } catch (StaleElementReferenceException e) {
			 attempts++;
		        System.out.println("Retrying due to stale element: Attempt " + attempts);
	     }
		
		}

		

	}

	public void ClickOnSearchbarOnBillManagement() {
		BillManagementLocators.SearchBarBillManagement.click();

	}
	
	public void EnterTextInSearchbarOnBillManagement() {
		
		BillManagementLocators.SearchBarBillManagement.sendKeys("1234");
		
	}
	
	public void ClickOnsearchButtonOnBillManagement() {
		
		BillManagementLocators.SearchBtnBillManagement.click();
		
	}
	
	public void ClickOnNoteIconOnBillManagement() {
		
		SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(BillManagementLocators.NoteBtnBillManagement));
		SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(BillManagementLocators.NoteBtnBillManagement));
		
		
		BillManagementLocators.NoteBtnBillManagement.click();
		
	}
	
	public void EnterTextOnNoteOnBillManagament() {
		
		
		
		SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(BillManagementLocators.NoteFieldBillManagement));
		
		BillManagementLocators.NoteFieldBillManagement.sendKeys("New Private Note");
		
	}
	
	public void SelectPrivacyOnNoteOnBillManagement() {
		
		BillManagementLocators.NotePrivacyDropdownBillManagement.click();
		
		BillManagementLocators.NotePrivacyAsPvtBillManagement.click();
		
	}
	
	
	
	public void ClickOnSaveOnNoteOnBillManagement() {
		
		BillManagementLocators.NoteSaveBtnBillManagement.click();
		
	}

}
