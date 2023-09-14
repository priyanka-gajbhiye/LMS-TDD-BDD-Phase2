package stepDefinition;

import Page_Factory.ClassPage;

import org.junit.Assert;
import Page_Factory.ClassPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClassDetailPopupSD {
	ClassPage classmodule = new ClassPage(); 
	
	@Given("Admin is on Manage Class Page")
	public void admin_is_on_manage_class_page() {
		classmodule.clickClassPage();
	}

	@When("Admin click +Add New Class button")
	public void admin_click_add_new_class_button() {
		classmodule.newclassBtnclick();

	}

	@Then("Admin should see a popup  with  heading {string}")
	public void admin_should_see_a_popup_with_heading(String string) {
		String actual_Msg = classmodule.popUpHeader();
		Assert.assertEquals(string,actual_Msg);
		System.out.println("The pop up window header is "+actual_Msg);
	}

	@Then("Admin should see input fields Text \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)")
	public void admin_should_see_input_fields_text_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{int} textbox should be  present in Class details popup window")
	public void textbox_should_be_present_in_class_details_popup_window(Integer int1) {
		   classmodule.textBoxNumbers(int1);
	}

	@Then("Admin should see  dropdown option for Batch ID")
	public void admin_should_see_dropdown_option_for_batch_id() {
		boolean t=classmodule.batchDropdowndisplay();
	    if(t==true)
			System.out.println("batch number is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see  dropdown option for Staff Id")
	public void admin_should_see_dropdown_option_for_staff_id() {
		boolean t=classmodule.staffDropdowndisplay();
		if(t==true)
			System.out.println("program dropdown is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see  calendar icon for class date")
	public void admin_should_see_calendar_icon_for_class_date() {
		boolean t=classmodule.calenderIcondisplay();
	    if(t==true)
			System.out.println("calender icon is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see  save button in the class detail popup window")
	public void admin_should_see_save_button_in_the_class_detail_popup_window() {
		boolean t=classmodule.SaveDisplay();
	    if(t==true)
			System.out.println("save button is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see  cancel button in the class detail popup window")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
		boolean t=classmodule.CancelDisplay();
	    if(t==true)
			System.out.println("cancel button is Visible");
			else
				System.out.println("Not Visible");
	}

	@Then("Admin should see  close button on the class details popup window")
	public void admin_should_see_close_button_on_the_class_details_popup_window() {
		boolean t=classmodule.CloseDisplay();
	    if(t==true)
			System.out.println("close button is Visible");
			else
				System.out.println("Not Visible");
	}
	

}
