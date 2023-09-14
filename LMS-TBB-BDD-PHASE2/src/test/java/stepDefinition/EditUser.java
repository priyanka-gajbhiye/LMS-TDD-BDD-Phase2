package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Page_Factory.UserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class EditUser {
	UserPage user =new UserPage();
	ExcelReader reader = new ExcelReader();
	
	@Given("The edit icon on row level in data table is enabled")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled() {
	    user.validateedit();
	}

	@When("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
	    user.clickeditbutton();
	}
	@Then("A  pop up window with User details appears")
	public void a_pop_up_window_with_user_details_appears() {
	    user.validatepopup();
	}

	@When("Update the fields with valid values from {string},{int} and click submit")
	public void update_the_fields_with_valid_values_from_and_click_submit(String sheetname, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/UserPage.xlsx", sheetname);
		String firstname = testData.get(int1).get("First Name");
		String middlename = testData.get(int1).get("Middle Name");
		String lastname = testData.get(int1).get("Last Name");
		String phonenumber = testData.get(int1).get("phonenumber");
		String location = testData.get(int1).get("location");
		String linkdn = testData.get(int1).get("linkdn");
		String userrole = testData.get(int1).get("UserRole");
		String rolestatus = testData.get(int1).get("RoleStatus");
		String visastatus = testData.get(int1).get("VisaStatus");
		String email = testData.get(int1).get("email");
		String undergraduate = testData.get(int1).get("UnderGraduate");
		String postgraduate = testData.get(int1).get("PostGraduate");
		String timezone = testData.get(int1).get("TimeZone");
		String usercomments= testData.get(int1).get("UserComments");
		user.fillAllFields(firstname,lastname,middlename,phonenumber,location,linkdn,userrole,rolestatus,visastatus,email,undergraduate,postgraduate,timezone,usercomments);
	    user.clicksubmitbutton();
	}
	

	@Then("The updated user details should appear on the data table")
	public void the_updated_user_details_should_appear_on_the_data_table() {
		String UserName = null;
		user.updateuserdisplay(UserName);
		}
	

	@When("Update the fields with invalid values from {string}, {int} and click submit")
	public void update_the_fields_with_invalid_values_from_and_click_submit(String sheetname, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/UserPage.xlsx", sheetname);
		String firstname = testData.get(int1).get("First Name");
		String middlename = testData.get(int1).get("Middle Name");
		String lastname = testData.get(int1).get("Last Name");
		String phonenumber = testData.get(int1).get("phonenumber");
		String location = testData.get(int1).get("location");
		String linkdn = testData.get(int1).get("linkdn");
		String userrole = testData.get(int1).get("UserRole");
		String rolestatus = testData.get(int1).get("RoleStatus");
		String visastatus = testData.get(int1).get("VisaStatus");
		String email = testData.get(int1).get("email");
		String undergraduate = testData.get(int1).get("UnderGraduate");
		String postgraduate = testData.get(int1).get("PostGraduate");
		String timezone = testData.get(int1).get("TimeZone");
		String usercomments= testData.get(int1).get("UserComments");
		user.fillAllFields(firstname,lastname,middlename,phonenumber,location,linkdn,userrole,rolestatus,visastatus,email,undergraduate,postgraduate,timezone,usercomments);
	    user.clicksubmitbutton();
	}

	@Then("The error message should appear")
	public void the_error_message_should_appear() {
	    user.errormessage();
	}

	@When("Update the fields with empty values from {string},{int} and click submit")
	public void update_the_fields_with_empty_values_from_and_click_submit(String sheetname, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetname);
		String firstname = testData.get(int1).get("First Name");
		String middlename = testData.get(int1).get("Middle Name");
		String lastname = testData.get(int1).get("Last Name");
		String phonenumber = testData.get(int1).get("phonenumber");
		String location = testData.get(int1).get("location");
		String linkdn = testData.get(int1).get("linkdn");
		String userrole = testData.get(int1).get("UserRole");
		String rolestatus = testData.get(int1).get("RoleStatus");
		String visastatus = testData.get(int1).get("VisaStatus");
		String email = testData.get(int1).get("email");
		String undergraduate = testData.get(int1).get("UnderGraduate");
		String postgraduate = testData.get(int1).get("PostGraduate");
		String timezone = testData.get(int1).get("TimeZone");
		String usercomments= testData.get(int1).get("UserComments");
		user.fillAllFields(firstname,lastname,middlename,phonenumber,location,linkdn,userrole,rolestatus,visastatus,email,undergraduate,postgraduate,timezone,usercomments);
	    user.clicksubmitbutton();
	}
	

	
	@When("erase  email data from {string},{int} and click submit")
	public void erase_email_data_from_and_click_submit(String sheetname, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", sheetname);
		String firstname = testData.get(int1).get("First Name");
		String middlename = testData.get(int1).get("Middle Name");
		String lastname = testData.get(int1).get("Last Name");
		String phonenumber = testData.get(int1).get("phonenumber");
		String location = testData.get(int1).get("location");
		String linkdn = testData.get(int1).get("linkdn");
		String userrole = testData.get(int1).get("UserRole");
		String rolestatus = testData.get(int1).get("RoleStatus");
		String visastatus = testData.get(int1).get("VisaStatus");
		String email = testData.get(int1).get("email");
		String undergraduate = testData.get(int1).get("UnderGraduate");
		String postgraduate = testData.get(int1).get("PostGraduate");
		String timezone = testData.get(int1).get("TimeZone");
		String usercomments= testData.get(int1).get("UserComments");
		user.fillAllFields(firstname,lastname,middlename,phonenumber,location,linkdn,userrole,rolestatus,visastatus,email,undergraduate,postgraduate,timezone,usercomments);
	    user.clicksubmitbutton();
	}

	@When("Admin clicks cancel button")
	public void admin_clicks_cancel_button() {
	    user.clickcancelbutton();
	}

	@Then("Admin should redirected to manage user page")
	public void admin_should_redirected_to_manage_user_page() {
	    user.ManageUserUrl();
	}

}
