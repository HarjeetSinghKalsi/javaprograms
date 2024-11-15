package advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollers {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
        driver.manage().window().maximize();
        WebElement e1=  driver.findElement(By.xpath("//a[.='About Amazon']"));
        
        Thread.sleep(1000);
             
        Point p1 =      e1.getLocation(); //it is an abs method of WebElement interface
        int x=    p1.getX(); // it is Point method and help to find you the coordinate of X
        int y =   p1.getY(); // it is Point method and help to find you the coordinate of y
        
        System.out.println(x);
        System.out.println(y);
       
        //if scroll down y value will be positive
        JavascriptExecutor js = driver; //upcasting driver to JavascriptExecutor
        js.executeScript("window.scrollBy(0,  "+y+")"); //utilizing a method called executeScript
        
        Thread.sleep(1000);
        
      //if scroll up y value will be negative
        JavascriptExecutor js1 = driver; //upcasting driver to JavascriptExecutor
        js1.executeScript("window.scrollBy(0,  "+ -y +")"); //utilizing a method called executeScript
        
      //  Thread.sleep(1000);
      //  e1.click();

	}

}
