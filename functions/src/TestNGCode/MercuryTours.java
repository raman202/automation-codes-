/package TestNGCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.MercuryToursPageObjects;
import Pageobjects.functioncode1;

public class MercuryTours {
	
	WebDriver driver;
	functioncode1 obj1;
	MercuryToursPageObjects SignupPage;
	
@BeforeTest

public void BeforeTest() {

System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");

	driver = new ChromeDriver();
	obj1 = new functioncode1();
	SignupPage = new MercuryToursPageObjects(driver);

	driver.get("http://newtours.demoaut.com/mercuryregister.php");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
	
@Test(priority=1)		
public void SignUpTest() {

	SignupPage.UserFirstName().sendKeys("Raman");
	SignupPage.UserLastName().sendKeys("Paul");
	SignupPage.UserPhone().sendKeys("5713839976");
	SignupPage.UserEmail().sendKeys("RamanPaul@yahoo.com");
	SignupPage.UserAddress().sendKeys("8353 Firsthome Dr");
	SignupPage.UserCity().sendKeys("Washington");
	SignupPage.UserState().sendKeys("DC");
	SignupPage.UserZipCode().sendKeys("20024");
	SignupPage.UserName().sendKeys("TheOne");
	SignupPage.UserPassword().sendKeys("YesHeIs1");
	SignupPage.UserConfirmPassword().sendKeys("YesHeIs1");
	
	Reporter.log("Sign up data entered");
}	
	
@Test(priority=2)
public void validatesubmitbuttom () {
	
		boolean SubmitButton = driver.findElement(By.name("register")).isDisplayed();
			if (SubmitButton) {System.out.println("Submit Button is displayed");}	
		boolean SubmitButton1 = driver.findElement(By.name("register")).isEnabled();
			if (SubmitButton1) {System.out.println("Submit Button is enabled");}	
	
			Assert.assertTrue(SubmitButton);
			Reporter.log("Submit buttom working");
}

@Test(priority=3)
public void ValidateURL() {
	
		String ActiualUrl = driver.getCurrentUrl();
		String ExpectedUrl= "http://newtours.demoaut.com/mercuryregister.php";
			System.out.println(ActiualUrl);

		Assert.assertEquals(ActiualUrl, ExpectedUrl);
		Reporter.log("URL validated");
}
 
@Test(priority=4, dependsOnMethods = {"ValidateURL"})
public void ValidateTitle() {

		String ActiualTitle = driver.getTitle();
		String ExpectedTitle= "Register: Mercury Tours";
			System.out.println(ActiualTitle);

		Assert.assertEquals(ActiualTitle, ExpectedTitle);
		Reporter.log("Page Title validated");

}

@AfterTest
public void aftertest () throws InterruptedException{

	driver.manage().deleteAllCookies();	
	Thread.sleep(3000);
	obj1.printName();
	driver.quit();

}
}
		

