package testng_selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Two_Test_Case_Executing
{
	@Test
	public void TestCase2()
	{
		
		System.out.println("Login Amazon -> searchingn a product -> adding to wishlist");	
	
	}
	
	@BeforeMethod
	public void prerequisit()
	{
		System.out.println("Launching a browser");
	
	}
	
	@Test
	public void TestCase1()
	{
		
		System.out.println("Login Amazon -> searchingn a product");	
	
	}
	
	@AfterMethod
	public void closingbrowser()
	{
		System.out.println("closing browser");

	}
}
