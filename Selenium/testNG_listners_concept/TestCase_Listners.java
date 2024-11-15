package testNG_listners_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG_listners_concept.ITestListners_Logic.class)

public class TestCase_Listners extends ITestListners_Logic
{
	
	@Test()
	public void testcase1()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.name("q")); //take ss for passed tc 
	//	WebElement e1 =driver.findElement(By.name("qa")); //take ss for failed tc 
		e1.sendKeys("India" + Keys.ENTER);
		
	}

}
