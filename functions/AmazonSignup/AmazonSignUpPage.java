package AmazonSignup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AmazonSignupPageObj.amazonSignUpPageObjects;
import Pageobjects.functioncode1;

public class AmazonSignUpPage {

	WebDriver driver;
	functioncode1 obj1;
	amazonSignUpPageObjects AZS;
	
		public void BeforeTestConfig() {

			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
					
					driver = new ChromeDriver();	
					obj1 = new functioncode1();
					AZS = amazonSignUpPageObjects(driver);
					driver.get("https://www.phptravels.net/register");
					driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
					driver.manage().window().maximize();
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


