package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_GTM {

	public static void main(String[] args)
	
	{
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://grotechminds.com/registration/");
        
        WebElement file = driver.findElement(By.name("file")); //file upload
        file.sendKeys("C:\\Users\\harje\\Downloads\\fileupload.txt");
        
		

	}

}
