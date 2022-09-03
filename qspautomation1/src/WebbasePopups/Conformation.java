package WebbasePopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conformation {
public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("file:///C:/Users/shahrukh/Desktop/abc.html");
	driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
	Thread.sleep(3000);
	 org.openqa.selenium.Alert al = driver.switchTo().alert();
	 Thread.sleep(3000);
	 al.dismiss();

}
}


