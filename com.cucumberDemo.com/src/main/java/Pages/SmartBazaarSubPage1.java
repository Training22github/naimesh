package Pages;

import java.io.IOException;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Browser.Browser;
import PageObjects.SmartBazaarPage1;

public class SmartBazaarSubPage1 extends Browser {
	public static SmartBazaarPage1 obj;
	
	public static void textBoxEnter(String text) throws IOException
	{
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Search Test");
		logger.log(Status.INFO, "Entering Search Data");
		try {
		obj = new SmartBazaarPage1();
		obj.popUp().click();
		}
		catch(Exception e)
		{
			System.out.println("Pop Up didn't Appear");
		}
		try {
		obj.searchTextBox().sendKeys(text);
		logger.log(Status.PASS, "Search Data Entering Passed");
		}catch(Exception e)
		{
			System.out.println(e);
			logger.log(Status.FAIL, "Search Data Entering Failed");
		}
		extent.flush();
	}

	 public static void clickSearchIcon() 
	 {
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Search Test");
		logger.log(Status.INFO, "Searching Click Icon");
		 try {
		 obj.clickSearchIcon().click();
		 logger.log(Status.PASS, "Search Click Passed");
		 }catch(Exception e)
			{
				System.out.println(e);
				logger.log(Status.PASS, "Search Click Failed");
			}
		extent.flush();
	 }
	 
	 public static void textVerification(String text) throws Exception
	 {
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Search Test Verification");
		logger.log(Status.INFO, "Assert Test");
		 try {
		 String actualResult = obj.textVerifier().getText();
		  boolean actualresult = actualResult.contains(text);
		 Assert.assertTrue(actualresult);
		 logger.log(Status.PASS, "Search Results Passed");
	 }catch(AssertionError e)
		 {
	             System.out.println(e);	
	             logger.log(Status.PASS, "Search Results Failed");
		 }
		 extent.flush();
	 }
}
