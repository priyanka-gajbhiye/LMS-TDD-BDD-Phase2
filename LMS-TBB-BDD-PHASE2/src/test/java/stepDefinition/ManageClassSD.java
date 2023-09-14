package stepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.junit.runner.manipulation.Ordering;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

import Page_Factory.ClassPage;


public class ManageClassSD {
	ClassPage classmodule=new ClassPage(); 
	ExcelReader reader = new ExcelReader();
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
		 classmodule.clickClassPage();
	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) {
		classmodule.ManageClassUrl();
	}


	@Then("Get the response time for navigation from dashboard page to manage class page")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page() {
		 classmodule.ResponseTime();
	}


	@Then("Admin should see header with {string}")
	public void admin_should_see_header_with(String expected_text) {
		String actual_Msg = classmodule.Header();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The header is "+actual_Msg);
	}

	@When("Admin clicks class button on the navigation bar and get all text from the portal page")
	public void admin_clicks_class_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page() {
		   classmodule.clickClassPage();
			classmodule.getAllText();
	}

	@Then("Admin should see correct spelling for the all the fields as {string}")
	public void admin_should_see_correct_spelling_for_the_all_the_fields_as(String string) {
		String actual_Msg = classmodule.spellcheck();
		Assert.assertEquals(string,actual_Msg);
		System.out.println("The field is "+actual_Msg);
	}

    @Then("Admin should see disabled delete icon below the Manage Class")
	public void admin_should_see_disabled_delete_icon_below_the_manage_class() {
		boolean t=classmodule.deleteMultiRowBtndisplay();
		if(t==true)
		System.out.println("Disabled Delete Button is Visible");
		else
			System.out.println("Not Visible");
	}

	@Then("Admin should see search bar on the manage class page")
	public void admin_should_see_search_bar_on_the_manage_class_page() {
		boolean t=classmodule.searchBardisplay();
		if(t==true)
			System.out.println("Search Bar is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see +Add New Class button on the manage assignment page")
	public void admin_should_see_add_new_class_button_on_the_manage_assignment_page() {
		boolean t=classmodule.newclassBtndisplay();
		if(t==true)
			System.out.println("+Add New Assignment Button is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see data table on the manage class page With following column headers")
	public void admin_should_see_data_table_on_the_manage_class_page_with_following_column_headers() {
		boolean t=classmodule.dataTabledisplay();
		if(t==true)
			System.out.println("Table and Headers are Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
		 classmodule.editRowdisplay();
	}

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() {
		classmodule.editRownotdisplay();
	}

	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
		classmodule.deleteRowdisplay();
	}

	@Then("Delete Icon will not be present in data table")
	public void delete_icon_will_not_be_present_in_data_table() {
		classmodule.deleteRownotdisplay();
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
		classmodule.sortIcondisplay();
	}

	@Then("Admin should see check box in the all rows  of data table when entries available")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table_when_entries_available() {
		   classmodule.rowCheckboxdisplay();
	}

	@Then("Above the footer Admin should see the text as {string} below the table")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table(String string) {
		  String actual_Msg=classmodule.footerText();
		    Assert.assertEquals(string,actual_Msg);
			System.out.println("The field is "+actual_Msg);
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		boolean t=classmodule.paginatordisplay();
		if(t==true)
			System.out.println("Paginator is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see the text with total number classes in the data table")
	public void admin_should_see_the_text_with_total_number_classes_in_the_data_table() {
		boolean t=classmodule.footerTextdisplay();
		if(t==true)
			System.out.println("Footer is Visible");
			else
				System.out.println("Not Visible");
	}
     @When("Admin enters batch id into search box from excel sheet {string} and {int}")
		public void admin_enters_batch_id_into_search_box_from_excel_sheet_and(String string, Integer int1) throws Exception, IOException {
			List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/src/test/resources/TestData/ClassModule.xlsx", "Class");
			String batchId=testData.get(int1).get("batchId");
			classmodule.textSearch(batchId);
		}
	

	@Then("Displays entries with that batch id")
	public void displays_entries_with_that_batch_id() {
		 
		
		 }

	@When("Admin enters batch id is not existing the table into search box")
	public void admin_enters_batch_id_is_not_existing_the_table_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays empty details in the data table")
	public void displays_empty_details_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
