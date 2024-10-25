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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Excel_Sheet_Add_Address {
	
	//Login Amazon add address using DDT

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream f1 = new FileInputStream("C:\\\\Users\\\\harje\\\\eclipse-workspace\\\\Selenium2024\\\\Excel\\\\Data Sheet.xlsx");
		   Workbook w1 =      WorkbookFactory.create(f1);
	  String un =        w1.getSheet("add_address").getRow(1).getCell(0).getStringCellValue();
	  String pwd =       w1.getSheet("add_address").getRow(1).getCell(1).getStringCellValue(); 
	  String fname =     w1.getSheet("add_address").getRow(1).getCell(2).getStringCellValue(); 
	  String mob =       NumberToTextConverter.toText(w1.getSheet("add_address").getRow(1).getCell(3).getNumericCellValue());
	  String pincode =   NumberToTextConverter.toText(w1.getSheet("add_address").getRow(1).getCell(4).getNumericCellValue());
	  String houseno =   NumberToTextConverter.toText(w1.getSheet("add_address").getRow(1).getCell(5).getNumericCellValue());
	  String street =    w1.getSheet("add_address").getRow(1).getCell(6).getStringCellValue();
	  
	//  String city =      w1.getSheet("add_address").getRow(1).getCell(6).getStringCellValue();
	  System.out.println(mob);
	  System.out.println(pincode);
	  System.out.println(houseno);
	  System.out.println(street);
 
			
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
			    
			    
			    
			    WebElement e7 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
			    
			    Actions a11 = new Actions(driver);
			    a11.moveToElement(e7).perform();
			    
		        e7.click();
		        
		         
		        WebElement e8 = driver.findElement(By.xpath("(//span[.='Edit addresses for orders and gifts'])[1]"));
		        e8.click();
		        
		       WebElement e9 = driver.findElement(By.id("ya-myab-plus-address-icon"));
		        e9.click();
		        
		        WebElement e10 = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
		        e10.sendKeys(fname);
		        
		        WebElement e11 = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		        e11.sendKeys(mob);
		        
		        WebElement e12 = driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
		        e12.sendKeys(pincode);
		        
		       WebElement e13 = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		        e13.sendKeys(houseno);
		        
		        WebElement e14 = driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
		        e14.sendKeys(street);
		        
		       
		        WebElement e16 = driver.findElement(By.xpath("(//input[@class='a-button-input'])[3]"));
		        e16.click();
		        
		        WebElement e17 = driver.findElement(By.id("ya-myab-address-delete-btn-1"));
		        e17.click();
		        
		        Thread.sleep(1000);
		        
		        WebElement e18 = driver.findElement(By.id("deleteAddressModal-1-submit-btn"));
		        e18.click();
		        
		        Thread.sleep(2000);
		        
		        
		        
		        
		        
		        
		        
		        

	}

}
