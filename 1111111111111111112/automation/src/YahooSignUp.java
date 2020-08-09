package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooSignUp {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		functioncode1 obj1 = new functioncode1();

		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Mehar");
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Paul");

		driver.findElement(By.id("usernamereg-yid")).sendKeys("meharpaul");

		driver.findElement(By.id("usernamereg-password")).sendKeys("2020TheOne1");
		
		driver.findElement(By.name("phone")).sendKeys("5713839976");
				
		Select month = new Select(driver.findElement(By.name("mm")));
		
		month.selectByVisibleText("July");
		
		driver.findElement(By.name("dd")).sendKeys("6");
		
		driver.findElement(By.name("yyyy")).sendKeys("1987");
		
		driver.findElement(By.name("freeformGender")).sendKeys("female");
		
		boolean ContinueButton = driver.findElement(By.id("reg-submit-button")).isDisplayed();
		if (ContinueButton) {System.out.println("Submit Button is displayed");}
					
		boolean ContinueButton1 = driver.findElement(By.id("reg-submit-button")).isEnabled();
		if (ContinueButton1) {System.out.println("Submit Button is enabled");}	
	
		String Title = driver.getTitle();
			System.out.println(Title);
		
		String URL = driver.getCurrentUrl();
			System.out.println("URl is below");
			System.out.println(URL);
			
			
		Thread.sleep(2500);
			
			driver.manage().deleteAllCookies();	
			driver.quit();
			obj1.printName();
		
		
		
	
		
		
	}

}
