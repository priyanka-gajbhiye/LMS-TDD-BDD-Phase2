package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import Page_Factory.ProgramPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class ProgramEditSD {

	ProgramPage program=new ProgramPage();
	ExcelReader reader = new ExcelReader();
	
	@When(": Admin clicks <Edit> button on the data table for any row")
	public void admin_clicks_edit_button_on_the_data_table_for_any_row() {
	   program.EditProgram();
	}

	@Then(": Admin should see a popup open for Program details to edit")
	public void admin_should_see_a_popup_open_for_program_details_to_edit(String expected_text) {
		String actual_Msg = program.popUpHeader();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The pop up window header is "+actual_Msg);
	}

	@Given(": Admin edits new Program from {string} and {int}")
	public void admin_edits_new_program_from_and(String string, Integer int1) throws InvalidFormatException, IOException{
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Book1.xlsx", "ProgramEdit");
		String ProgramName=testData.get(int1).get("ProgramName");
		program.textSearch(ProgramName);
	}

	@When(": Admin edits the Name column and clicks save button")
	public void admin_edits_the_name_column_and_clicks_save_button() {
		boolean t=program.SaveDisplay();
	    if(t==true)
			System.out.println("save button is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then(": Admin gets a message {string} alert and able to see the updated name in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_name_in_the_table_for_the_particular_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When(": Admin edits the Description column and clicks save button")
	public void admin_edits_the_description_column_and_clicks_save_button() {
		boolean t=program.SaveDisplay();
	    if(t==true)
			System.out.println("save button is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then(": Admin gets a message {string} alert and able to see the updated description in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_description_in_the_table_for_the_particular_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When(": Admin changes the Status and clicks save button")
	public void admin_changes_the_status_and_clicks_save_button() {
		 program.clickSave();
	}

	@Then(": Admin gets a message {string} alert and able to see the updated status in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_status_in_the_table_for_the_particular_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given(": Admin is on Program Details Popup window to Edit")
	public void admin_is_on_program_details_popup_window_to_edit(String expected_text) {
		String actual_Msg = program.popUpHeader();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The pop up window header is "+actual_Msg);
	}

	@When(": Admin clicks <Cancel>button on edit popup")
	public void admin_clicks_cancel_button_on_edit_popup() {
	    program.CancelDisplay();
	}

	@Then(": Admin can see the Program details popup disappears and can see nothing changed for particular program")
	public void admin_can_see_the_program_details_popup_disappears_and_can_see_nothing_changed_for_particular_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When(": Admin clicks <Save>button on edit popup")
	public void admin_clicks_save_button_on_edit_popup(String expected_text) {
		String actual_Msg = program.popUpHeader();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The pop up window header is "+actual_Msg);
		 program.clickSave();
	}

	@Then(": Admin gets a message {string} alert and able to see the updated details in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_details_in_the_table_for_the_particular_program(String string) {
	    System.out.println("program updated");
	}

	
}
