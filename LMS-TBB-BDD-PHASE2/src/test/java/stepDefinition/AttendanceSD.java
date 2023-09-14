package stepDefinition;

import Page_Factory.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import utilities.ExcelUtilsAttendance;

import Page_Factory.AttendancePage;

public class AttendanceSD {
	
	private static final String String = null;
	 AttendancePage attendance=new AttendancePage(); 
	 ExcelUtilsAttendance reader = new ExcelUtilsAttendance();
	 
		    
	///////////////////////// Manage Attendance SD ////////////////////////
	 
	 @Given("Admin is on dashboard page after Login")
	 public void admin_is_on_dashboard_page_after_login() {
	    attendance.ManageAttendanceUrl();
	 }

	 @When("Admin clicks {string} button on the navigation bar and get all text from the portal page")
	 public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page(String string) {
		 attendance.clickAttendancePage();
			attendance.getAllTextAttendance();
	 }
	 
	 @Then("Admin should see the {string} in header")
	 public void admin_should_see_the_in_header(String expected_text) {
		 	String actual_Msg = attendance.HeaderAttendance();
			Assert.assertEquals(expected_text,actual_Msg);
			System.out.println("The header is "+actual_Msg);
	 }

	 @Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	 public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
	    attendance.ResponseTimeAttendance();
	 }

	 @Then("HTTP response {string}")
	 public void http_response(String string) {
	    attendance.invalidURLstatus();
	 }

	 @Then("the link is broken")
	 public void the_link_is_broken() {
	     attendance.broken_links();
	 }

	 @Then("Admin should see LMS -Learning management system  as title")
	 public void admin_should_see_lms_learning_management_system_as_title() {
	    attendance.Labelspellchecker();
	 }

	 @Then("Manage attendance header should be in left side of the page")
	 public void manage_attendance_header_should_be_in_left_side_of_the_page() {
	    attendance.logoaligned();
	 }
	 
	 @Then("Admin should see correct spelling for the all the fields")
	 public void admin_should_see_correct_spelling_for_the_all_the_fields(String string) {
		 String actual_Msg = attendance.spellcheckAttendance();
	     Assert.assertEquals(string,actual_Msg);
			System.out.println("The field is "+actual_Msg);
	 }

	 @Then("Admin should see disabled delete icon below the {string}")
	 public void admin_should_see_disabled_delete_icon_below_the(String string) {
		 boolean t=attendance.deleteMultiRowBtndisplayAttendance();
			if(t==true)
			System.out.println("Disabled Delete Button is Visible");
			else
				System.out.println("Not Visible");
	 }

	 @Then("Admin should see search bar on the attendance page")
	 public void admin_should_see_search_bar_on_the_attendance_page() {
	    
	    boolean t=attendance.searchBardisplay();
		if(t==true)
			System.out.println("Search Bar is Visible");
			else
				System.out.println("Not Visible");
	 }

	 @Then("Admin should see +Add New Attendance button on the attendance page")
	 public void admin_should_see_add_new_attendance_button_on_the_attendance_page() {
	    
	     boolean t= attendance.newAttendanceBtndisplay();
			if(t==true)
				System.out.println("+Add New Attendance Button is Visible");
				else
					System.out.println("Not Visible");
	 }

	 @Then ("Admin should see data table on the Manage Attendance Page With following column headers Check box symbol,Class ID, Student Id,Present, Edit_Delete")
	 public void admin_should_see_data_table_on_the_manage_attendance_page_with_following_column_headers_check_box_symbol_class_id_student_id_preasent_edit_delete() {
		 
		 boolean t=attendance.dataTabledisplay();
			if(t==true)
				System.out.println("Table and Headers are Visible");
				else
					System.out.println("Not Visible");
	 }

	 @Then("Edit Icon in each row of data table only  when entries are available")
	 public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	     attendance.editRowdisplay();
	 }

	 @Then("Edit Icon will not be present in data table")
	 public void edit_icon_will_not_be_present_in_data_table() {
	     attendance.editRownotdisplay();
	 }

	 @Then("Delete Icon in each row of data table only when entries are available")
	 public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	   attendance.deleteRowdisplay();
	 }

	 @Then("Admin cant see delete Icon in data table")
	 public void admin_cant_see_delete_icon_in_data_table() {
	     attendance.deleteRownotdisplay();
	 }

	 @Then("Admin should see sort icon near the column headers except for Edit and Delete")
	 public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
	    
		 attendance.sortIcondisplay();
	 }

	 @Then("Admin should see check box in the all rows  of data table")
	 public void admin_should_see_check_box_in_the_all_rows_of_data_table() {
	    attendance.rowCheckboxdisplay();
	 }

	 @Then("Above the footer Admin should see the text as {string}{string}")
	 public void above_the_footer_admin_should_see_the_text_as(String string, String string2) {
		 String actual_Msg=attendance.footerText();
		    Assert.assertEquals(string,actual_Msg);
			System.out.println("The field is "+actual_Msg);
	 }

	 @Then("Admin should see the pagination controls under the data table")
	 public void admin_should_see_the_pagination_controls_under_the_data_table() {
		 boolean t=attendance.paginatordisplay();
			if(t==true)
				System.out.println("Paginator is Visible");
				else
					System.out.println("Not Visible");
	 }

	 @Then("Admin should see the text with total number classes in the data table.")
	 public void admin_should_see_the_text_with_total_number_classes_in_the_data_table() {
		 boolean t=attendance.footerTextdisplay();
			if(t==true)
				System.out.println("Footer is Visible");
				else
					System.out.println("Not Visible");
	 }

	///////////// Delete Multiple 	attendance SD////////////////////
	 
	 
	 @When("Admin clicks single  row level check box in the data table")
		public void admin_clicks_single_row_level_check_box_in_the_data_table() {
		    attendance.clickCheckbox();
		}
		
		@Then("Admin should see delete icon below the header is enabled")
		public void admin_should_see_delete_icon_below_the_header_is_enabled() {
			boolean t=attendance.deleteMultiRowBtnEnabled();
		    if(t==true)
				System.out.println("attendance multi deleted btn is enabled");
				else
					System.out.println("Disabled");
		}

		
		@Then("Redirected to assignment page and selected assignment details are deleted from the data table")
		public void redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table() {
		    boolean t=attendance.addAttendanceDisplay(toString());
		    if(t==false)
				System.out.println("attendance is deleted");
				else
					System.out.println("Not deleted");
		}
		
		@When("Admin clicks no button")
		public void admin_clicks_no_button() {
		    attendance.clickNo();
		}
		
		@Then("Redirected to assignment page and selected assignment details are not deleted from the data table")
		public void redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table() {
			boolean t=attendance.addAttendanceDisplay(toString());
		    if(t==true)
				System.out.println("attendance is not deleted");
				else
					System.out.println("deleted");
		}
		
		@When("Admin clicks yes button")
		public void admin_clicks_yes_button() {
		    attendance.clickYes();
		}
		@Then("Success message and selected attendance details are deleted from the data table")
		public void success_message_and_selected_attendance_details_are_deleted_from_the_data_table() {
			boolean t=attendance.addAttendanceDisplay(toString());
		    if(t==true)
				System.out.println("attendance is not deleted");
				else
					System.out.println("deleted");
		}

	 
	 ////////////// Pop-up Window SD////////////////////////
		
		
		@Given("Admin is in attendance details popup window")
		public void admin_is_in_attendance_details_popup_window() {
			String actual_Msg = attendance.popUpHeader();
			Assert.assertEquals("Attendance Details",actual_Msg);
			System.out.println("The pop up window is open");
		}
		
		@When("Admin clicks  program name dropdown")
		public void admin_clicks_program_name_dropdown() {
			
			boolean t=attendance.ProgramNameDropdowndisplay();
			if(t==true)
				System.out.println("program name dropdown is Visible");
				else
					System.out.println("Not Visible");
		
		}
	 
		@When("Admin clicks + A New Attendance button")
		public void admin_clicks_a_new_attendance_button() {
		
			attendance.newAttendanceBtnclick();
		}

		@Then("Admin should see correct spellings in the label")
		public void admin_should_see_correct_spellings_in_the_label() {
		attendance.Labelspellchecker();
		}

		@Then("{int} dropdown should be present attendance pop up window")
		public void dropdown_should_be_present_attendance_pop_up_window(Integer int1) {
		
			attendance.textBoxNumbers(int1);	
		}


		
		@Then("Admin should see close button on the attendance details popup window")
		public void admin_should_see_close_button_on_the_attendance_details_popup_window() {
		   attendance.CloseDisplay();
		}

		@Then("Close button should on the top right corner")
		public void close_button_should_on_the_top_right_corner() {
			
			boolean t=attendance.CloseDisplay();
		    if(t==true)
				System.out.println("close button is Visible");
				else
					System.out.println("Not Visible");
		}

		@Then("First dropdown box {string} text  should be present")
		public void first_dropdown_box_text_should_be_present(String string) {
		    boolean t=attendance.ProgramNameDropdowndisplay();
			if(t==true)
				System.out.println("program name dropdown is Visible");
				else
					System.out.println("Not Visible");
		}

		@Then("Second dropdown box {string} text  should be present")
		public void second_dropdown_box_text_should_be_present(String string) {
			boolean t=attendance.ClassNameDropdowndisplay();
			if(t==true)
				System.out.println("class name dropdown is Visible");
				else
					System.out.println("Not Visible");
		}

		@Then("Third dropdown box {string} text  should be present")
		public void third_dropdown_box_text_should_be_present(String string) {
			boolean t=attendance.StudentNameDropdowndisplay();
			if(t==true)
				System.out.println("Student name dropdown is Visible");
				else
					System.out.println("Not Visible");
		}

		@Then("Fourth dropdown box {string} text  should be present")
		public void fourth_dropdown_box_text_should_be_present(String string) {
			boolean t=attendance.AttendanceDropdowndisplay();
			if(t==true)
				System.out.println("program dropdown is Visible");
				else
					System.out.println("Not Visible");
		}

		@When("Admin clicks + a new attendance button	Admin clicks + a new attendance button")
		public void admin_clicks_a_new_attendance_button_admin_clicks_a_new_attendance_button() {
		    attendance.newAttendanceBtnclick();
		}

		@Then("Admin  should text in gray color")
		public void admin_should_text_in_gray_color() {
		   attendance.fieldscolor();
		}

		@Then("Admin should see save button in the class detail popup window")
		public void admin_should_see_save_button_in_the_class_detail_popup_window() {
			
			boolean t=attendance.SaveDisplay();
		    if(t==true)
				System.out.println("save button is Visible");
				else
					System.out.println("Not Visible");
		}

		@Then("Admin should see cancel button in the class detail popup window")
		public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
			
			boolean t=attendance.CancelDisplay();
		    if(t==true)
				System.out.println("cancel button is Visible");
				else
					System.out.println("Not Visible");
		}

		@Then("Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date.")
		public void order_of_the_label_should_be_program_name_class_name_student_name_attendance_attendance_date() {
			
			boolean t=attendance.addAttendanceDisplay(toString());
		    if(t==true)
				System.out.println("new assignment is Visible");
				else
					System.out.println("Not Visible");
		}

		@Then ("Attendance field should have keywords such as - present, absent, late, excused")
		public void Attendance_field_should_have_keywords_such_as_present_absent_late_excused() {
			
			attendance.AttendanceDropdowndisplay();
			
		}
		
		
		
		
		
		
		
	//// Edit Attendance SD///////////////////////
		
		
		@When("Admin enters all the mandatory values with valid data from {string}, {int} and click save")
		public void Admin_enters_all_the_mandatory_values_with_valid_data_from_and_click_save(String sheetName, Integer rowNumber) throws Exception, IOException {
			
			List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/ExcelFile/LMS ExcelUtils.xlsx",sheetName);
			
			String ProgramName = testData.get(rowNumber).get("Program Name");
			String ClassName = testData.get(rowNumber).get("Class Name");
			String StudentName = testData.get(rowNumber).get("Student Name");
			String Attendance = testData.get(rowNumber).get("Attendance");
			String AttendanceDate = testData.get(rowNumber).get("Attendance Date");
			attendance.fillValidMandatoryFields(ProgramName, ClassName, StudentName, Attendance, AttendanceDate);
		    attendance.clickSave();
		}
		
		@Then("Admin should see new attendance details is added in the data table")
		public void admin_should_see_new_attendance_details_is_added_in_the_data_table() {
		    boolean t=attendance.addAttendanceDisplay(toString());
		    if(t==true)
				System.out.println("new attendance is Visible");
				else
					System.out.println("Not Visible");
		}
	
		
		@When("Admin fills values missing attendance from {string}, {int} and click save")
		public void admin_fills_values_missing_attendance_from_and_click_save(String sheetName, Integer rowNumber) throws Exception, IOException {
			List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/ExcelFile/LMS ExcelUtils.xlsx",sheetName);
			String ProgramName = testData.get(rowNumber).get("Program Name");
			String ClassName = testData.get(rowNumber).get("Class Name");
			String StudentName = testData.get(rowNumber).get("Student Name");
			String Attendance = testData.get(rowNumber).get("Attendance");
			String AttendanceDate = testData.get(rowNumber).get("Attendance Date");
			attendance.fillValidMandatoryFields(ProgramName, ClassName, StudentName, Attendance, AttendanceDate);
		    attendance.clickSave();	
		}
		@Then("Attendance is missing {string}")
		public void attendance_is_missing(String expected_text) {
		
			String actual_Msg = attendance.Message();
			Assert.assertEquals(expected_text,actual_Msg);
			System.out.println("The Error message is "+actual_Msg);
		}
		@When("Admin enters  data missing value in program name from {string}, {int} and click save")
		public void admin_enters_data_missing_value_in_programname_click_save(String sheetName, Integer rowNumber) throws Exception, IOException {
			
			List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/ExcelFile/LMS ExcelUtils.xlsx",sheetName);
			String ProgramName = testData.get(rowNumber).get("Program Name");
			String ClassName = testData.get(rowNumber).get("Class Name");
			String StudentName = testData.get(rowNumber).get("Student Name");
			String Attendance = testData.get(rowNumber).get("Attendance");
			String AttendanceDate = testData.get(rowNumber).get("Attendance Date");
			attendance.fillValidMandatoryFields(ProgramName, ClassName, StudentName, Attendance, AttendanceDate);
		    attendance.clickSave();
		}
		@Then("programname is missing {string}")
		public void porgramname_is_missing(String expected_text) {
			String actual_Msg = attendance.Message();
			Assert.assertEquals(expected_text,actual_Msg);
			System.out.println("The Error message is "+actual_Msg);
		}
			@When("Admin enters data missing value in class name from  from {string}, {int} and click save")
			public void admin_enters_dates_missing_value_in_class_name_click_save(String sheetName, Integer rowNumber)throws Exception, IOException {
			
			List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/ExcelFile/LMS ExcelUtils.xlsx",sheetName);
			String ProgramName = testData.get(rowNumber).get("Program Name");
			String ClassName = testData.get(rowNumber).get("Class Name");
			String StudentName = testData.get(rowNumber).get("Student Name");
			String Attendance = testData.get(rowNumber).get("Attendance");
			String AttendanceDate = testData.get(rowNumber).get("Attendance Date");
			attendance.fillValidMandatoryFields(ProgramName, ClassName, StudentName, Attendance, AttendanceDate);
		    attendance.clickSave();
		}
		@Then("classname is missing {string}")
		public void classname_is_missing(String expected_text) {
			String actual_Msg = attendance.Message();
			Assert.assertEquals(expected_text,actual_Msg);
			System.out.println("The Error message is "+actual_Msg);
		}
		@When("Admin fills values missing attendance from {string}, {int} and click save")
		public void admin_fills_values_missing_attendancedate_from_and_click_save(String sheetName, Integer rowNumber) throws Exception, IOException {
		   
			List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/ExcelFile/LMS ExcelUtils.xlsx",sheetName);
			String ProgramName = testData.get(rowNumber).get("Program Name");
			String ClassName = testData.get(rowNumber).get("Class Name");
			String StudentName = testData.get(rowNumber).get("Student Name");
			String Attendance = testData.get(rowNumber).get("Attendance");
			String AttendanceDate = testData.get(rowNumber).get("Attendance Date");
			attendance.fillValidMandatoryFields(ProgramName, ClassName, StudentName, Attendance, AttendanceDate);
		    attendance.clickSave();
		}
		@Then("attendancedate is missing {string}")
		public void attendancedate_is_missing(String expected_text) {
			String actual_Msg = attendance.Message();
			Assert.assertEquals(expected_text,actual_Msg);
			System.out.println("The Error message is "+actual_Msg);
			
		}
			@When ("Admin fills values with future date from {string}, {int} and click save") 
			public void admin_fills_values_future_date_from_and_click_save(String sheetName, Integer rowNumber)throws Exception, IOException {	
				List<Map<String,String>> testData= reader.getData("/LMS-TDD-BDD-PHASE2/ExcelFile/LMS ExcelUtils.xlsx", sheetName);
				String ProgramName = testData.get(rowNumber).get("Program Name");
				String ClassName = testData.get(rowNumber).get("Class Name");
				String StudentName = testData.get(rowNumber).get("Student Name");
				String Attendance = testData.get(rowNumber).get("Attendance");
				String AttendanceDate = testData.get(rowNumber).get("Attendance Date");
				attendance.fillValidMandatoryFields(ProgramName, ClassName, StudentName, Attendance, AttendanceDate);
			    attendance.clickSave();
				
			}
			   
	    	@Then ("Invalidate attendance {string}")
	    	public void invalidate_attendance(String expected_text){
	    		String actual_Msg = attendance.Message();
				Assert.assertEquals(expected_text,actual_Msg);
				System.out.println("The Error message is "+actual_Msg);
	    	}
			
			
		@Then("Program Name in the drop down should match with {string} in manage program page table")
		public void program_name_in_the_drop_down_should_match_with_in_manage_program_page_table(String string) {
		 
			boolean actual_Msg = attendance.CompareProgmdrpdwnName(string);
			Assert.assertEquals(string,actual_Msg);
				
		}

		@Then("Class Name in the drop down should match with {string} in  manage class page table")
		public void class_name_in_the_drop_down_should_match_with_class_name_in_manage_class_page_table(String string) {

			boolean actual_Msg = attendance.CompareClassdrpdwnName(string);
			Assert.assertEquals(string,actual_Msg);

		}

		@Then("Attendance field should have keywords such as - present, absent, late, excused")
		public void attendance_field_should_have_keywords_such_as_present_absent_late_excused() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see correct spellings in dropdown text")
		public void admin_should_see_correct_spellings_in_dropdown_text() {
		  attendance.spellcheckAttendance();
		}

		@When("Admin clicks date from date picker")
		public void admin_clicks_date_from_date_picker() {
			attendance.selectDate();
		}

		@Then("selected date should be their in class date text box")
		public void selected_date_should_be_their_in_class_date_text_box() {
			 attendance.dateDisplay();
		}

		@Then("selected date should be in  mm\\/dd\\/yyyy format")
		public void selected_date_should_be_in_mm_dd_yyyy_format() {
		  attendance.validDateFormat();
		}

		@When("Admin clicks right arrow in the date picker near month")
		public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
		   attendance.clickRightArrowCalender();
		}

		@Then("Next month calender should visible")
		public void next_month_calender_should_visible() {
			 attendance.monthCalenderdisplay();
		}

		@When("Admin clicks left arrow in the date picker near month")
		public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
			attendance.clickLeftArrowCalender();
		}

		@Then("previous month calender should visible")
		public void previous_month_calender_should_visible() {
			attendance.monthCalenderdisplay();
		}

		@When("Admin clicks date picker button")
		public void admin_clicks_date_picker_button() {
			attendance.clickCalenderIcon();
		}

		@Then("Admin should see current date is highlighted in the date picker")
		public void admin_should_see_current_date_is_highlighted_in_the_date_picker() {
			attendance.highligtedDatedisplay();
		}

		@When("Admin clicks date picker button and selects future date")
		public void admin_clicks_date_picker_button_and_selects_future_date() {
			attendance.clickCalenderIcon();
		}

		@Then("Admin should see selected date is highlighted in the date picker")
		public void admin_should_see_selected_date_is_highlighted_in_the_date_picker() {
			attendance.highligtedDatedisplay();
		}
	
		
	//// Attendance Navigation SD 
		
		@When("Admin clicks {string} button in the navigation bar")
		public void admin_clicks_button_in_the_navigation_bar(String string) {
		    attendance.clickButton(string);
		}

		@Then("Admin should able to land on student page")
		public void admin_should_able_to_land_on_student_page() {
			String actual_Msg = attendance.HeaderAttendance();
			Assert.assertEquals(actual_Msg,"Manage Student");
		}

		@Then("Admin should able to land on program page")
		public void admin_should_able_to_land_on_program_page() {
			String actual_Msg = attendance.HeaderAttendance();
			Assert.assertEquals(actual_Msg,"Manage Program");
		}

		@Then("Admin should able to land on batch page")
		public void admin_should_able_to_land_on_batch_page() {
			String actual_Msg = attendance.HeaderAttendance();
			}
	
			@Then("Admin should able to land on user page")
			public void admin_should_able_to_land_on_user_page() {
				String actual_Msg = attendance.HeaderAttendance();
				Assert.assertEquals(actual_Msg,"Manage User");
			}

			@Then("Admin should able to land on assignment page")
			public void admin_should_able_to_land_on_assignment_page() {
				String actual_Msg = attendance.HeaderAttendance();
				Assert.assertEquals(actual_Msg,"Manage Assignment");
			}

			
			@Then("Admin should able to land on class page")
			public void admin_should_able_to_land_on_class_page() {
				String actual_Msg = attendance.HeaderAttendance();
				Assert.assertEquals(actual_Msg,"Manage Class");
			}

		@Then("Admin should able to land on login page")
		public void admin_should_able_to_land_on_login_page() {
			String actual_Msg = attendance.HeaderAttendance();
			Assert.assertEquals(actual_Msg,"Please login to LMS application");
		}
	
		
		/// Attendance Pagination SD //////////////
		
		
		@When("Admin clicks {string} button on the navigation bar")
		public void admin_clicks_button_on_the_navigation_bar(String string) {
		    attendance.clickAttendancePage();
		}
		
		@Then("Data table should display {string} page  when entries available")
		public void data_table_should_display_page_when_entries_available(String string) {
			String actual_Msg = attendance.pagesDisplay();
			Assert.assertEquals(actual_Msg,string);
		}
		
		@Then("Right arrow should be enabled in page one  when entries are more than {int} available")
		public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
		    attendance.rightArrowDisplay();
		}
		
		@Then("Left arrow should be disabled in page one  when entries are more than {int} available")
		public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
		    attendance.leftArrowDisplay();
		}
		
		@Then("Right arrow should be enabled in page two when entries are more than {int} available")
		public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) {
		    attendance.rightArrowDisplay(); 
		    
		}
		
		@Then("Left arrow should be enabled in page two")
		public void left_arrow_should_be_enabled_in_page_two() {
		    attendance.leftArrowDisplay();
		}
		
		@Then("When entries are more than {int} in data table pagination controls enabled")
		public void when_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer int1) {
			attendance.leftArrowDisplay();
			attendance.rightArrowDisplay();
		}
		
		@Then("When entries are less than {int} in data table pagination controls disabled")
		public void when_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer int1) {
			attendance.leftArrowDisplay();
			attendance.rightArrowDisplay();
		}
		
		@When("Admin creates {int} new attendance")
		public void admin_creates_new_attendance(Integer int1) {
			while(int1<=6) {
		    attendance.addAttendanceDisplay(String);
			int1++;}
		}
		
		@Then("When total class entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled)")
		public void when_total_class_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled(Integer int1, Integer int2) {
		    attendance.nextPageDisplay();
		}
		
		@When("Admin creates less than or equal to {int} new  attendance")
		public void admin_creates_less_than_or_equal_to_new_attendance(Integer int1) {
			while(int1 <=5) {
			    attendance.addAttendanceDisplay(String);
				int1++;}
		}
		
		@Then("When total class entries  {int} or below next page is disabled")
		public void when_total_class_entries_or_below_next_page_is_disabled(Integer int1) {
			attendance.nextPageDisplay();
		}
		
	
}
