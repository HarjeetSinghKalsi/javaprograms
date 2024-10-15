package advanced_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Flipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        WebElement e1=  driver.findElement(By.name("q"));
        e1.sendKeys("mobile");
        Thread.sleep(1000);
        List <WebElement> li= driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
        int count = li.size();
        System.out.println(count);
        Thread.sleep(2000);
        li.get(1).click(); //1 is indexing
        

	}

}
