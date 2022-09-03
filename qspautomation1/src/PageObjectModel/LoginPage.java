package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	//declaration
	
	@FindBy(name="username")private WebElement usn;
	@FindBy(name="pwd")private WebElement pass;
	@FindBy(id="loginButton")private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox")private WebElement  checkBox;
	@FindBy(xpath="//a[contains(text(),'Actimind Inc.')]")private WebElement linkActitime;
	@FindBy(id="licenseLink")private WebElement licenseLink;
	@FindBy(xpath="//img[contains(@src,'timer')]")private WebElement logoActiTime;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Utilization

	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getLinkActitime() {
		return linkActitime;
	}

	public WebElement getLicenseLink() {
		return licenseLink;
	}

	public WebElement getLogoActiTime() {
		return logoActiTime;
	}
	
	
//opetional method
	
	public void validLoginActiTime(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginButton.click();
	}
	
	
	public void invalidLoginActitime(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginButton.click();
		
		Thread.sleep(4000);
		usn.clear();
		
		
	}
	

}
