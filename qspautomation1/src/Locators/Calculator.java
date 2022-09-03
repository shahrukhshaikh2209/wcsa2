package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.findElement(By.xpath("//span[text()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='×']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='3']")).click();

	}

}
