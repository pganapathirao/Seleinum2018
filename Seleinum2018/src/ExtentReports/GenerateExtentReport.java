package ExtentReports;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;


public class GenerateExtentReport {

	ExtentReports extent;  //specify the location of the report
	ExtentTest test;   //what details should be popuplated in the report
	
	@BeforeTest
	public void startReport() {

		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/MyOwnReport.html",true);
		extent.addSystemInfo("Host Name", "LocalHost");
		extent.addSystemInfo("Envionment", "QA");
		extent.addSystemInfo("User Name", "Ganesh");
		extent.loadConfig(new File(System.getProperty("user.dir")+ "\\extent-config.xml"));
				
	}
	
	@Test
	public void demoReportPass() {
		
		test =extent.startTest("DemoReportPass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condiation is true");
	}
	@Test
public void demoReportFail() {
		
		test =extent.startTest("DemoReportFail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Assert pass as condiation is false");
	}
@AfterMethod
public void getResult(ITestResult result) {
	
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(LogStatus.FAIL, result.getThrowable());
	}
	extent.endTest(test);
}

@AfterTest
public void endreport() {
	extent.flush();
}
}