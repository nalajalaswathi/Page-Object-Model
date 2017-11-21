/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Swathi
 * This Page contains all the elements of guru99 login page and also methods
 */
public class Guru99LoginPage 
{
	public WebDriver driver;
	
	By guru99_username = By.name("uid");
	By guru99_password = By.name("password");
	By guru99_login = By.name("btnLogin");
	By guru99_reset = By.name("btnReset");
	By guru99_logintitle = By.className("barone");
	
	public Guru99LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void typeUserName(String username)
	{
		driver.findElement(guru99_username).sendKeys(username);
	}
	
	public void typePassword(String pasword)
	{
		driver.findElement(guru99_password).sendKeys(pasword);
	}
	
	public void clickLogin()
	{
		driver.findElement(guru99_login ).click();
	}
	
	public void clickReset()
	{
		driver.findElement(guru99_reset ).click();
	}
	
	public String getLoginTitle()
	{
		return  driver.findElement(guru99_logintitle).getText();
	}
	
	public void loginGuru99(String username,String pasword)
	{
		this.typeUserName(username);
		this.typePassword(pasword);
		this.clickLogin();
	}
	
}
