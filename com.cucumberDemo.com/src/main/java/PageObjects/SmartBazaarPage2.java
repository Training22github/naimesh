package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.Browser;

public class SmartBazaarPage2 extends Browser{
	public SmartBazaarPage2()
	{  try {
			PageFactory.initElements(driver, this);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@FindBy(xpath="//ul[@class='products columns-5']")
	WebElement searchResult;
	public WebElement searchResult()
	{
		return searchResult;
	}
}
