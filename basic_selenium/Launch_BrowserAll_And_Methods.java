package basic_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Launch_BrowserAll_And_Methods
{

	public static void main(String[] args)
	{
			
		ChromeDriver driver = new ChromeDriver(); //creating an object of ChromeDriver class to launch browser
		//EdgeDriver driver1 = new EdgeDriver();
		//FirefoxDriver driver2 = new FirefoxDriver();
		//InternetExplorerDriver driver4 = new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com"); //provide url to open application
		driver.manage().window().maximize();
	    String title =driver.getTitle();      //get the title of application
		System.out.println(title);
	  //driver.close();    //close the parent/current window/tab
	    driver.quit();     //close both parent and child window/tab
		System.out.println(driver.getWindowHandle()); //it will give the parent window id
		System.out.println(driver.getWindowHandles()); ///it will give the parent/child window id	
		
	    

	}

}
