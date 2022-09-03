package DataDrivenFramwork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://127.0.0.1/login.do;jsessionid=q1ht1l73b7jn");
	Thread.sleep(3000);
	
	
	Flib flib = new Flib();
	String username = flib.getExceldata("./data/TestDataAct.xlsx","validcreds",1,0);
	String password = flib.getExceldata("./data/TestDataAct.xlsx","validcreds",1,1);
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
}
}

