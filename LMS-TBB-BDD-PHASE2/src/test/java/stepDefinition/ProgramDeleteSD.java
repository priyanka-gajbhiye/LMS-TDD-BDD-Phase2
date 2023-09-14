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

public class ProgramDeleteSD {
	ProgramPage program=new ProgramPage();
	ExcelReader reader = new ExcelReader();
	
	@When(": Admin clicks <Delete> button on the data table for any row")
	public void admin_clicks_delete_button_on_the_data_table_for_any_row() {
	   program.DeleteProgram();
	}

	@Then(": Admin should see a alert open with heading {string} along with  <YES> and <NO> button for deletion")
	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String string) {
		String actual_Msg = program.popUpHeader();
		Assert.assertEquals("Program Deleted",actual_Msg);
		System.out.println("Program Deleted");
		program.Yes_btn();
		program.No_btn();
	}

	@Then(": Admin should see a message {string}")
	public void admin_should_see_a_message(String string) {
	    System.out.println("program deleted");
	}

	@Given(": Admin is on Confirm Deletion alert")
	public void admin_is_on_confirm_deletion_alert() {
	   program.ConfirmTextBox();
	}

	@When(": Admin clicks <YES> button on the alert")
	public void admin_clicks_yes_button_on_the_alert() {
	    program.Yes_btn();
	}

	@Then(": Admin gets a message {string} alert and able to see that program deleted in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table(Integer int1 ,String expected_text)throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Book1.xlsx", "Program");
		String ProgramName=testData.get(int1).get("ProgramName");
		program.textSearch(ProgramName);
		String actual_Msg = program.popUpHeader();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The pop up window header is "+actual_Msg);
        }

	@When(": Admin clicks <NO> button on the alert")
	public void admin_clicks_no_button_on_the_alert() {
	    program.No_btn();
	}

	@Then(": Admin can see the deletion alert disappears without deleting")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When(": Admin clicks Cancel\\/Close\\(X) Icon on Deletion alert")
	public void admin_clicks_cancel_close_x_icon_on_deletion_alert() {
	    program.CancelDisplay();
	}

	@Then(": Admin can see the deletion alert disappears without any changes")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
