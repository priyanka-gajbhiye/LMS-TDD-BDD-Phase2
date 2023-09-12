package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import Page_Factory.AssignmentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class AssignmentSD{
	
	AssignmentPage assignment=new AssignmentPage(); 
	ExcelReader reader = new ExcelReader();
	
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

	@Then("Admin should see correct spelling for the all the fields as {string}")
	public void admin_should_see_correct_spelling_for_the_all_the_fields_as(String string) { 
		String actual_Msg = assignment.spellcheck();
		Assert.assertEquals(string,actual_Msg);
		System.out.println("The field is "+actual_Msg);
	}


	@Then("Admin should see disabled delete icon below the header")
	public void admin_should_see_disabled_delete_icon_below_the_header() {
		boolean t=assignment.deleteMultiRowBtndisplay();
		if(t==true)
		System.out.println("Disabled Delete Button is Visible");
		else
			System.out.println("Not Visible");
	}

	@Then("Admin should see search bar on the manage assignment page")
	public void admin_should_see_search_bar_on_the_manage_assignment_page() {
		boolean t=assignment.searchBardisplay();
		if(t==true)
			System.out.println("Search Bar is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see +Add New assignment button on the manage assignment page")
	public void admin_should_see_add_new_assignment_button_on_the_manage_assignment_page() {
		boolean t=assignment.newAssignmentBtndisplay();
		if(t==true)
			System.out.println("+Add New Assignment Button is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see data table on the manage assignment page With following column headers")
	public void admin_should_see_data_table_on_the_manage_assignment_page_with_following_column_headers() {
		boolean t=assignment.dataTabledisplay();
		if(t==true)
			System.out.println("Table and Headers are Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    assignment.editRowdisplay();
	}

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() {
	    assignment.editRownotdisplay();
	}

	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
		assignment.deleteRowdisplay();
	}

	@Then("Delete Icon will not be present in data table")
	public void delete_icon_will_not_be_present_in_data_table() {
		assignment.deleteRownotdisplay();
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
		assignment.sortIcondisplay();
	}

	@Then("Admin should see check box in the all rows  of data table when entries available")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table_when_entries_available() {
	    assignment.rowCheckboxdisplay();
	}

	@Then("Above the footer Admin should see the text as {string} below the table")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table(String string) {
	    String actual_Msg=assignment.footerText();
	    Assert.assertEquals(string,actual_Msg);
		System.out.println("The field is "+actual_Msg);
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		boolean t=assignment.paginatordisplay();
		if(t==true)
			System.out.println("Paginator is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see the text with total number assignments in the data table")
	public void admin_should_see_the_text_with_total_number_assignments_in_the_data_table() {
		boolean t=assignment.footerTextdisplay();
		if(t==true)
			System.out.println("Footer is Visible");
			else
				System.out.println("Not Visible");
	}

	@When("Admin enters assignment name into search box from excel sheet {string} and {int}")
	public void admin_enters_assignment_name_into_search_box_from_excel_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Assignment.xlsx", "Assignment");
		String assignmentName=testData.get(int1).get("assignmentName");
		assignment.textSearch(assignmentName);
		
	}

	@Then("Displays entries with that assignment name")
	public void displays_entries_with_that_assignment_name() {
	    assignment.textSearchdisplayed();
	}

	@When("Admin enters assignment name is not existing the table into search box")
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

	////////////////////////////////////////////////////
	//Assignment Detail Feature
	
	@Given("Admin is on manage assignment Page")
	public void admin_is_on_manage_assignment_page() {
	    assignment.clickAssignmentPage();
	}

	@When("Admin click +Add new assignment button")
	public void admin_click_add_new_assignment_button() {
	    assignment.newAssignmentBtnclick();
	}

	@Then("Admin should see a popup  with  heading {string}")
	public void admin_should_see_a_popup_with_heading(String expected_text) {
		String actual_Msg = assignment.popUpHeader();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The pop up window header is "+actual_Msg);
	}

	@Then("Admin should see input {string} Text")
	public void admin_should_see_input_text(String string) {
		boolean t=assignment.inputFieldsdisplay(string);
		if(t==true)
			System.out.println("Field is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("{int} textbox should be  present in Assignment details popup window")
	public void textbox_should_be_present_in_assignment_details_popup_window(Integer int1) {
	    assignment.textBoxNumbers(int1);
	}

	@Then("Admin should see  dropdown option for Batch Number")
	public void admin_should_see_dropdown_option_for_batch_number() {
		boolean t=assignment.batchDropdowndisplay();
	    if(t==true)
			System.out.println("batch number is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see  dropdown option for Program name")
	public void admin_should_see_dropdown_option_for_program_name() {
		boolean t=assignment.programDropdowndisplay();
		if(t==true)
			System.out.println("program dropdown is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see  calendar icon for assignment due date")
	public void admin_should_see_calendar_icon_for_assignment_due_date() {
		boolean t=assignment.calenderIcondisplay();
	    if(t==true)
			System.out.println("calender icon is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see  save button in the Assignment detail popup window")
	public void admin_should_see_save_button_in_the_assignment_detail_popup_window() {
		boolean t=assignment.SaveDisplay();
	    if(t==true)
			System.out.println("save button is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see  cancel button in the Assignment detail popup window")
	public void admin_should_see_cancel_button_in_the_assignment_detail_popup_window() {
		boolean t=assignment.CancelDisplay();
	    if(t==true)
			System.out.println("cancel button is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see  close button on the Assignment details popup window")
	public void admin_should_see_close_button_on_the_assignment_details_popup_window() {
		boolean t=assignment.CloseDisplay();
	    if(t==true)
			System.out.println("close button is Visible");
			else
				System.out.println("Not Visible");
	}

	/////////////////////////////////////////////////////////////////////////////
	///////////Add new assignment feature/////////////////////
	
	@Given("Admin is in  assignment details popup window")
	public void admin_is_in_assignment_details_popup_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with valid data and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see new assignment details is added in the data table")
	public void admin_should_see_new_assignment_details_is_added_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with invalid data and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters values in all fields with valid data and clicks save button \\(Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters with invalid data in optional fields and clicks save button \\(Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters  data missing value in program name and clicks save button \\(batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_data_missing_value_in_program_name_and_clicks_save_button_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Program Name is missing")
	public void program_name_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in Batch number and clicks save button \\(Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_data_missing_value_in_batch_number_and_clicks_save_button_program_name_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Batch number is missing")
	public void batch_number_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in Assignment name and clicks save button \\(Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
	public void admin_enters_data_missing_value_in_assignment_name_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Assignment name is missing")
	public void assignment_name_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in Assignment due date and clicks save button \\( Program name, batch number,Assignment Name, grade by)")
	public void admin_enters_data_missing_value_in_assignment_due_date_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Assignment due date is missing")
	public void assignment_due_date_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in grade by  and clicks save button \\(Program name, batch number,Assignment Name, Assignment due date)")
	public void admin_enters_data_missing_value_in_grade_by_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_due_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Grade by is missing")
	public void grade_by_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters passed date in the due date field and clicks save button \\( Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
	public void admin_enters_passed_date_in_the_due_date_field_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Assignment cannot be created for the passed date")
	public void assignment_cannot_be_created_for_the_passed_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see current date is highled in the date picker")
	public void admin_should_see_current_date_is_highled_in_the_date_picker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see selected date is highled in the date picker")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on manage assignment page")
	public void admin_should_land_on_manage_assignment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table")
	public void admin_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
}
