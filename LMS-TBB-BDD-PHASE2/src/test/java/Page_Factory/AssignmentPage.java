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
	@FindBy (xpath="//*[@class='alert alert-primary']") WebElement header;
	
//	@FindBy(xpath="//*[@class='btn btn-next']") WebElement nextPage_btn;
//	@FindBy(xpath="//*[@class='btn btn-previous']") WebElement previousPage_btn;
//	@FindBy(xpath="//*[@class='btn btn-last-page']") WebElement lastPage_btn;
//	@FindBy(xpath="//*[@class='btn btn-first-page']") WebElement firstPage_btn;
//	@FindBy(xpath="//*[@class='btn btn-search']") WebElement search_btn;
//	@FindBy(xpath="//*[@class='btn btn-name-asc']") WebElement nameAscending_btn;
//	@FindBy(xpath="//*[@class='btn btn-description-asc']") WebElement descriptionAscending_btn;
//	@FindBy(xpath="//*[@class='btn btn-duedate-asc']") WebElement duedateAscending_btn;
//	@FindBy(xpath="//*[@class='btn btn-grade-asc']") WebElement gradeAscending_btn;
//	@FindBy(xpath="//*[@class='btn btn-name-desc']") WebElement nameDescending_btn;
//	@FindBy(xpath="//*[@class='btn btn-description-desc']") WebElement descriptionDescending_btn;
//	@FindBy(xpath="//*[@class='btn btn-duedate-desc']") WebElement duedateDescending_btn;
//	@FindBy(xpath="//*[@class='btn btn-grade-desc']") WebElement gradeDescending_btn;
//	@FindBy(xpath="//*[@class='btn btn-add-new-assignment']") WebElement addNewAssignment_btn;
//	@FindBy(xpath="//*[@class='btn btn-save']") WebElement save_btn;
//	@FindBy(xpath="//*[@class='btn btn-cancel']") WebElement cancel_btn;
//	@FindBy(xpath="//*[@class='btn btn-manage']") WebElement manage_btn;
//	@FindBy(xpath="//*[@class='btn btn-edit']") WebElement edit_btn;
//	@FindBy(xpath="//*[@class='btn btn-assignment-name']") WebElement assignmentName_btn;
//	@FindBy(xpath="//*[@class='btn btn-submit']") WebElement submit_btn;
//	@FindBy(xpath="//*[@class='btn btn-clear']") WebElement clear_btn;
//	@FindBy(xpath="//*[@href='swithc_account_link']") WebElement switchAccount_link;
//	@FindBy(xpath="//*[@class='btn btn-delete']") WebElement delete_btn;
//	@FindBy(xpath="//*[@class='btn btn-yes']") WebElement yes_btn;
//	@FindBy(xpath="//*[@class='btn btn-no']") WebElement no_btn;
//	@FindBy(xpath="//*[@class='btn btn-delete-on-right']") WebElement deleteOnRight_btn;
//	@FindBy(xpath="//*[@class='btn btn-delete-on-top-left']") WebElement deleteOnTopLeft_btn;
//	@FindBy (xpath="//*[@class='alert alert-primary']") WebElement message;
//	@FindBy (xpath="//*[contains(text(),'Manage Assignment')]") WebElement assignment_Form;
//	@FindBy (id="search_query_top") WebElement search_txt;
//	@FindBy (xpath="//table/tbody/tr") List<WebElement> Row;
//	@FindBy (tagName=("td")) List<WebElement> colums;
//	@FindBy (xpath="//*[contains(text(),'Delete Confirm')]") WebElement DeletConfirm_Box;
//	@FindBy (xpath="//table//thead//tr//th//input") WebElement SelectAll_checkbox;
//	@FindBy (xpath="//table//thead//tr//th//input") WebElement checkbox;
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
		String field1="LMS - Learning Management System";
		String field2="Manage Assignment";
		String field3="Assignment Name";
		String field4="Assignment description";
		String field5="Assignment Due Date";
		String field6="Assignment Grade";
		String field7="Edit/Delete";
		
		

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
//	public void clickNameAscending() 
//	{
//		nameAscending_btn.click();	
//	}
//	
//	public void clickDescriptionAscending() 
//	{
//		descriptionAscending_btn.click();	
//	}
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
