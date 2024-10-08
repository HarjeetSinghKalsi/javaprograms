package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_GTM {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://grotechminds.com/registration/");
		 driver.manage().window().maximize();
		 WebElement e1 = driver.findElement(By.id("Skills"));
		 e1.click();
		 Select s1 = new Select(e1); 
         s1.selectByVisibleText("Technical Skills");  //select by visible text
         
         
         WebElement e2 = driver.findElement(By.id("Country"));
		 e2.click();
		 Select s2 = new Select(e2); 
         s2.selectByIndex(8);  //select by indexing
         
         
         WebElement e3 = driver.findElement(By.id("Relegion"));
		 e3.click();
		 Select s3 = new Select(e3); 
         s3.selectByValue("Sikh");  //select by value
				 
		
	}

}
