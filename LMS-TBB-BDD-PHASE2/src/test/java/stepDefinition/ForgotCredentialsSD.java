package stepDefinition;

import Page_Factory.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class ForgotCredentialsSD {
	
	HomePage hp = new HomePage();
	@When("Admin clicks forgot username or password link")
	public void admin_clicks_forgot_username_or_password_link() {
	    hp.forgotUsernamePasswordbtn();
	}

	@Then("Admin should land on forgot username or password page")
	public void admin_should_land_on_forgot_username_or_password_page() {
	  Loggerload.info("Admin is on forgot username and password page");
	}

	@Then("HTTP response >= {int} the link is broken")
	public void http_response_the_link_is_broken(Integer int1) {
	    hp.broken_links();
	}

	@Then("Admin should see Email text in gray color")
	public void admin_should_see_email_text_in_gray_color() {
	    hp.emailcolor();
	}

	@Then("Admin should see Email in text field")
	public void admin_should_see_email_in_text_field() {
	    hp.textcheck(1);
	}

	@Then("Admin should see send Link  button")
	public void admin_should_see_send_link_button() {
	    hp.sendlinkbtn();
	}

	@Then("Admin should see asterik {string} symbol need Email")
	public void admin_should_see_asterik_symbol_need_email(String string) {
	    hp.astrikemail(string);
	}

	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
	    
	}

	@Then("Admin should see send link button in center of the page")
	public void admin_should_see_send_link_button_in_center_of_the_page() {
	    hp.centresendlibtn();
	}

}
