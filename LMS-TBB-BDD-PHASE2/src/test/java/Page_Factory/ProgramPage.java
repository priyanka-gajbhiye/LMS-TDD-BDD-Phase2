package Page_Factory;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;
import utilities.Loggerload;
import java.util.ArrayList;

public class ProgramPage {


	public static WebDriver driver=BrowserManager.getdriver();
	String ManageProgramUrl=ConfigfileReader.getManageProgramUrl();
	
	@FindBy(xpath="//button[@type='button'][text()='Program']") WebElement Program_btn;	
	@FindBy(xpath="//a[text()='ManageProgram']")WebElement Programheader;
	@FindBy(xpath="//*[text()='LMS - Learning Management System']") WebElement navigation_header;
    @FindBy(xpath="//a[text()='DeleteAll']")WebElement DeleteAllProgram;
	@FindBy(xpath="//a[text()='Search']")WebElement SearchProgram;
    @FindBy(xpath="//button[@type='button'][text()='Add New']")WebElement AddNewProgram;	
    @FindBy(xpath="//a[text()='Program Name']")WebElement ProgramName;
    @FindBy(xpath="//a[text()='Program Description']")WebElement ProgramDescription;
    @FindBy(xpath="//a[text()='Program Status']") WebElement ProgramStatus;
	@FindBy (xpath="//table//thead//tr//th//input") WebElement Programcheckbox;
    @FindBy(xpath="//a[text()='Edit']")WebElement EditProgram;
    @FindBy(xpath="//a[text()='Delete']")WebElement DeleteProgram;
    @FindBy(xpath= ".Program-details-popup input[type-'text']")WebElement ProgramTextBox;
    @FindBy(xpath="//button[@type=‘button'][text()='Save']") WebElement save_btn;
    @FindBy(xpath= "//button [@type= ‘button ' ] [text () = 'Cancel']") WebElement cancel_btn;
    @FindBy(xpath= "//button [@type= ‘button' ] [text () ='Close']")WebElement close_btn;
    @FindBy(xpath= "//input [@class='Name']")WebElement NameTextBox;		
    @FindBy(xpath= "//input [@class='Description']")WebElement DescriptionTextBox;		
    @FindBy(xpath= "//input [@class='Active']")WebElement ActiveStatus;	
    @FindBy(xpath="//input [@class='InActive']")WebElement InActiveStatus;	
    @FindBy(xpath=".Confirm-popup input[type-'text']")WebElement ConfirmTextBox;
    @FindBy(xpath="//button [@type= ‘button' ] [text () ='Yes']") WebElement Yes_btn;
    @FindBy(xpath="//button [@type= ‘button' ] [text () ='No']") WebElement No_btn;
	@FindBy(xpath="//*[contains(text(),'Showing')]") WebElement Programfooter;
	@FindBy(xpath="//*[@id='page-navigator']/div") WebElement pagination_navigator;
	@FindBy(xpath="//*[contains(text(),'Showing')]") WebElement footer;
	@FindBy(xpath="//*[@class='btn btn-search']") WebElement search_btn;
	@FindBy (xpath="//table/tbody/tr") List<WebElement> Rows;
	@FindBy (xpath="//table/tbody/td") List<WebElement> Columns;
	@FindBy (xpath="//*[contains(text(),'Program Details')]") WebElement pop_up_header;
	@FindBy(xpath="//*[@id='program-select-menu']") WebElement program_dropdown;
	@FindBy (xpath="//*[@id='content']/div[2]/div[2]/div[1]/table") WebElement data_table;
	@FindBy(xpath="//*[@class='btn btn-edit']") WebElement edit_button;
	@FindBy(xpath="//*[@class='btn btn-delete']") WebElement row_delete_btn;
	@FindBy(xpath="//*[@class='btn btn-sort']") WebElement sort_btn;
	@FindBy (xpath="//table//thead//tr//th//input") WebElement row_checkbox_btn;
	@FindBy(xpath="//*[@class='btn btn-user']") WebElement nextPage_btn;
	@FindBy(xpath="//*[@class='btn btn-previous']") WebElement previousPage_btn;
	@FindBy(xpath="//*[@class='btn btn-last-page']") WebElement lastPage_btn;
	@FindBy(xpath="//*[@class='btn btn-first-page']") WebElement firstPage_btn;
	@FindBy(xpath="//*[@class='btn btn-asce']") WebElement DataTableAscendingSort;
	@FindBy(xpath="//*[@class='btn btn-desc']") WebElement DataTableDescendingSort;
	@FindBy(xpath="//*[@class='btn btn-sort']") WebElement ProgramSortedList;
	@FindBy(xpath="//table//thead//tr//th//user") WebElement user;
	@FindBy(xpath="//table//thead//tr//th//input") WebElement assignment;
	@FindBy(xpath="//table//thead//tr//th//input") WebElement attendence;
	@FindBy(xpath="//table//thead//tr//th//input") WebElement logout;
	@FindBy(xpath="//*[@class='btn btn-student']") WebElement student_btn;
	@FindBy(xpath="//*[@class='btn btn-program']") WebElement program_btn;
	@FindBy(xpath="//*[@class='btn btn-batch']") WebElement batch_btn;
	@FindBy(xpath="//*[@class='btn btn-class']") WebElement class_btn;
	@FindBy(xpath="//*[@class='btn btn-user']") WebElement user_btn;
	@FindBy(xpath="//*[@class='btn btn-attendence']") WebElement attendence_btn;
	
