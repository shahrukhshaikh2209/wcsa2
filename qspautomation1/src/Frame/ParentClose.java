package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentClose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.bluestone.com");
		Thread.sleep(10000);
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(12000);

		WebElement chat = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
		driver.switchTo().frame(chat);
		Thread.sleep(8000);

		driver.findElement(By.id("name")).sendKeys("shahrukh");
		
		
}
	

	}


