package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Page_Factory.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.Loggerload;

public class ResetPasswordCheckSD {
	
	HomePage hp = new HomePage();
	ExcelReader reader = new ExcelReader();
	
	@Given("Admin reset password page")
	public void admin_reset_password_page() {
		hp.url();
	    hp.forgotUsernamePasswordbtn();
	    hp.resetpasswordclick();
	    
	}

	@When("Admin clicks on type in new password field")
	public void admin_clicks_on_type_in_new_password_field() {
	    hp.enabletext();
	}

	@Then("Admin should see text box is enabled state")
	public void admin_should_see_text_box_is_enabled_state() {
	    Loggerload.info("Text Box is enabled Status");
	}

	@When("Admin clicks on retype password field")
	public void admin_clicks_on_retype_password_field() {
	    hp.enableretypetext();
	}
	
	@Then("Admin should see retype text box is enabled state")
	public void admin_should_see_retype_text_box_is_enabled_state() {
	    Loggerload.info("Text Box is enabled Status");
	}

	@When("Admin enters same password from excel sheet {string} and {int}")
	public void admin_enters_same_password_from_excel_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String newpassword=testData.get(int1).get("New Password");
		String retypepassword=testData.get(int1).get("Retype Password");
		hp.newpassword(newpassword);
		hp.retypepassword(retypepassword);
		hp.submitbtnclick();
	}

	@Then("Admin should recieve  Your password has been reset Please click here to login")
	public void admin_should_recieve_your_password_has_been_reset_please_click_here_to_login() {
	    Loggerload.info("Password has been reset");
	}

	@When("Admin enters same password on both field with invalid details from excel sheet {string} and {int}")
	public void admin_enters_same_password_on_both_field_with_invalid_details_from_excel_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String newpassword=testData.get(int1).get("New Password");
		String retypepassword=testData.get(int1).get("Retype Password");
		hp.newpassword(newpassword);
		hp.retypepassword(retypepassword);
		hp.submitbtnclick();
	}

	@Then("Error message Please try again")
	public void error_message_please_try_again() {
		Loggerload.info("Please try again");
	}

	@When("Admin enters  empty details on both fieldand clicks submit button")
	public void admin_enters_empty_details_on_both_fieldand_clicks_submit_button() {
	    hp.submitbtn();
	}

	@Then("Error msg Please try again details")
	public void error_msg_please_try_again_details() {
		Loggerload.info("Please try again");
	}

	@When("Admin enters  mismatch values from excel sheet {string} and {int}")
	public void admin_enters_mismatch_values_from_excel_sheet_and(String string, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String newpassword=testData.get(int1).get("New Password");
		String retypepassword=testData.get(int1).get("Retype Password");
		hp.newpassword(newpassword);
		hp.retypepassword(retypepassword);
		hp.submitbtnclick();
	}
	
	@Then("Error message Please try again details")
	public void error_message_please_try_again_details() {
		Loggerload.info("Please try again");
	}



}
