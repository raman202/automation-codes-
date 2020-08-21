package cucumberSetdefFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import AmazonSignupPageObj.amazonSignUpPageObjects;
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
	amazonSignUpPageObjects ASP;
	functioncode1 obj1;

	// Yahoo Step deff

	@Given("^user is on the Yahoo sign page$")
	public void user_is_on_the_Yahoo_sign_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		SignupPage = new YahooSignUpWebobjects(driver);
		obj1 = new functioncode1();
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	}

	@Given("^user is able to see correct URl$")
	public void user_is_able_to_see_correct_URl() throws Throwable {
		String ActiualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://login.yahoo.com/account/create?specId=yidReg";
		System.out.println(ActiualUrl);
		Assert.assertEquals(ActiualUrl, ExpectedUrl);
		Reporter.log("URL validated");
	}

	@Then("^user can close browser$")
	public void user_can_close_browser() throws Throwable {
		driver.manage().deleteAllCookies();	
		Thread.sleep(3000);
		obj1.printName();
		driver.quit();
	}

	@Given("^user can see the correct page title$")
	public void user_can_see_the_correct_page_title() throws Throwable {
		String ActualPageTitle = driver.getTitle();
		String ExpactedPageTitle = "Yahoo";
		System.out.println(ActualPageTitle);
		Assert.assertEquals(ActualPageTitle, ExpactedPageTitle);
		Reporter.log("Page Title validated");
	}

	@When("^user can enter the firstname \"([^\"]*)\"$")
	public void user_can_enter_the_firstname(String arg1) throws Throwable {
	   SignupPage.UserFirstName().sendKeys(arg1);
	}

	@When("^user can enter the lastname \"([^\"]*)\"$")
	public void user_can_enter_the_lastname(String arg1) throws Throwable {
		   SignupPage.UserLastName().sendKeys(arg1);

	}

	@When("^user can enter the email \"([^\"]*)\"$")
	public void user_can_enter_the_email(String arg1) throws Throwable {
		   SignupPage.UserEmail().sendKeys(arg1);
	}

	@When("^user can enter the birth date \"([^\"]*)\"$")
	public void user_can_enter_the_birth_date(String arg1) throws Throwable {
	   SignupPage.GetDate().sendKeys(arg1);
	}

	@When("^user can enter the birth year \"([^\"]*)\"$")
	public void user_can_enter_the_birth_year(String arg1) throws Throwable {
	 SignupPage.GetYear().sendKeys(arg1);
	}
	
	@Given("^user can enter the passward \"([^\"]*)\"$")
	public void user_can_enter_the_passward(String arg1) throws Throwable {
		   SignupPage.UserPassward().sendKeys(arg1);
	}

	@Given("^user can enter the phone \"([^\"]*)\"$")
	public void user_can_enter_the_phone(String arg1) throws Throwable {
	  SignupPage.PhoneNumber().sendKeys(arg1);
	}

	@When("^user can enter the gender \"([^\"]*)\"$")
	public void user_can_enter_the_gender(String arg1) throws Throwable {
	   SignupPage.GetGender().sendKeys(arg1);
	}

	@When("^user can select the birth month \"([^\"]*)\"$")
	public void user_can_select_the_birth_month(String arg1) throws Throwable {
		Select Month = new Select(SignupPage.GetMonth());
		Month.selectByVisibleText("July");
}

	@Given("^user can enter the password \"([^\"]*)\"$")
	public void user_can_enter_the_password(String arg1) throws Throwable {
		SignupPage.UserPassward().sendKeys(arg1);
}
	
	
	// Amazon Step Deff
	

	@Given("^user is on the Amazon sign up page$")
	public void user_is_on_the_Amazon_sign_up_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		obj1 = new functioncode1();
		ASP = new amazonSignUpPageObjects(driver);
		driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dap_frn_logo%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		driver.manage().window().maximize();
	}

	@When("^user can validate the amazon sign up page URL$")
	public void user_can_validate_the_amazon_sign_up_page_URL() throws Throwable {
		String ActiualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dap_frn_logo%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
		System.out.println(ActiualUrl);
		Assert.assertEquals(ActiualUrl, ExpectedUrl);
		Reporter.log("URL validated");
	}

	@When("^user can see and validate the amazon sign up page title$")
	public void user_can_see_and_validate_the_amazon_sign_up_page_title() throws Throwable {
		String ActualPageTitle = driver.getTitle();
		String ExpactedPageTitle = "Amazon Registration";
		System.out.println(ActualPageTitle);
		Assert.assertEquals(ActualPageTitle, ExpactedPageTitle);
		Reporter.log("Page Title validated");
	}

	@When("^user can enter thier name \"([^\"]*)\"$")
	public void user_can_enter_thier_name(String arg1) throws Throwable {
		ASP.UserFirstName().sendKeys(arg1);
	}

	@When("^user can enter thier email \"([^\"]*)\"$")
	public void user_can_enter_thier_email(String arg1) throws Throwable {
	  ASP.UserEmail().sendKeys(arg1);
	}

	@When("^user can enter a password\"([^\"]*)\"$")
	public void user_can_enter_a_password(String arg1) throws Throwable {
	   ASP.UserPassword().sendKeys(arg1);;
	}

	@When("^user can confirm password \"([^\"]*)\"$")
	public void user_can_confirm_password(String arg1) throws Throwable {
	    ASP.confirmPassword().sendKeys(arg1);
	}
	
	@Then("^user can close the browser$")
	public void user_can_close_the_browser() throws Throwable {
		driver.manage().deleteAllCookies();	
		Thread.sleep(3000);
		obj1.printName();
		driver.quit();
	}
	

}
