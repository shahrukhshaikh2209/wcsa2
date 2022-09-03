package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7invocation {
  @Test(invocationCount=5000)
  public void f() 
  {
	  Reporter.log("gabgka",true);
  }
}
