package advanced_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestions {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement e1=  driver.findElement(By.name("q"));
        e1.sendKeys("jabalpur");
        Thread.sleep(1000);
        
        //used List interface with find elements
        List<WebElement> li = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
        int count =  li.size();
        System.out.println(count);
        Thread.sleep(5000);
        li.get(count-1).click();
      
        
      

	}

}
