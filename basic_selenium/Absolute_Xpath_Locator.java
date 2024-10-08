package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath_Locator {

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/harje/Downloads/learning.html");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.xpath("(/html/body/input)[1]")); //username
        e1.sendKeys("harjeet@GTM");
        WebElement e2=	driver.findElement(By.xpath("(/html/body/input)[2]")); //hint
        e2.sendKeys("harjeetkalsi0708");
        WebElement e3=	driver.findElement(By.xpath("(/html/body/input)[3]")); // password
        e3.sendKeys("Test@123");
        WebElement e4=	driver.findElement(By.xpath("(/html/body/form)[1]/input[1]")); //first name
        e4.sendKeys("harjeet");
        WebElement e5=	driver.findElement(By.xpath("(/html/body/form)[2]/input[1]")); //boy
        e5.click();
        WebElement e6=	driver.findElement(By.xpath("(/html/body/form)[2]/input[2]")); //girl
        e6.click();
        WebElement e7=	driver.findElement(By.xpath("(/html/body/form)[2]/input[3]")); //baby
        e7.click();
        WebElement e8=	driver.findElement(By.xpath("(/html/body/input)[4]")); //male
        e8.click();
        WebElement e9=	driver.findElement(By.xpath("(/html/body/input)[5]")); //female
        e9.click();
        WebElement e10=	driver.findElement(By.xpath("(/html/body/input)[6]")); //relocate to banglore
        e10.click(); 
        WebElement e11=	driver.findElement(By.xpath("(/html/body/a)")); //click on link
        e11.click();
		
	}

}
