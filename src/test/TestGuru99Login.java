/**
 * 
 */
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Guru99HomePage;
import pages.Guru99LoginPage;

/**
 * @author user
 *
 */
@Test
public class TestGuru99Login 
{
	public WebDriver driver;
	
	Guru99LoginPage objLogin;
	
	Guru99HomePage objHomepage;
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4");
	}
	
	@Test
	public void verify_homePageText()
	{
		objLogin = new Guru99LoginPage(driver);
		String Verify_loginTitle = objLogin.getLoginTitle();
		//System.out.println(Verify_loginTitle);
		Assert.assertTrue(Verify_loginTitle.equalsIgnoreCase("Guru99 Bank"));
		objLogin.loginGuru99("mngr105657","hyjAseg");
		
		objHomepage = new Guru99HomePage(driver);
		String Verify_Test = objHomepage.verifyHomePageText();
		//System.out.println(Verify_Test);
		Assert.assertTrue(Verify_Test.equalsIgnoreCase("Manger Id : mngr105657"));
	}
	
}
