package advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//how to find the co ordinates of the website, it will for scrolling

public class Coordinates {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
        driver.manage().window().maximize();
        WebElement e1=  driver.findElement(By.xpath("//a[.='About Amazon']"));
        
        Point p1 =      e1.getLocation(); //it is an abs method of WebElement interface
        int x=    p1.getX(); // it is Point method and help to find you the coordinate of X
        int y =   p1.getY(); // it is Point method and help to find you the coordinate of y
        
        System.out.println(x);
        System.out.println(y);
        
        
        
        
        

	}

}
