package TestNGCode;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import AmazonSignupPageObj.amazonSignUpPageObjects;
import Pageobjects.functioncode1;

public class AmazonSignup1 {

		WebDriver driver;
		functioncode1 obj1;
		amazonSignUpPageObjects AmazonSignUp;
				
@BeforeTest
public void BeforeTestConfig() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
						
		driver = new ChromeDriver();	
		obj1 = new functioncode1();
		AmazonSignUp = new amazonSignUpPageObjects(driver);
		driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dap_frn_logo%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		driver.manage().window().maximize();
}

@Parameters({"fullName", "email", "password", "confirmPassword",})
@Test(priority=1)
public void AmazonSignDataEnter(String fullName ,String email,String password, String confirmPassword) {
	
		AmazonSignUp.UserFirstName().sendKeys(fullName);		
		AmazonSignUp.UserEmail().sendKeys(email);
		AmazonSignUp.UserPassword().sendKeys(password);
		AmazonSignUp.confirmPassword().sendKeys(confirmPassword);
		
}

@Test(priority=2)
public void CreatAccountButtonOperation() {
	
		boolean Button = AmazonSignUp.creatAccountButton().isDisplayed();
		boolean Button2 =AmazonSignUp.creatAccountButton().isEnabled();
		Assert.assertTrue(Button);
		Assert.assertTrue(Button2);
}

@Test(priority=3)
public void validateUrl() {

		String ActualAmazonUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dap_frn_logo%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
		System.out.println(ActualAmazonUrl);
		Assert.assertEquals(ActualAmazonUrl, ExpectedUrl);
}

@Test(priority=4)
public void validateTitlePage() {

		String AmazonPageTitle = driver.getTitle();
		String ExpectedTitle = "Amazon Registration";
		System.out.println(AmazonPageTitle);
		Assert.assertEquals(AmazonPageTitle, ExpectedTitle);

}

@AfterTest		
public void AfterTest() throws InterruptedException {
	
		Thread.sleep(2500);
		driver.quit();
		obj1.printName();
		obj1.printData("08/13/2020");
}		
		
	
}
			
		
	

