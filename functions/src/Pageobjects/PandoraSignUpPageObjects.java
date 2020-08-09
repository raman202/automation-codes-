package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PandoraSignUpPageObjects {

	WebDriver driver;
	
	
	public PandoraSignUpPageObjects (WebDriver x) {
		driver = x;	}
	
	public WebElement userEmail() {
		WebElement email=driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[1]/div/label/div[2]/input"));
		return email;
	}
	
	public WebElement userPassword () {
		WebElement password=driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[2]/div/label/div[2]/input"));
		return password;
	}
	
	public WebElement userBirthYear () {
		WebElement birthYear=driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[3]/div/div/div[1]/label/div[2]/input"));
		return birthYear;
	}
	
	public WebElement userZipCode () {
		WebElement zipCode=driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[3]/div/div/div[2]/label/div[2]/input"));
		return zipCode;
	}
	
	public WebElement SignUpButton () {
		WebElement signUpButton=driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[6]/div/button"));
		return signUpButton;
	}
	
	public WebElement userGenderMale () {
		WebElement genderMale=driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[5]/div/label/div[2]/label[1]/input"));
		return genderMale;
	}
	
	
	public WebElement userGenderFemale () {
		WebElement genderFemale=driver.findElement(By.xpath("/html/body/div[3]/div/main/div/div/div[2]/div[3]/div/div[1]/form/div[5]/div/label/div[2]/label[1]/div/div[1]/span"));
		return genderFemale;
	}
	
	
	
	
	
	
	
	
	
}
