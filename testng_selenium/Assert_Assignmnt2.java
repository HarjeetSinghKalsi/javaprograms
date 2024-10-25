package testng_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Assignmnt2 {
	//login amazon search product logout and verify the test case is pass using assert.
	
	@Test
	public void testcase1() throws InterruptedException
	{
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
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
		    e5.sendKeys("Welcome@123");
		    
		    WebElement e6 =  driver.findElement(By.id("signInSubmit"));
		    e6.click();
		    
		    
		    WebElement e7 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		    
		    Actions a11 = new Actions(driver);
		    a11.moveToElement(e7).perform();
		    
	       Thread.sleep(2000);
		    WebElement search_text = driver.findElement(By.id("nav-item-signout"));
		    search_text.click();
		    
		    //Assert
	        Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	}

}
