package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import LoginSnippet.HomePage;
import LoginSnippet.LogInPage;

public class HomePageTest {
	
	

	@Test()
	public void requestQuote1() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\computer zone\\Documents\\Selenium\\drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/insurance/v1/index.php");
	
	LogInPage loginPage = new LogInPage(driver);
	loginPage.login();

		
	
	
	WebElement Logout = driver.findElement(By.xpath("//input[@value='Log out']"));
	boolean displayed = Logout.isDisplayed();
	
	
	HomePage homePage = new HomePage(driver);
	homePage.calculatePremium();
	 
	
	Assert.assertTrue(homePage.logOutButtonIsPresent());
	
	
	Assert.assertTrue(homePage.isRequestQuotationTabPresent());
	
	
	
	Assert.assertTrue(homePage.checkRadioButtonSelected());
	
		
	Assert.assertTrue(homePage.isCalculatedPremiumDisplayed());
	

	Assert.assertFalse(homePage.checkDropdownIsSelected());
	
	

	
	}
}