	public ProgramPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickProgramPage() 
	{
		Program_btn.click();
		
	}
	public void AddNewProgram() 
	{
		AddNewProgram.click();
		
	}
	public void ManageProgramUrl()
	{
		driver.get(ManageProgramUrl);
				
	}
	public void ResponseTime() {
		//capture time before load
		long start=System.currentTimeMillis();
		//URL launch
		driver.get(ManageProgramUrl);
		//capture time after load
		long end=System.currentTimeMillis();
		//calculate time
		long pageload_time=end-start;
		System.out.println("The Page Load time in milliseconds is: "+pageload_time);
	}
    public String ProgramHeader() {
		
		return Programheader.getText();
	}
    public void getAllText() {
		driver.getPageSource();
	}
	
	public String spellcheck() {
		if(driver.getPageSource().contains(navigation_header.getText()))
			return navigation_header.getText();
		if(driver.getPageSource().contains(ProgramName.getText()))
			return ProgramName.getText();
		if(driver.getPageSource().contains(ProgramDescription.getText()))
			return ProgramDescription.getText();
		if(driver.getPageSource().contains(ProgramStatus.getText()))
			return ProgramStatus.getText();
		if(driver.getPageSource().contains(EditProgram.getText()))
			return EditProgram.getText();
		if(driver.getPageSource().contains(DeleteProgram.getText()))
			return DeleteProgram.getText();
		else 
			return "String not found";
		}
	
	public boolean DeleteAllProgram_Display() 
	{
		return DeleteAllProgram.isDisplayed();
					
	}
	
	public boolean SearchProgramdisplay() 
	{
	return SearchProgram.isDisplayed();
	}
	public boolean AddNewProgramdisplay() 
	{
		return AddNewProgram.isDisplayed();
		
	}
	public void Yes_btn() 
	{
		Yes_btn.click();
		
	}
	public void No_btn() 
	{
		No_btn.click();
		
	}
	
	public boolean ProgramTextBox() {
		if(ProgramTextBox.isDisplayed())
			return ProgramTextBox.isDisplayed();
		if(Programcheckbox.isDisplayed())
			return Programcheckbox.isDisplayed();
		if(ProgramName.isDisplayed())
			return ProgramName.isDisplayed();
		if(ProgramDescription.isDisplayed())
			return ProgramDescription.isDisplayed();
		if(ProgramStatus.isDisplayed())
			return ProgramStatus.isDisplayed();
		if(EditProgram.isDisplayed())
			return EditProgram.isDisplayed();
		if(DeleteProgram.isDisplayed())
			return DeleteProgram.isDisplayed();
		return false;
	}
	
	public void textcheck() {
		List<WebElement> textfields = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		int size = textfields.size();
		if(size==2) {
			Loggerload.info("2 text feilds are present");
		}
		else {
			Loggerload.info("text feilds are not 2");
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

public void textSearch(String ProgramName) 
{
	search_btn.sendKeys(ProgramName);	
}

public void textSearchdisplayed() 
{
	String text=search_btn.getText();
	String rowText=((WebElement) Rows).getText();
	text.compareTo(rowText);
	
}
public String popUpHeader() {	
	return pop_up_header.getText();
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

public void fillValidMandatoryFields(String ProgramName,String ProgramDescription,String ProgramStatus){
	
	
	}
public boolean dataTabledisplay() {
	if(data_table.isDisplayed())
		return data_table.isDisplayed();
	if(Programcheckbox.isDisplayed())
		return Programcheckbox.isDisplayed();
	if(ProgramName.isDisplayed())
		return ProgramName.isDisplayed();
	if(ProgramDescription.isDisplayed())
		return ProgramDescription.isDisplayed();
	if(ProgramStatus.isDisplayed())
		return ProgramStatus.isDisplayed();
	if(EditProgram.isDisplayed())
		return EditProgram.isDisplayed();
	if(DeleteProgram.isDisplayed())
		return DeleteProgram.isDisplayed();
	return false;
}

public void clickSave() 
{
	save_btn.click();	
}

public void fillInvalidMandatoryFields(String ProgramName,String ProgramDescription,String ProgramStatus){
	
	
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
public boolean inputFieldsdisplay(String field) {
	if(ProgramName.isDisplayed())
		return ProgramName.getText().equals(field);
	if(ProgramDescription.isDisplayed())
		return ProgramDescription.getText().equals(field);
	if(ProgramStatus.isDisplayed())
		return ProgramStatus.getText().equals(field);
	
	return false;	

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
public void EditProgram() {
	EditProgram.click();
	
}
public void DeleteProgram() {
	DeleteProgram.click();
	
}
public void ConfirmTextBox() {
	ConfirmTextBox.click();
	
}
public List<String> DataTableAscendingSort() {
	DataTableAscendingSort.click();
	return(null);
	
}
	
public void DataTableDescendingSort()
{
	DataTableDescendingSort.click();
}
public void ProgramSortedList() {
	ProgramSortedList.click();
}
public void clickuser() {
	
	user.click();
	
}
public void clickassignment() {
	assignment.click();
	
}
public void clickattendence() {
	attendence.click();
	
}
public void clicklogout() {
	logout.click();
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
		attendence.click();
	if(string=="Logout")
		logout.click();
	}
	
public void PageDisplay() 
{
	
}
public boolean AddNewProgramdisplay(String string) {
	
	return false;
}




}
