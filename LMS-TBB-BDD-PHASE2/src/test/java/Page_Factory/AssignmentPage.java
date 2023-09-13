package Page_Factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ConfigfileReader;

public class AssignmentPage {

	public static WebDriver driver=BrowserManager.getdriver();
	String ManageAssignmentUrl=ConfigfileReader.getManageAssignmentUrl();
	
	@FindBy(xpath="//*[@class='btn btn-assignment']") WebElement assignment_btn;
	@FindBy(xpath="//*[text()='Manage Assignment']") WebElement header;
	@FindBy(xpath="//*[text()='LMS - Learning Management System']") WebElement navigation_header;
	@FindBy(xpath="//*[text()='Program Name']") WebElement program_name;
	@FindBy(xpath="//*[text()='Batch Name']") WebElement batch_name;
	@FindBy(xpath="//*[text()='Assignment Name']") WebElement assignment_name;
	@FindBy(xpath="//*[text()='Assignment Description']") WebElement assignment_description;
	@FindBy(xpath="//*[text()='Assignment Due Date']") WebElement assignment_due_date;
	@FindBy(xpath="//*[text()='Assignment Grade']") WebElement assignment_grade;
	@FindBy(xpath="//*[text()='Grade By']") WebElement grade_by;
	@FindBy(xpath="//*[text()='Assignment File1']") WebElement assignment_file1;
	@FindBy(xpath="//*[text()='Assignment File2']") WebElement assignment_file2;
	@FindBy(xpath="//*[text()='Assignment File3']") WebElement assignment_file3;
	@FindBy(xpath="//*[text()='Assignment File4']") WebElement assignment_file4;
	@FindBy(xpath="//*[text()='Assignment File5']") WebElement assignment_file5;
	@FindBy(xpath="//*[text()='Edit/Delete']") WebElement edit_delete;
	@FindBy (xpath="//button//span[text()=' Delete']") WebElement deleteMuti_btn;
	@FindBy(xpath="//*[@class='btn bar-search']") WebElement search_bar;
	@FindBy(xpath="//*[@class='btn btn-add-new-assignment']") WebElement addNewAssignment_btn;
	@FindBy (xpath="//table//thead//tr//th//input") WebElement checkbox;
	@FindBy (xpath="//*[@id='content']/div[2]/div[2]/div[1]/table") WebElement data_table;
	@FindBy (xpath="//table/tbody/tr") List<WebElement> Rows;
	@FindBy (xpath="//table/tbody/td") List<WebElement> Columns;
	@FindBy(xpath="//*[@class='btn btn-edit']") WebElement edit_button;
	@FindBy(xpath="//*[@class='btn btn-delete']") WebElement row_delete_btn;
	@FindBy(xpath="//*[@class='btn btn-sort']") WebElement sort_btn;
	@FindBy (xpath="//table//thead//tr//th//input") WebElement row_checkbox_btn;
	@FindBy(xpath="//*[contains(text(),'Showing')]") WebElement footer;
	@FindBy(xpath="//*[@class='btn btn-next']") WebElement nextPage_btn;
	@FindBy(xpath="//*[@class='btn btn-previous']") WebElement previousPage_btn;
	@FindBy(xpath="//*[@class='btn btn-last-page']") WebElement lastPage_btn;
	@FindBy(xpath="//*[@class='btn btn-first-page']") WebElement firstPage_btn;
	@FindBy(xpath="//*[@id='page-navigator']/div") WebElement pagination_navigator;
	@FindBy(xpath="//*[@class='btn btn-search']") WebElement search_btn;
	@FindBy (xpath="//*[contains(text(),'Assignment Details')]") WebElement pop_up_header;
	@FindBy(xpath="//input[@type='text']") List<WebElement> text_boxes;
	@FindBy(xpath="//*[@id='batch-select-menu']") WebElement batch_dropdown;
	@FindBy(xpath="//*[@id='program-select-menu']") WebElement program_dropdown;
	@FindBy(xpath="//*[@id='datepicker']")  WebElement calender_icon;
	@FindBy(xpath="//*[@id='datepicker-left']")  WebElement calender_left;
	@FindBy(xpath="//*[@id='datepicker-right']")  WebElement calender_right;
	@FindBy(xpath="//*[@id='datepicker-month']")  WebElement calender_month;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//td)") List<WebElement> all_dates;
	@FindBy(xpath="//*[@class='btn btn-save']") WebElement save_btn;
	@FindBy(xpath="//*[@class='btn btn-cancel']") WebElement cancel_btn;
	@FindBy(xpath="//*[@class='btn btn-close']") WebElement close_btn;
	@FindBy (xpath="//*[@class='alert alert-message']") WebElement message;
	@FindBy (xpath="//*[@class='date-picker-highligted')]/div[@class='v-btn__content']") WebElement highligted_date;
	@FindBy (xpath="//*[contains(text(),'Delete Confirm')]") WebElement DeletConfirm_Box;
	@FindBy(xpath="//*[@class='btn btn-yes']") WebElement yes_btn;
	@FindBy(xpath="//*[@class='btn btn-no']") WebElement no_btn;	
	@FindBy(xpath="//*[@class='btn btn-student']") WebElement student_btn;
	@FindBy(xpath="//*[@class='btn btn-program']") WebElement program_btn;
	@FindBy(xpath="//*[@class='btn btn-batch']") WebElement batch_btn;
	@FindBy(xpath="//*[@class='btn btn-class']") WebElement class_btn;
	@FindBy(xpath="//*[@class='btn btn-user']") WebElement user_btn;
	@FindBy(xpath="//*[@class='btn btn-attendence']") WebElement attendence_btn;
	@FindBy(xpath="//*[@class='btn btn-logout']") WebElement logout_btn;

	
	//constructor
	public AssignmentPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickAssignmentPage() 
	{
		assignment_btn.click();	
	}
	
