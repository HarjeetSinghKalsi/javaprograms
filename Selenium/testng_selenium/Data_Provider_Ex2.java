package testng_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test; 

//Print the login with 10 set of data
//row[5], col[5]

public class Data_Provider_Ex2
{
	
	@DataProvider(name="Login")
	public Object[][] method1()
	{
		Object data1[][] = new Object [10][5]; 
		
		//row 1
		data1[0][0] = "harjeet1";
		data1[0][1] =  "kalsi";
		data1[0][2] = "07/08/1991";
		data1[0][3] =  "male";
		data1[0][4] = "hkalsi1@gmail.com";
		
		
		//row 2
		data1[1][0] = "harjeet2";
		data1[1][1] = "Test@1234";
		data1[1][2] = "hkalsi1@gmail.com";
		data1[1][3] = "Test@123";
		data1[1][4] = "hkalsi1@gmail.com";
				
		//row 3
		data1[2][0] = "harjeet3";
		data1[2][1] = "Test@12345";
		data1[2][2] = "hkalsi1@gmail.com";
		data1[2][3] = "Test@123";
		data1[2][4] = "hkalsi1@gmail.com";
				
		//row 4
		data1[3][0] = "harjeet4";
		data1[3][1] = "Test@1236";
		data1[3][2] = "hkalsi1@gmail.com";
		data1[3][3] = "Test@123";
		data1[3][4] = "hkalsi1@gmail.com";
				
		//row 5
		data1[4][0] = "harjeet5";
		data1[4][1] = "Test@1237";
		data1[4][2] = "hkalsi1@gmail.com";
		data1[4][3] = "Test@123";
		data1[4][4] = "hkalsi1@gmail.com";
		
		//row 6
		data1[5][0] = "harjeet6";
		data1[5][1] = "Test@1237";
		data1[5][2] = "hkalsi1@gmail.com";
		data1[5][3] = "Test@123";
		data1[5][4] = "hkalsi1@gmail.com";
		
		//row 7
		data1[6][0] = "harjeet7";
		data1[6][1] = "Test@1237";
		data1[6][2] = "hkalsi1@gmail.com";
		data1[6][3] = "Test@123";
		data1[6][4] = "hkalsi1@gmail.com";
				
		//row 8
		data1[7][0] = "harjeet8";
		data1[7][1] = "Test@1237";
		data1[7][2] = "hkalsi1@gmail.com";
		data1[7][3] = "Test@123";
		data1[7][4] = "hkalsi1@gmail.com";
				
		//row 9
		data1[8][0] = "harjeet9";
		data1[8][1] = "Test@1237";
		data1[8][2] = "hkalsi1@gmail.com";
		data1[8][3] = "Test@123";
		data1[8][4] = "hkalsi1@gmail.com";
				
		//row 10
		data1[9][0] = "harjeet10";
	    data1[9][1] = "Test@1237";
		data1[9][2] = "hkalsi1@gmail.com";
		data1[9][3] = "Test@123";
		data1[9][4] = "hkalsi1@gmail.com";
	
		
		return data1;
					
	}

	@Test(dataProvider="Login")
	public void login(String firstname, String lastname, String DOB, String gender, String email)
	
	{
	  System.out.println(firstname);
	  System.out.println(lastname);
	  System.out.println(DOB);
	  System.out.println(gender);
	  System.out.println(email);
	}
	
	
	

}
