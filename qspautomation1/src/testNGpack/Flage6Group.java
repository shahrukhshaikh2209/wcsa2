package testNGpack;

import org.checkerframework.common.util.report.qual.ReportReadWrite;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flage6Group {
  @Test(groups = "FUNCTIONAL")
  public void fT1() 
  {
	  Reporter.log("functional test case",true);
  }
  
  @Test(groups = "INT")
  public void iT1() 
  {
	  Reporter.log("INT test case",true);
  }
  
  
  @Test(groups = "SMOKE")
  public void sT1() 
  {
	  Reporter.log("SMOKE test case",true);
  }
  
  //--------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void fT2() 
  {
	  Reporter.log("functional test case",true);
  }
  
  @Test(groups = "INT")
  public void iT2() 
  {
	  Reporter.log("INT test case",true);
  }
  
  
  @Test(groups = "SMOKE")
  public void sT2() 
  {
	  Reporter.log("SMOKE test case",true);
  }
  
  
  //-----------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void fT3() 
  {
	  Reporter.log("functional test case",true);
  }
  
  @Test(groups = "INT")
  public void iT3() 
  {
	  Reporter.log("INT test case",true);
  }
  
  
  @Test(groups = "SMOKE")
  public void sT3() 
  {
	  Reporter.log("SMOKE test case",true);
	  
  }
  
  
  //--------------------------------------------------------------
  
  
  @Test(groups = "FUNCTIONAL")
  public void fT4() 
  {
	  Reporter.log("functional test case",true);
  }
  
  @Test(groups = "INT")
  public void iT4() 
  {
	  Reporter.log("INT test case",true);
  }
  
  
  @Test(groups = "SMOKE")
  public void sT4() 
  {
	  Reporter.log("SMOKE test case",true);
  }
  //---------------------------------------------------------------------------------
  
  
  
  @Test(groups = "FUNCTIONAL")
  public void fT5() 
  {
	  Reporter.log("functional test case",true);
  }
  
  @Test(groups = "INT")
  public void iT5() 
  {
	  Reporter.log("INT test case",true);
  }
  
  
  @Test(groups = "SMOKE")
  public void sT5() 
  {
	  Reporter.log("SMOKE test case",true);
  }
  
  
  //-----------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void fT6() 
  {
	  Reporter.log("functional test case",true);
  }
  
  @Test(groups = "INT")
  public void iT6() 
  {
	  Reporter.log("INT test case",true);
  }
  
  
  @Test(groups = "SMOKE")
  public void sT6() 
  {
	  Reporter.log("SMOKE test case",true);
  }
  
}
