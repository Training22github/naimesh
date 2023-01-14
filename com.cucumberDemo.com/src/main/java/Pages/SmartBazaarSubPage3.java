package Pages;

import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import Browser.Browser;
import PageObjects.SmartBazaarPage3;

public class SmartBazaarSubPage3 extends Browser{
	public static SmartBazaarPage3 obj;
	
	public static void textVerification(String text) throws Exception
	 {
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Selection Test Verification");
		logger.log(Status.INFO, "Selecting Result Passed");
		 try {
		 obj = new SmartBazaarPage3();
		 String actualResult = obj.textVerification().getText();
		 boolean actualresult = actualResult.equalsIgnoreCase(text);
		 Assert.assertTrue(actualresult);
		 logger.log(Status.PASS, "Selecting Results Passed");
	 }catch(AssertionError e)
		 {
	             System.out.println(e);	
	             logger.log(Status.FAIL, "Selecting Results Failed");
		 }
		 extent.flush();
	 }
}
