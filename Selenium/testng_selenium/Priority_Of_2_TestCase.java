package testng_selenium;

import org.testng.annotations.Test;

//what will be the order of execution of 2 @Test if both have the same priority
//ans - alphabetic order of execution

public class Priority_Of_2_TestCase
{
	@Test(priority=1)
	public void logout()
	{
		
	}
	
	@Test(priority=1)
	public void login()
	{
		
	}

}
