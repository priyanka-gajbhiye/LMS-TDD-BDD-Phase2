package stepDefinition;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Page_Factory.StudentPage;
import utilities.ExcelReader;
import utilities.Loggerload;

public class StudentValidation {
	StudentPage student= new StudentPage();
	ExcelReader reader = new ExcelReader();
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	   
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
		 student.clickstudentPage();
	}

	@Then("Admin should see the Student details Page Title")
	public void admin_should_see_the_student_details_page_title() {
	    student.validatestudentpagetitle();
	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
	    student.validateresponsetime();
	}

	@Then("HTTP response >= {int}.")
	public void http_response(Integer int1) {
	    student.broken_links();
	}

	@Then("The link is broken")
	public void the_link_is_broken() {
		Loggerload.info("Page Not Found");
	}

	@Then("Admin should see LMS -Learning management system  as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
	    student.validateLMStitle();
	}

	@Then("Student Detail title should be in centre of the page")
	public void student_detail_title_should_be_in_centre_of_the_page() {
	   student.centrealignstudentdetailpage();
	}

	@Then("Two dropdowns should be present in the page")
	public void two_dropdowns_should_be_present_in_the_page() {
	    student.validatedropdown();
	}

	@Then("Admin should see search box inside studentname drop down")
	public void admin_should_see_search_box_inside_studentname_drop_down() {
	    student.validatestudentnamesearchbox();
	}

	@Then("Admin should see search box inside  batch id drop down")
	public void admin_should_see_search_box_inside_batch_id_drop_down() {
	    student.validatebatchidsearchbox();
	}

	@Then("Admin should see correct spelling select student name")
	public void admin_should_see_correct_spelling_select_student_name() {
	    student.studentnamespellcheck();
	}

	@Then("Admin should see correct spelling select  batch id text")
	public void admin_should_see_correct_spelling_select_batch_id_text() {
	    student.batchidspellcheck();
	}

	@Then("Admin should see select student name in gray color")
	public void admin_should_see_select_student_name_in_gray_color() {
	    student.studentnamecolor();
	}

	@Then("Admin should see select batch ID in gray color")
	public void admin_should_see_select_batch_id_in_gray_color() {
	    student.batchidcolor();
	}

	@Then("Admin should see select student name in first")
	public void admin_should_see_select_student_name_in_first() {
	    student.validatefirststudentnamelabel();
	}

	@Then("Admin should see select batch id in second")
	public void admin_should_see_select_batch_id_in_second() {
	    student.validatesecondbatchidlabel();
	}

	@Then("Admin should able to scroll down to select the student name")
	public void admin_should_able_to_scroll_down_to_select_the_student_name() {
	    student.validatestudentnamescrolldown();
	}

	@Then("Admin should able to scroll down to select the batch id")
	public void admin_should_able_to_scroll_down_to_select_the_batch_id() {
		student.validatebatchidscrolldown();
	}


}
