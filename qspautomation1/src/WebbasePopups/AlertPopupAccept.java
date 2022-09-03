package WebbasePopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupAccept {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("file:///C:/Users/shahrukh/Desktop/alert.html");
	driver.findElement(By.xpath("//button[.='Try it']")).click();
	Thread.sleep(3000);
	 org.openqa.selenium.Alert al = driver.switchTo().alert();
	 Thread.sleep(3000);
	 al.accept();
	}
	

	
		
	}

