package Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cleartrip.com");
		
		
		driver.findElement(By.xpath("//div[@class='px-1 plNew  flex flex-middle nmx-1 pb-1']")).click();
		
		WebElement target = driver.findElement(By.xpath("//h2[@class='fs-6 px-4 c-neutral-400 fw-400']"));
		System.out.println(target);
		Actions act = new Actions(driver);
		Thread.sleep(10000);
		
		for(int i=0;i<=2;i++)
		{
			act.clickAndHold(target).perform();
		}
		Thread.sleep(8000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
        System.out.println(robot);
		Thread.sleep(8000);

        
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.className("q")).click();
        
        robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(8000);
       
		driver.findElement(By.name("btnK")).click();
        
        
		
			

	}

}
