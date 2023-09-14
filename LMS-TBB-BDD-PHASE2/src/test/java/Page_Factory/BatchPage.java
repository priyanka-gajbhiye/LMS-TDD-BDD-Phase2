package Page_Factory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ConfigfileReader;
import utilities.Loggerload;


public class BatchPage {
	
	public static WebDriver driver=BrowserManager.getdriver();
	String ManageBatchUrl=ConfigfileReader.getManageBatchUrl();
    
    @FindBy(xpath="//button[@type='button'][text()='Batch']") WebElement Batch_btn;	
	@FindBy(xpath="//a[text()='ManageBatch']")WebElement Batchheader;
	@FindBy(xpath="//*[text()='LMS - Learning Management System']") WebElement navigation_header;
    @FindBy(xpath="//a[text()='DeleteAll']")WebElement DeleteAllBatch;
	@FindBy(xpath="//a[text()='Search']")WebElement SearchBatch;
    @FindBy(xpath="//button[@type='button'][text()='Add New']")WebElement AddNewBatch;	
    @FindBy(xpath="//a[text()='Batch Name']")WebElement BatchName;
    @FindBy(xpath="//a[text()='Batch Description']")WebElement BatchDescription;
    @FindBy(xpath="//a[text()='Batch Status']") WebElement BatchStatus;
    @FindBy(xpath="//a[text()='No Of Classes']")WebElement NoOfClasses;
    @FindBy(xpath="//a[text()='Program Name']")WebElement ProgramName;
	@FindBy (xpath="//table//thead//tr//th//input") WebElement Batchcheckbox;
    @FindBy(xpath="//a[text()='Edit']")WebElement EditBatch;
    @FindBy(xpath="//a[text()='Delete']")WebElement DeleteBatch;
    @FindBy(xpath= ".Program-details-popup input[type-'text']")WebElement BatchTextBox;
    @FindBy(xpath=" //a(batch= program-box dropdown-toggle']")WebElement ProgramNameDropDown;
    @FindBy(xpath="//button[@type=‘button'][text()='Save']") WebElement save_btn;
    @FindBy(xpath= "//button [@type= ‘button ' ] [text () = 'Cancel']") WebElement cancel_btn;
    @FindBy(xpath= "//button [@type= ‘button' ] [text () ='Close']")WebElement close_btn;
    @FindBy(xpath= "//input [@class='Name']")WebElement NameTextBox;		
    @FindBy(xpath= "//input [@class='Description']")WebElement DescriptionTextBox;	
    @FindBy(xpath= "//input [@class='ProgramName']")WebElement ProgramNameTextBox;
    @FindBy(xpath= "//input [@class='NoOfClasses']")WebElement NoOfClassesTextBox;
    @FindBy(xpath= "//input [@class='Active']")WebElement ActiveStatus;	
    @FindBy(xpath="//input [@class='InActive']")WebElement InActiveStatus;	
    @FindBy(xpath=".Confirm-popup input[type-'text']")WebElement ConfirmTextBox;
    @FindBy(xpath="//button [@type= ‘button' ] [text () ='Yes']") WebElement Yes_btn;
    @FindBy(xpath="//button [@type= ‘button' ] [text () ='No']") WebElement No_btn;
	@FindBy(xpath="//*[contains(text(),'Showing')]") WebElement Batchfooter;
	@FindBy(xpath="//*[@id='page-navigator']/div") WebElement pagination_navigator;
	@FindBy(xpath="//*[contains(text(),'Showing')]") WebElement footer;
	@FindBy(xpath="//*[@class='btn btn-search']") WebElement search_btn;
	@FindBy (xpath="//table/tbody/tr") List<WebElement> Rows;
	@FindBy (xpath="//table/tbody/td") List<WebElement> Columns;
	@FindBy (xpath="//*[contains(text(),'Batch Details')]") WebElement pop_up_header;
	@FindBy(xpath="//*[@id='program-select-menu']") WebElement program_dropdown;
	@FindBy (xpath="//*[@id='content']/div[2]/div[2]/div[1]/table") WebElement data_table;
	@FindBy(xpath="//*[@class='btn btn-edit']") WebElement edit_button;
	@FindBy(xpath="//*[@class='btn btn-delete']") WebElement row_delete_btn;
	@FindBy(xpath="//*[@class='btn btn-sort']") WebElement sort_btn;
	@FindBy (xpath="//table//thead//tr//th//input") WebElement row_checkbox_btn;
	
