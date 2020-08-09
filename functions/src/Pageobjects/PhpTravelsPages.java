package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpTravelsPages {

	WebDriver driver;

	public PhpTravelsPages(WebDriver y) {
		driver = y;	}

	public WebElement UserFirstName(){
		WebElement FirstName = driver.findElement(By.name("firstname"));
		return FirstName;
		}

	public WebElement UserLastName() {
		WebElement LastName= driver.findElement(By.name("lastname"));
		return LastName;
		}

	public WebElement UserPhone() {
		WebElement Phone= driver.findElement(By.name("phone"));
		return Phone;
		}
	
	public WebElement UserEmail() {	
		WebElement email= driver.findElement(By.name("email"));
		return email;
		}
		
	public WebElement UserPassword() {	
		WebElement Password= driver.findElement(By.name("password"));
		return Password;
		}
	public WebElement UserConfirmPassword() {	
		WebElement ConfirmPassword= driver.findElement(By.name("confirmpassword"));
		return ConfirmPassword;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
