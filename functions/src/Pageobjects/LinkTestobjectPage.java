package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTestobjectPage {

WebDriver driver;
	
	public LinkTestobjectPage(WebDriver z) {
		driver = z;	}

	public WebElement UserFirstName(){
		WebElement FirstName = driver.findElement(By.name("firstName"));
		return FirstName;
		}

	public WebElement UserLastName() {
		WebElement LastName= driver.findElement(By.name("lastName"));
		return LastName;
		}

	public WebElement UserPhone() {
		WebElement Phone= driver.findElement(By.name("phone"));
		return Phone;
		}
	
	public WebElement UserEmail() {	
		WebElement email= driver.findElement(By.id("userName"));
		return email;
		}
		
	public WebElement UserAddress() {	
		WebElement address= driver.findElement(By.name("address1"));
		return address;
		}
	
	public WebElement UserCity() {	
		WebElement city= driver.findElement(By.name("city"));
		return city;
		}
		
	public WebElement UserState() {	
		WebElement state= driver.findElement(By.name("state"));
		return state;
		}
	public WebElement UserZipCode() {	
		WebElement zipCode= driver.findElement(By.name("postalCode"));
		return zipCode;
		}
	
	public WebElement UserName() {	
		WebElement loginName= driver.findElement(By.name("email"));
		return loginName;
		}
		
	public WebElement UserPassword() {	
		WebElement password= driver.findElement(By.name("password"));
		return password;
		}
	public WebElement UserConfirmPassword() {	
		WebElement password= driver.findElement(By.name("confirmPassword"));
		return password;
		}
	
}
