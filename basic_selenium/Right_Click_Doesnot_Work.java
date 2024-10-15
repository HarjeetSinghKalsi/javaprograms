package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Automate those application whose right click doesn't work ex - bank application
public class Right_Click_Doesnot_Work {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();
		
		WebElement e2 = driver.findElement(By.id("username"));
		e2.sendKeys("manish6543");
		
		WebElement e3 = driver.findElement(By.name("password"));
		e3.sendKeys("mabuyt56y");
		
		WebElement e4 = driver.findElement(By.id("loginCaptchaValue"));
		e4.sendKeys("yb478");
		
		WebElement e5 = driver.findElement(By.id("Button2"));
		e5.click();
		
		
		
		

	}

}