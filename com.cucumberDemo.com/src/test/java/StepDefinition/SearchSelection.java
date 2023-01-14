package StepDefinition;

import Pages.SmartBazaarSubPage1;
import Pages.SmartBazaarSubPage2;
import Pages.SmartBazaarSubPage3;
import Screenshot.CaptureScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchSelection {
	@And("User enters the {string} Data")
	public void user_enters_the_data(String string) {
		try {
			SmartBazaarSubPage1.textBoxEnter(string);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@And("User selects the {string} from the list")
	public void user_selects_the_from_the_list(String string) {
		try {
			Thread.sleep(2000);
			SmartBazaarSubPage2.searhResultSelect(string);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Then("User verifies the {string} result")
	public void user_verifies_the_result(String string) {
		try {
			Thread.sleep(2000);
			 CaptureScreen.ScreenShot(2);
			 SmartBazaarSubPage3.textVerification(string);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
