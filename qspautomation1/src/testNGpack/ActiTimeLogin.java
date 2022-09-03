package testNGpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeLogin {
	
	WebDriver driver;
  @Test
  @Parameters({"browser","username","password"})
  public void actiTime(String browservalue, String username, String password) 
  {
	  if (browservalue.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("http://127.0.0.1/login.do;jsessionid=12r0tudqv5ak6");
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	  driver.findElement(By.id("loginButton")).click();
	  driver.close();
	  }
	  
	  else if (browservalue.equalsIgnoreCase("firefox")) 
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver= new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  driver.get("http://127.0.0.1/login.do;jsessionid=12r0tudqv5ak6");
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  driver.findElement(By.id("loginButton")).click();
		  driver.close(); 
	  }
  }
}
