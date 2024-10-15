
package basic_selenium;

import org.openqa.selenium.chrome.ChromeDriver;


public class Launch_Browser_With_GetTitle {

	public static void main(String[] args)
	{
			
		ChromeDriver driver = new ChromeDriver(); //creating an object of ChromeDriver class to launch browser
	    driver.get("https://www.flipkart.com"); //provide url to open application
	    String driver1 =driver.getTitle(); //get the title of application
	    System.out.println(driver1);
	    driver.close(); //close the parent window/tab
	    //driver.quit();
	    

	}

}
