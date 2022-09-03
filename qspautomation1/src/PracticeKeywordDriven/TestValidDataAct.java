package PracticeKeywordDriven;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;

public class TestValidDataAct extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
      String usename = flib.readPropertFile(PROP_PATH, "username");
	  String password = flib.readPropertFile(PROP_PATH, "password");
	
	
	
	
	  driver.findElement(By.name("username")).sendKeys(usename);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	  
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(8000);
	  
	//bt.closeBrowser();

	}

}
