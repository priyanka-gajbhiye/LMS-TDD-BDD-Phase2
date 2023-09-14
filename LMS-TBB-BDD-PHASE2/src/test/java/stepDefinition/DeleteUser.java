package stepDefinition;

import Page_Factory.UserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class DeleteUser {
	UserPage user =new UserPage();
	ExcelReader reader = new ExcelReader();
	
	@Given("The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() {
	    user.validatedeletebutton();
	}

	@When("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon() {
	    user.clickdeletebutton();
	}

	@Then("Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option() {
	    user.validatealert();
	}

	@Given("Admin is on alert window")
	public void admin_is_on_alert_window() {
	    user.validatealert();
	}
	@When("Admin click yes option")
	public void admin_click_yes_option() {
	    user.clickyesbutton();
	}

	@Then("User deleted alert pops and user is no more available in data table")
	public void user_deleted_alert_pops_and_user_is_no_more_available_in_data_table() {
	    user.deletemessagedisplay();
	}

	@When("Admin click No option")
	public void admin_click_no_option() {
	    user.clicknobutton();
	}

	@Then("User is still listed in data table")
	public void user_is_still_listed_in_data_table() {
	    user.ManageUserUrl();
	}
}
