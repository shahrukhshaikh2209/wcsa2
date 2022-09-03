package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement target = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9' and @alt='Fashion']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		act.moveToElement(target);
	}

}
