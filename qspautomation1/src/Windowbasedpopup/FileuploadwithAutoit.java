package Windowbasedpopup;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;

public class FileuploadwithAutoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
		Thread.sleep(8000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		WebElement fileuploadbutton = driver.findElement(By.id("photofile"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(fileuploadbutton).perform();
		Thread.sleep(4000);
		
		File abs = new File("/qspautomation1/autoitfiles/ss.exe");
		String abspath = abs.getAbsolutePath();
		Runtime.getRuntime().exec(abspath);
		Thread.sleep(4000);
		Runtime.getRuntime().exec(abspath);
		
		
		
		
		
		
		
		
		
		

	}

}
