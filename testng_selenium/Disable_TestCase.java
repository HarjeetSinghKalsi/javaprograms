package testng_selenium;

import org.testng.annotations.Test;

//how to disable any test case in testNG

public class Disable_TestCase
{
	@Test(enabled=false) //disable test case
	public void login()
	{
		
	}
	
	@Test (priority=1, invocationCount=10)
	public void logout()
	{
		
	}
	
	@Test
	public void registration()
	{
		
	}

}
