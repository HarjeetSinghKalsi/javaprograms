package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_Signin {

	public static void main(String[] args)
	{
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.Amazon.in");
	    driver.manage().window().maximize();
	   
	    //Hoverover
	    WebElement e1= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	    Actions a1 = new Actions(driver);
	    a1.moveToElement(e1).perform();
	    	
	    WebElement e2 =  driver.findElement(By.xpath("//span[@Class='nav-action-inner']"));
	    e2.click();
	    
	    WebElement e3 =  driver.findElement(By.id("ap_email"));
	    e3.sendKeys("harjeet.kalsi007@gmail.com");
	    
	    WebElement e4 =  driver.findElement(By.id("continue"));
	    e4.click();
	    
	    WebElement e5 =  driver.findElement(By.id("ap_password"));
	    e5.sendKeys("Password@123");
	    
	    WebElement e6 =  driver.findElement(By.id("signInSubmit"));
	    e6.click();
	    
	  
	    
	    
	    
	    
	    
	    
		

	}

}
