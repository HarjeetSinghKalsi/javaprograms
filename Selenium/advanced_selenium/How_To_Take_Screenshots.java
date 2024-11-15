package advanced_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class How_To_Take_Screenshots {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
        driver.manage().window().maximize();
        
        /*
         1. object class has method called .getClass()
         2. so instead of creating object class method and call .getClass(), we can create child class object i.e How_To_Take_Screenshots.
         3. new way to write non static object is new classname i.e. new How_To_Take_Screenshots
         4. used Math.Random to give unique number for different screenshots
         5. we can write with concatenation.
         */
        
         TakesScreenshot t1 =           driver;
         File source =                t1.getScreenshotAs(OutputType.FILE);
         File destination = new File ("C:\\Users\\harje\\OneDrive\\Documents\\Selenium screenshots\\" + new How_To_Take_Screenshots().getClass() + Math.random() + ".png");
         FileHandler.copy(source, destination);
         
                         

	}

}
