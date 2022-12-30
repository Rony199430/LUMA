package ValidityGreenQATraining.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchList extends BaseClass{
	
	SearchList (WebDriver driver){
		this.driver= driver; 
	}

	public void itemLists() throws InterruptedException {
	scrolling (); 
	driver.findElement(By.xpath("(//img[@class = 'product-image-photo'])[1]")).click();
	Thread.sleep(2000);
	}
	
}
