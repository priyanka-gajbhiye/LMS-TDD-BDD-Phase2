package stepDefinition;



import Page_Factory.BatchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader; 

public class BatchDeleteMultiSD {

	BatchPage batch=new BatchPage(); 
	ExcelReader reader = new ExcelReader();
	
	@Given(":None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() {
    batch.textcheck();
	    
	}

	@Then(":The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled(String string) {
     batch.BatchHeader();
	    
	}

	@Given(": One of the checkbox\\/row is selected")
	public void one_of_the_checkbox_row_is_selected() {
    batch.rowCheckboxdisplay();
	    
	}

	@When(":Click delete icon below {string} header")
	public void click_delete_icon_below_header(String string) {
		 batch.DeleteBatch();
	    
	}

	@Then(":The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted() {
		System.out.println("Batch Deleted");
	    
	}

	@Given(":Two or more checkboxes\\/row is selected")
	public void two_or_more_checkboxes_row_is_selected() {
		batch.rowCheckboxdisplay();
	}
	    
}
