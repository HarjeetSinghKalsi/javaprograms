package testng_selenium;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Int_Example
{
	@DataProvider(name="set1") //giving name to data Provider
	public Object [][] methodsearch() //return type of data Provider is Object class of 2 dimension  and then method name
	{
		
		//if return type is not void and of other type i.e. Object [][] then we have to use return keyword.
		//creating object of Object class i.e. new Object[][] and passing value.
		return new Object[][] {{100}, {200}, {300}}; 	
		
	}
	
	@Test(dataProvider="set1")
	public void search (int input)
	{
		int sum= 100+input;
        System.out.println(sum);
		Reporter.log("Addition is ->" + sum); //Reporter.log will help to print anything in emailable report.
		
		
	}

}
