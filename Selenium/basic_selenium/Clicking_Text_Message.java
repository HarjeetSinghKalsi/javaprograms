package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment was Launch flipkart and click on Fashion using text 
//but Fashion is coming in arrow key so i used with Mobiles text

public class Clicking_Text_Message {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("(//span[.='Mobiles'])[2]"));
		e1.click();
		

	}

}
