package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.functioncode1;

public class linktest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\testing drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		functioncode1 obj1 = new functioncode1();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Specials")).click();
		
		String SpecialTitle = driver.getTitle();
			System.out.println(SpecialTitle);
			
		String SpecialsURL = driver.getCurrentUrl();
			System.out.println(SpecialsURL);
			
		driver.navigate().back();
		
		Thread.sleep(1500);
			
		driver.findElement(By.linkText("New products")).click();
		
		String NewProductsTitle = driver.getTitle();
			System.out.println(NewProductsTitle);
			
		String NewProductsURL = driver.getCurrentUrl();
			System.out.println(NewProductsURL);
			
		driver.navigate().back();
		
		driver.findElement(By.linkText("Best sellers")).click();
		
		String BestSellersTitle = driver.getTitle();
			System.out.println(BestSellersTitle);
			
		String BestSellersURL = driver.getCurrentUrl();
			System.out.println(BestSellersURL);
			
		driver.navigate().back();
		
		driver.findElement(By.linkText("Our stores")).click();
		
		String OurStoresTitle = driver.getTitle();
			System.out.println(OurStoresTitle);
			
		String OurStoresURL = driver.getCurrentUrl();
			System.out.println(OurStoresURL);
			
		driver.navigate().back();
		
		driver.findElement(By.linkText("Contact us")).click();
		
		String ContactUsTitle = driver.getTitle();
			System.out.println(ContactUsTitle);
			
		String ContactUsURL = driver.getCurrentUrl();
			System.out.println(ContactUsURL);
			
		driver.navigate().back();
		
		driver.findElement(By.linkText("Terms and conditions of use")).click();
		
		String TermsTitle = driver.getTitle();
			System.out.println(TermsTitle);
			
		String TermsURL = driver.getCurrentUrl();
			System.out.println(TermsURL);
			
		driver.navigate().back();
		
		driver.findElement(By.linkText("About us")).click();
		
		String AboutUsTitle = driver.getTitle();
			System.out.println(AboutUsTitle);
			
		String AboutUsURL = driver.getCurrentUrl();
			System.out.println(AboutUsURL);
			
		driver.navigate().back();
		
		driver.findElement(By.linkText("Sitemap")).click();
		
		String SiteMapTitle = driver.getTitle();
			System.out.println(SiteMapTitle);
			
		String SiteMapURL = driver.getCurrentUrl();
			System.out.println(SiteMapURL);
			
			
		driver.navigate().back();
		
		Thread.sleep(1500);
		
		driver.manage().deleteAllCookies();	
		driver.quit();
		obj1.printName();
		
		

	}

}
