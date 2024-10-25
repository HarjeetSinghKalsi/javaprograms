package testng_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//how to run same test case with multiple times and multiple inputs.
public class Data_Provider
{
	
	@DataProvider(name="set1") //giving name to data Provider
	public Object [][] methodsearch() //return type of data Provider is Object class of 2 dimension  and then method name
	{
		
		//if return type is not void and of other type i.e. Object [][] then we have to use return keyword.
		//creating object of Object class i.e. new Object[][] and passing value.
		return new Object[][] {{"100"}, {"SriLanka"}, {"Bangladesh"}}; 	
		
	}
	
	
	@Test(dataProvider="set1")
	public void searchgoogle(String input) //giving input to method and its String type
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.name("q"));
		e1.sendKeys(input + Keys.ENTER);
	}

}
