package JavaScriptExicuter;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebbasePopups.Chrome;

public class Rightleft {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@class='sc-dznXNo imttdp'])[1]")).click();
		
		//scroll right
		
		Thread.sleep(4000);
		
		JavascriptExecutor jsw = (JavascriptExecutor)driver;
		jsw.executeScript("window.scrollBy(1000,0)");
		
		//scroll left
		Thread.sleep(4000);
		jsw.executeScript("window.scrollBy(-1000,0)");
	}

}
