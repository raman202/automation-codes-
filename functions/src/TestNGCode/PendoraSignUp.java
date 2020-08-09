package TestNGCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Pageobjects.PandoraSignUpPageObjects;
import Pageobjects.functioncode1;
import junit.framework.Assert;

public class PendoraSignUp {

	WebDriver driver;
	PandoraSignUpPageObjects SP;
	functioncode1 obj1;
	
	@BeforeTest	

	public void  beforeTest () {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			SP = PandoraSignUpPageObjects(driver);
			obj1 = new functioncode1();
		
			driver.get("https://www.pandora.com/account/register");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
			
	}

	private PandoraSignUpPageObjects PandoraSignUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

@Test(priority=3)
	public void PandoraSignUpTest () {
			
driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[1]/div/label/div[2]/input")).sendKeys("MeharPaul@gmail.com");
driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[2]/div/label/div[2]/input")).sendKeys("TheOne1");
driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[3]/div/div/div[1]/label/div[2]/input")).sendKeys("1987");
driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[3]/div/div/div[2]/label/div[2]/input")).sendKeys("20109");
driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[5]/div/label/div[2]/label[1]/div/div[1]/span")).click();

				
	}
	@Test(priority=2)
	public void SignupButton () {
		SP.SignUpButton().isDisplayed();
		boolean SignupButton= SP.SignUpButton().isEnabled();

		Assert.assertTrue(SignupButton);
		Reporter.log("Sign up data entered");
		}
	
@Test(priority=3, dependsOnMethods = {"validateURl"})
	public void ValidateTitle() {

			String ActualPageTitle = driver.getTitle();
			String ExpactedPageTitle = "Music and Podcasts, Free and On-Demand | Pandora";
				System.out.println(ActualPageTitle);

			Assert.assertEquals(ActualPageTitle, ExpactedPageTitle);
			Reporter.log("Page Title validated");
	}

@Test(priority=4)
	public void validateURL () {
		
			String ActiualUrl = driver.getCurrentUrl();
			String ExpectedUrl = "https://www.pandora.com/account/register";
				System.out.println(ActiualUrl);
			Assert.assertEquals(ActiualUrl, ExpectedUrl);
			Reporter.log("URL validated");
	}

@AfterTest
	public void AfterTest () throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.quit();
		obj1.printName();
		Thread.sleep(2500);
}

	}
	
