package stepDefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Page_Factory.DashBoard;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.Loggerload;

public class LogOutSD {
	
	ExcelReader reader = new ExcelReader();
	DashBoard db = new DashBoard();

	@Given("Admin is in dashboard page")
	public void admin_is_in_dashboard_page() throws InvalidFormatException, IOException {
		db.url();
		db.validcredentials();
		db.logincheck();
	}

	@When("Admin click Logout button on navigation bar")
	public void admin_click_logout_button_on_navigation_bar() {
	    db.logout();
	}

	@Then("Admin should land on login in page")
	public void admin_should_land_on_login_in_page() {
	    Loggerload.info("Admin is on login page");
	}
}
