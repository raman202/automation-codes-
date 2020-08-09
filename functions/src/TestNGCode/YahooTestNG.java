package TestNGCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pageobjects.YahooSignUpWebobjects;
import Pageobjects.functioncode1;

public class YahooTestNG {
	
		WebDriver driver;
		functioncode1 obj1;
		YahooSignUpWebobjects SignupPage;
		
@BeforeTest	

public void  beforeTest () {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		SignupPage = new YahooSignUpWebobjects(driver);
		obj1 = new functioncode1();
	
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
}

@Parameters({"firstname", "lastname", "email", "password", "phone", "date", "year", "gender"})
@Test(priority=3)
public void YahooSignUpTest (String firstname ,String lastname,String email, String password, String phone, String date, String year, String gender) {
	
		SignupPage.UserFirstName().sendKeys(firstname);
		SignupPage.UserLastName().sendKeys(lastname);
		SignupPage.UserEmail().sendKeys(email);	
		SignupPage.UserPassward().sendKeys(password);
		SignupPage.PhoneNumber().sendKeys(phone);
		
		Select Month = new Select(SignupPage.GetMonth());
			Month.selectByVisibleText("July");

		SignupPage.GetDate().sendKeys(date);
		SignupPage.GetYear().sendKeys(year);
		SignupPage.GetGender().sendKeys(gender);
			
		Reporter.log("Sign up data entered");
}			
			
@Test(priority=4)			
public void ValidateUrlTile() {			
		
		boolean ContinueButton = driver.findElement(By.id("reg-submit-button")).isDisplayed();
			if (ContinueButton) {System.out.println("Submit Button is displayed");}
		boolean ContinueButton1 = driver.findElement(By.id("reg-submit-button")).isEnabled();
			if (ContinueButton1) {System.out.println("Submit Button is enabled");}	
		
		Assert.assertTrue(ContinueButton1);
		Reporter.log("Submit buttom working");
}

@Test(priority=2, dependsOnMethods = {"validateURl"})
public void ValidateTitle() {

		String ActualPageTitle = driver.getTitle();
		String ExpactedPageTitle = "Yahoo";
			System.out.println(ActualPageTitle);

		Assert.assertEquals(ActualPageTitle, ExpactedPageTitle);
		Reporter.log("Page Title validated");
}

@Test(priority=1)
public void validateURl () {
	
		String ActiualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://login.yahoo.com/account/create?specId=yidReg";
			System.out.println(ActiualUrl);
		Assert.assertEquals(ActiualUrl, ExpectedUrl);
		Reporter.log("URL validated");
}

@AfterTest
public void aftertest () throws InterruptedException{
	
		driver.manage().deleteAllCookies();	
		Thread.sleep(3000);
		obj1.printName();
		driver.quit();

}
}
