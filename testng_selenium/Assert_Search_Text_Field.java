package testng_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Search_Text_Field 

{
	@Test
	public void testcase1()
	{
		ChromeDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
	      driver.get("https://www.google.com");   
	    	      
		  WebElement Search_Text_field =driver.findElement(By.name("q"));
		  
		  //Assert
		  Assert.assertEquals(Search_Text_field.isDisplayed(), true);
		  
		  Search_Text_field.sendKeys("India" + Keys.ENTER);
		
	}

}
