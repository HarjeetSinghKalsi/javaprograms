package fb_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_source.FB_Login_Page;

public class Test_Case1_Login
{
	@Test
	
	public void login_to_fb_with_valid_data()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		FB_Login_Page f1 = new FB_Login_Page(driver);
		f1.un();
		f1.pwd();
		f1.log();
		
	}

	
}
