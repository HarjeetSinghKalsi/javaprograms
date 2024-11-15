package testng_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


// Choosing browser using choosing browser.xml
// also using with cross browser testing.xml and parallel testing.xml
public class Choosing_Browser
{
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void testchrome(String nameofbrowser)
	
	{
	  if (nameofbrowser.equals("chrome"))  
	   {
	       driver = new ChromeDriver();		
	   }
	  if (nameofbrowser.equals("firefox"))   
       {
		   driver = new FirefoxDriver();
	   }
      if (nameofbrowser.equals("edge"))	   
	   {
		   driver = new EdgeDriver();		
	   }
      
      driver.manage().window().maximize();
	  driver.get("https://www.Amazon.in");
     WebElement e1=  driver.findElement(By.name("field-keywords"));
      e1.sendKeys("shoes" + Keys.ENTER);
      
      
	   
	}

}
