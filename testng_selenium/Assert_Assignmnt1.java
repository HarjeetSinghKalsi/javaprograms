package testng_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Assignmnt1 {
	
	//launch amazon after search for shoe verify if the test case pass or fail using assert
	
	@Test
	public void Testcase1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
        driver.manage().window().maximize();
        WebElement e1=  driver.findElement(By.name("field-keywords"));
        e1.sendKeys("shoes" + Keys.ENTER);
        
        List<WebElement>  li =                driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
        int countofshoes = li.size();
        
       //Assert 
        Assert.assertEquals(countofshoes>50, true);
        
		
	}

}
