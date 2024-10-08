package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Flipkart {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.flipkart.com/?client=cemp-client&redirectURL=httpsmerchant.ekartlogistics.comcallbackappNamemerchant");
        driver.manage().window().maximize();
       /* WebElement e1= driver.findElement(By	
        e1.sendKeys("harjeet.kalsi007@gmail.com");
        WebElement e2=  driver.findElement(By.id("continue"));
        e2.click();
*/
	}

}
