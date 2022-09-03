package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		 driver.switchTo().activeElement().sendKeys("pheobe buffey",Keys.ENTER);
		 Thread.sleep(8000);
		 driver.findElement(By.className("1NPNE")).clear();

}
}
