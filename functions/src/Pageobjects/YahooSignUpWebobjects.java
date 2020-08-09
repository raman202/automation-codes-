package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooSignUpWebobjects {
	
	WebDriver driver;
	
	public YahooSignUpWebobjects (WebDriver x) {
		driver = x;	}
	
	public WebElement UserFirstName(){
		WebElement FirstName = driver.findElement(By.id("usernamereg-firstName"));
		return FirstName;
		}

	public WebElement UserLastName() {
		WebElement LastName= driver.findElement(By.id("usernamereg-lastName"));
		return LastName;
		}

	public WebElement UserEmail() {
		WebElement email= driver.findElement(By.id("usernamereg-yid"));
		return email;
		}
	
	public WebElement UserPassward() {	
		WebElement password=driver.findElement(By.id("usernamereg-password"));
		return password;
		}
		
	public WebElement PhoneNumber() {	
		WebElement Phone=driver.findElement(By.name("phone"));
		return Phone;
		}
	public WebElement GetMonth() {	
		return driver.findElement(By.name("mm"));	
		}
	public WebElement GetDate() {
		WebElement Date = driver.findElement(By.name("dd"));
		return Date;	
		}
	public WebElement GetYear() {
		WebElement Year = driver.findElement(By.name("yyyy"));
		return Year;	
		}
	public WebElement GetGender() {
		WebElement Gender = driver.findElement(By.name("freeformGender"));
		return Gender;	
		}

	public WebElement GetCountryCode() {
		return driver.findElement(By.name("shortCountryCode"));	
	}
}
