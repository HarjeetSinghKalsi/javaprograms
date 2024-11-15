package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_GTM_Using_Name_Locator_Youtube {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.name("search_query"));
		e1.sendKeys("grow tech minds");
		WebElement e2=driver.findElement(By.name("search_query"));
		e2.sendKeys(Keys.ENTER);
	

	}

}