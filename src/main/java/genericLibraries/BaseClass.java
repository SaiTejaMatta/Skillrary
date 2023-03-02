package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.CoreJavaForSeleniumPage;
import pompages.CoreJavaVideoPage;
import pompages.HomePage;
import pompages.SeleniumTrainingPage;
import pompages.SkillraryDemoAppPage;
import pompages.TestingPage;

public class BaseClass {
	 protected propertiesFileutility property;
	 protected ExcelUtility excel;
	 protected WebDriverUtility web;
	 protected WebDriver driver;
	 protected HomePage home;
	 protected SkillraryDemoAppPage skillraryDemo;
	 protected SeleniumTrainingPage selenium;
	 protected TestingPage testing;
	 protected CoreJavaForSeleniumPage coreJava;
	 protected CoreJavaVideoPage javaVideo;
	 protected ContactUsPage contact;
	 protected long time;
	 
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	
	public void classConfiguration()
	{
		 property=new propertiesFileutility();
		 excel=new ExcelUtility();
		 web=new WebDriverUtility();
		 
		 property.propertyFileInitialization(IConstantpath.PROPERTIES_FILE_PATH);
		 excel.excelInitialization(IConstantpath.EXCEL_FILE_PATH);
		
	}
	@BeforeMethod
	public void methodconfiguration()
	{
    time=Long.parseLong(property.fetchProperty("timeouts"));
	driver= web.openApplication(property.fetchProperty("browser"),property.fetchProperty("url"),time);
	       
	home=new HomePage(driver);
	Assert.assertTrue(home.getLogo().isDisplayed());
	skillraryDemo = new SkillraryDemoAppPage(driver);
		
	selenium=new SeleniumTrainingPage(driver);
	testing=new TestingPage(driver);
	coreJava=new CoreJavaForSeleniumPage(driver);
	javaVideo=new CoreJavaVideoPage(driver);
	contact =new ContactUsPage(driver);
	}
	@AfterMethod
	public void methodTearDown()
	{
		web.quitBrowser();
	}
	@AfterClass
	public void classTearDown()
	{
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite

}
