package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//declaration
	@FindBy(name="usersSelector.selectedUser")private WebElement enterTimeTrackDropDown;
	@FindBy(xpath="//a[contains(text(),'task')]")private WebElement creatNewTaskLink;
	@FindBy(id="SubmitTTButton")private WebElement saveleaveTimeButton;
	@FindBy(xpath="//a[text()='Logout']")private WebElement logOutLink;
	
	
	//initiailization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	//utilizatin

	public WebElement getEnterTimeTrackDropDown() {
		return enterTimeTrackDropDown;
	}


	public WebElement getCreatNewTaskLink() {
		return creatNewTaskLink;
	}


	public WebElement getSaveleaveTimeButton() {
		return saveleaveTimeButton;
	}


	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	
	public void logoutActitime()
	{
		logOutLink.click();
	}
	
	
	
	

}
