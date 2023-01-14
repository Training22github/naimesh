package Pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Browser.Browser;
import PageObjects.SmartBazaarPage2;

public class SmartBazaarSubPage2 extends Browser  {
	public static SmartBazaarPage2 obj;
	
	public static void searhResultSelect(String text) throws IOException
	{
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Selection Test");
		logger.log(Status.INFO, "Selecting the Result");
		try {
		obj = new SmartBazaarPage2();
		List<WebElement> searchList = obj.searchResult().findElements(By.xpath(".//li/div/div/div[3]/div[1]/h4/a"));
		for(int i=0; i<searchList.size(); i++)
		{
			String searchText = searchList.get(i).getText(); 
			if(searchText.contains(text)) 
			{
				act.moveToElement(searchList.get(i)).click().build().perform();
				break;
			}
		}
		logger.log(Status.PASS, "Selection Passed");
		}catch(Exception e)
		{
			System.out.println(e);
			logger.log(Status.FAIL, "Selection Failed");
		}
		extent.flush();
	}
	
	
}
