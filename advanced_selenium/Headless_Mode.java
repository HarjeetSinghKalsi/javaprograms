package advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Mode {
	
	//How to run any browser in headless mode means program will run but browser will not launch

	public static void main(String[] args) 
	
	{
		ChromeOptions c1 = new ChromeOptions(); //headless mode
		c1.addArguments("--headless"); //with the help of ref var using method .addArguments	
		
		ChromeDriver driver = new ChromeDriver(c1); //passing c1 in ChromeDriver
        driver.manage().window().maximize();
        driver.get("https://grotechminds.com/registration/");
        
        WebElement file = driver.findElement(By.name("file")); //file upload
        file.sendKeys("C:\\Users\\harje\\Downloads\\fileupload.txt");

	}

}
