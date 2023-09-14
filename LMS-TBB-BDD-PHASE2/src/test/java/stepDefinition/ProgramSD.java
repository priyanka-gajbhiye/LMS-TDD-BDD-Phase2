package stepDefinition;
import org.junit.Assert;

import Page_Factory.ProgramPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class ProgramSD {

	ProgramPage program=new ProgramPage();
	ExcelReader reader = new ExcelReader();
	
	@Given(": Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    
	}

	@When(": Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
	    program.ClickProgramPage();
	    
	}

	@Then(": Admin should see URL with {string}")
	public void admin_should_see_url_with() {
	    program.ManageProgramUrl();
	    
	}

	@Then(": Admin should see a heading with text {string} on the page")
	public void admin_should_see_a_heading_with_text_on_the_page(String expected_text) {
		String actual_Msg = program.ProgramHeader();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The header is "+actual_Msg);
	    
	}

	@Then(": {string}{string}\" along with Pagination icon below the table.")
	public void along_with_pagination_icon_below_the_table(String string, String string2) {
		boolean t=program.paginatordisplay();
		if(t==true)
			System.out.println("Paginator is Visible");
			else
				System.out.println("Not Visible");
	    
	}

	@Then(": {string}{string}\".")
	public void string_string(String string, String string2) {
	    
	    
	}

	@Then(": Admin should see a Delete button on the top left hand side as Disabled")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
	    program.deleteRowdisplay();

	    
	}

	@Then(": Admin should see a {string} button on the program page above the data table")
	public void admin_should_see_a_button_on_the_program_page_above_the_data_table(String string) {
		boolean t=program.AddNewProgramdisplay();
		if(t==true)
			System.out.println("+Add New Program Button is Visible");
			else
				System.out.println("Not Visible");
	    
	}

	@Then(": Admin should see the number of records \\(rows of data in the table) displayed on the page are {int}")
	public void admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
		boolean t=program.dataTabledisplay();
		if(t==true)
			System.out.println("Table and Headers are Visible");
			else
				System.out.println("Not Visible");
	    
	}

	@Then(": Admin should see correct spelling for the all the fields as {string}")
	public void admin_should_see_correct_spelling_for_the_all_the_fields_as(String string) {
		String actual_Msg = program.spellcheck();
		Assert.assertEquals(string,actual_Msg);
		System.out.println("The field is "+actual_Msg);
	}


	@Then(": Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete(String expected_text) {
		String actual_Msg = program.popUpHeader();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The pop up window header is "+actual_Msg);
	    
	}

	@Then(": Admin should see check box on the left side in all rows of the data table")
	public void admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table() {
	   
	    
	}

	@Then(": Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	    program.DeleteProgram();
	    program.EditProgram();
	    
	}

	@Then(": Admin should see Search bar with text as {string}")
	public void admin_should_see_search_bar_with_text_as(String string) {
	    
	    
	}

	@Given(": Admin is on Manage Program Page")
	public void admin_is_on_manage_program_page() {
		program.ManageProgramUrl();
	    
	}

	@When(": Admin enters <Program name phrase> into search box.")
	public void admin_enters_program_name_phrase_into_search_box() {
		boolean t=program.SearchProgramdisplay();
		if(t==true)
			System.out.println("Search Bar is Visible");
			else
				System.out.println("Not Visible");
	    
	}

	@Then(": Admin should see the Programs displayed based on the Program Name")
	public void admin_should_see_the_programs_displayed_based_on_the_program_name() {
		boolean t=program.SearchProgramdisplay();
		if(t==true)
			System.out.println("Search Bar is Visible");
			else
				System.out.println("Not Visible");
	    
	}

	@When(": Admin enters <Program description phrase> into search box.")
	public void admin_enters_program_description_phrase_into_search_box() {
	    program.SearchProgramdisplay();
	    
	}

	@Then(": Admin should see the Programs displayed based on the Program Description")
	public void admin_should_see_the_programs_displayed_based_on_the_program_description() {
	    program.dataTabledisplay();
	    
	}

	@When(": Admin enters <Program status phrase> into search box.")
	public void admin_enters_program_status_phrase_into_search_box() {
	    
	    
	}

	@Then(": Admin should see the Programs displayed based on the Program Status")
	public void admin_should_see_the_programs_displayed_based_on_the_program_status() {
	    program.dataTabledisplay();
	    
	}

	@When(": Admin enters the keywords not present in the data table on the Search box")
	public void admin_enters_the_keywords_not_present_in_the_data_table_on_the_search_box() {
	    program.SearchProgramdisplay();

	    
	}

	@Then(": Admin should see zero entries on the data table")
	public void admin_should_see_zero_entries_on_the_data_table() {
	    
	    
	}

}
