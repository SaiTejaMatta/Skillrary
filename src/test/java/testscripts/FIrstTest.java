package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FIrstTest extends BaseClass {
	@Test
	public void FirstTest() {
		SoftAssert soft=new SoftAssert();
		home.clickGears();
		home.clickskillarydemoApp();
		web.handleChildBrowser();
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		skillraryDemo.mouseHoverToCourse(web);
		skillraryDemo.clickSeleniumTraining();
		soft.assertEquals(selenium.getPageHeader(),"Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.explicityWait(time, selenium.getItemAddedMessage());
		web.takeScreenshot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		selenium.getItemAddedMessage();
		
		
	}

}
