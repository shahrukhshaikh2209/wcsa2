package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 12");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(20000);

		//driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]")).click();
		

		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(20000);
		
		
	  String parenthandle = driver.getWindowHandle();
	 
	  System.out.println(parenthandle);
	  
	 Set<String> abc = driver.getWindowHandles();
	 
	 System.out.println(abc);
	 
	 for(String handle:abc)
	 {
		 if(!parenthandle.equals(handle))
		 {
			 System.out.println(handle);
			
			driver.switchTo().window(handle);
		 }
	 }
	 
	 
	Thread.sleep(20000);
	Robot robot = new Robot();
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 
	 robot.keyPress(KeyEvent.VK_TAB);
	 robot.keyRelease(KeyEvent.VK_TAB);
	 
	 robot.keyRelease(KeyEvent.VK_CONTROL);



	
	 Thread.sleep(20000);

		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
		Thread.sleep(20000);

		driver.findElement(By.xpath("(//a[@class='_1fGeJ5'])[2]")).click();
		Thread.sleep(20000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(20000);

		driver.findElement(By.xpath("(//div[@class='_3dsJAO'])[2]")).click();
	}		
	}


		
	


