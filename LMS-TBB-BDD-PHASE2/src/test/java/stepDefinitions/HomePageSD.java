package stepDefinitions;

import Page_Factory.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class HomePageSD {

HomePage hp = new HomePage();
	
	@Given("Admin Launch the Browser")
	public void admin_launch_the_browser() {
	   Loggerload.info("Admin Launch the Browser");
	}

	@When("Admin gives correct LMS portal URL")
	public void admin_gives_correct_lms_portal_url() {
		hp.url();
	}

	@Then("Admin should land on the Home Page")
	public void admin_should_land_on_the_home_page() {
		Loggerload.info("Admin is on Home Page");
	}

	@When("Admin gives invalid LMS portal URL")
	public void admin_gives_invalid_lms_portal_url() {
	   hp.invalid_url();
	}

	@Then("Admin should receive {string} page not found error")
	public void admin_should_receive_page_not_found_error(String string) {
		Loggerload.info("Page Not Found");
	}

	@Then("HTTP response {string} then the link is broken")
	public void http_response_then_the_link_is_broken(String string) {
	   
	}

	@Then("Admin should see correct spelling all the fields")
	public void admin_should_see_correct_spelling_all_the_fields() {
	   
	}

	@Then("Admin should see correct logo of the LMS")
	public void admin_should_see_correct_logo_of_the_lms() {
	    
	}

	@Then("Admin should see logo is properly aligned")
	public void admin_should_see_logo_is_properly_aligned() {
	   
	}

	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
		
	}

	@Then("Admin should able to click login button")
	public void admin_should_able_to_click_login_button() {
	    
	}	

}
