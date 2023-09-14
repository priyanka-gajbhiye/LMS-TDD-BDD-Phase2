package stepDefinition;

import Page_Factory.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class ResetPasswordSD {
	HomePage hp = new HomePage();
	@When("Admin clicks reset password link")
	public void admin_clicks_reset_password_link() {
	    hp.url();
	    hp.resetpasswordclick();
	}

	@Then("Admin should land on reset password page")
	public void admin_should_land_on_reset_password_page() {
	    Loggerload.info("Admin is on reset password page");
	}

	@Then("Admin should see submit  button")
	public void admin_should_see_submit_button() {
	    hp.submitbtn();
	}

	@Then("Admin should see submit button in center of the page")
	public void admin_should_see_submit_button_in_center_of_the_page() {
	    hp.centresubmitbtn();
	}

	@Then("Admin should see two text box")
	public void admin_should_see_two_text_box() {
	 hp.textcheck(2);
	}

	@Then("Admin should see Type in new password in the first label text")
	public void admin_should_see_type_in_new_password_in_the_first_label_text() {
	  hp.checklables();  
	}

	@Then("Admin should see Retype password in the second label text")
	public void admin_should_see_retype_password_in_the_second_label_text() {
	  hp.checklables();  
	}

	@Then("Admin should see text box in disabled state")
	public void admin_should_see_text_box_in_disabled_state() {
	    hp.textenablement();
	}




}
