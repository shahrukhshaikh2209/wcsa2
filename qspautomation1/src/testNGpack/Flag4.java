package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void actTimeLogin()
  {
	  int i=9/0;
     System.out.println(i);
	  Reporter.log("login successful",true);  
  }
  
  @Test (dependsOnMethods="actTimeLogin")
  public void actitimeCreateUser()
  {
	  Reporter.log("create user",true);
  }
  
  @Test(dependsOnMethods="actitimeCreateUser")
  public void actitimeLogout()
  {
	  Reporter.log("logout succesful",true);
  }
}
