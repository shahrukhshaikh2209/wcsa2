package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkartsort {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.flipkart.com");
 Thread.sleep(8000);
 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
 Thread.sleep(8000);
 driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("laptop");
 Thread.sleep(8000);
 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
 Thread.sleep(8000);
 driver.findElement(By.xpath("//div[.='Core i5' and @class='_3879cV']")).click();
 Thread.sleep(8000);
 driver.findElement(By.xpath("//div[.='Brand' and @class='_2gmUFU _3V8rao']")).click();
 Thread.sleep(8000);
 driver.findElement(By.xpath("//div[@class='_3879cV']")).click();
 Thread.sleep(8000);
 driver.findElement(By.xpath("//div[.='Operating System' and @class='_2gmUFU _3V8rao']")).click();
 Thread.sleep(8000);
 driver.findElement(By.xpath("//div[@class='_3879cV']")).click();

 

 
 
 
}
}
