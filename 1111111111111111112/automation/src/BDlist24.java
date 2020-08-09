package functions;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BDlist24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
			
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_n")).sendKeys("Raman");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("u_0_p")).sendKeys("Paul");
				
		driver.findElement(By.id("u_0_s")).sendKeys("1032034444");
		
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("1234Paul");
		
	
		
		
		Thread.sleep(2000);
		
		driver.getTitle();
		//*[@id="password_step_input"]
		//*[@id="password_step_input"]
		driver.manage().deleteAllCookies();
		
		driver.getTitle();
		
		driver.getCurrentUrl();
		
		driver.quit();
		
		
		
		
		
		
		
	}

}

