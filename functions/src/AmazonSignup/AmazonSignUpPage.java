package AmazonSignup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AmazonSignupPageObj.amazonSignUpPageObjects;
import Pageobjects.functioncode1;

public class AmazonSignUpPage {

	WebDriver driver;
	functioncode1 obj1;
	amazonSignUpPageObjects AmazonSignUp;
	
		public void BeforeTestConfig() {

			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
					
					driver = new ChromeDriver();	
					obj1 = new functioncode1();
					AmazonSignUp = new amazonSignUpPageObjects(driver);
					driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dap_frn_logo%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
					driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
					driver.manage().window().maximize();
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


