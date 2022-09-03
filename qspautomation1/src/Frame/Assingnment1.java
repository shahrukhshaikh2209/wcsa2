package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingnment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://bluestone.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
		Thread.sleep(8000);

       driver.findElement(By.xpath("//div[@class='lc-1x7wur2 e1dmt1bi0']")).click();
		Thread.sleep(8000);

       driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shahrukh");
	}

}
