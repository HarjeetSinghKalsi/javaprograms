package testng_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet_Non_Technical_Way {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//Step 1 excel sheet location
		FileInputStream f1 = new FileInputStream ("C:\\Users\\harje\\eclipse-workspace\\Selenium2024\\Excel\\Data Sheet.xlsx");
		
		//Step 2 open excel file
	Workbook w1 =	WorkbookFactory.create(f1);
	
	//go to the actual sheet
	 Sheet s1 =         w1.getSheet("login");
	    Row r1 =       s1.getRow(1);
	    Cell c1 =      r1.getCell(0);     
	    String un =        c1.getStringCellValue();
	    	System.out.println(un);
	    	
	    Row r2 =	s1.getRow(1);
	    Cell c2 =     r2.getCell(1);
	     String pwd =        c2.getStringCellValue();
	     System.out.println(pwd);
	     
	     
	     ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			WebElement e1 = driver.findElement(By.id("email"));
			e1.sendKeys(un);
			WebElement e2 =driver.findElement(By.id("pass"));
			e2.sendKeys(pwd);
			WebElement e3 = driver.findElement(By.name("login"));
			e3.click();
	    

		
	}

}
