package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Page_Factory.BatchPage;
public class BatchAddSD {

	BatchPage batch=new BatchPage(); 
	ExcelReader reader = new ExcelReader();
	
	@Then(":Admin should see all the fields")
	public void admin_should_see_all_the_fields(String string) {
		boolean t=batch.inputFieldsdisplay(string);
		if(t==true)
			System.out.println("Field is Visible");
			else
				System.out.println("Not Visible");
	}
	   
	

	@Given(":Admin creates new Batch from {string} and {int}")
	public void admin_creates_new_batch_from_and(String string, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Book1.xlsx", "Batch");
		String BatchName=testData.get(int1).get("BatchName");
		batch.textSearch(BatchName);
	   
	}

	@When(":any of the fields have invalid values and click save")
	public void any_of_the_fields_have_invalid_values_and_click_save(String sheetName, Integer rowNumber) throws Exception, IOException  {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "Batch");
       
		
		String BatchName = testData.get(rowNumber).get("Batch Name");
        String BatchDescription = testData.get(rowNumber).get("Batch Description");
		String BatchStatus = testData.get(rowNumber).get("BatchStatus");
		String NoOfClasses = testData.get(rowNumber).get("NoOfClasses");
		String ProgramName = testData.get(rowNumber).get("ProgramName");
		
		batch.fillInvalidMandatoryFields( BatchName, BatchDescription, BatchStatus, NoOfClasses, ProgramName);
	    batch.clickSave();
	}
	

	@When(":Any of the mandatory fields are blank and click save")
	public void any_of_the_mandatory_fields_are_blank_and_click_save() {
		batch.clickSave();
	   
	}

	@When(":Fill in all the fields except description with valid values and click save")
	public void fill_in_all_the_fields_except_description_with_valid_values_and_click_save() {
		boolean t=batch.SaveDisplay();
	    if(t==true)
			System.out.println("save button is Visible");
			else
				System.out.println("Not Visible");
	   
	}

	@Then(":The newly added batch should be present in the data table in Manage Batch page")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page(String sheetName, Integer rowNumber) throws Exception, IOException  {
List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/TestData/Assignment.xlsx", "Batch");
		
String BatchName = testData.get(rowNumber).get("Batch Name");
String BatchDescription = testData.get(rowNumber).get("Batch Description");
String BatchStatus = testData.get(rowNumber).get("BatchStatus");
String NoOfClasses = testData.get(rowNumber).get("NoOfClasses");
String ProgramName = testData.get(rowNumber).get("ProgramName");

batch.fillInvalidMandatoryFields( BatchName, BatchDescription, BatchStatus, NoOfClasses, ProgramName);
batch.clickSave();
}

	@When(":Fill in all the fields with valid values and click save")
	public void fill_in_all_the_fields_with_valid_values_and_click_save() {
	   batch.clickSave();
	   
	}

	@Then(":Error message should appear")
	public void error_message_should_appear() {
		System.out.println("error message appear here"); 
	   
	}
}
