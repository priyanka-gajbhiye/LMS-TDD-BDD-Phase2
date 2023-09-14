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

public class AddNewUser {
	UserPage user =new UserPage();
	ExcelReader reader = new ExcelReader();
	
	@Given("A new pop up with user details appears")
	public void a_new_pop_up_with_user_details_appears() {
	  user.validatepopup();  
	}

	@When("Admin checks all fields is displayed")
	public void admin_checks_all_fields_is_displayed() {
	    user.validatepopup();
	    user.numberoffileds();
	    user.UserroleDD();
	    user.RolestatusDD();
	    user.VisastatusDD();
	}

	@Then("The pop up should include the fields")
	public void the_pop_up_should_include_the_fields() {
	    user.validatepopup();
	}

	@Given("Admin is on pop up window")
	public void admin_is_on_pop_up_window() {
	    user.validatepopup();
	}

	@When("Admin enters valid data in mandatory fields except optional fields from {string},{int} and click submit")
	public void admin_enters_valid_data_in_mandatory_fields_except_optional_fields_from_and_click_submit(String sheetname, Integer int1) throws Exception, IOException {
	    
	
		List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/UserPage.xlxs",sheetname);
		String firstname = testData.get(int1).get("First Name");
		//String middlename = testData.get(rowNumber).get("Middle Name");
		String lastname = testData.get(int1).get("Last Name");
		String phonenumber = testData.get(int1).get("phonenumber");
		String location = testData.get(int1).get("location");
		//String linkdn = testData.get(rowNumber).get("linkdn");
		String userrole = testData.get(int1).get("UserRole");
		String rolestatus = testData.get(int1).get("RoleStatus");
		String visastatus = testData.get(int1).get("VisaStatus");
		//String email = testData.get(rowNumber).get("email");
		//String undergraduate = testData.get(rowNumber).get("UnderGraduate");
		//String postgraduate = testData.get(rowNumber).get("PostGraduate");
		//String timezone = testData.get(rowNumber).get("TimeZone");
		//String usercomments= testData.get(rowNumber).get("UserComments");
		user.fillMandatoryFields(firstname,lastname,phonenumber,location,userrole,rolestatus,visastatus);
	    user.clicksubmitbutton();
		
	}

	@Then("The newly added user should be present in the data table in Manage User page")
	public void the_newly_added_user_should_be_present_in_the_data_table_in_manage_user_page(String UserName) {
	    user.addNewuserDisplay(UserName);
	}

	@When("Admin enters invalid data in mandatory fields and valid optional fields from {string},{int} and click submit")
	public void admin_enters_invalid_data_in_mandatory_fields_and_valid_optional_fields_from_and_click_submit(String sheetname, Integer int1) throws Exception, IOException {
	   
	
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

	@When("Admin enters valid data in optional fields with empty mandatory fields from {string},{int} and click submit")
	public void admin_enters_valid_data_in_optional_fields_with_empty_mandatory_fields_from_and_click_submit(String sheetname, Integer int1) throws Exception, IOException {
	    
	
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
	

	@Then("Error message should dispaly")
	public void error_message_should_dispaly() {
	    user.errormessage();
	}

	
	@When("Admin enters valid data in mandatory fields and optional fields from {string},{int} and click submit")
	public void admin_enters_valid_data_in_mandatory_fields_and_optional_fields_from_and_click_submit(String sheetname, Integer int1) throws Exception, IOException {
	    
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


}
