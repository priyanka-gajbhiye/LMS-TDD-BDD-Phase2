package Page_Factory;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;

public class AssignmentPage {

	public static WebDriver driver=BrowserManager.getdriver();
	String ManageAssignmentUrl=ConfigfileReader.getManageAssignmentUrl();
	
	@FindBy(xpath="//*[@class='btn btn-assignment']") WebElement assignment_btn;
	@FindBy(xpath="//*[text()='Manage Assignment']") WebElement header;
	@FindBy(xpath="//*[text()='LMS - Learning Management System']") WebElement navigation_header;
	@FindBy(xpath="//*[text()='Assignment Name']") WebElement assignment_name;
	@FindBy(xpath="//*[text()='Assignment Description']") WebElement assignment_description;
	@FindBy(xpath="//*[text()='Assignment Due Date']") WebElement assignment_due_date;
	@FindBy(xpath="//*[text()='Assignment Grade']") WebElement assignment_grade;
	@FindBy(xpath="//*[text()='Edit/Delete']") WebElement edit_delete;
	@FindBy (xpath="//button//span[text()=' Delete']") WebElement deleteMuti_btn;
	@FindBy(xpath="//*[@class='btn btn-search']") WebElement search_bar;
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

//	@FindBy(xpath="//*[@class='btn btn-next']") WebElement nextPage_btn;
//	@FindBy(xpath="//*[@class='btn btn-previous']") WebElement previousPage_btn;
//	@FindBy(xpath="//*[@class='btn btn-last-page']") WebElement lastPage_btn;
//	@FindBy(xpath="//*[@class='btn btn-first-page']") WebElement firstPage_btn;
//	@FindBy(xpath="//*[@class='btn btn-save']") WebElement save_btn;
//	@FindBy(xpath="//*[@class='btn btn-cancel']") WebElement cancel_btn;
//	@FindBy(xpath="//*[@class='btn btn-manage']") WebElement manage_btn;
//	@FindBy(xpath="//*[@class='btn btn-assignment-name']") WebElement assignmentName_btn;
//	@FindBy(xpath="//*[@class='btn btn-submit']") WebElement submit_btn;
//	@FindBy(xpath="//*[@class='btn btn-clear']") WebElement clear_btn;
//	@FindBy(xpath="//*[@href='swithc_account_link']") WebElement switchAccount_link;
//	@FindBy(xpath="//*[@class='btn btn-yes']") WebElement yes_btn;
//	@FindBy(xpath="//*[@class='btn btn-no']") WebElement no_btn;
//	@FindBy(xpath="//*[@class='btn btn-delete-on-right']") WebElement deleteOnRight_btn;
//	@FindBy(xpath="//*[@class='btn btn-delete-on-top-left']") WebElement deleteOnTopLeft_btn;
//	@FindBy (xpath="//*[@class='alert alert-primary']") WebElement message;
//	@FindBy (xpath="//*[contains(text(),'Manage Assignment')]") WebElement assignment_Form;
//	@FindBy (id="search_query_top") WebElement search_txt;
//	@FindBy (xpath="//*[contains(text(),'Delete Confirm')]") WebElement DeletConfirm_Box;
//	@FindBy (xpath="//table//thead//tr//th//input") WebElement SelectAll_checkbox;
//	@FindBy (xpath="//button//span[text()=' Delete']") WebElement deleteMuti_btn;
	
	
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
	
	public void footerdisplay() {
		
	}
	
	
//	public boolean assignmentForm(String text) {
//
//		return assignment_Form.isDisplayed();
//	}
//	
//	public void clickNextBtn() 
//	{
//		nextPage_btn.click();
//	}
//	
//	public void clickPreviousBtn() 
//	{
//		previousPage_btn.click();
//	}
//	
//	public void clickLastPageBtn() 
//	{
//		lastPage_btn.click();
//	}
//
//	public void clickFirstPageBtn() 
//	{
//		firstPage_btn.click();
//	}
//	
//	public void clickSearchBtn(String input) 
//	{
//		search_btn.sendKeys(input);	
//	}
//	
//	public void tableValue() {
//
//		int col = colums.size();
//		int row = Row.size();
//		for(int j=1;j<=col;j++) {			
//			for(int i=1;i<=row;i++)
//			{
//				System.out.println(String.valueOf(i));
//			}
//		}
//	}
//	
//	
//	
//	public void clickDueDateAscending() 
//	{
//		duedateAscending_btn.click();	
//	}
//	
//	public void clickGradeAscending() 
//	{
//		gradeAscending_btn.click();	
//	}
//	
//	public void clickNameDescending() 
//	{
//		nameDescending_btn.click();	
//	}
//	
//	public void clickDescriptionDescending() 
//	{
//		descriptionDescending_btn.click();	
//	}
//	
//	public void clickDueDateDescending() 
//	{
//		duedateDescending_btn.click();	
//	}
//	
//	public void clickGradeDescending() 
//	{
//		gradeDescending_btn.click();	
//	}
//	
//	public void clickAddNewAssignment() 
//	{
//		addNewAssignment_btn.click();	
//	}
//	
//	public void clickSave() 
//	{
//		save_btn.click();	
//	}
//	
//	public void clickCancel() 
//	{
//		cancel_btn.click();	
//	}
//	
//	public void clickManage() 
//	{
//		manage_btn.click();	
//	}
//	
//	public void clickEdit() 
//	{
//		edit_btn.click();	
//	}
//	
//	public void clickAssignmentName() 
//	{
//		assignmentName_btn.click();	
//	}
//	
//	public void clickAssignment() 
//	{
//		assignment_btn.click();	
//	}
//	
//	public void clickSubmit() 
//	{
//		submit_btn.click();	
//	}
//	
//	public void clickClear() 
//	{
//		clear_btn.click();	
//	}
//	
//	public void clickSwitchAccount() 
//	{
//		switchAccount_link.click();	
//	}
//	
//	public void clickDelete() 
//	{
//		delete_btn.click();	
//	}
//	
//	public void clickDeleteOnRight() 
//	{
//		deleteOnRight_btn.click();	
//	}
//	
//	public void clickYes() 
//	{
//		yes_btn.click();	
//	}
//	
//	public void clickNo() 
//	{
//		no_btn.click();	
//	}
//	
//	public void clickDeleteOnTopLeft() 
//	{
//		deleteOnTopLeft_btn.click();	
//	}
//	
//	public String Message(String expectedmsg) {
//		
//			return message.getText();
//	}
//
//	public String DeleteConfirmBox(String text) {
//		return DeletConfirm_Box.getText();
//	}
//
//	public boolean deleteMultiRowBtndisplay() {
//		return deleteMuti_btn.isEnabled();
//	}
//
//	public void clickCheckbox() {
//		checkbox.click();
//		
//	}
//
//	public void clickAllCheckbox() {
//		SelectAll_checkbox.click();	
//	}

}
