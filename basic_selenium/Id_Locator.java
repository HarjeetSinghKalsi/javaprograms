package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//launch amazon and search iphone using id locator 

public class Id_Locator {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
        driver.manage().window().maximize();
        WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
        e1.sendKeys("iphone 16");
        WebElement e2= driver.findElement(By.id("nav-search-submit-button"));
        e2.click();
  

	}

}
