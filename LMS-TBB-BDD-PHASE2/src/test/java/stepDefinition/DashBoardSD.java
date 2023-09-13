package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Page_Factory.DashBoard;
import Page_Factory.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.Loggerload;

public class DashBoardSD {
	
	HomePage hp = new HomePage();
	ExcelReader reader = new ExcelReader();
	DashBoard db = new DashBoard();
	@Given("Admin is in login page")
	public void admin_is_in_login_page() {
	    db.url();
	    
	}
	
	@When("Admin enter valid credentials from excel sheet")
	public void admin_enter_valid_credentials_from_excel_sheet_() throws InvalidFormatException, IOException {
		db.validcredentials();
		db.logincheck();
	}

	@Then("Admin should see manage program as header")
	public void admin_should_see_manage_program_as_header() {
		db.Header();
	    
	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
	    db.ResponseTime(int1);
	}
	
	@Then("HTTP response {string} the link is broken at dashboard")
	
	public void http_response_the_login_link_is_broken_at_dashboard(String string) {
	    db.broken_links();
	}


	@Then("Admin should see {string} as title")
	public void admin_should_see_lms_learning_management_system_as_title(String string) {
	    db.title(string);
	}

	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() {
	    db.titlelocationleft();
	}

	@Then("Admin should see correct spelling in navigation bar text {string}")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
	    db.spellcheck();
	}

	@Then("Admin should see correct spelling and space in LMS title {string}")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
		db.spellcheck();
	}

	@Then("Admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
	    db.titlelocationright();
	}

	@Then("Admin should see student in the 1 st place")
	public void admin_should_see_student_in_the_1st_place() {
	    db.validatenavbar(0);
	}

	@Then("Admin should see program in the 2nd place")
	public void admin_should_see_program_in_the_2nd_place() {
		 db.validatenavbar(1);
	}

	@Then("Admin should see batch in the 3rd place")
	public void admin_should_see_batch_in_the_3rd_place() {
		 db.validatenavbar(2);
	}

	@Then("Admin should see class in the 4th place")
	public void admin_should_see_class_in_the_4th_place() {
		 db.validatenavbar(3);
	}

	@Then("Admin should see student in the  5th user")
	public void admin_should_see_student_in_the_5th_user() {
		 db.validatenavbar(4);
	}

	@Then("Admin should see student in the  6th assignment")
	public void admin_should_see_student_in_the_6th_assignment() {
		 db.validatenavbar(5);
	}

	@Then("Admin should see student in the  7th attendance")
	public void admin_should_see_student_in_the_7th_attendance() {
		 db.validatenavbar(6);}

	@Then("Admin should see student in the 8th logout")
	public void admin_should_see_student_in_the_8th_logout() {
		 db.validatenavbar(7);
	}



}
