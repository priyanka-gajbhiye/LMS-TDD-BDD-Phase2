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

public class LoginPageCredentialsSD {
	
	HomePage hp = new HomePage();
	ExcelReader reader = new ExcelReader();
	
	@Given("Admin is on login Page")
	public void admin_is_on_login_page() {
	    hp.url();
	}

	@When("Admin enter valid credentials from excel sheet {string} and {int}")
	public void admin_enter_valid_credentials_from_excel_sheet_(String Login, int int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String user=testData.get(int1).get("User");
		String password=testData.get(int1).get("Password");
		hp.validuser(user);
		hp.validpassword(password);
		hp.logincheck();
	}

	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() {
		Loggerload.info("Login is successful with valid credential");
	}

	@When("Admin enter invalid credentials from excel sheet {string} and {int}")
	public void admin_enter_invalid_credentials_from_excel_sheet_(String Login, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String user=testData.get(int1).get("User");
		String password=testData.get(int1).get("Password");
		hp.invalidlogin(user, password);
	}

	@Then("Error message please check username\\/password")
	public void error_message_please_check_username_password() {
	    Loggerload.info("Please check username/password");
	}

	@When("Admin enter valid username from excel sheet {string} and {int}")
	public void admin_enter_valid_username_from_excel_sheet_(String Login, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String user=testData.get(int1).get("User");
		String password=testData.get(int1).get("Password");
	    hp.validuser(user);
	    hp.validpassword(password);;
	    hp.logincheck();
	}

	@Then("Error message please check password")
	public void error_message_please_check_password() {
		Loggerload.info("Please check password ");
	}

	@When("Admin enter valid  password from excel sheet {string} and {int}")
	public void admin_enter_valid_password_from_excel_sheet_(String Login, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String user=testData.get(int1).get("User");
		String password=testData.get(int1).get("Password");
		hp.validuser(user);
		hp.validpassword(password);
		hp.logincheck();
	}

	@Then("Error message please check username")
	public void error_message_please_check_username() {
		Loggerload.info("Please check user ");
	}

	@When("Admin enter blank in username from excel sheet {string} and {int}")
	public void admin_enter_blank_in_username_from_excel_sheet_(String Login, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String password=testData.get(int1).get("Password");
		hp.validpassword(password);
	    hp.logincheck();
	}
	
	@Then("Error message please check username or password")
	public void Error_message_please_check_username_or_password() {
		Loggerload.info("Please check user and password ");
	}
	
	@When("Admin enter blank in password from excel sheet {string} and {int}")
	public void admin_enter_blank_in_password_from_excel_sheet_(String Login, Integer int1) throws InvalidFormatException, IOException{
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String user=testData.get(int1).get("User");
		hp.validuser(user);
	    hp.logincheck();
	}
	
	@Then("Error message please check username also password")
	public void Error_message_please_check_username_also_password() {
		Loggerload.info("Please check user and password");
	}
	
	
	@When("Admin clicks Login button with empty values in both columns")
	public void admin_clicks_login_button_with_empty_values_in_both_columns() {
	    hp.logincheck();
	}
	
    @Then("Error message please check username and password")
    public void Error_message_please_check_username_and_password() {
    	Loggerload.info("Please check user ");
     }

	@When("Admin enter valid credentials and click through keyboard from excel sheet {string} and {int}")
	public void admin_enter_valid_credentials_and_click_through_keyboard_from_excel_sheet_(String Login, Integer int1) throws InvalidFormatException, IOException{
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String user=testData.get(int1).get("User");
		String password=testData.get(int1).get("Password");
		hp.validuser(user);
		hp.validpassword(password);
		hp.keyboardaction();
	}
	
	@Then("Admin should land dashboard page")
	public void admin_should_land_dashboard_page() {
		Loggerload.info("Login is successful");
	}


	@When("Admin enter valid credentials and click through mouse from excel sheet {string} and {int}")
	public void admin_enter_valid_credentials_and_clickthrough_mouse_from_excel_sheet_(String Login, Integer int1) throws InvalidFormatException, IOException{
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String user=testData.get(int1).get("User");
		String password=testData.get(int1).get("Password");
		hp.validuser(user);
		hp.validpassword(password);
		hp.mouseaction();
	}
	
	@Then("Admin land on dashboard page")
	public void admin_land_on_dashboard_page() {
		Loggerload.info("Login is successful");
	}



}
