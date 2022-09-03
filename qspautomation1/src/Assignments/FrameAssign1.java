package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class FrameAssign1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	    Thread.sleep(5000);
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles)
			
		{
			driver.switchTo().window(handle);
			driver.close();
			Thread.sleep(5000);
		}
		

	}

}
