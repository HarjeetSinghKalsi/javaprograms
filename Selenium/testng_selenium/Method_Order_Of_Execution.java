package testng_selenium;

import org.testng.annotations.Test;

//if a particular class have 3 @Test than what is the order of execution of them.
//ans - alphabetical order of method name and method should e lower case only other it will not follow.

public class Method_Order_Of_Execution 
{
	@Test
	public void login()
	{
		
	}
	
	@Test
	public void logout()
	{
		
	}
	
	@Test
	public void registration()
	{
		
	}

}
