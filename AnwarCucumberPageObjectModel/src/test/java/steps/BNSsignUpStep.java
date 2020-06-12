package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BNSsignUpPage;

public class BNSsignUpStep extends AbstractClass{
	BNSsignUpPage bnsp=PageFactory.initElements(driver, BNSsignUpPage.class);
	@Given("User is on BNS sign up page")
	public void user_is_on_BNS_sign_up_page() {
		driver.get("file:///C:/Users/ANAWA/OneDrive/Desktop/BNS.html");
	    
	}

	@When("User will enter {string} in firstname textbox, {string} in lastname textbox, {string} in emil textbox,{string} in password textbox, {string} in phone textbox")
	public void user_will_enter_in_firstname_textbox_in_lastname_textbox_in_emil_textbox_in_password_textbox_in_phone_textbox(String FN, String LN, String EM, String PW, String PH) {
	   bnsp.enterFirstName(FN);
	   bnsp.enterLastName(LN);
	   bnsp.enterEmail(EM);
	   bnsp.enterPassword(PW);
	   bnsp.enterPhone(PH);
	}

	@When("User will select {string} in month dropdown box, {string} in day dropdown box, {string} in year dropdownbox")
	public void user_will_select_in_month_dropdown_box_in_day_dropdown_box_in_year_dropdownbox(String MN, String DY, String YR) {
	    bnsp.selectMonth(MN);
	    bnsp.selectDay(DY);
	    bnsp.selectYear(YR);
	}

	@When("User will click {string} in Gender radio button")
	public void user_will_click_in_Gender_radio_button(String GN) {
	   bnsp.clickOnMale(GN);
	}

	@When("User will click {string} in submit button")
	public void user_will_click_in_submit_button(String SUB) throws InterruptedException {
	    bnsp.clickOnSubmit();
	    Thread.sleep(3000);
	}

	@Then("User should see message {string}")
	public void user_should_see_message(String message) throws InterruptedException {
	    bnsp.verifyText(message);
	    Thread.sleep(3000);
	}


}
