package stepDefinition;

import org.junit.Assert;

import Page_Factory.ProgramPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class ProgramNavigationSD {
	ProgramPage program=new ProgramPage();
	ExcelReader reader = new ExcelReader();
	
	@When(":Admin clicks on Student link on Manage Program page")
	public void admin_clicks_on_student_link_on_manage_program_page() {
	   program.ClickProgramPage();
	}

	@Then(":Admin is re-directed to Student page")
	public void admin_is_re_directed_to_student_page() {
		   System.out.println("Student page will open");

	}

	@When(":Admin clicks on Batch link on Manage Program page")
	public void admin_clicks_on_batch_link_on_manage_program_page() {
	   program.ManageProgramUrl();
	}

	@Then(":Admin is re-directed to Batch page")
	public void admin_is_re_directed_to_batch_page() {
	   System.out.println("Batch page will open");
	}

	@When(":Admin clicks on Class link on Manage Program page")
	public void admin_clicks_on_class_link_on_manage_program_page() {
	    program.getClass();
	}

	@Then(":Admin is re-directed to Class page")
	public void admin_is_re_directed_to_class_page() {
		   System.out.println("Class page will open");

	}

	@When(":Admin clicks on User link on Manage Program page")
	public void admin_clicks_on_user_link_on_manage_program_page() {
	   program.clickuser();
	}

	@Then(":Admin is re-directed to User page")
	public void admin_is_re_directed_to_user_page() {
		System.out.println("User page will open");
	}

	@When(":Admin clicks on Assignment link on Manage Program page")
	public void admin_clicks_on_assignment_link_on_manage_program_page() {
	    program.clickassignment();
	}

	@Then(":Admin is re-directed to Assignment page")
	public void admin_is_re_directed_to_assignment_page() {
		System.out.println("Assignment page will open");
	}

	@When(":Admin clicks on Attendance link on Manage Program page")
	public void admin_clicks_on_attendance_link_on_manage_program_page() {
	   program.clickattendence();
	}

	@Then(":Admin is re-directed to Attendance page")
	public void admin_is_re_directed_to_attendance_page() {
		System.out.println("Attendence page will open");

	}

	@When(":Admin clicks on Logout link on Manage Program page")
	public void admin_clicks_on_logout_link_on_manage_program_page() {
	   program.clicklogout();
	}

	@Then(":Admin is re-directed to Login page")
	public void admin_is_re_directed_to_login_page() {
		String actual_Msg = program.ProgramHeader();
		Assert.assertEquals(actual_Msg,"Please login to LMS application");	}
}
