package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Facebook {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("stbymkt@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("bgvfr5tyh");
		driver.findElement(By.name("login")).click();
		           

	}

}