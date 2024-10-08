package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// launch amazon and by search shoes by relative xpath 
//syntaxt is //child

public class Relative_Xpath_Locator {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        WebElement e1 =driver.findElement(By.xpath("(//input)[5]"));
        e1.sendKeys("shoes" + Keys.ENTER);

	}

}
