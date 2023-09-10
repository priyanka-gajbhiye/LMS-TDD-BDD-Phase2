package stepDefinitions;

import org.junit.Assert;
import Page_Factory.AssignmentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentSD{
	
	AssignmentPage assignment=new AssignmentPage(); 
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks assignment button on the navigation bar")
	public void admin_clicks_assignment_button_on_the_navigation_bar() {
	    assignment.clickAssignmentPage();
	}

	@Then("Admin should see URL with Manage assignment")
	public void admin_should_see_url_with_Manage_assignment() {
		assignment.ManageAssignmentUrl();
	}

	@Then("Get the response time for navigation from dashboard page to manage assignment page")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_assignment_page() {
	    assignment.ResponseTime();
	}

	@Then("Admin should see header with {string}")
	public void admin_should_see_header_with(String expected_text) {
		String actual_Msg = assignment.Header();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The header is "+actual_Msg);
	}

	@When("Admin clicks assignment button on the navigation bar and get all text from the portal page")
	public void admin_clicks_assignment_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page() {
	    assignment.clickAssignmentPage();
		assignment.getAllText();
	}

	@Then("Admin should see correct spelling for the all the fields")
	public void admin_should_see_correct_spelling_for_the_all_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see disabled delete icon below the {string}")
	public void admin_should_see_disabled_delete_icon_below_the(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see search bar on the manage assignment page")
	public void admin_should_see_search_bar_on_the_manage_assignment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see +Add New assignment button on the manage assignment page")
	public void admin_should_see_add_new_assignment_button_on_the_manage_assignment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see data table on the manage assignment page With following column headers. \\(check box symbol ,Assignment name, Assignment description, Assignment Date, Assignment Grade, Edit Delete)")
	public void admin_should_see_data_table_on_the_manage_assignment_page_with_following_column_headers_check_box_symbol_assignment_name_assignment_description_assignment_date_assignment_grade_edit_delete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Delete Icon will not be present in data table")
	public void delete_icon_will_not_be_present_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see check box in the all rows  of data table when entries available")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table_when_entries_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Above the footer Admin should see the text as {string} below the table")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the text with total number assignments in the data table")
	public void admin_should_see_the_text_with_total_number_assignments_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters assignment name into search box")
	public void admin_enters_assignment_name_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays entries with that assignment name")
	public void displays_entries_with_that_assignment_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters assignment  name is not existing the table into search box")
	public void admin_enters_assignment_name_is_not_existing_the_table_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays empty details in the data table")
	public void displays_empty_details_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters assignment description into search box")
	public void admin_enters_assignment_description_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays entries with that assignment description")
	public void displays_entries_with_that_assignment_description() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters assignment description which is not existing the table into search box")
	public void admin_enters_assignment_description_which_is_not_existing_the_table_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters assignment due date into search box")
	public void admin_enters_assignment_due_date_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays entries with that assignment due date")
	public void displays_entries_with_that_assignment_due_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters assignment due date which is not existing the table into search box")
	public void admin_enters_assignment_due_date_which_is_not_existing_the_table_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters grade value  into search box")
	public void admin_enters_grade_value_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays entries with that assignment  grade")
	public void displays_entries_with_that_assignment_grade() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters grade value which is not existing the table into search box")
	public void admin_enters_grade_value_which_is_not_existing_the_table_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
