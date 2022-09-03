package PracticeXMl;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class p1 {
	WebDriver driver;
	@Test
	public void loginActitime()
	{
		/*driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();*/
		Reporter.log("Test annotation exicuted",true);
	}
	
	@Test
	public void actiTimelogout() throws InterruptedException
	{
		  
		 /* driver.findElement(By.name("username")).sendKeys("admn");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  
		  driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath(".//a[text()='Logout']")).click();*/
		Reporter.log("@test annotation exicuted",true);
	}
		@BeforeMethod
		public void lonchBrowser()
		{
			Reporter.log("bfore Method annotation exicuted",true);
		    /*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        RemoteWebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.get("http://127.0.0.1/login.do;jsessionid=57ss393utj34n");*/
			
		}
		@AfterMethod
		public void closebrowser()
		{
			//driver.close();
			Reporter.log("After method annotation exicuted",true);
		}
		
		
		@BeforeClass
		public void beforclass()
		{
			Reporter.log("bfore class annotation exicuted",true);
		}
		
		@AfterClass
		public void afterclass()
		{
			Reporter.log("after class annotation exicuted",true);
		}
}

