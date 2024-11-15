package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//drop down using visible text, value, index
//Launch amazon select books and search power of minds and enter

public class Drop_Down {
	public static void main(String[] args) 
	{
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.Amazon.in");
		 driver.manage().window().maximize();
		 WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		 e1.click();
		 Select s1 = new Select(e1); 
	//	 s1.selectByIndex(3);  //select by index
	//	 s1.selectByValue("search-alias=stripbooks"); //select by value
		 s1.selectByVisibleText("Books");  //select by visible text
		 
		 WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
		 e2.sendKeys("Power of  minds");
		 
		 WebElement e3 = driver.findElement(By.id("nav-search-submit-button"));
		 e3.click();
		 
		 
		 
		 
		 
		    
		    
		    
	}

}