package testscripts;

import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;
import pompages.SkillraryDemoAppPage;

public class SecondTest extends BaseClass{
	public void SecondTest() {
		SoftAssert soft=new SoftAssert();
		home.clickGears();
		home.clickskillarydemoApp();
		web.switchToParentWindow();
		soft.assertEquals(skillraryDemo.getPageHeader(),"SkillRary-ECommerce");
		skillraryDemo.selectCategory(web, 1);
		soft.assertEquals(testing.getPageHeader(), "Testing");
		web.dragAndDropElement(testing.getSeleniumImage(), testing.getCartArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		soft.assertAll();
	}

}
