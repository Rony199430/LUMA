package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ValidityGreenQATraining.LUMA.BaseClass;

public class TestCase extends BaseClass {
	
	@BeforeClass 
	public void open () {
		openBrowser();
	}
	
	@Test
	public void test1() {
		navigateWebsite(); 
	}

	@Test
	public void test2() {
		
	}
	
	@Test 
	public void test3() {
		hp.search();
	}
	
	@Test 
	public void test4() throws InterruptedException {
		sl.itemLists();
	}
	
	@Test
	public void test5() throws InterruptedException {
		pd.itemDetails();
	}
	
	@Test 
	public void test6() throws InterruptedException {
		sa.accountEmail();
	}
	
	@Test 
	public void test7() throws InterruptedException {
		sa.shippingInfo();
	}
	@Test 
	public void test8() {
		sa.shippingMethod();
	}
	@Test 
	public void test9() throws InterruptedException {
		sa.confirmation();
	}

	@AfterClass 
	public void close() {
		closeBrowser(); 
	}
	
	
	
}
