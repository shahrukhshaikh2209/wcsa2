package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
  @Test
  public void actitime() 
  {
	  Reporter.log("enter the url",true);
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertEquals(false, true);
	  Reporter.log("verify the title of login page",true);
	  Reporter.log("enter the username",true);
	  Reporter.log("enetr the password",true);
	  
	  
	  Reporter.log("click on login buttun",true);
	  Reporter.log("verify the homepag",true);
	  Reporter.log("create user",true);
	  Reporter.log("create user",true);
	  Reporter.log("DELETE user",true);
	  Reporter.log("CREATE REPORT",true);
	  
	  softassert.assertAll();
	  
	  
	  
	  
  }
}
