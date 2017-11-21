/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Swathi
 *This Page contains all the elements of guru99 Home page and also methods
 */
public class Guru99HomePage 
{
	
	public WebDriver driver;
	
	By Homepagetxt = By.xpath("//table//tr[@class='heading3']");
	
	public Guru99HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyHomePageText()
	{
		return driver.findElement(Homepagetxt).getText();
	}
	
}
