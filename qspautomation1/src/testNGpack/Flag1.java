package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description="this test is used to perform a valid login")
  public void validActiTimeTest() 
  {
	  Reporter.log("valid login is performed",true);
  }
  
  
  @Test(description="this test is used to perform invalid login")
  public void invalidActiTimeTest() 
  {
	  Reporter.log("valid login is performd",true);
  }
}
