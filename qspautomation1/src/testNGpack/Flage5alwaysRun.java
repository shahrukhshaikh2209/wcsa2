package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flage5alwaysRun {
  @Test
  public void actiTimeLogin() 
  {
	  int i=9/0;
	  System.out.println(i);
	  Reporter.log("login sucesfull",true);
  }
  
  @Test(dependsOnMethods="actiTimeLogin",alwaysRun=true)
  public void actiTimeCreateUser()
  {
	  Reporter.log("create user",true);
	  
  }
  
  
  
  @Test(dependsOnMethods="actiTimeLogin")
  public void actiTimeLogOut()
  {
	  Reporter.log("logout succesfull",true);
  }
}
