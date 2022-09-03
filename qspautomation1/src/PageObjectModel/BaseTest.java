package PageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements iAutoConstant {
	static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browservalue = flib.readPropertFile(PROP_PATH, "browser");
		
		
		String url = flib.readPropertFile(PROP_PATH, "url");
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);

		}
		else if(browservalue.equalsIgnoreCase("firfox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			
		
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);

		}
		
	}
	public void closeBrowser()
	{
		driver.quit();
		
	}

}