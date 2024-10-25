package amazon_test_case;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends Launch_And_Quit

   //Search a product 

{
	
	@Test
	public void search_a_product() throws InterruptedException
	{
		 WebElement e1 =driver.findElement(By.id("twotabsearchtextbox"));
	        e1.sendKeys("shoes" + Keys.ENTER);    
	}

}
