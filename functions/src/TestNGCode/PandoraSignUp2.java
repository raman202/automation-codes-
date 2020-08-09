package TestNGCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pageobjects.PandoraSignUpPageObjects;
import Pageobjects.functioncode1;

public class PandoraSignUp2 {
	
	WebDriver driver;
	functioncode1 obj1;
	PandoraSignUpPageObjects SP;
	
@BeforeTest	
public void  beforeTest () {

System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");

	driver = new ChromeDriver();
	SP = new PandoraSignUpPageObjects(driver);
	obj1 = new functioncode1();

	driver.get("https://www.pandora.com/account/register");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
}

@Parameters({"email","password","birthyear","zipcode"})
@Test(priority=3)
public void PandoraSignUpTest (String email, String password, String birthyear, String zipcode) {

	SP.userEmail().sendKeys(email);
	SP.userPassword().sendKeys(password);
	SP.userBirthYear().sendKeys(birthyear);
	SP.userZipCode().sendKeys(zipcode);
	SP.userGenderFemale().click();
	Reporter.log("Sign up data entered");
}			
		
@Test(priority=4)			
public void ValidateUrlTile() {			
	
	boolean ContinueButton = SP.SignUpButton().isDisplayed();
		if (ContinueButton) {System.out.println("Sign Up Button is displayed");}
	boolean ContinueButton1 = SP.SignUpButton().isEnabled();
		if (ContinueButton1) {System.out.println("Sign Up Button is enabled");}	
	
	Assert.assertTrue(ContinueButton1);
	Reporter.log("Submit buttom working");
}

@Test(priority=2, dependsOnMethods = {"validateURl"})
public void ValidateTitle() {

	String ActualPageTitle = driver.getTitle();
	String ExpactedPageTitle = "Music and Podcasts, Free and On-Demand | Pandora";
		System.out.println(ActualPageTitle);

	Assert.assertEquals(ActualPageTitle, ExpactedPageTitle);
	Reporter.log("Page Title validated");
}

@Test(priority=1)
public void validateURl () {

	String ActiualUrl = driver.getCurrentUrl();
	String ExpectedUrl = "https://www.pandora.com/account/register";
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