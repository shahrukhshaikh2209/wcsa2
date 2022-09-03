package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test
  public void f() 
  {
	  
  }
  
  
  @Test(priority=1)
  public void a() 
  {
	  Reporter.log("a methode",true);
  }
  
  @Test(priority=1)
  public void b() 
  {
	  Reporter.log("b methode",true);
  }
  
  @Test(priority=1)
  public void c() 
  {
	  Reporter.log("c methode",true);
  }
  @Test
  public void d() 
  {
	  Reporter.log(" d methode",true);
  }
  
  
  @Test
  public void s() 
  {
	  Reporter.log("s methode",true);
  }
  
  @Test
  public void u() 
  {
	  Reporter.log("u methode",true);
  }
  
  @Test
  public void e() 
  {
	  Reporter.log("methode",true);
  }
  
  @Test(priority=6)
  public void x() 
  {
	  Reporter.log("x methode",true);
  }
  
  @Test(priority=2)
  public void v() 
  {
	  Reporter.log("v methode",true);
  }
  
  @Test
  public void z() 
  {
	  Reporter.log("z methode",true);
  }
}
