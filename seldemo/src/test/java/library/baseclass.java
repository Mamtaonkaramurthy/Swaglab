package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver ;
	@BeforeMethod
	

	        // Enter username
		 public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.get("https://www.saucedemo.com/");
	        WebElement usernameField = driver.findElement(By.id("user-name"));
	        usernameField.sendKeys("standard_user");

	        // Enter password
	        WebElement passwordField = driver.findElement(By.id("password"));
	        passwordField.sendKeys("secret_sauce");

	        // Click on the login button
	        WebElement loginButton = driver.findElement(By.id("login-button"));
	        loginButton.click();
	        
	        Thread.sleep(3000);

	        // Add item to cart
	        WebElement addToCartButton = driver.findElement(By.cssSelector(".btn_primary.btn_inventory"));
	        addToCartButton.click();

	        // Wait for a few seconds to see the result
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
	        cartIcon.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement checkoutButton = driver.findElement(By.cssSelector(".btn_action.checkout_button"));
	        checkoutButton.click();
	        Thread.sleep(2000);

	        // Enter first name
	        WebElement firstNameField = driver.findElement(By.id("first-name"));
	        firstNameField.sendKeys("Your_First_Name");
	        Thread.sleep(2000);

	        // Enter last name
	        WebElement lastNameField = driver.findElement(By.id("last-name"));
	        lastNameField.sendKeys("Your_Last_Name");
	        Thread.sleep(2000);

	        // Enter zipcode
	        WebElement zipCodeField = driver.findElement(By.id("postal-code"));
	        zipCodeField.sendKeys("Your_Zip_Code");
	        Thread.sleep(3000);

	        // Click on continue button
	        WebElement continueButton = driver.findElement(By.cssSelector(".btn_primary.cart_button"));
	        continueButton.click();
	        Thread.sleep(3000);

	        // Click on finish button
	        WebElement finishButton = driver.findElement(By.cssSelector(".btn_action.cart_button"));
	        finishButton.click();
	        Thread.sleep(3000);
	        
			/*
			 * WebElement backToHomeLink =
			 * driver.findElement(By.className("btn btn_primary btn_small"));
			 * backToHomeLink.click();
			 */
	        driver.get("https://www.saucedemo.com/");
	        Thread.sleep(5000);


	        // Close the browser
	       driver.quit();
		
	}
	
	//@AfterMethod
	//public void tearDown()
	//{
		//driver.quit();
	//}

}

