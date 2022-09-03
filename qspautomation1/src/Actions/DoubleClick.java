package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@class='button']")).click();
		 driver.findElement(By.xpath("//b[.='PIM']")).click();
		 driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		WebElement target=driver.findElement(By.xpath("//input[@class='duplexBox']"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform(); 

	}

}
