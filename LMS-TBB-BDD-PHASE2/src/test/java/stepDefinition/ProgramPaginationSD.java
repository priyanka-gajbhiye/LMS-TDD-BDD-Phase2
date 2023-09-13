package stepDefinition;

import Page_Factory.ProgramPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class ProgramPaginationSD {
	ProgramPage program=new ProgramPage();
	ExcelReader reader = new ExcelReader();
	
	@When(":Admin clicks Next page link on the program table")
	public void admin_clicks_next_page_link_on_the_program_table() {
	    program.nextPageDisplay();
	}

	@Then(":Admin should see the Pagination has {string} link")
	public void admin_should_see_the_pagination_has_link(String string) {
		boolean t=program.paginatordisplay();
		if(t==true)
			System.out.println("Paginator is Visible");
			else
				System.out.println("Not Visible");
	}

	@When(":Admin clicks Last page link")
	public void admin_clicks_last_page_link() {
	    program.PageDisplay();
	}

	@Then(":Admin should see the last page record on the table with Next page link are disabled")
	public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
	    program.pagesDisplay();
	}

	@Given(":Admin is on last page of Program table")
	public void admin_is_on_last_page_of_program_table() {
	    program.nextPageDisplay();
	}

	@When(":Admin clicks First page link")
	public void admin_clicks_first_page_link() {
	   program.PageDisplay();
	}

	@Then(":Admin should see the previous page record on the table with pagination has previous page link")
	public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link() {
		boolean t=program.paginatordisplay();
		if(t==true)
			System.out.println("Paginator is Visible");
			else
				System.out.println("Not Visible");
	}

	@Given(":Admin is on Previous Program page")
	public void admin_is_on_previous_program_page() {
	   program.leftArrowDisplay();
	}

	@When(":Admin clicks Start page link")
	public void admin_clicks_start_page_link() {
	   program.rightArrowDisplay();
	}

	@Then(":Admin should see the very first page record on the table with Previous page link are disabled")
	public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
	   program.pagesDisplay();
	}
}
