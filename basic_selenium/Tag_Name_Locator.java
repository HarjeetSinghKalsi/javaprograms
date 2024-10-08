package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Name_Locator {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/harje/Downloads/learning.html");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.tagName("a"));
        e1.click(); 
	}

}