	public void ManageAssignmentUrl() {
		driver.get(ManageAssignmentUrl);
	}
	
	public void ResponseTime() {
		//capture time before load
		long start=System.currentTimeMillis();
		//URL launch
		driver.get(ManageAssignmentUrl);
		//capture time after load
		long end=System.currentTimeMillis();
		//calculate time
		long pageload_time=end-start;
		System.out.println("The Page Load time in milliseconds is: "+pageload_time);
	}
	
	public String Header() {	
		return header.getText();
	}
	
	public void getAllText() {
		driver.getPageSource();
	}
	
	public String spellcheck() {
		if(driver.getPageSource().contains(navigation_header.getText()))
			return navigation_header.getText();
		if(driver.getPageSource().contains(assignment_name.getText()))
			return assignment_name.getText();
		if(driver.getPageSource().contains(assignment_description.getText()))
			return assignment_description.getText();
		if(driver.getPageSource().contains(assignment_due_date.getText()))
			return assignment_due_date.getText();
		if(driver.getPageSource().contains(assignment_grade.getText()))
			return assignment_grade.getText();
		if(driver.getPageSource().contains(edit_delete.getText()))
			return edit_delete.getText();
		else 
			return "String not found";
		}
	
	public boolean deleteMultiRowBtndisplay() {
		return deleteMuti_btn.isDisplayed();
	}
		
	public boolean searchBardisplay() {
		return search_bar.isDisplayed();
	}
	
	public boolean newAssignmentBtndisplay() {
		return addNewAssignment_btn.isDisplayed();
	}
	
	public boolean dataTabledisplay() {
		if(data_table.isDisplayed())
			return data_table.isDisplayed();
		if(checkbox.isDisplayed())
			return checkbox.isDisplayed();
		if(assignment_name.isDisplayed())
			return assignment_name.isDisplayed();
		if(assignment_description.isDisplayed())
			return assignment_description.isDisplayed();
		if(assignment_due_date.isDisplayed())
			return assignment_due_date.isDisplayed();
		if(assignment_grade.isDisplayed())
			return assignment_grade.isDisplayed();
		if(edit_delete.isDisplayed())
			return edit_delete.isDisplayed();
		return false;
	}
	
	public void editRowdisplay() {
		int row = Rows.size();
		for(int i=0;i<row;i++) {	
			if(edit_button.isDisplayed())
				System.out.println("Edit Button is displayed for row "+(i+1));
				}
			}

	public void editRownotdisplay() {
		int row = Rows.size();	
		if(row==0)
			System.out.println("Edit Button is not displayed");
		}
	
	public void deleteRowdisplay() {
		int row = Rows.size();
		for(int i=0;i<row;i++) {	
			if(row_delete_btn.isDisplayed())
				System.out.println("Delete Button is displayed for row "+(i+1));
				}
			}

	public void deleteRownotdisplay() {
		int row = Rows.size();	
		if(row==0)
			System.out.println("Delete Button is not displayed");
		}
	
	
	public void sortIcondisplay() 
	{		
		int column = Columns.size();
		for(int i=0;i<column;i++) {	
			if(sort_btn.isDisplayed())
				System.out.println("Sort Button is displayed for cloumn "+(i+1));
				}
	}
	
