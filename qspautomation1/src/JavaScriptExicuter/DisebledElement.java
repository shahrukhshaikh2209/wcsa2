package JavaScriptExicuter;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisebledElement {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///E:/WCSA2/html2/disabledelement.html");
		
		
		JavascriptExecutor jsw=(JavascriptExecutor)driver;
		jsw.executeScript("document.getElementById('i1').value='shahrukh'");
		
		
		//document.getElementById('i1').value='shahrukh'


}
}
