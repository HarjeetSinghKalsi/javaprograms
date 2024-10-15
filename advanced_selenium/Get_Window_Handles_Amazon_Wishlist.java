package advanced_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window_Handles_Amazon_Wishlist {

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement e1 =driver.findElement(By.id("twotabsearchtextbox"));
        e1.sendKeys("shoes" + Keys.ENTER);
        
        WebElement e2 =driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[5]"));
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
        
        WebElement e3 =driver.findElement(By.id("wishListMainButton"));
        e3.click();
        

	}

}
