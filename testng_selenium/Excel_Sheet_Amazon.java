package testng_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Excel_Sheet_Amazon {
	
	//Login Amazon Search Product using DDT
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\\\Users\\\\harje\\\\eclipse-workspace\\\\Selenium2024\\\\Excel\\\\Data Sheet.xlsx");
		   Workbook w1 =      WorkbookFactory.create(f1);
		   String un =        w1.getSheet("amazon").getRow(1).getCell(0).getStringCellValue();
		   String pwd =       w1.getSheet("amazon").getRow(1).getCell(1).getStringCellValue(); 
		   String product =      w1.getSheet("amazon").getRow(1).getCell(2).getStringCellValue(); 
	
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			
		    WebElement e1= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			Actions a1 = new Actions(driver);
			a1.moveToElement(e1).perform();
			    	
			    WebElement e2 =  driver.findElement(By.xpath("//span[@Class='nav-action-inner']"));
			    e2.click();
			    
			    WebElement e3 =  driver.findElement(By.id("ap_email"));
			    e3.sendKeys(un);
			    
			    WebElement e4 =  driver.findElement(By.id("continue"));
			    e4.click();
			    
			    WebElement e5 =  driver.findElement(By.id("ap_password"));
			    e5.sendKeys(pwd);
			    
			    WebElement e6 =  driver.findElement(By.id("signInSubmit"));
			    e6.click();
			    
			    WebElement e7 = driver.findElement(By.id("twotabsearchtextbox"));
		        e7.sendKeys(product);
		        
		        WebElement e8 = driver.findElement(By.id("nav-search-submit-button"));
		        e8.click();
		       
			  
	}

}
