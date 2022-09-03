package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2
{
  @Test(enabled= false)
  public void methode1()
  {
	  Reporter.log("actiTime valid",true);
	  
  }
  
  
  @Test
  public void method2()
  {
	  Reporter.log("Actitime create User");
  }
  
  
  @Test
  public void methode2()
  {
	Reporter.log("Actitime Create reporter",true);	  
  }
}
