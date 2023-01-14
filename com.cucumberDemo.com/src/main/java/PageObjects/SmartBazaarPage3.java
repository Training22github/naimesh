package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Browser.Browser;

public class SmartBazaarPage3 extends Browser{
	public SmartBazaarPage3()
	{  try {
			PageFactory.initElements(driver, this);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@FindBy(xpath="//*[@id='primary']/main/div[2]/div/div[2]/h1")
	WebElement textVerification;
	public WebElement textVerification()
	{
		return textVerification;
	}
}
