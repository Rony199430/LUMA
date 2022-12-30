package ValidityGreenQATraining.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddress extends BaseClass{
	
	ShippingAddress(WebDriver driver){
		this.driver = driver; 
	}
	
	
	
	public void accountEmail() throws InterruptedException {
		driver.findElement(By.id("customer-email")).sendKeys("johnsmith123@gmail.com"); 
		Thread.sleep(2000); 
	}
	
	public void shippingInfo () throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Smith");
		Thread.sleep(2000); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)", "");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("1 Broadway");
		driver.findElement(By.xpath("//input[@name='street[1]']")).sendKeys("apt 1");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Brooklyn");
		Select city = new Select (driver.findElement(By.xpath("//select[@name='region_id']")));
		city.selectByVisibleText("New York");  
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("11211");
		Select cntry = new Select (driver.findElement(By.xpath("//select[@name='country_id']")));
		cntry.selectByVisibleText("United States");
		js.executeScript("window.scrollBy(0, 1000)", ""); 
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("123-456-7890");
		Thread.sleep(2000); 
	}
	
	public void shippingMethod(){
		
		driver.findElement(By.id("label_method_flatrate_flatrate")).click();
		driver.findElement(By.xpath("//button[@data-role='opc-continue']")).click();
	}
	public void confirmation () throws InterruptedException {
		Thread.sleep(3000); 
		driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click(); 
	}
}
