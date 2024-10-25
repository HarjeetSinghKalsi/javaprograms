package testng_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Sheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
	   FileInputStream f1 = new FileInputStream("C:\\\\Users\\\\harje\\\\eclipse-workspace\\\\Selenium2024\\\\Excel\\\\Data Sheet.xlsx");
	   Workbook w1 =      WorkbookFactory.create(f1);
	   String un =        w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	   
	   //it is used to convert any number into string 
	   String pwd =   NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
	   
  //   String pwd =       w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();  
		
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
