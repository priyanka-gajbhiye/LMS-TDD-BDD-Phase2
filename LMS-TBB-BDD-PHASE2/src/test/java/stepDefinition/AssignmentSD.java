package stepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.junit.runner.manipulation.Ordering;
import Page_Factory.AssignmentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class AssignmentSD{
	
	private static final String String = null;
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
		
	
	@Then("Admin should see disabled delete icon below the Manage assignment")
	public void admin_should_see_disabled_delete_icon_below_the_Manage_assignment() {
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

	///////SearchBox/////
	
	@When("Admin enters assignment name into search box from excel sheet {string} and {int}")
	public void admin_enters_assignment_name_into_search_box_from_excel_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "Assignment");
		String assignmentname=testData.get(int1).get("assignmentName");
		assignment.textSearch(assignmentname);
		
	}

	@Then("Displays entries with that assignment name")
	public void displays_entries_with_that_assignment_name() {
	    boolean t=assignment.textSearchdisplayed();
	    if(t==true)
			System.out.println("Searched Text is Visible");
			else
				System.out.println("Searched Text Not Visible");
	}

	@When("Admin enters assignment name is not existing the table into search box from excel sheet {string} and {int}")
	public void admin_enters_assignment_name_is_not_existing_the_table_into_search_box_from_excel_sheet_and(String string, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "Assignment");
		String assignmentname=testData.get(int1).get("assignmentName");
		assignment.textSearch(assignmentname);
	}

	@Then("Displays empty details in the data table")
	public void displays_empty_details_in_the_data_table() {
		boolean t=assignment.textSearchdisplayed();
	    if(t==true)
			System.out.println("Searched Text is Visible");
			else
				System.out.println("Searched Text Not Visible");
	}

	@When("Admin enters assignment description into search box from excel sheet {string} and {int}")
	public void admin_enters_assignment_description_into_search_box_from_excel_sheet_and(String string, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "Assignment");
		String assignmentdescription=testData.get(int1).get("assignmentDescription");
		assignment.textSearch(assignmentdescription);
	}
	
	@Then("Displays entries with that assignment description")
	public void displays_entries_with_that_assignment_description() {
		boolean t=assignment.textSearchdisplayed();
	    if(t==true)
			System.out.println("Searched Text is Visible");
			else
				System.out.println("Searched Text Not Visible");
	}

	@When("Admin enters assignment description which is not existing the table into search box from excel sheet {string} and {int}")
	public void admin_enters_assignment_description_which_is_not_existing_the_table_into_search_box_from_excel_sheet_and(String string, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "Assignment");
		String assignmentdescription=testData.get(int1).get("assignmentDescription");
		assignment.textSearch(assignmentdescription);
	}

	@When("Admin enters assignment due date into search box from excel sheet {string} and {int}")
	public void admin_enters_assignment_due_date_into_search_box_from_excel_sheet_and(String string, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "Assignment");
		String assignmentduedate=testData.get(int1).get("dueDate");
		assignment.textSearch(assignmentduedate);
	}

	@Then("Displays entries with that assignment due date")
	public void displays_entries_with_that_assignment_due_date() {
		boolean t=assignment.textSearchdisplayed();
	    if(t==true)
			System.out.println("Searched Text is Visible");
			else
				System.out.println("Searched Text Not Visible");
	}

	@When("Admin enters assignment due date which is not existing the table into search box from excel sheet {string} and {int}")
	public void admin_enters_assignment_due_date_which_is_not_existing_the_table_into_search_box_from_excel_sheet_and(String string, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "Assignment");
		String assignmentduedate=testData.get(int1).get("dueDate");
		assignment.textSearch(assignmentduedate);
	}

	@When("Admin enters grade value  into search box from excel sheet {string} and {int}")
	public void admin_enters_grade_value_into_search_box_from_excel_sheet_and(String string, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "Assignment");
		String assignmentgrade=testData.get(int1).get("grade");
		assignment.textSearch(assignmentgrade);
	}

	@Then("Displays entries with that assignment  grade")
	public void displays_entries_with_that_assignment_grade() {
		boolean t=assignment.textSearchdisplayed();
	    if(t==true)
			System.out.println("Searched Text is Visible");
			else
				System.out.println("Searched Text Not Visible");
	}

	@When("Admin enters grade value which is not existing the table into search box from excel sheet {string} and {int}")
	public void admin_enters_grade_value_which_is_not_existing_the_table_into_search_box_from_excel_sheet_and(String string, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "Assignment");
		String assignmentgrade=testData.get(int1).get("grade");
		assignment.textSearch(assignmentgrade);
	}

	///////////////////////////////////////////////////////////////////////////////
	////////////////////////Assignment Detail Feature/////////////////////////////////
	
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
		String actual_Msg = assignment.popUpHeader();
		Assert.assertEquals("Assignment Details",actual_Msg);
		System.out.println("The pop up window is open");
	}

	@When("Admin enters all mandatory field values with valid data from {string},{int} and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_valid_data_from_and_clicks_save_button(String sheetName, Integer rowNumber) throws Exception, IOException {
		List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx",sheetName);
		
		String programName = testData.get(rowNumber).get("Program Name");
		String batchName = testData.get(rowNumber).get("Batch Name");
		String assignmentName = testData.get(rowNumber).get("Assignment Name");
		String gradeBy = testData.get(rowNumber).get("Grade By");
		String assignmentDueDate = testData.get(rowNumber).get("Assignment DueDate");
		assignment.fillMandatoryFields(programName, batchName, assignmentName, gradeBy, assignmentDueDate);
	    assignment.clickSave();
	}

	@Then("Admin should see new assignment details is added in the data table")
	public void admin_should_see_new_assignment_details_is_added_in_the_data_table() {
	    boolean t=assignment.addAssignmentDisplay(toString());
	    if(t==true)
			System.out.println("new assignment is Visible");
			else
				System.out.println("Not Visible");
	}

	@When("Admin enters all mandatory field values with invalid data from {string},{int} and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_from_and_clicks_save_button(String sheetName, Integer rowNumber) throws Exception, IOException {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetName);
		
		String programName = testData.get(rowNumber).get("Program Name");
		String batchName = testData.get(rowNumber).get("Batch Name");
		String assignmentName = testData.get(rowNumber).get("Assignment Name");
		String gradeBy = testData.get(rowNumber).get("Grade By");
		String assignmentDueDate = testData.get(rowNumber).get("Assignment DueDate");
		
		assignment.fillMandatoryFields(programName, batchName, assignmentName, gradeBy, assignmentDueDate);
	    assignment.clickSave();
	}

	@Then("Error message should appear in alert {string}")
	public void error_message_should_appear_in_alert(String expected_text) {
		String actual_Msg = assignment.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);
	}

	@When("Admin enters values in all fields with valid data from {string},{int} and clicks save button")
	public void admin_enters_values_in_all_fields_with_valid_data_from_and_clicks_save_button(String sheetName, Integer rowNumber) throws Exception, IOException {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetName);
		
		String programName = testData.get(rowNumber).get("Program Name");
		String batchName = testData.get(rowNumber).get("Batch Name");
		String assignmentName = testData.get(rowNumber).get("Assignment Name");
		String assignmentDescription = testData.get(rowNumber).get("Assignment Description");
		String gradeBy = testData.get(rowNumber).get("Grade By");
		String assignmentDueDate = testData.get(rowNumber).get("Assignment DueDate");
		String assignmentFile1 = testData.get(rowNumber).get("Assignment File1");
		String assignmentFile2 = testData.get(rowNumber).get("Assignment File2");
		String assignmentFile3 = testData.get(rowNumber).get("Assignment File3");
		String assignmentFile4 = testData.get(rowNumber).get("Assignment File4");
		String assignmentFile5 = testData.get(rowNumber).get("Assignment File5");
		
		assignment.fillAllFields(programName, batchName, assignmentName,assignmentDescription, gradeBy, assignmentDueDate,assignmentFile1,assignmentFile2,assignmentFile3,assignmentFile4,assignmentFile5);
	    assignment.clickSave();
	}

	@When("Admin enters with invalid data in optional fields from {string},{int} and clicks save button")
	public void admin_enters_with_invalid_data_in_optional_fields_from_and_clicks_save_button(String sheetName, Integer rowNumber) throws Exception, IOException {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetName);
		
		String programName = testData.get(rowNumber).get("Program Name");
		String batchName = testData.get(rowNumber).get("Batch Name");
		String assignmentName = testData.get(rowNumber).get("Assignment Name");
		String assignmentDescription = testData.get(rowNumber).get("Assignment Description");
		String gradeBy = testData.get(rowNumber).get("Grade By");
		String assignmentDueDate = testData.get(rowNumber).get("Assignment DueDate");
		String assignmentFile1 = testData.get(rowNumber).get("Assignment File1");
		String assignmentFile2 = testData.get(rowNumber).get("Assignment File2");
		String assignmentFile3 = testData.get(rowNumber).get("Assignment File3");
		String assignmentFile4 = testData.get(rowNumber).get("Assignment File4");
		String assignmentFile5 = testData.get(rowNumber).get("Assignment File5");
		
		assignment.fillAllFields(programName, batchName, assignmentName,assignmentDescription, gradeBy, assignmentDueDate,assignmentFile1,assignmentFile2,assignmentFile3,assignmentFile4,assignmentFile5);
	    assignment.clickSave();
	}

	@When("Admin enters  data missing value in program name from {string},{int} and clicks save button")
	public void admin_enters_data_missing_value_in_program_name_from_and_clicks_save_button(String sheetName, Integer rowNumber) throws Exception, IOException {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetName);
		
		String programName = testData.get(rowNumber).get("Program Name");
		String batchName = testData.get(rowNumber).get("Batch Name");
		String assignmentName = testData.get(rowNumber).get("Assignment Name");
		String assignmentDescription = testData.get(rowNumber).get("Assignment Description");
		String gradeBy = testData.get(rowNumber).get("Grade By");
		String assignmentDueDate = testData.get(rowNumber).get("Assignment DueDate");
		String assignmentFile1 = testData.get(rowNumber).get("Assignment File1");
		String assignmentFile2 = testData.get(rowNumber).get("Assignment File2");
		String assignmentFile3 = testData.get(rowNumber).get("Assignment File3");
		String assignmentFile4 = testData.get(rowNumber).get("Assignment File4");
		String assignmentFile5 = testData.get(rowNumber).get("Assignment File5");
		
		assignment.fillAllFields(programName, batchName, assignmentName,assignmentDescription, gradeBy, assignmentDueDate,assignmentFile1,assignmentFile2,assignmentFile3,assignmentFile4,assignmentFile5);
	    assignment.clickSave();
	}

	@Then("Program Name is missing {string}")
	public void program_name_is_missing(String expected_text) {
		String actual_Msg = assignment.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);
	}

	@When("Admin enters data missing value in Batch number from {string},{int} and clicks save button")
	public void admin_enters_data_missing_value_in_batch_number_from_and_clicks_save_button(String sheetName, Integer rowNumber) throws Exception, IOException {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetName);
		
		String programName = testData.get(rowNumber).get("Program Name");
		String batchName = testData.get(rowNumber).get("Batch Name");
		String assignmentName = testData.get(rowNumber).get("Assignment Name");
		String assignmentDescription = testData.get(rowNumber).get("Assignment Description");
		String gradeBy = testData.get(rowNumber).get("Grade By");
		String assignmentDueDate = testData.get(rowNumber).get("Assignment DueDate");
		String assignmentFile1 = testData.get(rowNumber).get("Assignment File1");
		String assignmentFile2 = testData.get(rowNumber).get("Assignment File2");
		String assignmentFile3 = testData.get(rowNumber).get("Assignment File3");
		String assignmentFile4 = testData.get(rowNumber).get("Assignment File4");
		String assignmentFile5 = testData.get(rowNumber).get("Assignment File5");
		
		assignment.fillAllFields(programName, batchName, assignmentName,assignmentDescription, gradeBy, assignmentDueDate,assignmentFile1,assignmentFile2,assignmentFile3,assignmentFile4,assignmentFile5);
	    assignment.clickSave();
	}

	@Then("Batch number is missing {string}")
	public void batch_number_is_missing(String expected_text) {
		String actual_Msg = assignment.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);
	}

	@When("Admin enters data missing value in Assignment name from {string},{int} and clicks save button")
	public void admin_enters_data_missing_value_in_assignment_name_from_and_clicks_save_button(String sheetName, Integer rowNumber) throws Exception, IOException {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetName);
		
		String programName = testData.get(rowNumber).get("Program Name");
		String batchName = testData.get(rowNumber).get("Batch Name");
		String assignmentName = testData.get(rowNumber).get("Assignment Name");
		String assignmentDescription = testData.get(rowNumber).get("Assignment Description");
		String gradeBy = testData.get(rowNumber).get("Grade By");
		String assignmentDueDate = testData.get(rowNumber).get("Assignment DueDate");
		String assignmentFile1 = testData.get(rowNumber).get("Assignment File1");
		String assignmentFile2 = testData.get(rowNumber).get("Assignment File2");
		String assignmentFile3 = testData.get(rowNumber).get("Assignment File3");
		String assignmentFile4 = testData.get(rowNumber).get("Assignment File4");
		String assignmentFile5 = testData.get(rowNumber).get("Assignment File5");
		
		assignment.fillAllFields(programName, batchName, assignmentName,assignmentDescription, gradeBy, assignmentDueDate,assignmentFile1,assignmentFile2,assignmentFile3,assignmentFile4,assignmentFile5);
	    assignment.clickSave();
	}

	@Then("Assignment name is missing {string}")
	public void assignment_name_is_missing(String expected_text) {
		String actual_Msg = assignment.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);
	}

	@When("Admin enters data missing value in Assignment due date from {string},{int} and clicks save button")
	public void admin_enters_data_missing_value_in_assignment_due_date_from_and_clicks_save_button(String sheetName, Integer rowNumber) throws Exception, IOException {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetName);
		
		String programName = testData.get(rowNumber).get("Program Name");
		String batchName = testData.get(rowNumber).get("Batch Name");
		String assignmentName = testData.get(rowNumber).get("Assignment Name");
		String assignmentDescription = testData.get(rowNumber).get("Assignment Description");
		String gradeBy = testData.get(rowNumber).get("Grade By");
		String assignmentDueDate = testData.get(rowNumber).get("Assignment DueDate");
		String assignmentFile1 = testData.get(rowNumber).get("Assignment File1");
		String assignmentFile2 = testData.get(rowNumber).get("Assignment File2");
		String assignmentFile3 = testData.get(rowNumber).get("Assignment File3");
		String assignmentFile4 = testData.get(rowNumber).get("Assignment File4");
		String assignmentFile5 = testData.get(rowNumber).get("Assignment File5");
		
		assignment.fillAllFields(programName, batchName, assignmentName,assignmentDescription, gradeBy, assignmentDueDate,assignmentFile1,assignmentFile2,assignmentFile3,assignmentFile4,assignmentFile5);
	    assignment.clickSave();
	}

	@Then("Assignment due date is missing {string}")
	public void assignment_due_date_is_missing(String expected_text) {
		String actual_Msg = assignment.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);
	}

	@When("Admin enters data missing value in grade by  from {string},{int} and clicks save button")
	public void admin_enters_data_missing_value_in_grade_by_from_and_clicks_save_button(String sheetName, Integer rowNumber) throws Exception, IOException {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetName);
		
		String programName = testData.get(rowNumber).get("Program Name");
		String batchName = testData.get(rowNumber).get("Batch Name");
		String assignmentName = testData.get(rowNumber).get("Assignment Name");
		String assignmentDescription = testData.get(rowNumber).get("Assignment Description");
		String gradeBy = testData.get(rowNumber).get("Grade By");
		String assignmentDueDate = testData.get(rowNumber).get("Assignment DueDate");
		String assignmentFile1 = testData.get(rowNumber).get("Assignment File1");
		String assignmentFile2 = testData.get(rowNumber).get("Assignment File2");
		String assignmentFile3 = testData.get(rowNumber).get("Assignment File3");
		String assignmentFile4 = testData.get(rowNumber).get("Assignment File4");
		String assignmentFile5 = testData.get(rowNumber).get("Assignment File5");
		
		assignment.fillAllFields(programName, batchName, assignmentName,assignmentDescription, gradeBy, assignmentDueDate,assignmentFile1,assignmentFile2,assignmentFile3,assignmentFile4,assignmentFile5);
	    assignment.clickSave();
	}

	@Then("Grade by is missing {string}")
	public void grade_by_is_missing(String expected_text) {
		String actual_Msg = assignment.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);
	}

	@When("Admin enters passed date in the due date field from {string},{int} and clicks save button")
	public void admin_enters_passed_date_in_the_due_date_field_from_and_clicks_save_button(String sheetName, Integer rowNumber) throws Exception, IOException {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetName);
		
		String programName = testData.get(rowNumber).get("Program Name");
		String batchName = testData.get(rowNumber).get("Batch Name");
		String assignmentName = testData.get(rowNumber).get("Assignment Name");
		String assignmentDescription = testData.get(rowNumber).get("Assignment Description");
		String gradeBy = testData.get(rowNumber).get("Grade By");
		String assignmentDueDate = testData.get(rowNumber).get("Assignment DueDate");
		String assignmentFile1 = testData.get(rowNumber).get("Assignment File1");
		String assignmentFile2 = testData.get(rowNumber).get("Assignment File2");
		String assignmentFile3 = testData.get(rowNumber).get("Assignment File3");
		String assignmentFile4 = testData.get(rowNumber).get("Assignment File4");
		String assignmentFile5 = testData.get(rowNumber).get("Assignment File5");
		
		assignment.fillAllFields(programName, batchName, assignmentName,assignmentDescription, gradeBy, assignmentDueDate,assignmentFile1,assignmentFile2,assignmentFile3,assignmentFile4,assignmentFile5);
	    assignment.clickSave();
	}

	@Then("Assignment cannot be created for the passed date {string}")
	public void assignment_cannot_be_created_for_the_passed_date(String expected_text) {
		String actual_Msg = assignment.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);
	}

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() {
		assignment.selectDate();
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
	    assignment.dateDisplay();
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() {
	    assignment.validDateFormat();
	}

	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
	    assignment.clickRightArrowCalender();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() {
	    assignment.monthCalenderdisplay();
	}

	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
		assignment.clickLeftArrowCalender();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() {
		assignment.monthCalenderdisplay();
	}

	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() {
	    assignment.clickCalenderIcon();
	}

	@Then("Admin should see current date is highled in the date picker")
	public void admin_should_see_current_date_is_highled_in_the_date_picker() {
		assignment.highligtedDatedisplay();
	}

	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() {
		assignment.clickCalenderIcon();
	}

	@Then("Admin should see selected date is highled in the date picker")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
		assignment.highligtedDatedisplay();
	}

	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
	    assignment.clickCancelBtn();
	}

	@Then("Admin should land on manage assignment page")
	public void admin_should_land_on_manage_assignment_page() {
	    assignment.Header();
	}

	@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
		assignment.clickCancelBtn();
	}

	@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table")
	public void admin_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table() {
		boolean t= assignment.addAssignmentDisplay(toString());
		if(t==true)
			System.out.println("new assignment is Visible");
			else
				System.out.println("Not Visible");
		
	}

	//////////////////////////////////////////////////////////////////////////////////
	/////////////////Edit Assignment Validation Feature///////////////////////


	
	@Given("Admin is in manage assignment page")
	public void admin_is_in_manage_assignment_page() {
		String t=assignment.Header();
	    if(t=="Manage Assignment")
			System.out.println("manage assignment page is Visible");
			else
				System.out.println("Not Visible");
	}
	
	@When("Admin clicks Edit button in data table")
	public void admin_clicks_edit_button_in_data_table() {
	    assignment.clickEdit();
	}
	
	@Then("Edit popup window appears with heading Assignment Details")
	public void edit_popup_window_appears_with_heading_assignment_details() {
		String t=assignment.popUpHeader();
		if(t=="Assignment Details")
			System.out.println("assignment pop up window is Visible");
			else
				System.out.println("Not Visible");
	}
	
	@When("Admin clicks Edit button from one of the row in data table")
	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
		assignment.clickEdit();
	}
	
	@Then("Edit popup window appears with same row values in the all {string}")
	public void edit_popup_window_appears_with_same_row_values_in_the_all(String string) {		
		boolean t=assignment.inputFieldsdisplay(string);
		if(t==true)
			System.out.println("Field is Visible");
			else
				System.out.println("Not Visible");
	}
	
	@Given("Admin is in  Edit assignment detail popup window")
	public void admin_is_in_edit_assignment_detail_popup_window() {
		String t=assignment.popUpHeader();
		if(t=="Assignment Details")
			System.out.println("assignment pop up window is Visible");
			else
				System.out.println("Not Visible");
	}
	
	@Then("Admin should see updated assignment details is added in the data table")
	public void admin_should_see_updated_assignment_details_is_added_in_the_data_table() {
		boolean t=assignment.addAssignmentDisplay(toString());
	    if(t==true)
			System.out.println("new assignment is Visible");
			else
				System.out.println("Not Visible");
	}
	
	@Then("Assignment cannot be updated for the passed date {string}")
	public void assignment_cannot_be_updated_for_the_passed_date(String string) {
		boolean t=assignment.addAssignmentDisplay(toString());
	    if(t==true)
			System.out.println("new assignment is Visible");
			else
				System.out.println("Not Visible");
	}
	

	//////////////////////////////////////////////////////////////////////////////
	////////////////////////////Delete Assignment Feature//////////////////////////

	
	@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() {
	    assignment.clickDeleteOnRight();
	}
	
	@Then("Admin should see dialog box")
	public void admin_should_see_dialog_box() {
	    boolean t=assignment.deleteDialogBoxdisplay();
	    if(t==true)
			System.out.println("new assignment is Visible");
			else
				System.out.println("Not Visible");
	}
	
	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String string) {
		String actual_Msg = assignment.yesBtndisplay();
		Assert.assertEquals(actual_Msg,string);
	}
	
	@Then("Alert should have {string} button to reject")
	public void alert_should_have_button_to_reject(String string) {
		String actual_Msg = assignment.noBtndisplay();
		Assert.assertEquals(actual_Msg,string);
	}
	
	@Given("Admin is in delete alert")
	public void admin_is_in_delete_alert() {
		boolean t=assignment.deleteDialogBoxdisplay();
	    if(t==true)
			System.out.println("new assignment is Visible");
			else
				System.out.println("Not Visible");
	}
	
	@When("Admin clicks yes button")
	public void admin_clicks_yes_button() {
	    assignment.clickYes();
	}
	
	@Then("Redirected to assignment page and selected assignment details are deleted from the data table")
	public void redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table() {
	    boolean t=assignment.addAssignmentDisplay(toString());
	    if(t==false)
			System.out.println("assignment is deleted");
			else
				System.out.println("Not deleted");
	}
	
	@When("Admin clicks no button")
	public void admin_clicks_no_button() {
	    assignment.clickNo();
	}
	
	@Then("Redirected to assignment page and selected assignment details are not deleted from the data table")
	public void redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table() {
		boolean t=assignment.addAssignmentDisplay(toString());
	    if(t==true)
			System.out.println("assignment is not deleted");
			else
				System.out.println("deleted");
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////Delete Multiple Assignment Feature///////////////////////
	
	
	@When("Admin clicks single  row level check box in the data table")
	public void admin_clicks_single_row_level_check_box_in_the_data_table() {
	    assignment.clickCheckbox();
	}
	
	@Then("Admin should see delete icon below the header is enabled")
	public void admin_should_see_delete_icon_below_the_header_is_enabled() {
		boolean t=assignment.deleteMultiRowBtnEnabled();
	    if(t==true)
			System.out.println("assignment multi deleted btn is enabled");
			else
				System.out.println("Disabled");
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	///////////////////////////SortFuntionInManageAssignment Feature////////////////////
	

	@When("Admin click on assignment name column header to sort")
	public void admin_click_on_assignment_name_column_header_to_sort() {
	    assignment.clickSortDesc();
	}
	
	@When("Admin double click on assignment name column header to sort")
	public void admin_double_click_on_assignment_name_column_header_to_sort() {
		assignment.clickSortAsc();
	}
	
	@Then("Admin should see data table sorted in {string} order")
	public void admin_should_see_data_table_sorted_in_order(String result) {
		List<String> tempList = assignment.ascSorted();
		assertEquals(tempList, result);
		System.out.println("Data in ascending order.");
	    
		//boolean isSorted=assertTrue(Ordering.natural().isOrdered(result)); 
		//Checks for natural(ascending) order
	}
	
	@Then("Admin should see data table sorted in {string} order")
	public void admin_should_se_data_table_sorted_in_order(String result) {
		assignment.descSorted(null);		
		System.out.println("Data is not in ascending alphabetical order.");
		
		//assertTrue(Ordering.reverse().isOrdered(result)); 
		//Checks for descending order
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////Pagination Feature////////////////////////////////////
	
			
	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) {
	    assignment.clickAssignmentPage();
	}
	
	@Then("Data table should display  {string} page when entries available")
	public void data_table_should_display_page_when_entries_available(String string) {
		String actual_Msg = assignment.pagesDisplay();
		Assert.assertEquals(actual_Msg,string);
	}
	
	@Then("Right arrow should be enabled in page one  when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
	    assignment.rightArrowDisplay();
	}
	
	@Then("Left arrow should be disabled in page one  when entries are more than {int} available")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
	    assignment.leftArrowDisplay();
	}
	
	@Then("Right arrow should be enabled in page two when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) {
	    assignment.rightArrowDisplay(); 
	    
	}
	
	@Then("Left arrow should be enabled in page two")
	public void left_arrow_should_be_enabled_in_page_two() {
	    assignment.leftArrowDisplay();
	}
	
	@Then("When entries are more than {int} in data table pagination controls enabled")
	public void when_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer int1) {
		assignment.leftArrowDisplay();
		assignment.rightArrowDisplay();
	}
	
	@Then("When entries are less than {int} in data table pagination controls disabled")
	public void when_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer int1) {
		assignment.leftArrowDisplay();
		assignment.rightArrowDisplay();
	}
	
	@When("Admin creates {int} new assignment")
	public void admin_creates_new_assignment(Integer int1) {
		while(int1<=6) {
	    assignment.addAssignmentDisplay(String);
		int1++;}
	}
	
	@Then("When total class entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled)")
	public void when_total_class_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled(Integer int1, Integer int2) {
	    assignment.nextPageDisplay();
	}
	
	@When("Admin creates less than or equal to {int} new  assignment")
	public void admin_creates_less_than_or_equal_to_new_assignment(Integer int1) {
		while(int1<=5) {
		    assignment.addAssignmentDisplay(String);
			int1++;}
	}
	
	@Then("When total class entries  {int} or below next page is disabled")
	public void when_total_class_entries_or_below_next_page_is_disabled(Integer int1) {
		assignment.nextPageDisplay();
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////Navigation Feature////////////////////////////////////


	
	@When("Admin clicks {string} button in the navigation bar")
	public void admin_clicks_button_in_the_navigation_bar(String string) {
	    assignment.clickButton(string);
	}

	@Then("Admin should able to land on student page")
	public void admin_should_able_to_land_on_student_page() {
		String actual_Msg = assignment.Header();
		Assert.assertEquals(actual_Msg,"Manage Student");
	}

	@Then("Admin should able to land on program page")
	public void admin_should_able_to_land_on_program_page() {
		String actual_Msg = assignment.Header();
		Assert.assertEquals(actual_Msg,"Manage Program");
	}

	@Then("Admin should able to land on batch page")
	public void admin_should_able_to_land_on_batch_page() {
		String actual_Msg = assignment.Header();
		Assert.assertEquals(actual_Msg,"Manage Batch");
	}

	@Then("Admin should able to land on user page")
	public void admin_should_able_to_land_on_user_page() {
		String actual_Msg = assignment.Header();
		Assert.assertEquals(actual_Msg,"Manage User");
	}

	@Then("Admin should able to land on class page")
	public void admin_should_able_to_land_on_class_page() {
		String actual_Msg = assignment.Header();
		Assert.assertEquals(actual_Msg,"Manage Class");
	}

	@Then("Admin should able to land on Attendance page")
	public void admin_should_able_to_land_on_attendance_page() {
		String actual_Msg = assignment.Header();
		Assert.assertEquals(actual_Msg,"Manage Attendence");
	}

	@Then("Admin should able to land on login page")
	public void admin_should_able_to_land_on_login_page() {
		String actual_Msg = assignment.Header();
		Assert.assertEquals(actual_Msg,"Please login to LMS application");
	}
	
}