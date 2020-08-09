package functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();	
	
	driver.get("https://www.google.com/?&bih=625&biw=749&safe=active&hl=en");
	
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("gbqfbb")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("gsr")).click();

	
	Thread.sleep(5000);
	
	
driver.navigate().back();



Thread.sleep(5500);
	
	
	
		String title = driver.getTitle();
		System.out.println(title);
		
	String url = driver.getCurrentUrl();
		System.out.println(url);
				

	driver.manage().deleteAllCookies();
	
	
	driver.quit();

		
	
		
		
		
		
		
	}

}
