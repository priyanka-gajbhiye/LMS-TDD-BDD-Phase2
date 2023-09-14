package stepDefinition;

import Page_Factory.ClassPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteMultipleClassSD {
	ClassPage classmodule = new ClassPage(); 
	
	@Given("Admin is in Manage class page")
	public void admin_is_in_manage_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks single  row level check box in the data table")
	public void admin_clicks_single_row_level_check_box_in_the_data_table() {
		  classmodule.clickCheckbox();
	}

	@Then("Admin should see delete icon below the header is enabled")
	public void admin_should_see_delete_icon_below_the_header_is_enabled() {
		boolean t=classmodule.deleteMultiRowBtnEnabled();
	    if(t==true)
			System.out.println("assignment multi deleted btn is enabled");
			else
				System.out.println("Disabled");
	}

	@Then("Admin should see tick mark in check box")
	public void admin_should_see_tick_mark_in_check_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks multiple row level check box in the data table")
	public void admin_clicks_multiple_row_level_check_box_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see tick mark in check box  of the selected rows")
	public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is in delete alert")
	public void admin_is_in_delete_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks yes button")
	public void admin_clicks_yes_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Success message and validate particular class details are deleted from the data table")
	public void success_message_and_validate_particular_class_details_are_deleted_from_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks no button")
	public void admin_clicks_no_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on manage class page and validate particular class details are not deleted from the data table")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_deleted_from_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on manage class page and validate particular class details are deleted from the data table")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_deleted_from_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