	public void rowCheckboxdisplay() {
		int row = Rows.size();
		for(int i=0;i<row;i++) {	
			if(row_checkbox_btn.isDisplayed())
				System.out.println("Checkbox Button is displayed for row "+(i+1));
				}
			}
	
	public String footerText() {
		
			return footer.getText();
	}
	
	public boolean footerTextdisplay() {		
		return footer.isDisplayed();
	}

	public boolean paginatordisplay() {

		return pagination_navigator.isDisplayed();
	}
	
	public void textSearch(String string) 
	{
		search_btn.sendKeys(string);	
	}
	
	public boolean textSearchdisplayed() 
	{
		String searchText=search_btn.getText();
		 boolean rowExists = false;
		 
	        for (WebElement row : Rows) {
	            String rowText = row.getText();

	            if (rowText.contains(searchText)) {
	                rowExists = true;
	                break; // Break the loop when the row is found
	            }
	        }
			return rowExists;
	}
	
	public void newAssignmentBtnclick() {
		addNewAssignment_btn.click();
	}
	
	public String popUpHeader() {	
		return pop_up_header.getText();
	}
	
	public boolean inputFieldsdisplay(String field) {
		if(program_name.isDisplayed())
			return program_name.getText().equals(field);
		if(batch_name.isDisplayed())
			return batch_name.getText().equals(field);
		if(assignment_name.isDisplayed())
			return assignment_name.getText().equals(field);
		if(assignment_description.isDisplayed())
			return assignment_description.getText().equals(field);
		if(grade_by.isDisplayed())
			return grade_by.getText().equals(field);
		if(assignment_due_date.isDisplayed())
			return assignment_due_date.getText().equals(field);
		if(assignment_file1.isDisplayed())
			return assignment_file1.getText().equals(field);
		if(assignment_file2.isDisplayed())
			return assignment_file2.getText().equals(field);
		if(assignment_file3.isDisplayed())
			return assignment_file3.getText().equals(field);
		if(assignment_file4.isDisplayed())
			return assignment_file4.getText().equals(field);
		if(assignment_file5.isDisplayed())
			return assignment_file5.getText().equals(field);
		return false;	
	}
	
	public void textBoxNumbers(int i) {
		if(text_boxes.size()==i)
			System.out.println("There are "+i+" TextBoxes");
		else
			System.out.println("Error:Number of boxes don't match");
	}
	
	public boolean batchDropdowndisplay() {		
		return batch_dropdown.isDisplayed();
	}
	
	public boolean programDropdowndisplay() {		
		return program_dropdown.isDisplayed();
	}
	
	public boolean calenderIcondisplay() {		
		return calender_icon.isDisplayed();
	}
	
	public boolean SaveDisplay() 
	{
		return save_btn.isDisplayed();	
	}
	
	public boolean CancelDisplay() 
	{
		return cancel_btn.isDisplayed();
	}
	
	public boolean CloseDisplay() 
	{
		return close_btn.isDisplayed();
	}
	
	public void fillMandatoryFields(String ProgramName,String batchNumber,String AssignmentName,String gradeBy,String AssignmentDueDate){
		Select select1= new Select(program_dropdown);
		select1.selectByVisibleText(ProgramName);
		Select select2= new Select(batch_dropdown);
		select2.selectByVisibleText(batchNumber);
		assignment_name.sendKeys(AssignmentName);
		grade_by.sendKeys(gradeBy);
		assignment_due_date.sendKeys(AssignmentDueDate);
		addAssignmentDisplay(AssignmentName);
	}
	
	public void clickSave() 
	{
		save_btn.click();	
	}
	
	public void fillAllFields(String ProgramName,String batchNumber,String AssignmentName,String AssignmentDescription,String gradeBy,String AssignmentDueDate,String AssignmentFile1,String AssignmentFile2,String AssignmentFile3,String AssignmentFile4,String AssignmentFile5){
		Select select1= new Select(program_dropdown);
		select1.selectByVisibleText(ProgramName);
		Select select2= new Select(batch_dropdown);
		select2.selectByVisibleText(batchNumber);
		assignment_name.sendKeys(AssignmentName);
		assignment_description.sendKeys(AssignmentDescription);
		grade_by.sendKeys(gradeBy);
		assignment_due_date.sendKeys(AssignmentDueDate);
		assignment_file1.sendKeys(AssignmentFile1);
		assignment_file2.sendKeys(AssignmentFile2);
		assignment_file3.sendKeys(AssignmentFile3);
		assignment_file4.sendKeys(AssignmentFile4);
		assignment_file5.sendKeys(AssignmentFile5);
		addAssignmentDisplay(AssignmentName);
		//rowDeleted(AssignmentName);
	}
	
