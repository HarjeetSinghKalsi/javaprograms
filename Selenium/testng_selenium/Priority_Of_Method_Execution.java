package testng_selenium;

import org.testng.annotations.Test;

public class Priority_Of_Method_Execution
{
	@Test(priority=2)
	public void login()
	{
		
	}
	
	@Test(priority=3)
	public void logout()
	{
		
	}
	
	@Test(priority=1)
	public void registration()
	{
		
	}
	
	@Test //default priority of any @Test is 0
	public void signin()
	{
		
	}


}
