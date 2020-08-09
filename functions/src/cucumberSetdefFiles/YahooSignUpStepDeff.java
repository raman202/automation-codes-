package cucumberSetdefFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import Pageobjects.PandoraSignUpPageObjects;
import Pageobjects.YahooSignUpWebobjects;
import Pageobjects.functioncode1;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YahooSignUpStepDeff {

	WebDriver driver;
	YahooSignUpWebobjects SignupPage;
	PandoraSignUpPageObjects SP;
	functioncode1 obj1;
	
	
			@Given("^that the user is on the Yahoo sign up page$")
		public void that_the_user_is_on_the_Yahoo_sign_up_page() throws Throwable {
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				YahooSignUpWebobjects SignupPage;
				driver.get("https://login.yahoo.com/account/create?specId=yidReg");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		}

		@When("^user can see the correct pahe title$")
		public void user_can_see_the_correct_pahe_title() throws Throwable {
			
				String ActualPageTitle = driver.getTitle();
				String ExpactedPageTitle = "Yahoo";
				Reporter.log("Page Title validated");
				Assert.assertEquals(ActualPageTitle, ExpactedPageTitle);
		}

		@When("^user can see the correct URL$")
		public void user_can_see_the_correct_URL() throws Throwable {
			
				String ActiualUrl = driver.getCurrentUrl();
				String ExpectedUrl = "https://login.yahoo.com/account/create?specId=yidReg";
				Assert.assertEquals(ActiualUrl, ExpectedUrl);
				Reporter.log("URL validated");
		}

		@Then("^user can creat new Yahoo account$")
		public void user_can_creat_new_Yahoo_account() throws Throwable {
			System.out.println("user can now creat a new Yahoo account");
			
		}

		@When("^user can enter the firstName \"([^\"]*)\"$")
		public void user_can_enter_the_firstName(String arg1) throws Throwable {
			SignupPage.UserFirstName().sendKeys("Raman");
		}

		@When("^user can enter the lastName \"([^\"]*)\"$")
		public void user_can_enter_the_lastName(String arg1) throws Throwable {
			SignupPage.UserLastName().sendKeys(arg1);
		}

		@When("^user can enter the email \"([^\"]*)\"$")
		public void user_can_enter_the_email(String arg1) throws Throwable {
			SignupPage.UserEmail().sendKeys(arg1);
		}

		@When("^user can enter the password \"([^\"]*)\"$")
		public void user_can_enter_the_password(String arg1) throws Throwable {
			SignupPage.UserPassward().sendKeys(arg1);
		}

		@When("^user can enter the phoneNumber \"([^\"]*)\"$")
		public void user_can_enter_the_phoneNumber(String arg1) throws Throwable {
			SignupPage.PhoneNumber().sendKeys(arg1);
		}
		
		@When("^user can enter the birthMonth \"([^\"]*)\"$")
		public void user_can_enter_the_birthMonth(String arg1) throws Throwable {
			Select Month = new Select(SignupPage.GetMonth());
			Month.selectByVisibleText("July");
		}

		@When("^user can emter the birthDate \"([^\"]*)\"$")
		public void user_can_emter_the_birthDate(String arg1) throws Throwable {
			SignupPage.GetDate().sendKeys(arg1);
		}

		@When("^user can emter the birthYear \"([^\"]*)\"$")
		public void user_can_emter_the_birthYear(String arg1) throws Throwable {
			SignupPage.GetYear().sendKeys(arg1);
		}

		@When("^user can emter the gender \"([^\"]*)\"$")
		public void user_can_emter_the_gender(String arg1) throws Throwable {
			SignupPage.GetGender().sendKeys(arg1);
		}

		@Then("^user can close browser$")
		public void user_can_close_browser() throws Throwable {
			driver.manage().deleteAllCookies();	
			Thread.sleep(1000);
			obj1.printName();
			driver.quit();
		}
		
		
	@Before
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		
	}
		
		@Given("^the user is on the pendora sign up page$")
		public void the_user_is_on_the_pendora_sign_up_page() throws Throwable {
			SP = new PandoraSignUpPageObjects(driver);
			driver.get("https://www.pandora.com/account/register");
			
		}

		@When("^user can validate the URL$")
		public void user_can_validate_the_URL() throws Throwable {
			String ActiualUrl = driver.getCurrentUrl();
			String ExpectedUrl = "https://www.pandora.com/account/register";
				System.out.println(ActiualUrl);
			Assert.assertEquals(ActiualUrl, ExpectedUrl);
			Reporter.log("URL validated");
		}

		@When("^user can validate the page title$")
		public void user_can_validate_the_page_title() throws Throwable {
			String ActualPageTitle = driver.getTitle();
			String ExpactedPageTitle = "Music and Podcasts, Free and On-Demand | Pandora";
				System.out.println(ActualPageTitle);

			Assert.assertEquals(ActualPageTitle, ExpactedPageTitle);
			Reporter.log("Page Title validated");

		}

		@When("^user can enter email \"([^\"]*)\"$")
		public void user_can_enter_email(String arg1) throws Throwable {
			SP.userEmail().sendKeys(arg1);
		}

		@When("^user can enter password \"([^\"]*)\"$")
		public void user_can_enter_password(String arg1) throws Throwable {
			SP.userPassword().sendKeys(arg1);
		}

		@When("^user can enter birthyear \"([^\"]*)\"$")
		public void user_can_enter_birthyear(String arg1) throws Throwable {
			SP.userBirthYear().sendKeys(arg1);
		}

		@When("^user can enter zipcode \"([^\"]*)\"$")
		public void user_can_enter_zipcode(String arg1) throws Throwable {
		   SP.userZipCode().sendKeys(arg1);
		}

		@Then("^user can exit browser$")
		public void user_can_exit_browser() throws Throwable {
			driver.manage().deleteAllCookies();	
			Thread.sleep(3000);
			obj1.printName();
			driver.quit();
		}
		
	

		

}
