package stepDefinition;

import io.cucumber.java.en.Given;
import Page_Factory.ClassPage;
import java.io.IOException;
import org.junit.Assert;
import Page_Factory.ClassPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewClassSD {
	ClassPage classmodule = new ClassPage(); 
	
	@Given("Admin is in  class detail popup window")
	public void admin_is_in_class_detail_popup_window() {
		String actual_Msg = classmodule.popUpHeader();
		Assert.assertEquals("Assignment Details",actual_Msg);
		System.out.println("The pop up window is open");
	}

	@When("Admin clicks  Batch ID dropdown")
	public void admin_clicks_batch_id_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Batch id in the drop down should match with Batch id manage batch page table")
	public void batch_id_in_the_drop_down_should_match_with_batch_id_manage_batch_page_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with valid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	   
	}

	@Then("Admin should see new class details is added in the data table")
	public void admin_should_see_new_class_details_is_added_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with invalid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id, )")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("Error message should appear in alert {string}")
	public void error_message_should_appear_in_alert(String expected_text) {
		String actual_Msg = classmodule.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);

	}

	@When("Admin enters values in all fields with valid data and clicks save button \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)")
	public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters with invalid data in optional fields and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters  data missing value in Batch ID and clicks save button \\(No of Classes, Class Date, Staff Id)")
	public void admin_enters_data_missing_value_in_batch_id_and_clicks_save_button_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Batch Id is missing {string}")
	public void program_name_is_missing(String expected_text) {
		String actual_Msg = classmodule.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);
	
	}

	@When("Admin enters data missing value in No of class and clicks save button \\(Batch ID ,  Class Date, Staff Id, )")
	public void admin_enters_data_missing_value_in_no_of_class_and_clicks_save_button_batch_id_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@Then("Batch number is missing {string}")
	public void batch_number_is_missing(String expected_text) {
		String actual_Msg = classmodule.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);
	
	}

	@When("Admin enters data missing value in  class date and clicks save button \\(Batch ID , No of Classes, Staff Id, )")
	public void admin_enters_data_missing_value_in_class_date_and_clicks_save_button_batch_id_no_of_classes_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("class date is missing")
	public void class_date_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in staff id and clicks save button \\(Batch ID , No of Classes, Class Date )")
	public void admin_enters_data_missing_value_in_staff_id_and_clicks_save_button_batch_id_no_of_classes_class_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("staff id is missing")
	public void staff_id_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters passed date in the class date field and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_passed_date_in_the_class_date_field_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Assignment cannot be created for the passed date {string}")
	public void assignment_cannot_be_created_for_the_passed_date(String expected_text) {
		String actual_Msg = classmodule.Message();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The Error message is "+actual_Msg);
	
	}

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() {
		classmodule.selectDate();
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
		  classmodule.dateDisplay();
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() {
		 classmodule.validDateFormat();
	}

	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
	    classmodule.clickRightArrowCalender();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() {
		  classmodule.monthCalenderdisplay();
	}

	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
		classmodule.clickLeftArrowCalender();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() {
		classmodule.monthCalenderdisplay();
	}

	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() {
	    classmodule.clickCalenderIcon();
	}

	@Then("Admin should see current date is highled in the date picker")
	public void admin_should_see_current_date_is_highled_in_the_date_picker() {
		classmodule.highligtedDatedisplay();
	}

	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() {
		classmodule.clickCalenderIcon();
	}

	@Then("Admin should see selected date is highled in the date picker")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
		classmodule.highligtedDatedisplay();
	}

	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
	    classmodule.clickCancelBtn();
	}

	@Then("Admin should land on Manage Class page")
	public void admin_should_land_on_manage_class_page() {
	    classmodule.Header();
	}

	@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
		classmodule.clickCancelBtn();
	}

	
	@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table")
	public void admin_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table() {
		boolean t= classmodule.addAssignmentDisplay(toString());
		if(t==true)
			System.out.println("new assignment is Visible");
			else
				System.out.println("Not Visible");
	
	}


}
