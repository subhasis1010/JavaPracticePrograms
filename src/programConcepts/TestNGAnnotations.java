package programConcepts;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@Test
	public void testCar()
	{
		System.out.println("this is a test for car");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testBus()
	{
		System.out.println("this is a test for bus");
	}
	
	public void testBus1()
	{
		System.out.println("this is a test for second bus");
	}
	
	
	@BeforeMethod
	public void methodBCar()
	{
		System.out.println("this is before method");
	}
	
	@BeforeTest
	public void testBCar()
	{
		System.out.println("this is before test");
		Assert.assertTrue(true);
	}
	
	@AfterTest
	public void testACar()
	{
		System.out.println("this is after test");
	}
	
	@AfterMethod
	public void methodAcar()
	{
		System.out.println("this is after method");
	}

}