	public boolean addAssignmentDisplay(String AssignmentName) {
		boolean isFound=false;
		for(WebElement row:Rows) {
			if(row.getText().equals(AssignmentName))
					isFound=true;
			break;
		}
		return isFound;
		}
	
	public String Message() {
		
			return message.getText();
	} 
	
	public void selectDate() {
	for(WebElement ele:all_dates)
	{	
		String date=ele.getText();	
        // once admin selects date is 28 then click and break
		if(date.equalsIgnoreCase("28"))
		{
			ele.click();
			break;
		}
	}
	}
	
	public boolean dateDisplay() {
		return assignment_due_date.isDisplayed();
	}
	
	public void validDateFormat() {
		boolean isvalidFormat=assignment_due_date.getText().matches("([0-9]{2})/([0-9]{2})/([0-9]{4})");
	}
	
	
	public void clickRightArrowCalender() 
	{
		calender_right.click();
	}
	
	public void clickLeftArrowCalender() 
	{
		calender_left.click();
	}
	
	public void monthCalenderdisplay() 
	{
		calender_month.isDisplayed();
	}
		
	public void clickCalenderIcon(){ 
	
		calender_icon.click();
	}
	
	public void highligtedDatedisplay(){ 
			highligted_date.isDisplayed();
	}
	
	public void clickCancelBtn() 
	{
		cancel_btn.click();
	}
	
	public void clickEdit() 
	{
		edit_button.click();	
	}
	
	
	public void clickDeleteOnRight() 
	{
		row_delete_btn.click();	
	}
	
	public boolean deleteDialogBoxdisplay() 
	{
		return DeletConfirm_Box.isDisplayed();	
	}
	
	public String yesBtndisplay() 
	{
		if(yes_btn.isDisplayed())	
		return yes_btn.getText();
		return "Error";
	}
	
	public String noBtndisplay() 
	{
		if(no_btn.isDisplayed())
		return no_btn.getText();
		return "Error";
	}
	
	public void clickYes() 
	{
		yes_btn.click();	
	}
	
	public void clickNo() 
	{
		no_btn.click();	
	}
	
	
	public void clickCheckbox() {
		checkbox.click();
	}
	
	public boolean deleteMultiRowBtnEnabled() {
		return deleteMuti_btn.isEnabled();
	}
	
	
	public void clickSortDesc() 
	{
		sort_btn.click();	
	}
	
	public void clickSortAsc() 
	{
		sort_btn.click();
		sort_btn.click();	
	}
	
	public List<String> ascSorted() 
	{
    List<String> expectedData = new ArrayList<>();
    for (WebElement element : Rows) {
    	expectedData.add(element.getText());
    }    
    // Create a copy of the data for sorting
    List<String> sortedData = new ArrayList<>(expectedData);
    for(String s:expectedData)
    	sortedData.add(s);
    // Check if the data is in ascending order
    Collections.sort(sortedData);
    return sortedData;
	}

	public void descSorted(List<String> sortedData) 
	{	// Check if the data is in descending order
		sortedData.sort(Collections.reverseOrder());
	}
	
	public void rightArrowDisplay() 
	{
		boolean goNext = false;
		do {
		boolean paginationNext = nextPage_btn.isEnabled();
        goNext = paginationNext;
        if (paginationNext) {
            nextPage_btn.click();
        }
      } while (goNext);
	}	
	
	public void leftArrowDisplay() 
	{
		boolean goPrevious = false;
		do {
		boolean paginationNext = previousPage_btn.isEnabled();
        goPrevious = paginationNext;
        if (paginationNext) {
            previousPage_btn.click();
        }
           } while (goPrevious);
	}	
	
	public String pagesDisplay() {
		if(Rows.size()<=5)
			return firstPage_btn.getText();
		return "";
	   }

	public boolean nextPageDisplay() {
		for(int i=0;i<Rows.size();i+=5) {
            // If there are more than 5 rows, the "Next" button should be enabled
            if (nextPage_btn.isEnabled()) {
                System.out.println("Next button is enabled.");
                return true;
            } else {
                System.out.println("Next button is not enabled");
                return false;
            }
        }
		return false; 
	}
	
	public void clickButton(String string) {
		if(string=="Student")
			student_btn.click();
		if(string=="Program")
			program_btn.click();
		if(string=="Batch")
			batch_btn.click();
		if(string=="User")
			user_btn.click();
		if(string=="Class")
			class_btn.click();
		if(string=="Attendence")
			attendence_btn.click();
		if(string=="Logout")
			logout_btn.click();
		}


}

