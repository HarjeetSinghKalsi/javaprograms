package amazon_test_case;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

  //Clicking on add to art

public class TestCase3 extends Launch_And_Quit
{
	@Test
	public void add_to_cart()
	{
		WebElement e1 =driver.findElement(By.id("twotabsearchtextbox"));
        e1.sendKeys("shoes" + Keys.ENTER);    
        
		 WebElement e2 =driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
	        e2.click();
	  
		  // giving control to child window     
	       Set <String> s1 = driver.getWindowHandles();
	        System.out.println(s1);
	        
	        Iterator <String> li =           s1.iterator();
	        String parentid =                  li.next();
	        String childid =                  li.next();
	        System.out.println(parentid);
	        System.out.println(childid);
	        
	        driver.switchTo().window(childid);
	        
	        WebElement e3 =driver.findElement(By.id("add-to-cart-button"));
	        e3.click();
	        

	}

}
