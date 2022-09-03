package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameIntIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shahrukh/Desktop/username.html");
		Thread.sleep(4000);
		driver.findElement(By.id("un")).sendKeys("admin");
		Thread.sleep(4000);

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frid']"));
		driver.switchTo().frame(0);
		Thread.sleep(4000);

		driver.findElement(By.id("pwd")).sendKeys("123");
		Thread.sleep(4000);

		driver.switchTo().parentFrame();
		Thread.sleep(4000);

		driver.findElement(By.id("un")).clear();
		
	}

	}


