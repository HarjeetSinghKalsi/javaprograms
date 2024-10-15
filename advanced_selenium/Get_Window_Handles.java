package advanced_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window_Handles {

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
        driver.manage().window().maximize();
        WebElement e1 =driver.findElement(By.xpath("//span[.='Google']"));
        e1.click();
        
      //used set interface because of uniqueness   
        Set <String> s1=  driver.getWindowHandles(); //used getWindowHandles to get id's of the parent and child window
        System.out.println(s1);
        
           Iterator <String> il =       s1.iterator(); // used iterator to seperate parent and child id's
           String parentid =            il.next(); // will give you the parent id
           String childid =            il.next();  // will give you the child id
           System.out.println(parentid);
           System.out.println(childid);
           
           driver.switchTo().window(childid); //to get the control on child window
           Thread.sleep(2000);
           
           driver.quit();
       
	}

}
