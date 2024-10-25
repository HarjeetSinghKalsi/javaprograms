package testng_selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Order_Of_Execution

{
	
	@Test
	public void testcase1()
	{
		System.out.println("Test Case 1");
	}
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("After Suite");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("After Method");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("After Class");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("After Test");
	}

}