	public BatchPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickBatchPage() 
	{
		Batch_btn.click();
		
	}
	public void AddNewBatch() 
	{
		AddNewBatch.click();
		
	}
	public void ManageBatchUrl()
	{
		driver.get(ManageBatchUrl);
				
	}
	public void ResponseTime() {
		//capture time before load
		long start=System.currentTimeMillis();
		//URL launch
		driver.get(ManageBatchUrl);
		//capture time after load
		long end=System.currentTimeMillis();
		//calculate time
		long pageload_time=end-start;
		System.out.println("The Page Load time in milliseconds is: "+pageload_time);
	}
    public String BatchHeader() {
		
		return Batchheader.getText();
	}
    public void getAllText() {
		driver.getPageSource();
	}
	
	public String spellcheck() {
		if(driver.getPageSource().contains(navigation_header.getText()))
			return navigation_header.getText();
		if(driver.getPageSource().contains(BatchName.getText()))
			return BatchName.getText();
		if(driver.getPageSource().contains(BatchDescription.getText()))
			return BatchDescription.getText();
		if(driver.getPageSource().contains(BatchStatus.getText()))
			return BatchStatus.getText();
		if(driver.getPageSource().contains(NoOfClasses.getText()))
			return NoOfClasses.getText();
		if(driver.getPageSource().contains(ProgramName.getText()))
			return ProgramName.getText();
		if(driver.getPageSource().contains(EditBatch.getText()))
			return EditBatch.getText();
		if(driver.getPageSource().contains(DeleteBatch.getText()))
			return DeleteBatch.getText();
		else 
			return "String not found";
		}
	
	public boolean DeleteAllBatch_Display() 
	{
		return DeleteAllBatch.isDisplayed();
					
	}
	
	public boolean SearchBatchdisplay() 
	{
	return SearchBatch.isDisplayed();
	}
	public boolean AddNewBatchdisplay() 
	{
		return AddNewBatch.isDisplayed();
		
	}
	public void Yes_btn() 
	{
		Yes_btn.click();
		
	}
	public void No_btn() 
	{
		No_btn.click();
		
	}
	
	public boolean BatchTextBox() {
		if(BatchTextBox.isDisplayed())
			return BatchTextBox.isDisplayed();
		if(Batchcheckbox.isDisplayed())
			return Batchcheckbox.isDisplayed();
		if(BatchName.isDisplayed())
			return BatchName.isDisplayed();
		if(BatchDescription.isDisplayed())
			return BatchDescription.isDisplayed();
		if(BatchStatus.isDisplayed())
			return BatchStatus.isDisplayed();
		if(NoOfClasses.isDisplayed())
			return NoOfClasses.isDisplayed();
		if(ProgramName.isDisplayed())
			return ProgramName.isDisplayed();
		if(EditBatch.isDisplayed())
			return EditBatch.isDisplayed();
		if(DeleteBatch.isDisplayed())
			return DeleteBatch.isDisplayed();
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

public void textSearch(String BatchName) 
{
	search_btn.sendKeys(BatchName);	
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
public boolean programDropdowndisplay() {		
	return program_dropdown.isDisplayed();
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

public void fillValidMandatoryFields(String BatchName,String BatchDescription,String BatchStatus,int NoOfClasses,String ProgramName){
	Select select1= new Select(program_dropdown);
	select1.selectByVisibleText(ProgramName);
	
	
	
	}
public boolean dataTabledisplay() {
	if(data_table.isDisplayed())
		return data_table.isDisplayed();
	if(Batchcheckbox.isDisplayed())
		return Batchcheckbox.isDisplayed();
	if(BatchName.isDisplayed())
		return BatchName.isDisplayed();
	if(BatchDescription.isDisplayed())
		return BatchDescription.isDisplayed();
	if(BatchStatus.isDisplayed())
		return BatchStatus.isDisplayed();
	if(NoOfClasses.isDisplayed())
		return NoOfClasses.isDisplayed();
	if(ProgramName.isDisplayed())
		return ProgramName.isDisplayed();
	if(EditBatch.isDisplayed())
		return EditBatch.isDisplayed();
	if(DeleteBatch.isDisplayed())
		return DeleteBatch.isDisplayed();
	return false;
}

public void clickSave() 
{
	save_btn.click();	
}

public void fillInvalidMandatoryFields(String BatchName,String BatchDescription,String BatchStatus,String NoOfClasses,String ProgramName){
	Select select1= new Select(program_dropdown);
	select1.selectByVisibleText(ProgramName);
	
	
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
	if(BatchName.isDisplayed())
		return BatchName.getText().equals(field);
	if(BatchDescription.isDisplayed())
		return BatchDescription.getText().equals(field);
	if(BatchStatus.isDisplayed())
		return BatchStatus.getText().equals(field);
	if(NoOfClasses.isDisplayed())
		return NoOfClasses.getText().equals(field);
	if(ProgramName.isDisplayed())
		return ProgramName.getText().equals(field);
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
public void EditBatch() {
	EditBatch.click();
	
}
public void DeleteBatch() {
	DeleteBatch.click();
	
}
	}

