package advanced_selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class How_To_Take_Screenshots_Using_Time {

	public static void main(String[] args) throws IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
   //   driver.manage().window().maximize();
        
         Date d1 = new Date();
         System.out.println(d1.getTime()+(1000*60*60*24*0));
         
         String s1 =         d1.toString();
     //    System.out.println(s1);
         String s2=s1.replaceAll(":", "");
         
         
         
     
         TakesScreenshot t1 =           driver;
         File source =                t1.getScreenshotAs(OutputType.FILE);
         File destination = new File ("C:\\Users\\harje\\OneDrive\\Documents\\Selenium screenshots\\"  + new How_To_Take_Screenshots().getClass()+ s2+ ".png");
         FileHandler.copy(source, destination);
         


	}

}
