package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ValidityGreenQATraining.LUMA.BaseClass;

public class TestCase extends BaseClass {
	
	
	static ExtentTest test;
	static ExtentReports report;
	
	
	@BeforeClass 
	public void open () {
		report = new ExtentReports("Report/"+"TestReport.html");
		test = report.startTest("LUMA---QA");
		openBrowser();
	}
	
	@Test
	public void test1() {
		navigateWebsite(); 
		
		test.log(LogStatus.PASS,"Test 1 Passed");
	}
	
	@Test 
	public void test3() {
		hp.search();
		test.log(LogStatus.PASS,"Test 3 Passed");
	}
	
	@Test 
	public void test4() throws InterruptedException {
		sl.itemLists();
		test.log(LogStatus.PASS,"Test 4 Passed");
	}
	
	@Test
	public void test5() throws InterruptedException {
		pd.itemDetails();
		test.log(LogStatus.PASS,"Test 5 Passed");
	}
	
	@Test 
	public void test6() throws InterruptedException {
		sa.accountEmail();
		test.log(LogStatus.PASS,"Test 6 Passed");
	}
	
	@Test 
	public void test7() throws InterruptedException {
		sa.shippingInfo();
	}
	@Test 
	public void test8() {
		sa.shippingMethod();
		test.log(LogStatus.PASS,"Test 7 Passed");
	}
	@Test 
	public void test9() throws InterruptedException {
		sa.confirmation();
		test.log(LogStatus.PASS,"Test 8 Passed");
	}

	@AfterClass 
	public void close() {
		closeBrowser(); 
		
		report.endTest(test);
		report.flush();
	}
	
	
	
}
