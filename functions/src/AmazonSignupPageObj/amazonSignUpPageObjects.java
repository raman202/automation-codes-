package AmazonSignupPageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonSignUpPageObjects {

	WebDriver driver;
	
	public amazonSignUpPageObjects (WebDriver x) {
		driver = x;	}
	
	public WebElement UserFirstName(){
		WebElement FullName = driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
		return FullName;
		}

		public WebElement UserEmail() {
		WebElement email= driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		return email;
		}
	
	public WebElement UserPassword() {	
		WebElement password=driver.findElement(By.name("password"));
		return password;
		}
		
	public WebElement confirmPassword() {	
		WebElement confirmPassword=driver.findElement(By.name("passwordCheck"));
		return confirmPassword;
		}
	
	public WebElement creatAccountButton() {
		WebElement creatAccountButton = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		return creatAccountButton;	
		}
	
	
	
	
	
	
}
