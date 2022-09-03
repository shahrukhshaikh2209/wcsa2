package takesScreenShotsDynamically;

import java.io.File;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseTest {
	static WebDriver driver;
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedrivers.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("www.flipkart.com");
		
	}
	
	public void failed(String methodName)
	{
		
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/"+methodName+".jpg");
			Files.copy(src, dest);
		}
		catch (Exception e) 
		{
	
		
		}
	}
}
