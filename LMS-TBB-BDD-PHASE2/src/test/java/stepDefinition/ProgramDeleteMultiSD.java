package stepDefinition;

import Page_Factory.ProgramPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class ProgramDeleteMultiSD {
	ProgramPage program=new ProgramPage();
	ExcelReader reader = new ExcelReader();
	
	@Given(":Admin is in Manage Program page")
	public void admin_is_in_manage_program_page() {
	    program.ManageProgramUrl();
	}

	@When(":Admin clicks any checkbox in the data table")
	public void admin_clicks_any_checkbox_in_the_data_table() {
	    program.rowCheckboxdisplay();
	}

	@Then(":Admin should see common delete option enabled under header Manage Program")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_program() {
	    program.deleteRowdisplay();
	}

	@Given(":Admin is on Confirm Deletion alert")
	public void admin_is_on_confirm_deletion_alert() {
	    program.DeleteProgram();
	}

	@When(":Admin clicks <YES> button on the alert")
	public void admin_clicks_yes_button_on_the_alert() {
	    program.Yes_btn();
	}

	@Then(":Admin should land on Manage Program page and can see the selected program is deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When(":Admin clicks <NO> button on the alert")
	public void admin_clicks_no_button_on_the_alert() {
	   program.No_btn();
	}

	@Then(":Admin should land on Manage Program page and can see the selected program is not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table() {
		boolean t=program.AddNewProgramdisplay(toString());
	    if(t==true)
			System.out.println("assignment is not deleted");
			else
				System.out.println("deleted");
	}
	

	@Then(":Admin should land on Manage Program page and can see the selected programs are deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_deleted_from_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then(":Admin should land on Manage Program page and can see the selected programs are not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_not_deleted_from_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
