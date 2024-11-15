package retry_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Failed_TestCase 
{
	@Test(retryAnalyzer=retry_concept.Retry_Logic.class)
	public void testcase1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.name("qa"));
		e1.sendKeys("India" + Keys.ENTER);
		
	}

}
