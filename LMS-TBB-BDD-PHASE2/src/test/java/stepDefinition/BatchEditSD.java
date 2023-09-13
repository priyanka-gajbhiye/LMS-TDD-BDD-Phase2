package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Page_Factory.BatchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class BatchEditSD {
	BatchPage batch=new BatchPage(); 
	ExcelReader reader = new ExcelReader();
	
	@Given(":The edit icon on row level in data table is enabled")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When(":Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
	    batch.EditBatch();
	}

	@Given(":Admin Edit new Batch from {string} and {int}")
	public void admin_edit_new_batch_from_and(String string, Integer int1)throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Book1.xlsx", "BatchEdit");
		String BatchName=testData.get(int1).get("BatchName");
		batch.textSearch(BatchName);
	   
	}

	@When(":Update the fields with valid values and click save")
	public void update_the_fields_with_valid_values_and_click_save() {
		batch.clickSave();
	}

	@Then(":The updated batch details should appear on the data table")
	public void the_updated_batch_details_should_appear_on_the_data_table(String string) {
	    boolean t=batch.inputFieldsdisplay(string);
		if(t==true)
			System.out.println("Field is Visible");
			else
				System.out.println("Not Visible");
	}
	

	@When(":Update the fields with invalid values and click save")
	public void update_the_fields_with_invalid_values_and_click_save(String sheetName, Integer rowNumber) throws Exception, IOException{
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "BatchEdit");
       
		
		String BatchName = testData.get(rowNumber).get("Batch Name");
        String BatchDescription = testData.get(rowNumber).get("Batch Description");
		String BatchStatus = testData.get(rowNumber).get("BatchStatus");
		String NoOfClasses = testData.get(rowNumber).get("NoOfClasses");
		String ProgramName = testData.get(rowNumber).get("ProgramName");
		
		batch.fillInvalidMandatoryFields( BatchName, BatchDescription, BatchStatus, NoOfClasses, ProgramName);
	    batch.clickSave();
	}

	@When(":Erase data from mandatory field")
	public void erase_data_from_mandatory_field() {
	    
	}

	@When(":Erase data from description field")
	public void erase_data_from_description_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
