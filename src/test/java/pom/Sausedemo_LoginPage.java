package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sausedemo_LoginPage 
{
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginbutton;
	
	public Sausedemo_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		loginbutton.click();
	}
}
