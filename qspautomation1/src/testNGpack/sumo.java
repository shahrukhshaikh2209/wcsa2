package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sumo {
  @Test()
  public void methode2()
  {
	  int a=2/0;
	  Reporter.log("methode2",true);
	  System.out.println(a);
	  
  }
}
