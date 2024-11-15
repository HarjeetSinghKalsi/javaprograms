package amazon_test_case;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_And_Quit
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void precondition(String nameofbrowser) throws InterruptedException
	{
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
		      
		
		      driver.get("https://www.amazon.in/");
		      Thread.sleep(2000);
		      driver.manage().window().maximize();
		      
			  
		}
		
	}
	
	
	
	@AfterMethod
	public void postcondition() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		
	}

}
