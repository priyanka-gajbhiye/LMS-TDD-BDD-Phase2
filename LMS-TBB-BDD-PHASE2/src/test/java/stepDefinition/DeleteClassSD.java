package stepDefinition;

import io.cucumber.java.en.Given;
import Page_Factory.ClassPage;

import org.junit.Assert;
import Page_Factory.ClassPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteClassSD {
	ClassPage classmodule = new ClassPage(); 
	
	@Given("Admin is in Manage class page")
	public void admin_is_in_manage_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() {
	       classmodule.clickDeleteOnRight();
	}

	@Then("Admin should see alert")
	public void admin_should_see_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String string) {
		String actual_Msg = classmodule.yesBtndisplay();
		Assert.assertEquals(actual_Msg,string);
	}

	@Then("Alert should have {string} button to reject")
	public void alert_should_have_button_to_reject(String string) {
		String actual_Msg = classmodule.noBtndisplay();
		Assert.assertEquals(actual_Msg,string);
	}

	@Given("Admin is in delete alert")
	public void admin_is_in_delete_alert() {
		boolean t=classmodule.deleteDialogBoxdisplay();
	    if(t==true)
			System.out.println("new assignment is Visible");
			else
				System.out.println("Not Visible");
	}

	@When("Admin clicks yes button")
	public void admin_clicks_yes_button() {
	    classmodule.clickYes();
	}

	@Then("Success message and validate particular class details are deleted from the data table")
	public void success_message_and_validate_particular_class_details_are_deleted_from_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks no button")
	public void admin_clicks_no_button() {
		   classmodule.clickNo();
	}

	@Then("Admin should land on manage class page and validate particular class details are not deleted from the data table")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_deleted_from_the_data_table() {
		boolean t=classmodule.addAssignmentDisplay(toString());
	    if(t==true)
			System.out.println("assignment is not deleted");
			else
				System.out.println("deleted");
	}


}
