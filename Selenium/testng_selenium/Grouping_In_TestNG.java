package testng_selenium;

import org.testng.annotations.Test;

public class Grouping_In_TestNG {
	
	@Test(groups = {"integration"})
	public void TestCase1()
	{
		
	}
	
	@Test(groups = {"integration"})
	public void TestCase2()
	{
		
	}
	
	@Test(groups = {"system","smoke"})
	public void TestCase3()
	{
		
	}
	
	@Test(groups = {"system"})
	public void TestCase4()
	{
		
	}
	
	@Test(groups = {"integration"})
	public void TestCase5()
	{
		
	}

}
