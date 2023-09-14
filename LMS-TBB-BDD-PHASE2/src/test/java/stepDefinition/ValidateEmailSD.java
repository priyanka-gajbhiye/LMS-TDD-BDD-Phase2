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

public class ValidateEmailSD {
	
	HomePage hp = new HomePage();
	ExcelReader reader = new ExcelReader();
	
	@Given("Admin is in forgot username and password page")
	public void admin_is_in_forgot_username_and_password_page() {
	    hp.url();
	    hp.forgotUsernamePasswordbtn();
	}

	@When("Admin enters valid email id from excel sheet {string} and {int} and clicks send link button")
	public void admin_enters_valid_email_id_from_excel_sheet_and_and_clicks_send_link_button(String string, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String validemail=testData.get(int1).get("Email");	
		hp.validemail(validemail);
	}

	@Then("Admin should receive link in mail for reset username and password")
	public void admin_should_receive_link_in_mail_for_reset_username_and_password() {
	    Loggerload.info("User receive link in email");
	}

	@When("Admin enters invalid email id from excel sheet {string} and {int} and clicks send link button")
	public void admin_enters_invalid_email_id_from_excel_sheet_and_and_clicks_send_link_button(String string, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String invalidemail=testData.get(int1).get("Email");	
		hp.invalidemail(invalidemail);
	}

	@Then("Admin should not receive link in mail for reset username and password")
	public void admin_should_not_receive_link_in_mail_for_reset_username_and_password() {
		Loggerload.info("Invalid Credentials");
	}


}
