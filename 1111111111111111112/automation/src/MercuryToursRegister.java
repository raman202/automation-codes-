package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursRegister {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		functioncode1 obj1 = new functioncode1 ();

		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstName")).sendKeys("Raman");
		
		driver.findElement(By.name("lastName")).sendKeys("Paul");
		
		driver.findElement(By.name("phone")).sendKeys("5713839976");

		driver.findElement(By.id("userName")).sendKeys("RamanPaul@yahoo.com");

		driver.findElement(By.name("address1")).sendKeys("8353 Firsthome Dr");

		driver.findElement(By.name("city")).sendKeys("Washington");

		driver.findElement(By.name("state")).sendKeys("DC");

		driver.findElement(By.name("postalCode")).sendKeys("20024");

		driver.findElement(By.name("email")).sendKeys("TheOne");

		driver.findElement(By.name("password")).sendKeys("YesHeIs1");

		driver.findElement(By.name("confirmPassword")).sendKeys("YesHeIs1");

		boolean Submit = driver.findElement(By.name("register")).isDisplayed();
		if (Submit) {System.out.println("Submit Button is displayed");}
					
		boolean Submit1 = driver.findElement(By.name("register")).isEnabled();
		if (Submit1) {System.out.println("Submit Button is enabled");}	
	
		String Title = driver.getTitle();
			System.out.println(Title);
		
		String URL = driver.getCurrentUrl();
			System.out.println(URL);
			
		Thread.sleep(2500);
			
			driver.manage().deleteAllCookies();
			
			driver.quit();
			
			obj1.printName();
				
		
	}

}
