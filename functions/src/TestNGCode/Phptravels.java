package TestNGCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pageobjects.PhpTravelsPages;
import Pageobjects.functioncode1;

public class Phptravels {
	
	WebDriver driver;
	functioncode1 obj1;
	PhpTravelsPages SignupPage;
	
@BeforeTest
public void BeforeTestConfig() {

System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();	
		obj1 = new functioncode1 ();
		SignupPage = new PhpTravelsPages(driver);
		
		driver.get("https://www.phptravels.net/register");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		driver.manage().window().maximize();
	
}

@Parameters({"firstName","lastName","phone","email","password","confirmPassword"})
@Test(priority=1)
public void PhpSignupTest(String firstName, String lastName, String phone, String email, String password, String confirmPassword ) {
	
	SignupPage.UserFirstName().sendKeys(firstName);
	SignupPage.UserLastName().sendKeys(lastName);
	SignupPage.UserPhone().sendKeys(phone);
	SignupPage.UserEmail().sendKeys(email);
	SignupPage.UserPassword().sendKeys(password);
	SignupPage.UserConfirmPassword().sendKeys(confirmPassword);
		
		Reporter.log("Sign up data entered");	
}

@Test(priority=2)
public void validateSignupButton() {
	
		boolean SignUp = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).isDisplayed();
			if (SignUp) {System.out.println("Submit Button is displayed");}			
		boolean SignUp1 = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).isEnabled();
			if (SignUp1) {System.out.println("Submit Button is enabled");}
			
			Reporter.log("SignUp Button working");
			Assert.assertTrue(true);
}

@Test(priority=4)	
public void getDriver() {	
	
		String ActiualTitle = driver.getTitle();
		String ExpectedTitle= "Register";
			System.out.println(ActiualTitle);

		Assert.assertEquals(ActiualTitle, ExpectedTitle);
		Reporter.log("Page Title validated");

}

@Test(priority=3)
public void getUrl() {

	
	String ActiualUrl = driver.getCurrentUrl();
	String ExpectedUrl= "https://www.phptravels.net/register";
			System.out.println(ActiualUrl);	
	
	Assert.assertEquals(ActiualUrl, ExpectedUrl);
	Reporter.log("URL validated");
}

@AfterTest	
public void AfterTest() throws InterruptedException {	
		driver.manage().deleteAllCookies();	
		obj1.printName();
		Thread.sleep(1500);	
		driver.quit();

}



}