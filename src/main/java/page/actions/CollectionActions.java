package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import page.locators.CollectionLocators;
import utils.SeleniumDriver;

public class CollectionActions {
	
	CollectionLocators CollectionLocators = null;
	
	public CollectionActions() {
		this.CollectionLocators= new CollectionLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CollectionLocators);
		
	}
	
	
	public void ClickOnCollection() {
		
		CollectionLocators.CollectionBtn.click();
		
    	//SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(SeleniumDriver.getDriver().findElement(By.id("myframe"))));
		SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(CollectionLocators.TotalTxt));
	}
	
    public void VerifyCollection() {

    //	SeleniumDriver.Wait().until(ExpectedConditions.invisibilityOf(SeleniumDriver.getDriver().findElement(By.id("myframe"))));
		SeleniumDriver.Wait().until(ExpectedConditions.urlContains("collection"));
		Assert.assertEquals(SeleniumDriver.getDriver().getCurrentUrl(), "https://stgnavigator.parkstreet.com/router.php/collection");
		SeleniumDriver.Wait().until(ExpectedConditions.visibilityOf(CollectionLocators.TotalTxt));

	}

}
