package ValidityGreenQATraining.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass{
	
	HomePage (WebDriver driver){
		
		this.driver= driver; 
	}

	public void search() {
		
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("Yoga Pants");
		driver.findElement(By.id("search")).sendKeys(Keys.RETURN); 
	}
}
