package stepDefinition;

import org.junit.Assert;

import Page_Factory.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class LoginPageSD {

	HomePage hp = new HomePage();
	
	@Given("Admin is on Home Page")
	public void admin_is_on_home_page() {
	    hp.url();
	}

	@When("Admin clicks login button")
	public void admin_clicks_login_button() {
	    hp.logincheck();
	}

	@Then("Admin land on Login Page")
	public void admin_land_on_login_page() {
	    Loggerload.info("Admin is on Login page");;
	}
	
	@Then("HTTP response {string} then the login link is broken")
	public void http_response_then_the_login_link_is_broken(String string) {
	    hp.broken_links();
	}

	@Then("Admin should see {string} in the Header")
	public void admin_should_see_in_the_header(String string) {
		hp.headerlogin(string);
	}

	@Then("Admin should see correct spelling in all the feilds")
	public void admin_should_see_correct_spelling_in_all_the_feilds() {
	    hp.spellchecker();
	}

	@Then("Admin should see two text feilds")
	public void admin_should_see_two_text_feilds() {
	    hp.textcheck(2);
	}

	@Then("Admin should {string} in the first text feild")
	public void admin_should_in_the_first_text_feild(String string) {
	    hp.usertext(string);
	}

	@Then("Admin should see {string} symbol next to user text")
	public void admin_should_see_symbol_next_to_user_text(String string) {
	    hp.astrikuser(string);
	}

	@Then("Admin should {string} in the second text feild")
	public void admin_should_in_the_second_text_feild(String string) {
	    hp.passwordtext(string);
	}

	@Then("Admin should see {string} symbol next to password text")
	public void admin_should_see_symbol_next_to_password_text(String string) {
	    hp.astrikpassword(string);
	}


	@Then("Admin should see input feild on the centre of the page")
	public void admin_should_see_input_feild_on_the_centre_of_the_page() {
	    hp.centrepage();
	}

	@Then("Admin should see login button on the centre of the page")
	public void admin_should_see_login_button_on_the_centre_of_the_page() {
	    hp.centreloginbtn();
	}

	@Then("Admin should see forgot password and username link")
	public void admin_should_see_forgot_password_and_username_link() {
	    hp.forgotUsernamePassword();
	}

	@Then("Admin should see reset password link")
	public void admin_should_see_reset_password_link() {
	 hp.resetpassword();
	}

	@Then("Admin should see user in grey color")
	public void admin_should_see_user_in_grey_color() {
	  hp.usercolor();
	}

	@Then("Admin should see password in grey color")
	public void admin_should_see_password_in_grey_color() {
	    hp.passwordcolor();
	}
}
