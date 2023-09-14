package stepDefinition;

import Page_Factory.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;


public class UserPageValidation {
	UserPage user =new UserPage();
	ExcelReader reader = new ExcelReader();
	
	
	@Given("Admin is on the dashboard page after Login")
	public void admin_is_on_the_dashboard_page_after_login() {
	    
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
		user.clickUserPage();
	}

	@Then("Admin should see {string} Title")
	public void admin_should_see_title(String string) {
		user.ManageUserUrl();
	}

	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) {
		user.Header(); 
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		user.validatepagination();
	}

	@Then("Admin Should see the data table with headers")
	public void admin_should_see_the_data_table_with_headers() {
		user.validatedatatableheaders();
	}

	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
		user.validatedeleteicon();
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
		user.validatenewuserbutton();
	}

	@Then("Admin should be able to see the search text box")
	public void admin_should_be_able_to_see_the_search_text_box() {
		user.validatesearchbox();
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
		 user.validatecheckbox();
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
		user.validateedit();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
		user.validatedeletebutton();
	}

	@Given("Admin is on the dashboard page after Login and clicks {string} from navigation bar")
	public void admin_is_on_the_dashboard_page_after_login_and_clicks_from_navigation_bar(String string) {
		user.ManageUserUrl();
	}

	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
		user.clickAddNewUserbutton();
	
	}

	@Then("A new pop up with User details appears")
	public void a_new_pop_up_with_user_details_appears() {
		user.validatepopup();
	}
}
