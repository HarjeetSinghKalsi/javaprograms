package advanced_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_URL_Using_Href {
	
	//print all the url's of the given website ie. google/amazon

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        
        
        List <WebElement> e1 = driver.findElements(By.tagName("a")); //mostly link will get with tagname locator
        
          
        int count = e1.size(); //e1.size is to count the total links
          System.out.println(count);
        for(int i=0; i<count; i++)
        {
        WebElement e2 = e1.get(i); //to get something from links i.e text or link
        String s1 =  e2.getAttribute("href");// href is used to to get the url from the links
		System.out.println(s1);
        }
        

	}

}
