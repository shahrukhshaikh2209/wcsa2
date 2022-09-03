package PracticeKeywordDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import KeywordDrivenFramwork.Flib;

public class BaseTest implements IAutoit {
	static WebDriver driver;
	public void openBrowser() throws IOException
	
	{
		Flib flib = new Flib();
	    String browserValue = flib.readPropertFile(PROP_PATH,"browser");
	    String urlValue = flib.readPropertFile(PROP_PATH,"url");
	    
	    
	    
	    if(browserValue.equalsIgnoreCase("chrome"))
	    {
	    	System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(urlValue);

	    }
	    else if(browserValue.equalsIgnoreCase("Firefox")) 
	    {
	    	System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(urlValue);

	    }
	    
	}
	public void closeBrowser()
	{
		driver.quit();
		
	
	

		
	}
	

}
