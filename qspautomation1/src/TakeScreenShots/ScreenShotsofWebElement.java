package TakeScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotsofWebElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//TakesScreenshot ts = (TakesScreenshot)driver;  //down casting
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com");
		Thread.sleep(8000);
		
		WebElement loginbutton = (WebElement) driver.findElements(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
				
		
		//EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		File src = loginbutton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/loginbutton.jpg");
		Files.copy(src, dest);

}
}