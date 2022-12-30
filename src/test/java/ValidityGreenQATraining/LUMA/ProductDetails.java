package ValidityGreenQATraining.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ProductDetails extends BaseClass {
  
	ProductDetails (WebDriver driver){
		this.driver= driver; 
	}
	JavascriptExecutor js = (JavascriptExecutor) driver; 

	public void itemDetails () throws InterruptedException {
		//js.executeScript("window.scrollBy(0, 150)", ""); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label= 'S']")).click();
		driver.findElement(By.xpath("//div[@option-label= 'Blue']")).click();	
		driver.findElement(By.id("qty")).clear();
		driver.findElement(By.id("qty")).sendKeys("5");
		Thread.sleep(2000);
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='counter qty'])[1]")).click(); 
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(3000);
	}
	
	
}
