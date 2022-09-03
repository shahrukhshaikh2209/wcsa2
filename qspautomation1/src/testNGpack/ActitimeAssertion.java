package testNGpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActitimeAssertion {
	WebDriver driver;
	
	@BeforeTest()
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  driver.get("http://127.0.0.1/login.do;jsessionid=12r0tudqv5ak6");
		
	}
	
	
	@Test
	public void ActiTime() throws InterruptedException
	{
		String loginPageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		
	
		//softAssert
		softassert.assertEquals(loginPageTitle, "Actitime - login");
		
		Reporter.log("login page title is verify",true);
		
		
		//hard Assert
		boolean statusofusernametextbox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusofusernametextbox,true);
		Reporter.log("username text box is displayed",true);
		driver.findElement(By.name("username")).sendKeys("admin");
		
		
		//--------------------------------------------------------------------------
		
		//hard assert
		
		
		boolean statusofpasswordtextbox = driver.findElement(By.name("pwd")).isDisplayed();
		Assert.assertEquals(statusofpasswordtextbox,true);
		Reporter.log("password text box is displayed",true);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//------------------------------------------------------------------------------
		
		
		
		boolean statusofloginbutton = driver.findElement(By.id("loginButton")).isDisplayed();
		Assert.assertEquals(statusofloginbutton,true);
		Reporter.log("login button  is displayed",true);
		driver.findElement(By.id("loginButton")).click();
		
		
		//---------------------------------------------------------------------------------------
		
		Thread.sleep(5000);
		
		String homePageTitle = driver.getTitle();
		softassert.assertEquals(homePageTitle," actiTime - Enter Time Track");
		
		
		Reporter.log("home page title is verified",true);
		
		Reporter.log("create user",true);
		Reporter.log("create reports",true);
		
		softassert.assertAll();
	}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
	
		
	}
	
	


