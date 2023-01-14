package StepDefinition;

import Browser.Browser;
import Excel.Read;
import Pages.SmartBazaarSubPage1;
import Screenshot.CaptureScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	@Given("User opens the browser")
	public void user_opens_the_browser() {
		try {
			Browser.setDriver();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Then("User enters the {string}")
	public void user_enters_the(String string) {
		try {
			Browser.getUrl(string);

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@And("User enters the search Data")
	public void user_enters_the_search_data() {
		try {
			SmartBazaarSubPage1.textBoxEnter(Read.readExcel(0, 1));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@When("User clicks on the search icon")
	public void user_clicks_on_the_search_icon() {
		try {
			SmartBazaarSubPage1.clickSearchIcon();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Then("User verifies the search result")
	public void user_verifies_the_search_result() {
		try {
			Thread.sleep(2000);
			 CaptureScreen.ScreenShot(1);
			SmartBazaarSubPage1.textVerification(Read.readExcel(0, 1));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@And("User close the browser")
	public void user_close_the_browser() {
		try
		{
			Browser.closeBrowser();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
