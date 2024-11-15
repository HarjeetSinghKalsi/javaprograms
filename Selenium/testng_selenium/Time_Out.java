package testng_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Time_Out 
{
	@Test(timeOut=2000)
	public void registration()
	{
		ChromeDriver driver = new ChromeDriver();
	}

}
