package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phptravels {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		functioncode1 obj1 = new functioncode1 ();

		driver.get("https://www.phptravels.net/register");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Raman");
		
		driver.findElement(By.name("lastname")).sendKeys("Paul");
		
		driver.findElement(By.name("phone")).sendKeys("5713839976");

		driver.findElement(By.name("email")).sendKeys("RamanPaul@yahoo.com");

		driver.findElement(By.name("password")).sendKeys("TheOne1");

		driver.findElement(By.name("confirmpassword")).sendKeys("TheOne1");

		boolean SignUp = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).isDisplayed();
		if (SignUp) {System.out.println("Submit Button is displayed");}
					
		boolean SignUp1 = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).isEnabled();
		if (SignUp1) {System.out.println("Submit Button is enabled");}	
	
		String Title = driver.getTitle();
			System.out.println(Title);
		
		String URL = driver.getCurrentUrl();
			System.out.println(URL);
			
		Thread.sleep(1500);
			
			driver.manage().deleteAllCookies();	
			driver.quit();
			obj1.printName();

		
	}

}
