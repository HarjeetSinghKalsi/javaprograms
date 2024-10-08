package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Amazon_Search_Using_Id_Locator {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dgoogmantxtmob170-21%26ascsubtag%3D_k_EAIaIQobChMIjYSNy6jhiAMV-jKDAx09Hx_iEAAYASAAEgJnIfD_BwE_k_%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();
        WebElement e1= driver.findElement(By.name("email"));
        e1.sendKeys("harjeet.kalsi007@gmail.com");
        WebElement e2=  driver.findElement(By.id("continue"));
        e2.click();
        
        WebElement e3= driver.findElement(By.name("password"));
        e3.sendKeys("Welcome@123");
        WebElement e4=  driver.findElement(By.id("signInSubmit"));
        e4.click();
        
        WebElement e5=driver.findElement(By.id("twotabsearchtextbox"));
        e5.sendKeys("iphone16");
        WebElement e6=driver.findElement(By.id("nav-search-submit-button"));
        e6.click();
        
        
	}

}
