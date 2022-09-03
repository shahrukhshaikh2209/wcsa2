package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchinstagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagra.com");
		Thread.sleep(5000);
		driver.close();
		
	}

}
