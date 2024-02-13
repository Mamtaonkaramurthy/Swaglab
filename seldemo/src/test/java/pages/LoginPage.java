package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.baseclass;

public class LoginPage extends baseclass
{
	@FindBy(xpath="//div[@class='login_logo']") private WebElement logo;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyURL()
	{
		String url = driver.getCurrentUrl();
		return url;
	}

}
