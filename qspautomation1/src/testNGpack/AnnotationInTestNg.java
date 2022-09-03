package testNGpack;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationInTestNg {
  @Test
  public void f() 
  {
	  Reporter.log("test case 1 exicute",true);
  }
  
  @Test
  public void f1()
  {
	  Reporter.log("test case 2 execute",true);
  }
  
  @BeforeMethod
  public void beforeMethde()
  {
	  Reporter.log("befor method exicuted",true);
	  
  }
  
  @org.testng.annotations.AfterMethod
  public void AfterMethod()
  {
	  Reporter.log("after method exicuted",true);
  }
  
  
  @BeforeClass()
  public void beforeMethode()
  {
	  Reporter.log("befor method exicuted",true);
  }
  
  @AfterClass()
  public void beforMethod()
  {
	  Reporter.log("after class exicuted",true);
  }
  
  
  @BeforeTest()
  public void beforetest()
  {
	  Reporter.log("before test exicuted",true);
  }
  
  @AfterTest()
  public void AffterTest()
  {
	  Reporter.log("after test exicuted",true);
  }
  
  
  @BeforeSuite()
  public void beforeSuite()
  {
	  Reporter.log("before suite exicuted",true);
  }
  
  @org.testng.annotations.AfterSuite()
  public  void AfterSuite()
  {
	  Reporter.log("afer suite exicuted",true);
  }
  
  {
	  
  
  
	  
  }
}
