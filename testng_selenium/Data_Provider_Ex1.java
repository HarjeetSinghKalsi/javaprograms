package testng_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test; 

//Test the login with 5 set of data
//row[5], col[2]

public class Data_Provider_Ex1
{
	
	@Test(dataProvider="Login")
	public void login(String username, String Password)
	{
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  WebElement e1 =driver.findElement(By.id("email"));
	  WebElement e2 =driver.findElement(By.id("pass"));
	  e1.sendKeys(username);
	  e2.sendKeys(Password);			  
	}
	
	@DataProvider(name="Login")
	public Object[][] method1()
	{
		Object data1[][] = new Object [5][2]; //[5] is row & [2] is column and it always execute from row i.e [5]
		
		//row 1
		data1[0][0] = "hkalsi1@gmail.com";
		data1[0][1]= "Test@123";
		
		//row 2
		data1[1][0] = "hkalsi2@gmail.com";
		data1[1][1]= "Test@1234";
				
		//row 3
		data1[2][0] = "hkalsi3@gmail.com";
		data1[2][1]= "Test@12345";
				
		//row 4
		data1[3][0] = "hkalsi4@gmail.com";
		data1[3][1]= "Test@1236";
				
		//row 5
		data1[4][0] = "hkalsi5@gmail.com";
		data1[4][1]= "Test@1237";
		return data1;
				
		
	}
	
	

}
