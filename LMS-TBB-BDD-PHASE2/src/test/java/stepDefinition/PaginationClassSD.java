package stepDefinition;

import org.junit.Assert;

import Page_Factory.ClassPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaginationClassSD {
	ClassPage classmodule = new ClassPage(); 
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		  
	}

	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) {
		classmodule.clickClassPage();
	}

	
	@Then("Data table should display {string} page  when entries available")
	public void data_table_should_display_page_when_entries_available(String string) {
		String actual_Msg = classmodule.pagesDisplay();
		Assert.assertEquals(actual_Msg,string);
	
	}

	@Then("Right arrow should be enabled in page one  when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
		  classmodule.rightArrowDisplay();
	}

	@Then("Left arrow should be disabled in page one  when entries are more than {int} available")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
		 classmodule.leftArrowDisplay();
	}

	@Then("Right arrow should be enabled in page two when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) {
		   classmodule.rightArrowDisplay(); 
	}

	@Then("Left arrow should be enabled in page two")
	public void left_arrow_should_be_enabled_in_page_two() {
		 classmodule.leftArrowDisplay();
	}

	@Then("Data table should display  page {int}  when entries available")
	public void data_table_should_display_page_1_when_entries_available(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("When entries are more than {int} in data table pagination controls enabled")
	public void when_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer int1) {
		classmodule.leftArrowDisplay();
		classmodule.rightArrowDisplay();
	}

	@Then("When entries are less than {int} in data table pagination controls disabled")
	public void when_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer int1) {
		classmodule.leftArrowDisplay();
		classmodule.rightArrowDisplay();
	}

	@Then("When total class entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled)")
	public void when_total_class_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled(Integer int1, Integer int2) {
		classmodule.nextPageDisplay();
	}

	@Then("When total class entries  {int} or below next page is disabled")
	public void when_total_class_entries_or_below_next_page_is_disabled(Integer int1) {
		classmodule.nextPageDisplay();
	}

	
}