package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automate_GTM_Registration_Page {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://grotechminds.com/registration/");
        
       WebElement first_name = driver.findElement(By.id("fname")); //firstname
       first_name.sendKeys("harjeet");
       first_name.click();
       Thread.sleep(1000);
       
       WebElement last_name = driver.findElement(By.id("lname")); //lastname
       last_name.sendKeys("kalsi");
       last_name.click();
       Thread.sleep(1000);
       
       WebElement email = driver.findElement(By.name("email")); //email
       email.sendKeys("hkalsi@gmail.com");
       email.click();
       Thread.sleep(1000);
       
       
       WebElement password = driver.findElement(By.name("password")); //password
       password.sendKeys("Tets@123");
       password.click();
       Thread.sleep(1000);
       
       WebElement gender = driver.findElement(By.id("male")); //gender
       gender.click();
       Thread.sleep(1000);
       
       
       WebElement skills = driver.findElement(By.name("Skills")); //skills
       Thread.sleep(2000);
       Select s1 = new Select(skills);
       s1.selectByVisibleText("Technical Skills");
       Thread.sleep(1000);
       
       
       WebElement ts = driver.findElement(By.name("technicalskills c-s")); //python
       Select s2 = new Select(ts);
       s2.selectByValue("Python");
       Thread.sleep(1000);
       
       
       WebElement c1 = driver.findElement(By.id("Country")); //country
       Select country1 = new Select(c1);
       country1.selectByIndex(8);
       c1.click();
       Thread.sleep(1000);
       
       
       WebElement Padd1 = driver.findElement(By.name("Present-Address")); //pres add
       Padd1.sendKeys("Gurgoan Haryana");
       Padd1.click();
       Thread.sleep(1000);
       
       
       WebElement Padd2 = driver.findElement(By.name("Permanent-Address")); //prem add
       Padd2.sendKeys("Jabalpur MP");
       Padd2.click();
       Thread.sleep(1000);
       
       WebElement pc = driver.findElement(By.name("Pincode")); //pincode
       pc.sendKeys("122001");
       pc.click();
       Thread.sleep(1000);
       
       WebElement rel = driver.findElement(By.name("Relegion")); //reigion
       Select rt2 = new Select(rel);
       rt2.selectByValue("Sikh");
       Thread.sleep(1000);
       
       WebElement relo = driver.findElement(By.id("relocate")); //relocate
       relo.click();
       Thread.sleep(2000);
       
       
       WebElement file = driver.findElement(By.name("file")); //file upload
       file.sendKeys("C:\\Users\\harje\\Downloads\\fileupload.txt");
       
             
       WebElement sub = driver.findElement(By.name("Submit")); //submit form
       sub.click();
       Thread.sleep(1000);
       
       driver.switchTo().alert().accept(); // handle accept javascript popup
       
       driver.close();
           

	}

}
