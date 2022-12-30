package ValidityGreenQATraining.LUMA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver; 
	public HomePage hp; 
	public ProductDetails pd; 
	public SearchList sl;
	public ShippingAddress sa; 
	
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		
		hp = new HomePage(driver);
		pd = new ProductDetails(driver); 
		sl = new SearchList(driver); 
		sa = new ShippingAddress (driver); 
		
		
	}
	
	public void navigateWebsite() {
		driver.get("https://magento.softwaretestingboard.com");
	}
	
	public void scrolling () {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)", ""); 
		}
	
	public void closeBrowser () {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}
