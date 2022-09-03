package PracticeKeywordDriven;

import java.io.IOException;

import org.openqa.selenium.By;

import KeywordDrivenFramwork.Flib;

public class TestInvalidData extends BaseTest {

	private static final String EXCEL_PATH = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		
		
		int path = flib.getRowCount(EXCEL_PATH,"invalidcreds");
		
		
		for(int i=1; i<=path; i++)
		{
			String username = flib.readExcelData(EXCEL_PATH,"invalidcreds",i,0);
			String password = flib.readExcelData(EXCEL_PATH,"invalidcreds",i,1);
			
			
			  driver.findElement(By.name("username")).sendKeys(username);
			  driver.findElement(By.name("pwd")).sendKeys(password);
			  
			  driver.findElement(By.id("loginButton")).click();
			  Thread.sleep(8000);
			  driver.findElement(By.name("username")).clear();
			  System.out.println(i);

			  
		}
		
		

	}

}
