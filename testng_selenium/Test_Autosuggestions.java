package testng_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Autosuggestions 
{
	
	@Test
	public void scenario1() throws InterruptedException
	{

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.Amazon.in");
    driver.manage().window().maximize();
    WebElement e1=  driver.findElement(By.name("field-keywords"));
    e1.sendKeys("shoes");
    Thread.sleep(1000);
    
    List <WebElement> l1=   driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
    int count = l1.size();
    System.out.println(count);
    Thread.sleep(2000);
    l1.get(count-9).click();           //here 5 is 5th indexing of auto suggestion


}
}
	
