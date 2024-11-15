package testng_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept
{
	@Test
	public void assertion()
	{
		
	  ChromeDriver driver = new ChromeDriver(); 
	  driver.manage().window().maximize();
      driver.get("https://www.google.com"); 
      
      //Assert
      Assert.assertEquals(driver.getTitle(), "Google","sorry the test case is failed pls check again"); //using assertion to compare acutal vs expected result
      
	  WebElement e1 =driver.findElement(By.name("q"));
	  e1.sendKeys("India" + Keys.ENTER);
		

	}
}
