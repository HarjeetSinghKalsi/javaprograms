package testng_selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links_With_Amazon {
	
	//Broken link with try and block explain

	public static void main(String[] args) throws IOException
	{

		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        
        
        List <WebElement> e1 = driver.findElements(By.tagName("a")); //mostly link will get with tagname locator
        
          
        int count = e1.size(); //e1.size is to count the total links
        System.out.println(count);
        for(int i=0; i<count; i++)
        {
        WebElement e2 = e1.get(i); //to get something from links i.e text or link
        String url =  e2.getAttribute("href");// href is used to to get the url from the links
//		System.out.println(url);
		verifylinks(url);
	
        }
	}
	
	static void verifylinks(String url) throws IOException
	{
		try
		{
			
		URL u1 = new URL(url); //URL is predefined class in java
		HttpURLConnection u2 =     (HttpURLConnection) u1.openConnection(); // then need to create a connection
		if ( u2.getResponseCode()==200)
		{
			System.out.println("Link is valid  " + url + "   " +  u2.getResponseMessage());
		}
		else
		{
			System.out.println("Link is invalid  " + url + "   " + u2.getResponseMessage());
		}
	  }
		catch (MalformedURLException w1)
		{
			System.out.println("Handled the exception");
		}
		
		
	}
	

	}


