package Page_Factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigfileReader;
import org.openqa.selenium.support.ui.Select;

public class ClassPage {
	

	public static WebDriver driver=BrowserManager.getdriver();
	String ManageClassUrl=ConfigfileReader.getManageClassUrl();

	@FindBy(xpath="//*[@class='btn btn-class']") WebElement class_btn;
    @FindBy(xpath="//*[text()='Manage Class']") WebElement header;
	@FindBy(xpath="//*[text()='LMS - Learning Management System']") WebElement navigation_header;
	@FindBy(xpath="//*[text()='Batch Id']") WebElement batch_id;
	@FindBy(xpath="//*[text()='Class No']") WebElement class_no;
	@FindBy(xpath="//*[text()='Class Date']") WebElement class_date;
	@FindBy(xpath="//*[text()='Class Topic']") WebElement class_topic;
	@FindBy(xpath="//*[text()='Staff Id']") WebElement staff_id;
	@FindBy(xpath="//*[text()='Description']") WebElement description;
	@FindBy(xpath="//*[text()='Comments']") WebElement comments;
	@FindBy(xpath="//*[text()='Notes']") WebElement notes;
	@FindBy(xpath="//*[text()='Recording']") WebElement recording;
	@FindBy(xpath="//*[text()='Edit/Delete']") WebElement edit_delete;
	@FindBy (xpath="//button//span[text()=' Delete']") WebElement deleteMuti_btn;
	@FindBy(xpath="//*[@class='btn btn-search']") WebElement search_bar;
	@FindBy(xpath="//*[@class='btn btn-add-new-class']") WebElement addNewclass_btn;
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
	@FindBy(xpath="//*[@id='staff-select-menu']") WebElement staff_dropdown;
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
	@FindBy(xpath="//*[@class='btn btn-assignment']") WebElement assignment_btn;
	@FindBy(xpath="//*[@class='btn btn-user']") WebElement user_btn;
	@FindBy(xpath="//*[@class='btn btn-attendence']") WebElement attendence_btn;
	@FindBy(xpath="//*[@class='btn btn-logout']") WebElement logout_btn;
	
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
	public ClassPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickClassPage() 
	{
		class_btn.click();	
	}
	
	public void ManageClassUrl() {
		driver.get(ManageClassUrl);
	}
	
	public void ResponseTime() {
		//capture time before load
		long start=System.currentTimeMillis();
		//URL launch
		driver.get(ManageClassUrl);
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
		String field2="Manage Class";
		String field3="Batch Id";
		String field4="Class No";
		String field5="Class Date";
		String field6="Class Topic";
		String field7="Staff Id";
		String field8="Description";
		String field9="Comments";
		String field10="Notes";
		String field11="Recording";
		String field12="Edit/Delete";



		driver.getPageSource();
	}

	public String spellcheck() {
		if(driver.getPageSource().contains(navigation_header.getText()))
			return navigation_header.getText();
		if(driver.getPageSource().contains(batch_id.getText()))
			return batch_id.getText();
		if(driver.getPageSource().contains(class_no.getText()))
			return class_no.getText();
		if(driver.getPageSource().contains(class_date.getText()))
			return class_date.getText();
		if(driver.getPageSource().contains(class_topic.getText()))
			return class_topic.getText();
		if(driver.getPageSource().contains(staff_id.getText()))
			return staff_id.getText();
		if(driver.getPageSource().contains(description.getText()))
			return description.getText();
		if(driver.getPageSource().contains(comments.getText()))
			return comments.getText();
		if(driver.getPageSource().contains(notes.getText()))
			return notes.getText();
		if(driver.getPageSource().contains(recording.getText()))
			return recording.getText();
		
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

	public boolean newclassBtndisplay() {
		return addNewclass_btn.isDisplayed();
	}

	public boolean dataTabledisplay() {
		if(data_table.isDisplayed())
			return data_table.isDisplayed();
		if(checkbox.isDisplayed())
			return checkbox.isDisplayed();
		if(batch_id.isDisplayed())
			return batch_id.isDisplayed();
		if(class_no.isDisplayed())
			return class_no.isDisplayed();
		if(class_date.isDisplayed())
			return class_date.isDisplayed();
		if(class_topic.isDisplayed())
			return class_topic.isDisplayed();
		if(staff_id.isDisplayed())
			return staff_id.isDisplayed();
		if(description.isDisplayed())
			return description.isDisplayed();
		if(comments.isDisplayed())
			return comments.isDisplayed();
		if(notes.isDisplayed())
			return notes.isDisplayed();
		if(recording.isDisplayed())
			return recording.isDisplayed();
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

//public void textSearch(String assignmentName) 
//{
//	search_btn.sendKeys(assignmentName);	
//}

public void textSearchdisplayed() 
{
	String text=search_btn.getText();
	String rowText=((WebElement) Rows).getText();
	text.compareTo(rowText);
	
}

public void newclassBtnclick() {
	addNewclass_btn.click();
}

public String popUpHeader() {	
	return pop_up_header.getText();
}

public boolean inputFieldsdisplay(String field) {
	if(batch_id.isDisplayed())
		return batch_id.getText().equals(field);
	if(class_no.isDisplayed())
		return class_no.getText().equals(field);
	if(class_date.isDisplayed())
		return class_date.getText().equals(field);
	if(class_topic.isDisplayed())
		return class_topic.getText().equals(field);
	if(staff_id.isDisplayed())
		return staff_id.getText().equals(field);
	if(description.isDisplayed())
		return description.getText().equals(field);
	if(comments.isDisplayed())
		return comments.getText().equals(field);
	if(notes.isDisplayed())
		return notes.getText().equals(field);
	if(recording.isDisplayed())
		return recording.getText().equals(field);
	
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

public boolean staffDropdowndisplay() {		
	return staff_dropdown.isDisplayed();
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

public void fillValidMandatoryFields(String BatchId,String ClassNumber,String ClassDate,String StaffId){
	Select select1= new Select(batch_dropdown);
	select1.selectByVisibleText(BatchId);
	class_no.sendKeys(ClassNumber);
	Select select2= new Select(staff_dropdown);
	select2.selectByVisibleText(StaffId);
	
	class_date.sendKeys(ClassDate);
	}

public void clickSave() 
{
	save_btn.click();	
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
	return class_date.isDisplayed();
}

public void validDateFormat() {
	boolean isvalidFormat=class_date.getText().matches("([0-9]{2})/([0-9]{2})/([0-9]{4})");
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
public void textSearch(String string) 
{
	search_btn.sendKeys(string);	
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
	
public void PageDisplay() 
{
	
}



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
///public boolean deleteMultiRowBtndisplay() {
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

	
