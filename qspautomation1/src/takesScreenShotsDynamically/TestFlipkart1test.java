package takesScreenShotsDynamically;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListner.class)

public class TestFlipkart1test extends BaseTest{
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
	}
	
	@Test
	public void TestFlipKart1()
	{
		Assert.fail();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
