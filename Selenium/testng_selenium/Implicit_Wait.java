package testng_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implicit_Wait
{
	@Test
	public void syncronization()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		
		driver.manage().window().maximize();
		WebElement e1=  driver.findElement(By.name("field-keywords"));
	    e1.sendKeys("shoes" + Keys.ENTER);
		
	}

	

}
