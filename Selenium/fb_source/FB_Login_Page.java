package fb_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Login_Page
{
	WebDriver driver;
	
	//step 1
	 @FindBy(id="email")
	 WebElement user_email;
	 
	 @FindBy(name="pass")
	 WebElement user_Pass;
	 
	 @FindBy(xpath="//button[@name='login']")
	 WebElement login;
	 
	 //step 2
	 public void un()
	 {
		 user_email.sendKeys("harjeet.kalsi007@gmail.com");
	 }
	 
	 public void pwd()
	 {
		 user_Pass.sendKeys("Test@123"); 
	 }
	 
	 public void log()
	 {
		 login.click();
	 }
	 
	 //step 3
	 
	 public FB_Login_Page (WebDriver driver)
	 {
		 PageFactory.initElements(driver, null);
	 }
	

	
}
