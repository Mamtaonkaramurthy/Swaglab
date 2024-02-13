package test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.baseclass;
import pages.LoginPage;

public class LoginPageTest extends baseclass
{
	LoginPage login;
	
	@BeforeMethod 
	public void setup()
	{
		login=new LoginPage(driver);
		
	}
	
	@Test
	public void verifyURL()
	{
		String actURL = login.verifyURL();
		String expURL="https://www.saucedemo.com/";
		Assert.assertEquals(actURL, expURL);
	}
	
	@Test
	public void verifyLogo()
	{
		//boolean actLogo = login.verifyLogo();
		boolean expLogo=true;
		//Assert.assertEquals(actLogo, expLogo);
	}
	
}
