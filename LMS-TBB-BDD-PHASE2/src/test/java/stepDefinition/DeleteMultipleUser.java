package stepDefinition;

import Page_Factory.UserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class DeleteMultipleUser {
	UserPage user =new UserPage();
	ExcelReader reader = new ExcelReader();
	
	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() {
	   user.validatecheckbox();
	}

	@When("Admin do not click  any of the checkboxes")
	public void admin_do_not_click_any_of_the_checkboxes() {
		user.validatecheckbox();
	}

	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled(String string) {
	    user.validatedeleteicon();
	}

	@Given("One of the checkbox or row is selected")
	public void one_of_the_checkbox_or_row_is_selected() {
	   user.clickrowcheckbox();
	}

	@When("Click delete icon below {string} header")
	public void click_delete_icon_below_header(String string) {
		user.clickdeleteicon();
	}

	@Then("The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted() {
		user.deletemessagedisplay();
	}

	@Given("Two or more checkboxes\\/row is selected")
	public void two_or_more_checkboxes_row_is_selected() {
		user.clickcheckbox();
	}

	@Then("The respective rows in the data table is deleted")
	public void the_respective_rows_in_the_data_table_is_deleted() {
	    user.deletemessagedisplay();
	}

}
