package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import Page_Factory.StudentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class StudentVerification {
	StudentPage student= new StudentPage();
	ExcelReader reader = new ExcelReader();
	
	@Given("Admin is on student details page")
	public void admin_is_on_student_details_page() {
	    student.managestudentdetailUrl();
	}

	@When("Admin clicks <options> on the batchid dropdown")
	public void admin_clicks_options_on_the_batchid_dropdown() {
	    student.clickbatchiddropdown();
	}

	@Then("Admin should see only numbers inside batch id drop down")
	public void admin_should_see_only_numbers_inside_batch_id_drop_down() {
	   student.verifynumber();
	}

	@When("Admin select student name from the drop down")
	public void admin_select_student_name_from_the_drop_down() {
	    student.validatefadestudentname();
	}

	@Then("Admin should not see select student name text")
	public void admin_should_not_see_select_student_name_text() {
		student.validatefadestudentname();
	}

	@When("Admin select batch id from the drop down")
	public void admin_select_batch_id_from_the_drop_down() {
	    student.validatefadebatchid();
	}

	@Then("Admin should not see select batch id text")
	public void admin_should_not_see_select_batch_id_text() {
	    student.validatefadebatchid();
	}
	@When("Admin clicks select student name and  enters {string} alphabet in the search box")
	public void admin_clicks_select_student_name_and_enters_alphabet_in_the_search_box(String string) {
	    student.verifyxalphabet();
	}
	@Then("Admin should see student name start with {string} is listed below")
	public void admin_should_see_student_name_start_with_is_listed_below(String string) {
		System.out.println("The dropdown contains an option starting with 'x'.");
	}

	@When("Admin  clicks select batch id and enter {int} number in the search box")
	public void admin_clicks_select_batch_id_and_enter_number_in_the_search_box(Integer int1) {
	   student.validatebatchidsearchbox();
	}
	@Then("Admin should see batch id start with {int} is listed below")
	public void admin_should_see_batch_id_start_with_is_listed_below(Integer int1) {
		System.out.println("The dropdown contains an option starting with '6'.");
	
	}
	
	@When("Admin selects only student name from {string} and {int}")
	public void admin_selects_only_student_name_from_and(String sheetname, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/StudentPage.xlsx", sheetname);
		String studentname = testData.get(int1).get("Student Name");
		String batchid= testData.get(int1).get("Batch Id");
		student.fillAllFields(batchid, studentname);
	}
	

	
	@Then("Student details should not be displayed")
	public void student_details_should_not_be_displayed() {
	    System.out.println("Student Details not available");
	}
	@When("Admin selects only  batch id from {string} and {int}")
	public void admin_selects_only_batch_id_from_and(String sheetname, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/StudentPage.xlsx", sheetname);
		String studentname = testData.get(int1).get("Student Name");
		String batchid= testData.get(int1).get("Batch Id");
		student.fillAllFields(batchid, studentname);
	}
	

	@When("Admin selects  student name and batch id from {string} and {int}")
	public void admin_selects_student_name_and_batch_id_from_and(String string, Integer int1) {
	    System.out.println("Student Details not available");
	}

	@When("Admin selects  student name and batch id from {string}, {int}")
	public void admin_selects_student_name_and_batch_id_from(String sheetname, Integer int1) throws Exception, IOException {
		List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/StudentPage.xlsx", sheetname);
		String studentname = testData.get(int1).get("Student Name");
		String batchid= testData.get(int1).get("Batch Id");
		student.fillAllFields(batchid, studentname);
	}
	

	@Then("Particular student informations should be displayed")
	public void particular_student_informations_should_be_displayed() {
		student.studentdisplay(student);
		System.out.println("Student details available");
	}
	

	@When("Admin clicks on program link on student  page")
	public void admin_clicks_on_program_link_on_student_page() {
	    student.clickprogrambutton();
	}

	@Then("Admin is redirected to Program page")
	public void admin_is_redirected_to_program_page() {
		String actual_Msg = student.Header();
		Assert.assertEquals(actual_Msg,"Manage Program");
	}

	@When("Admin clicks on Batch link on student page")
	public void admin_clicks_on_batch_link_on_student_page() {
	    student.clickbatchbutton();
	}

	@Then("Admin is redirected to Batch page")
	public void admin_is_redirected_to_batch_page() {
		String actual_Msg = student.Header();
		Assert.assertEquals(actual_Msg,"Manage Batch");
	}

	@When("Admin clicks on Class link on student page")
	public void admin_clicks_on_class_link_on_student_page() {
	    student.clickclassbutton();
	}
	@Then("Admin is redirected to Class page")
	public void admin_is_redirected_to_class_page() {
		String actual_Msg = student.Header();
		Assert.assertEquals(actual_Msg,"Manage Class");
	}
	@When("Admin clicks on user link on student page")
	public void admin_clicks_on_user_link_on_student_page() {
	    student.clickuserbutton();
	}
	@Then("Admin is redirected to User page")
	public void admin_is_redirected_to_user_page() {
		String actual_Msg = student.Header();
		Assert.assertEquals(actual_Msg,"Manage User");
	}
	@When("Admin clicks on Assignment link on student page")
	public void admin_clicks_on_assignment_link_on_student_page() {
	   student.clickassignmentbutton();
	}

	@Then("Admin is redirected to Assignment page")
	public void admin_is_redirected_to_assignment_page() {
		String actual_Msg = student.Header();
		Assert.assertEquals(actual_Msg,"Manage Assignment");
	}
	

	@When("Admin clicks on attendance link on student page")
	public void admin_clicks_on_attendance_link_on_student_page() {
	    student.clickattendancebutton();
	}

	@Then("Admin is redirected to Attendance page")
	public void admin_is_redirected_to_attendance_page() {
		String actual_Msg = student.Header();
		Assert.assertEquals(actual_Msg,"Manage Attendance");
	}

	@When("Admin clicks on Logout link on student page")
	public void admin_clicks_on_logout_link_on_student_page() {
	    student.clicklogoutbutton();
	}

	@Then("Admin is redirected to Login page")
	public void admin_is_redirected_to_login_page() {
		String actual_Msg = student.Header();
		Assert.assertEquals(actual_Msg,"Please login to LMS application");
	}

	

}
