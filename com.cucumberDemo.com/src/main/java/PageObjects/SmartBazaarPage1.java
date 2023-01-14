package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.Browser;

public class SmartBazaarPage1 extends Browser{
	public SmartBazaarPage1()
	{  try {
			PageFactory.initElements(driver, this);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@FindBy(xpath="//*[@id='sgpb-popup-dialog-main-div-wrapper']/div/img")
	WebElement popUp;
	public WebElement popUp()
	{
		 return popUp;
	}
	
	@FindBy(name="s")
	WebElement searchText;
	public WebElement searchTextBox()
	{
		 return searchText;
	}
	
	@FindBy(xpath="/html/body/div[3]/header/div/div[1]/div[3]/div/div/div[2]/div[1]/form/div[2]/span")
	WebElement ClickSearch;
	public WebElement clickSearchIcon()
	{
		return ClickSearch;
	}
	
	@FindBy(xpath="//nav[@class='woocommerce-breadcrumb']")
	WebElement textVerification;
	public WebElement textVerifier()
	{
		return textVerification;
	}
}
