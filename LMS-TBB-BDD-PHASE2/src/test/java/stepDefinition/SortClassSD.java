package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import Page_Factory.ClassPage;




public class SortClassSD {
	ClassPage classmodule = new ClassPage(); 
	
	@Given("Admin is in Manage class page")
	public void admin_is_in_manage_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin click on Batch id column header to sort")
	public void admin_click_on_batch_id_column_header_to_sort() {
		 classmodule.clickSortDesc();
	}

	@Then("Admin should see data table sorted in descending order")
	public void admin_should_see_data_table_sorted_in_descending_order() {
		classmodule.descSorted(null);	
	}

	@When("Admin double click on Batch id column header to sort")
	public void admin_double_click_on_batch_id_column_header_to_sort() {
		classmodule.clickSortDesc();
	}

	
	@Then("Admin should see data table sorted in ascending  order")
	public void admin_should_see_data_table_sorted_in_ascending_order(String result) {
		List<String> tempList = classmodule.ascSorted();
		assertEquals(tempList, result);
		System.out.println("Data in ascending order.");
	}
	
	
	

}
