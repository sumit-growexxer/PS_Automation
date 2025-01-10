package page.actions;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page.locators.CommonLocators;
import utils.SeleniumDriver;

public class CommonActions {

	CommonLocators CommonLocators = null;

	public CommonActions() {
		this.CommonLocators = new CommonLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CommonLocators);

	}

	public void HoverOnOprations() {

		if (SeleniumDriver.getDriver().getCurrentUrl().contains("stgnavigator")) {

			SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(CommonLocators.operationABtn));

			Actions action = new Actions(SeleniumDriver.getDriver());

			action.moveToElement(CommonLocators.operationABtn).perform();

		} else {

			SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(CommonLocators.operationsBtn));

			Actions action = new Actions(SeleniumDriver.getDriver());

			action.moveToElement(CommonLocators.operationsBtn).perform();

		}

	}

	public void HoverOnAccount() {

		if (SeleniumDriver.getDriver().getCurrentUrl().contains("stgnavigator")) {

			SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(CommonLocators.AccountABtn));

			Actions action = new Actions(SeleniumDriver.getDriver());

			action.moveToElement(CommonLocators.AccountABtn).perform();

		} else {

			SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(CommonLocators.AccountBtn));

			Actions action = new Actions(SeleniumDriver.getDriver());

			action.moveToElement(CommonLocators.AccountBtn).perform();

		}

	}

	public void HoverOnsales() throws InterruptedException {

		Thread.sleep(1000);

		if (SeleniumDriver.getDriver().getCurrentUrl().contains("stgnavigator")) {

			Actions action = new Actions(SeleniumDriver.getDriver());

			SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(CommonLocators.SalesABtn));

			action.moveToElement(CommonLocators.SalesABtn).build().perform();

		} else {

			Actions action = new Actions(SeleniumDriver.getDriver());

			SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(CommonLocators.SalesBtn));

			action.moveToElement(CommonLocators.SalesBtn).build().perform();

		}

	}
	
	public void HoverOnAccountingAndWallet() throws InterruptedException {

		Thread.sleep(1000);

	Actions action = new Actions(SeleniumDriver.getDriver());

			SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(CommonLocators.AccountingAndWalletBtn));

			action.moveToElement(CommonLocators.AccountingAndWalletBtn).build().perform();

		}

	public void ClickOnSearchbar() {

		CommonLocators.SearchBar.click();
	}

	public void EnterText() {

		CommonLocators.SearchBar.sendKeys("0000");
	}

	public void ClickOnsearchButton() {

		CommonLocators.SearchBtn.click();

	}

	public void ClickOnExcelButton() {

		boolean retry = true;
		int attempts = 0;
		while (retry && attempts < 3) {

			try {

//SeleniumDriver.Wait().until(d -> CommonLocators.ExcelBtn.isDisplayed());
				SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(CommonLocators.ExcelBtn));

				CommonLocators.ExcelBtn.click();

				retry = false;

			} catch (StaleElementReferenceException e) {
				attempts++;
				System.out.println("Retrying due to stale element: Attempt " + attempts);
			}

		}

	}

	public void ClickOnNoteIcon() {

		SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(CommonLocators.NoteBtn));
		SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(CommonLocators.NoteBtn));

		CommonLocators.NoteBtn.click();

	}

	public void EnterTextOnNote() throws InterruptedException {

		Thread.sleep(3000);
		if (CommonLocators.NoteField.isDisplayed()) {

			CommonLocators.NoteField.sendKeys("NewNote");

		} else {
			SeleniumDriver.getDriver().navigate().refresh();

			SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(CommonLocators.NoteBtn));

			CommonLocators.NoteBtn.click();

			SeleniumDriver.Wait().until(ExpectedConditions.elementToBeClickable(CommonLocators.NoteField));
			CommonLocators.NoteField.sendKeys("NewNote");
		}

	}

	public void SelectPrivacyOnNote() throws InterruptedException {

		CommonLocators.NotePrivacyDropdown.click();

		Thread.sleep(2000);
		CommonLocators.NotePrivacyAsPvt.click();

	}

	public void ClickOnSaveOnNote() {

		CommonLocators.NoteSaveBtn.click();

	}

	public void VerifyAddedNote() {

	}

}
