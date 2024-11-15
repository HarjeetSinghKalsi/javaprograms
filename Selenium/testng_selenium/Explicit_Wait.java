package testng_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Explicit_Wait
{
	@Test
	public void explicit()
	{
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    
	    //Explicit_Wait
	    WebDriverWait  w1 = new WebDriverWait (driver, Duration.ofSeconds(10));
	    w1.until(ExpectedConditions.titleIs("Google"));
	    
		WebElement e1=  driver.findElement(By.name("q"));
	    e1.sendKeys("India" + Keys.ENTER);
		
	}
	
	

}

