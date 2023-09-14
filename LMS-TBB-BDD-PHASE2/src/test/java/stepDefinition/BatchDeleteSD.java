package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

import org.junit.Assert;

import Page_Factory.BatchPage;
public class BatchDeleteSD {

	BatchPage batch=new BatchPage(); 
	ExcelReader reader = new ExcelReader();
	
	@Given(":The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() {
	    
	    
	}

	@When(":Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon() {
		 batch.DeleteBatch();
	    
	}

	@Then(":Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option() {
	    
	    batch.Yes_btn();
	    batch.No_btn();
	    
	}

	@Given(":Admin clicks the delete icon in Batch")
	public void admin_clicks_the_delete_icon_in_batch() {
	    
		 batch.DeleteBatch();
	}

	@When(":You click yes option")
	public void you_click_yes_option() {
	   
	batch.Yes_btn();
	    
	}

	@Then(":Batch deleted alert pops and batch is no more available in data table")
	public void batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table() {
		String actual_Msg = batch.popUpHeader();
		Assert.assertEquals("Batch Deleted",actual_Msg);
		System.out.println("Batch Deleted");
	    
	}

	@When(":you click No option")
	public void you_click_no_option() {
	    batch.No_btn();
	    
	}

	@Then(":Batch is still listed in data table")
	public void batch_is_still_listed_in_data_table() {
		boolean t=batch.dataTabledisplay();
		if(t==true)
			System.out.println("Table and Headers are Visible");
			else
				System.out.println("Not Visible");
	    
	}

}
