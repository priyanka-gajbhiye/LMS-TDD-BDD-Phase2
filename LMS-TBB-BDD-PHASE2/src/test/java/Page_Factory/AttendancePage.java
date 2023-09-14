package Page_Factory;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import org.apache.log4j.Logger;
import utilities.*;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigfileReader;
import org.openqa.selenium.support.Color;


public class AttendancePage
			{

				public static WebDriver driver=BrowserManager.getdriver();
				
				 String invalid_Attendanceurl=ConfigfileReader.getInvalidUrl();
				 HttpURLConnection huc = null;
			     int respCode = 200;
			     Actions act = new Actions(driver);
			     String url=ConfigfileReader.getApplicationUrl();
				 String LinkURL = "";
				 
			     
				String ManageAttendanceUrl=ConfigfileReader.getManageAttendanceUrl();
				 @FindBy (xpath  = "//icon") WebElement logoimage ;
				 @FindBy (xpath  = "//a[text()='Customers']") WebElement learningtext ;	
				 @FindBy (xpath  = "//a[text()='Management']") WebElement managementtext ;
				 @FindBy (xpath  = "//a[text()='Systems']") WebElement systemtext;
				
				@FindBy(xpath="//*[text()='LMS - Learning Management System']") WebElement navigation_header;
				@FindBy(xpath="//*[text()='Class ID']") WebElement ClassID;
				@FindBy(xpath="//*[text()='Student ID']") WebElement StudentID;
				@FindBy(xpath="//*[text()='Present']") WebElement Present;
				@FindBy(xpath="//*[text()='Edit/Delete']") WebElement edit_delete;
				@FindBy (xpath="//button//span[text()=' Delete']") WebElement deleteMulti_btn;
				@FindBy(xpath="//*[@class='btn bar-search']") WebElement search_bar;
				@FindBy(xpath="//*[@class='btn btn-attendance']") WebElement attendancebtn;
				@FindBy (xpath="//*[@class='bg-secondary text-white']") WebElement header;
				
				@FindBy (xpath  = "//a[text()='+ A New Attendance']") WebElement AddNewAttendancetxt ;
				@FindBy(xpath="//*[@class='btn btn-classid-asc']") WebElement ClassidAscendingbtn;
				@FindBy(xpath="//*[@class='btn btn-studentid-asc']") WebElement StudentidAscendingbtn;
				@FindBy(xpath="//*[@class='btn btn-present-asc']") WebElement PresentAscendingbtn;
				@FindBy(xpath="//*[@class='btn btn-classid-desc']") WebElement ClassidDescendingbtn;
				@FindBy(xpath="//*[@class='btn btn-studentid-desc']") WebElement StudentidDescendingbtn;
				@FindBy(xpath="//*[@class='btn btn-present-desc']") WebElement PresentDescendingbtn;
				@FindBy(xpath="//*[@class='btn btn-add-new-attendance']") WebElement addNewAttendancebtn;
				@FindBy(xpath="//*[@class='btn btn-delete']") WebElement Deletebtn;
				@FindBy(xpath="//*[@class='btn btn-edit']") WebElement Editbtn;
				@FindBy(xpath="//*[@class='nav-input nav-progressive-attribute-search']") WebElement SearchBtn;
				@FindBy(xpath="//*[@class='s-pagination-item s-pagination-NxtPage']") WebElement nextPage_btn;
				@FindBy(xpath="//*[@class='s-pagination-item s-pagination-previous']") WebElement previousPage_btn;
				@FindBy(xpath="//*[@class='s-pagination-item s-pagination-last-page']") WebElement lastPage_btn;
				@FindBy(xpath="//*[@class='s-pagination-item s-pagination-first-page']") WebElement firstPage_btn;
				@FindBy(xpath="//*[@class='btn btn-sort']") WebElement sort_btn;
				@FindBy(xpath="//*[@id='datepicker']")  WebElement calender_icon;
				@FindBy(xpath="//*[@class='btn btn-save']") WebElement save_btn;
				@FindBy(xpath="//*[@class='btn btn-cancel']") WebElement cancel_btn;
				@FindBy(xpath="//*[@class='btn btn-close']") WebElement close_btn;
				
				@FindBy (xpath="//table//thead//tr//th//input") WebElement checkbox;
				@FindBy (xpath="//*[@id='content']/div[2]/div[2]/div[1]/table") WebElement data_table;
				@FindBy (xpath="//table/tbody/tr") List<WebElement> Rows;
				@FindBy (xpath="//table/tbody/td") List<WebElement> Columns;
				@FindBy(xpath="//*[@class='btn btn-edit']") WebElement edit_button;
				@FindBy(xpath="//*[@class='btn btn-delete']") WebElement row_delete_btn;
				
				@FindBy (xpath="//table//thead//tr//th//input") WebElement row_checkbox_btn;
				@FindBy(xpath="//*[contains(text(),'Showing')]") WebElement footer;
				@FindBy(xpath="//*[@id='page-navigator']/div") WebElement pagination_navigator;
				@FindBy(xpath="//input[@type='text']") List<WebElement> text_boxes;
				@FindBy(xpath="//div[@class='dropdown-menu show-Programname") WebElement PrgmNamedropdown;
				@FindBy(xpath="//div[@class='dropdown-menu show-Classname") WebElement ClassNamedropdown;
				@FindBy(xpath="//div[@class='dropdown-menu show-Studentname") WebElement StudentNamedropdown;
				@FindBy(xpath="//div[@class='dropdown-menu show-Attendance") WebElement Attendancedropdwn;
				@FindBy (xpath="//*[@class='date-picker-highlighted')]/div[@class='v-btn__content']") WebElement highlighted_date;

		//		@FindBy(xpath="//*[@class='btn btn-delete-on-right']") WebElement deleteOnRight_btn;
				
				
//				@FindBy(xpath="//*[@class='btn btn-delete-on-top-left']") WebElement deleteOnTopLeft_btn;
//				@FindBy (xpath="//*[@class='alert alert-primary']") WebElement message;
//				@FindBy (id="search_query_top") WebElement search_txt;
//				@FindBy (xpath="//*[contains(text(),'Delete Confirm')]") WebElement DeletConfirm_Box;
//				@FindBy (xpath="//table//thead//tr//th//input") WebElement SelectAll_checkbox;
//				@FindBy (xpath="//button//span[text()=' Delete']") WebElement deleteMuti_btn;
				
				
				@FindBy(xpath="//*[@class='btn btn-yes']") WebElement yes_btn;
				@FindBy(xpath="//*[@class='btn btn-no']") WebElement no_btn;
				@FindBy (xpath="//*[contains(text(),'Attendance Details')]") WebElement pop_up_header;
				@FindBy(xpath="//*[text()='Program Name']") WebElement ProgramName;
				@FindBy(xpath="//*[text()='Class Name']") WebElement Classname;
				@FindBy(xpath="//*[text()='Student Name']") WebElement Studentname;
				@FindBy(xpath="//*[text()='Attendance']") WebElement AttendanceSelect;
				@FindBy(xpath="//*[text()='Attendance Date']") WebElement Attendance_date;
				@FindBy(xpath="//*[@class='dropdown-menu']") WebElement Dropdownfields;
				@FindBy(xpath="//*[@id='ProgramName-select-menu']") WebElement ProgramName_dropdown;
				@FindBy(xpath="//*[@id='ClassName-select-menu']") WebElement ClassName_dropdown;
				@FindBy(xpath="//*[@id='StudentName-select-menu']") WebElement StudentName_dropdown;
				@FindBy(xpath="//*[@id='Attendance-select-menu']") WebElement Attendance_dropdown;
				@FindBy(xpath="//*[@id='datepicker-left']")  WebElement calender_left;
				@FindBy(xpath="//*[@id='datepicker-right']")  WebElement calender_right;
				@FindBy(xpath="//*[@id='datepicker-month']")  WebElement calender_month;
				@FindBy(xpath="//table[@class='ui-datepicker-calendar']//td)") List<WebElement> all_dates;
				@FindBy (xpath="//*[@class='alert alert-message']") WebElement message;
				@FindBy (xpath="//*[@class='date-picker-highligted')]/div[@class='v-btn__content']") WebElement highligted_date;
				@FindBy (xpath="//button//span[text()=' Delete']") WebElement deleteMuti_btn;
					
				@FindBy(xpath="//*[@class='btn btn-student']") WebElement student_btn;
				@FindBy(xpath="//*[@class='btn btn-program']") WebElement program_btn;
				@FindBy(xpath="//*[@class='btn btn-batch']") WebElement batch_btn;
				@FindBy(xpath="//*[@class='btn btn-class']") WebElement class_btn;
				@FindBy(xpath="//*[@class='btn btn-user']") WebElement user_btn;
				@FindBy(xpath="//*[@class='btn btn-attendence']") WebElement attendence_btn;
				@FindBy(xpath="//*[@class='btn btn-logout']") WebElement logout_btn;

				
				
			      
				
// checking all modules on Dashboard page
			
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
					

				//constructor
				public AttendancePage() {
					PageFactory.initElements(driver,this);
				}
				
				
				public void clickAttendancePage() 
				{
					attendancebtn.click();	
				}
				
				public void ManageAttendanceUrl() {
					driver.get(ManageAttendanceUrl);
				}
				
				
				
		public void invalid_Attendanceurl() {
			driver.get(invalid_Attendanceurl);
			System.out.println("Incorrect URL");
			}
				
				public void invalidURLstatus() {
					assertTrue(driver.getTitle().contains("404"));
				}
				
				
			public void broken_links() {
				WebElement Link = driver.findElement(By.tagName("a"));
		        List<WebElement> links = driver.findElements(By.tagName("a"));
			        Iterator<WebElement> it = links.iterator();
			         while(it.hasNext()){        
			        	 LinkURL = it.next().getAttribute("href");
		           
		           System.out.println(LinkURL);
				//	String LinkURL = Link.getAttribute("href");
					
			if (LinkURL==null || LinkURL.isEmpty()) {
				Loggerload.info("URL is either not configurerd for anchor tag or it is empty");
			}
					
			try {
			           huc = (HttpURLConnection)(new URL(LinkURL).openConnection());
			          
			         huc.setRequestMethod("HEAD");
			            
			          huc.connect();
			            
			          respCode = huc.getResponseCode();
			            
			          if(respCode >= 400){
			              System.out.println(LinkURL+" is a broken link");
			           }
			          else{
			              System.out.println(LinkURL+" is a valid link");
			            }
					} catch (MalformedURLException e) {
			          
			           e.printStackTrace();
			      } catch (IOException e) {
			            
			          e.printStackTrace();
			        }
			}
				
			}
				
			public void sortIcondisplay() 
			{		
				int column = Columns.size();
				for(int i=0;i<column;i++) {	
					if(sort_btn.isDisplayed())
						System.out.println("Sort Button is displayed for cloumn "+(i+1));
						}
				
			}
				
				
				public void ResponseTimeAttendance() {
					//capture time before load
					long start=System.currentTimeMillis();
					//URL launch
					driver.get(ManageAttendanceUrl);
					//capture time after load
					long end=System.currentTimeMillis();
					//calculate time
					long pageload_time=end-start;
					System.out.println("The Page Load time in milliseconds is: "+pageload_time);
				}
				
				public String HeaderAttendance() {	
					return header.getText();
				}
				
				public void getAllTextAttendance() {
					driver.getPageSource();
				}
				
				public String spellcheckAttendance() {
					if(driver.getPageSource().contains(navigation_header.getText()))
						return navigation_header.getText();
					if(driver.getPageSource().contains(ClassID.getText()))
						return ClassID.getText();
					if(driver.getPageSource().contains(StudentID.getText()))
						return StudentID.getText();
					if(driver.getPageSource().contains(Present.getText()))
						return Present.getText();
					if(driver.getPageSource().contains(edit_delete.getText()))
						return edit_delete.getText();
					else 
						return "String not found";
					}
				
				public boolean deleteMultiRowBtndisplayAttendance() {
					return deleteMulti_btn.isDisplayed();
				}
					
				public boolean searchBardisplay() {
					return search_bar.isDisplayed();
				}	
				
				public boolean newAttendanceBtndisplay() {
					return addNewAttendancebtn.isDisplayed();
				}
				
				public boolean dataTabledisplay() {
					if(data_table.isDisplayed())
						return data_table.isDisplayed();
					if(checkbox.isDisplayed())
						return checkbox.isDisplayed();
					if(ClassID.isDisplayed())
						return ClassID.isDisplayed();
					if(StudentID.isDisplayed())
						return StudentID.isDisplayed();
					if(Present.isDisplayed())
						return Present.isDisplayed();
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
				
				public void textSearch(String AttendanceName) 
				{
					SearchBtn.sendKeys(AttendanceName);	
				}
				
				public void textSearchdisplayed() 
				{
					String text=SearchBtn.getText();
					String rowText=((WebElement) Rows).getText();
					text.compareTo(rowText);
					
				}
				
				public String popUpHeader() {	
					return pop_up_header.getText();
				}
				
				public void newAttendanceBtnclick() {
					addNewAttendancebtn.click();
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
					
				
				public boolean inputFieldsdisplay(String field) {
					if(ProgramName.isDisplayed())
						return ProgramName.getText().equals(field);
					if(Classname.isDisplayed())
						return Classname.getText().equals(field);
					if(Studentname.isDisplayed())
						return Studentname.getText().equals(field);
					if(AttendanceSelect.isDisplayed())
						return AttendanceSelect.getText().equals(field);
					if(Attendance_date.isDisplayed())
						return Attendance_date.getText().equals(field);
					return false;	
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
				
				
				// valid fields entered in Attendance page 
				
				public void fillValidMandatoryFields(String ProgramName,String ClassName,String StudentName,String Attendance,String AttendanceDate){
					Select select1= new Select(PrgmNamedropdown);
					select1.selectByVisibleText(ProgramName);
					Select select2= new Select(ClassNamedropdown);
					select2.selectByVisibleText(ClassName);
					Select select3=new Select(StudentNamedropdown);
					select3.selectByVisibleText(StudentName);
					Select select4=new Select(Attendancedropdwn);
					select4.selectByVisibleText(Attendance);
					Attendance_date.sendKeys(AttendanceDate);
					}
				
				public void clickSave() 
				{
					save_btn.click();	
				}

				// Invalid mandatory fields in Attendance page
				
				public void fillInvalidMandatoryFields(String ProgramName,String ClassName,String StudentName,String Attendance,String AttendanceDate)					
					{
					Select select1= new Select(PrgmNamedropdown);
					select1.selectByVisibleText(ProgramName);
					Select select2= new Select(ClassNamedropdown);
					select2.selectByVisibleText(ClassName);
					Select select3=new Select(StudentNamedropdown);
					select3.selectByVisibleText(StudentName);
					Select select4=new Select(Attendancedropdwn);
					select4.selectByVisibleText(Attendance);
					Attendance_date.sendKeys(AttendanceDate);
					
					}
					
					public boolean addAttendanceDisplay(String AttendanceName) {
						boolean isFound=false;
						for(WebElement row:Rows) {
							if(row.getText().equals(AttendanceName))
									isFound=true;
							break;
						}
						return isFound;
						}
					
					public String Message() {
						
							return message.getText();
					} 
		// display drop down in add attendance page
					
					public boolean ProgramNameDropdowndisplay() {		
						return ProgramName_dropdown.isDisplayed();
					}
					
					public boolean ClassNameDropdowndisplay() {		
						return ClassName_dropdown.isDisplayed();
					}
				
					
					public boolean StudentNameDropdowndisplay() {		
						return StudentName_dropdown.isDisplayed();
					}
					
					public boolean AttendanceDropdowndisplay() {		
						return Attendancedropdwn.isDisplayed();
					}
				
					
				
					
				
			// drop down click in add attendance page	
				
					
					

					public void ProgramdropdwnClick() {
						PrgmNamedropdown.click();
					}
					
					public void ClassdropdwnClick() {
						ClassNamedropdown.click();
					}
					
					public void StudentNameClick() {
						Studentname.click();
					}
					
					public void AttendanceClick() {
						AttendanceSelect.click();
					}
					
					public void AttendanceDateClick() {
						
						Attendance_date.click();
					}
				
					

					public void highligtedDatedisplay(){ 
							highlighted_date.isDisplayed();
					}

					
			public void logoaligned() {
					Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", logoimage);
				    
					if (!ImagePresent)
			        {
			        System.out.println("Image not displayed.");
			        }
			        else
			        {
			        System.out.println("Image is displayed.");
			        }
				}
				
				
				public void Labelspellchecker() {
					 String textLearning = learningtext.getText();
					 Assert.assertEquals("LEARNING",textLearning);
						System.out.println(textLearning);
						
						String textmanagementtext = managementtext.getText();
						 Assert.assertEquals("MANAGEMENT",textmanagementtext);
						 System.out.println(textmanagementtext);
						
						 String textsystemtext = systemtext.getText();
						 Assert.assertEquals("SYSTEM",textsystemtext);
						 System.out.println(textsystemtext);
						
						
					}
					
				public void correctlogo(WebElement img) throws IOException {
					img=logoimage;
					ScreenShots_Utils.webeScreenshot(driver,img);
				}
				

				public boolean dateDisplay() {
					return Attendance_date.isDisplayed();
				}
				
				public void validDateFormat() {
					boolean isvalidFormat=Attendance_date.getText().matches("([0-9]{2})/([0-9]{2})/([0-9]{4})");
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
				
				
				public void clickCancelBtn() 
				{
					cancel_btn.click();
				}
				
		//Admin should see correct spellings in the label	
				
				public void textBoxNumbers(int i) {
					if(text_boxes.size()==i)
						System.out.println("There are "+i+" TextBoxes");
					else
						System.out.println("Error:Number of boxes don't match");
				}
				
			
				
				public boolean deleteMultiRowBtnEnabled() {
					return deleteMuti_btn.isEnabled();
				}
				

				public void clickCheckbox() {
					checkbox.click();
				}
				
				
				public void clickYes() 
				{
					yes_btn.click();	
				}
				
				public void clickNo() 
				{
					no_btn.click();	
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
				

				 public void fieldscolor() {
			    	  String color = Dropdownfields.getCssValue("color");
			    	  String hex = Color.fromString(color).asHex();
			    	  
			    	  if (hex=="#808080" ) {
			    		  Loggerload.info("User String is in grey color");
			    	  }
			    	  else {
			    		  Loggerload.info("User String is not in grey color");
			    	  }
			      }	
				 
				 public boolean CompareProgmdrpdwnName(String text) {
					 
					 Select select= new Select(PrgmNamedropdown);
					 select.selectByVisibleText(text);
					 
					 boolean isMatchFound = false; 
					 
					 // Iterate through dropdown options
					 for (WebElement option : select.getOptions()) 
					 { String optionText = option.getText(); 
					 // Compare the string with option text (case-insensitive comparison in this example) 				
					 if (optionText.equalsIgnoreCase(text)) 
					 { isMatchFound = true;
					 break; 
					 // Exit the loop if a match is found }	 
					 }
					 return isMatchFound;
					 }
					 return isMatchFound;
				 }
			
					 public boolean CompareClassdrpdwnName(String text) {
						 
						 Select select= new Select(ClassNamedropdown);
						 select.selectByVisibleText(text);
						 
						 boolean isMatchFound = false; 
						 
						 // Iterate through dropdown options
						 for (WebElement option : select.getOptions()) 
						 { String optionText = option.getText(); 
						 // Compare the string with option text (case-insensitive comparison in this example) 				
						 if (optionText.equalsIgnoreCase(text)) 
						 { isMatchFound = true;
						 break; 
						 // Exit the loop if a match is found }	 
						 }
						 return isMatchFound;
					 }
						return isMatchFound;
					 
				 
			}
				 
			}


				
				
			
					
					