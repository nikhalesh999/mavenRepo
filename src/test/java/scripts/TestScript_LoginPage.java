package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pom.Sausedemo_LoginPage;

public class TestScript_LoginPage 
{
	@Test
	public void testLoginPage()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		Sausedemo_LoginPage rv = new Sausedemo_LoginPage(driver);
		rv.setLogin("standard_user", "secret_sauce");
		rv.clickOnLoginButton();
	}
	

}
