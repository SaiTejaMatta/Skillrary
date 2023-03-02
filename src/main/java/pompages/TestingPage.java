package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(id="Selenium Training")
	private WebElement SeleniumImage;
	@FindBy(id="cartArea")
	private WebElement cartArea;
	@FindBy(xpath="//footer[@class='main-footer']/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	//initialization
	public TestingPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	//Utilization
	public String getPageHeader()
	{
		return pageHeader.getText();
		}
	public WebElement getSeleniumImage() {
		return SeleniumImage;
	}
	public WebElement getCartArea(){
		return cartArea;
	}
	public WebElement getFacebookIcon() {
		return facebookIcon;
	}
	public void clickFacebookIcon() {
		facebookIcon.click();
	}
	

}
