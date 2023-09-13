package stepDefinition;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import utilities.ExcelReader;
import Page_Factory.ProgramPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramAddSD {
	ProgramPage program=new ProgramPage();
	ExcelReader reader = new ExcelReader();
	
	@When(": Admin clicks <A New Program>button")
	public void admin_clicks_a_new_program_button() {
		 program.AddNewProgram();
	}

	@Then(": Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close\\(X) Icon on the top right corner of the window")
	public void admin_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window(String expected_text) {
		String actual_Msg = program.popUpHeader();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The pop up window header is "+actual_Msg);
	}

	@Then(": Admin should see two input fields and their respective text boxes in the program details window")
	public void admin_should_see_two_input_fields_and_their_respective_text_boxes_in_the_program_details_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then(": Admin should see two radio button for Program Status")
	public void admin_should_see_two_radio_button_for_program_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given(": Admin creates new Program from {string} and {int}")
	public void admin_creates_new_program_from_and(String string, Integer int1)throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Book1.xlsx", "Program");
		String ProgramName=testData.get(int1).get("ProgramName");
		program.textSearch(ProgramName);
	}

	@When(": Admin clicks <Save>button without entering any data")
	public void admin_clicks_save_button_without_entering_any_data() {
		program.clickSave();
	}

	@Then(": Admin gets a Error message alert")
	public void admin_gets_a_error_message_alert() {
		System.out.println("Error message alert");
	}

	@When(": Admin enters only<Program Name> in text box and clicks Save button")
	public void admin_enters_only_program_name_in_text_box_and_clicks_save_button() {
		boolean t=program.SaveDisplay();
	    if(t==true)
			System.out.println("save button is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then(": Admin gets a message alert {string}")
	public void admin_gets_a_message_alert(String string) {
		
		
	}

	@When(": Admin enters only<Program description> in text box and clicks Save button")
	public void admin_enters_only_program_description_in_text_box_and_clicks_save_button() {
		boolean t=program.ProgramTextBox();
	    if(t==true)
			System.out.println("save button is Visible");
			else
				System.out.println("Not Visible");
	}

	@Given(":  Admin creates new Program from {string} and {int}")
	public void admin_creates_new_program_from_and(Integer int1)throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Book1.xlsx", "Program");
		String ProgramName=testData.get(int1).get("ProgramName");
		program.textSearch(ProgramName);
	}

	@When(": Admin selects only Status and clicks Save button")
	public void admin_selects_only_status_and_clicks_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When(": Admin enters only numbers or special char in name and desc column")
	public void admin_enters_only_numbers_or_special_char_in_name_and_desc_column() {
	    
	}

	@Given(": Admin is on {string} Popup window")
	public void admin_is_on_popup_window(String expected_text) {
		String actual_Msg = program.popUpHeader();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The pop up window header is "+actual_Msg);
	    
	}

	@When(": Admin clicks Cancel\\/Close\\(X) Icon on Program Details form")
	public void admin_clicks_cancel_close_x_icon_on_program_details_form() {
	    program.CancelDisplay();
	}

	@Then(": Program Details popup window should be closed without saving")
	public void program_details_popup_window_should_be_closed_without_saving() {
	    program.CloseDisplay();
	}

	@When(": Enter all the required fields with valid values and click Save button")
	public void enter_all_the_required_fields_with_valid_values_and_click_save_button() {
	    program.clickSave();
	}

	@Then(": Admin gets a message {string} alert and able to see the new program added in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_the_new_program_added_in_the_data_table(String string) {
	    System.out.println("new program added");
	}

	@When(": Admin clicks <Cancel>button")
	public void admin_clicks_cancel_button() {
	    program.CancelDisplay();
	}

	@Then(": Admin can see the Program details popup disappears without creating any program")
	public void admin_can_see_the_program_details_popup_disappears_without_creating_any_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
