package stepDefinition;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;


import static org.testng.Assert.assertEquals;

import java.util.*;
import Page_Factory.BrowserManager;
import Page_Factory.ProgramPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.Loggerload;

public class ProgramSortSD {
	public static WebDriver driver=BrowserManager.getdriver();
	ProgramPage program=new ProgramPage();
	ExcelReader reader = new ExcelReader();
	
//	public List<String> DataTableDescendingSort() throws InterruptedException
//	{
//	 							
//	    List<WebElement> datatablerowelements = driver.findElements(DataTable);
//	      List<String> ProgramNameList = new ArrayList<>();
//	    for (WebElement row : datatablerowelements) {
//	        WebElement batchIDCell = row.findElement(ProgramName);
//	        String ProgramName = batchIDCell.getText();
//	        ProgramNameList.add(ProgramName);
//	    }
//
//	    List<String> tablesortedlist = new ArrayList<>(BatchIdList);
//	    Collections.sort(tablesortedlist, Collections.reverseOrder());
//				    
//     return tablesortedlist;
//    		 
//	}
// public List<String> BatchIdSortedList() throws InterruptedException
//	{
//	 							
//	    List<WebElement> datatablerowelements = driver.findElements(DataTable);
//	      List<String> BatchIdList = new ArrayList<>();
//	    for (WebElement row : datatablerowelements) {
//	        WebElement batchIDCell = row.findElement(BatchId);
//	        String batchID = batchIDCell.getText();
//	        BatchIdList.add(batchID);
//	    }
//
//	    	   				    
//     return BatchIdList ;
//    		 
//	}
// public List<String> DataTableAscendingSort() throws InterruptedException
//	{
//	 							
//	    List<WebElement> datatablerowelements = driver.findElements(DataTable);
//	      List<String> BatchIdList = new ArrayList<>();
//	    for (WebElement row : datatablerowelements) {
//	        WebElement batchIDCell = row.findElement(BatchId);
//	        String batchID = batchIDCell.getText();
//	        BatchIdList.add(batchID);
//	    }
//
//	    List<String> tablesortedlist = new ArrayList<>(BatchIdList);
//	    Collections.sort(tablesortedlist);
//				    
//     return tablesortedlist;
//    		 
//	}
	
	@Given(":Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {
	    program.ManageProgramUrl();
	}

	@When(":Admin clicks the sort icon of program name column")
	public void admin_clicks_the_sort_icon_of_program_name_column() {
	   program.sortIcondisplay();
	}

	@Then(":The data get sorted on the table based on the program name column values in ascending order")
	public List<String> the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_ascending_order()throws InterruptedException  {
		
		List<String> tablesortedlist = new ArrayList<>();
	    Collections.sort(tablesortedlist);
				    
     return tablesortedlist;
	}
	

	@Given(":The data is in the ascending order on the table based on Program Name column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_name_column(String result) {
		List<String> tempList = program.ascSorted();
		assertEquals(tempList, result);
		System.out.println("Data in ascending order.");
	}

	@Then(":The data get sorted on the table based on the program name column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_descending_order(String result) {
		program.descSorted(null);		
		System.out.println("Data is not in ascending alphabetical order.");	}

	@When(":Admin clicks the sort icon of program Desc column")
	public void admin_clicks_the_sort_icon_of_program_desc_column() {
	    program.sortIcondisplay();
	}

	@Then(":The data get sorted on the table based on the program description column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_ascending_order(String result) {
		List<String> tempList = program.ascSorted();
		assertEquals(tempList, result);
		System.out.println("Data in ascending order.");
	}

	@Given(":The data is in the ascending order on the table based on Program Description column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_description_column(String result) {
		List<String> tempList = program.ascSorted();
		assertEquals(tempList, result);
		System.out.println("Data in ascending order.");

	}

	@Then(":The data get sorted on the table based on the program description column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_descending_order() {
		program.descSorted(null);		
		System.out.println("Data is not in ascending alphabetical order.");	
	}

	@When(":Admin clicks the sort icon of program Status column")
	public void admin_clicks_the_sort_icon_of_program_status_column() {
		Loggerload.info("Sorted in Descending Order");
	    program.sortIcondisplay();
	}

	@Then(":The data get sorted on the table based on the program status column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_ascending_order(String result) {
		List<String> tempList = program.ascSorted();
		assertEquals(tempList, result);
		System.out.println("Data in ascending order.");
	}

	@Given(":The data is in the ascending order on the table based on Program Status column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_status_column(String result) {
		List<String> tempList = program.ascSorted();
		assertEquals(tempList, result);
		System.out.println("Data in ascending order.");
	}

	@Then(":The data get sorted on the table based on the program status column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_descending_order() {
		program.descSorted(null);		
		System.out.println("Data is not in ascending alphabetical order.");	
	}

}
