package JavaScriptExicuter;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollby {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		
		//SCOLL DOWN
		JavascriptExecutor jsw=(JavascriptExecutor)driver;
	    jsw.executeScript("window.scrollBy(0,1000)");
	    
	    Thread.sleep(4000);
	    
	   // SCROLL UP
	    
	    jsw.executeScript("window.scrollBy(0,-1000)");
		
	

}
}
