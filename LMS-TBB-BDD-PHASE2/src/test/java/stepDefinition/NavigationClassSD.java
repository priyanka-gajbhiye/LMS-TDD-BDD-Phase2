package stepDefinition;

import org.junit.Assert;

import Page_Factory.ClassPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationClassSD {
	ClassPage classmodule = new ClassPage(); 
	
	@Given("Admin is in Manage class page")
	public void admin_is_in_manage_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks {string} button in the navigation bar")
	public void admin_clicks_button_in_the_navigation_bar(String string) {
		 classmodule.clickButton(string);
	}

	@Then("Admin should able to land on student page")
	public void admin_should_able_to_land_on_student_page() {
		String actual_Msg = classmodule.Header();
		Assert.assertEquals(actual_Msg,"Manage Student");
	}

	@Then("Admin should able to land on program page")
	public void admin_should_able_to_land_on_program_page() {
		String actual_Msg = classmodule.Header();
		Assert.assertEquals(actual_Msg,"Manage Program");
	}

	@Then("Admin should able to land on batch page")
	public void admin_should_able_to_land_on_batch_page() {
		String actual_Msg = classmodule.Header();
		Assert.assertEquals(actual_Msg,"Manage Batch");
	}

	@Then("Admin should able to land on user page")
	public void admin_should_able_to_land_on_user_page() {
		String actual_Msg = classmodule.Header();
		Assert.assertEquals(actual_Msg,"Manage User");
	}

	@Then("Admin should able to land on Assignment page")
	public void admin_should_able_to_land_on_assignment_page() {
	        String actual_Msg = classmodule.Header();
			Assert.assertEquals(actual_Msg,"Manage Assignment");
	}

	@Then("Admin should able to land on Attendance page")
	public void admin_should_able_to_land_on_attendance_page() {
		String actual_Msg = classmodule.Header();
		Assert.assertEquals(actual_Msg,"Manage Attendence");
	}

	@Then("Admin should able to land on login page")
	public void admin_should_able_to_land_on_login_page() {
		String actual_Msg = classmodule.Header();
		Assert.assertEquals(actual_Msg,"Please login to LMS application");
	}


}
