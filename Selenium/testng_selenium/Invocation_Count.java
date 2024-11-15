package testng_selenium;

import org.testng.annotations.Test;

//how to execute the same test cases multiple times 

public class Invocation_Count
{
	@Test(invocationCount=10) //it will execute TC for 10 times
	public void login()
	{
		
	}
	
	
}
