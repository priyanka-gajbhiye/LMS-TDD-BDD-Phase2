package stepDefinition;

import org.junit.Assert;
import utilities.ExcelReader;
import Page_Factory.BatchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchSD {

	BatchPage batch=new BatchPage(); 
	ExcelReader reader = new ExcelReader();
	
	@Given(":Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		
				} 

	@When(":Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string)throws InterruptedException {
		batch.clickBatchPage();
	    
	}

	@Then(":Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String string) {
	    batch.ManageBatchUrl();
	    
	}

	@Then(":Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String expected_text) {
		String actual_Msg = batch.BatchHeader();
		Assert.assertEquals(expected_text,actual_Msg);
		System.out.println("The header is "+actual_Msg);
	    
	}

	@Then(":Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		boolean t=batch.paginatordisplay();
		if(t==true)
			System.out.println("Paginator is Visible");
			else
				System.out.println("Not Visible");
	    
	}

	@Then(":Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
	    
		boolean t=batch.dataTabledisplay();
		if(t==true)
			System.out.println("Table and Headers are Visible");
			else
				System.out.println("Not Visible");
	}

	

	@Then(":Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
	   
	    
	}

	@Then(":Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
	    
	    
	}

	@Then(":Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
	    batch.rowCheckboxdisplay();
	    
	}

	@Then(":Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
	    
	    batch.editRowdisplay();
	}

	@Then(":Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
	    batch.deleteRowdisplay();
	    
	}

	@When(":Admin clicks {string} button")
	public void admin_clicks_button(String string) {
	    batch.clickBatchPage();
	    
	}

	@Then(":A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() {
		String actual_Msg = batch.popUpHeader();
		Assert.assertEquals("Batch Details",actual_Msg);
		System.out.println("The pop up window is open");
	}
	    
	}


