package Page_Factory;

import java.net.HttpURLConnection;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

//import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonArray;
//import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import utilities.ConfigfileReader;
import utilities.Loggerload;


public class UserPage {
	public static WebDriver driver=BrowserManager.getdriver();
	 //String url=ConfigfileReader.getApplicationUrl();
	 String manageuserUrl=ConfigfileReader.manageuserUrl();
		
	 
  
    
    
   
	
	//manage user webelements
    @FindBy(xpath = "//btn[text()='User']") WebElement userbutton;
    @FindBy(xpath="//*[text()='Manage User']") WebElement header;
	 @FindBy(xpath="//*[text()='LMS - Learning Management System']") WebElement navigation_header;
	 List<WebElement> rows = driver.findElements(By.xpath("//table[@id='data-table']/tbody/tr"));
	    List<WebElement> columnheaders = driver.findElements(By.xpath("//table[@id='data-table']/tbody/tr/th"));
	    @FindBy(xpath = "//table[@id='data-table']/tbody")WebElement Datatable;
	 @FindBy (id  = "//a[label()='ID']") WebElement ID  ;
	 @FindBy (xpath  = "//a[label()='Name']") WebElement Name ;
	 @FindBy (xpath  = "//a[label()='Location']") WebElement Location;
	 @FindBy (xpath  = "//a[label()='PhoneNumber']") WebElement phonenumber ;
	 @FindBy(xpath = "//button[text()='edit/delete']")WebElement editordelete ;
	 @FindBy (xpath  = "//button[text()='searchbox']") WebElement searchbox ;
	 @FindBy (xpath  = "//a[type()='searchicon']") WebElement searchicon ;
	 @FindBy (xpath="//table//thead//tr//th//input") WebElement row_checkbox_btn;
	 @FindBy(xpath="//*[@class='btn btn-delete']") WebElement row_delete_btn;
	 @FindBy ( xpath= "//td[@class='edit-icon']") WebElement btnedit ;
	 @FindBy (id  = "//a[btn()='delete']") WebElement btndelete ;
	 @FindBy (xpath="//td[@class='delete-icon']") WebElement deleteicon ;
	 @FindBy (xpath  = "//button[id()='checkbox']") WebElement checkbox ;
	 @FindBy (xpath  = "//a[btn()='+AddNewUser']") WebElement btnaddnewuser ;
	 @FindBy (xpath  = "//a[btn()='+AssignStaff']") WebElement btnassignstaff ;
	 @FindBy(xpath = "//button[@id='Pagination']") WebElement pagination;
	 @FindBy(xpath = "//*[@id= 'confirm-alert']") WebElement alert;
	 @FindBy (xpath  = "//a[btn()='Yes']") WebElement btnyes ;
	 @FindBy (xpath  = "//a[btn()='No']") WebElement btnno;
	 @FindBy (xpath  = "//a[text()='Usercreated']") WebElement successmessage ;
	 @FindBy (xpath  = "//a[text()='Userdeleted']") WebElement successdeletemessage ;
	 //@FindBy(xpath ="//*[@id ='total user']" )WebElement footerMesg;
	 @FindBy(xpath = "//*[@id= 'popup-heading']") WebElement popupheading;
	 @FindBy (xpath="//*[@class='alert alert-message']") WebElement message;
	 
	 //***********Add/Edit/DeleteUser**************//
	 @FindBy (xpath  = "//*[text()='FirstName']") WebElement firstnametext ;
	 @FindBy (xpath  = "//*[text()='MiddleName']") WebElement middlenametext ;
	 @FindBy (xpath  = "//*[text()='LastName']") WebElement lastnametext ;
	 @FindBy (xpath  = "//*[text()='location']") WebElement locationtext ;
	 @FindBy (xpath  = "//*[text()='phonenumber']") WebElement phonenumbertext ;
	 @FindBy (id  = "//a[linktext()='linkdn']") WebElement linkdntext ; 
	 @FindBy (xpath  = "//*[text()='Email']") WebElement emailtext ;
	 @FindBy (xpath  = "//*[text()='UnderGraduate']") WebElement undergraduatetext ;
	 @FindBy (xpath  = "//*[text()='PostGraduate']") WebElement postgraduatetext ;
	 @FindBy (xpath  = "//*[text()='TimeZone']") WebElement timezonetext ;
	 @FindBy (xpath  = "//*[text()='UserComments']") WebElement usercommentstext ;
	 @FindBy (xpath  = "//*[ID()='UserRole']") WebElement userroledropdown ;
	 @FindBy (xpath  = "//*[ID()='RoleStatus']") WebElement rolestatusdropdown ;
	 @FindBy (xpath  = "//*[ID()='VisaStatus']") WebElement visastatusdropdown ;
	 
	 @FindBy (id = "//a[btn()='Submit']") WebElement btnsubmit ;
	 @FindBy (id  = "//a[btn()='Cancel']") WebElement btncancel ;
	 
	 
	 
	 @FindBy(xpath = "//btn[text()='Student']") WebElement studentbutton;
	 @FindBy(xpath = "//btn[text()='Program']") WebElement programbutton;
	 @FindBy(xpath = "//btn[text()='Batch']") WebElement batchbutton;
	 @FindBy(xpath = "//btn[text()='Class']") WebElement classbutton;
	 @FindBy(xpath = "//btn[text()='Assignment']") WebElement assignmentbutton;
	 @FindBy(xpath = "//btn[text()='Attendance']") WebElement attendancebutton;
	 @FindBy(xpath = "//btn[text()='Logout']") WebElement logoutbutton;
	 
 public void PagefactoryClass(WebDriver driver) {
	        UserPage.driver = driver;
	        PageFactory.initElements(driver, this);
	 }
 public void clickUserPage() 
	{
	 userbutton.click();	
	}
 public void ManageUserUrl() {
	 String ManageURL = driver.getCurrentUrl();
	 Assert.assertEquals("URL should contain Manage ", ManageURL .contains("Manage User Page"));
	}
  

 public String Header() {	
		return header.getText();
		
	}


public void validatepagination() {
	
        Assert.assertEquals("Pagination is displayed", pagination.isDisplayed());

}
public void validatedatatableheaders() {
	WebElement[] elementstoassert = {checkbox,ID,Name,Location,phonenumber,editordelete };
    for(WebElement element: elementstoassert){
        String elementname= element.getAttribute("name");
        Assert.assertEquals("the header" +elementname+ "is displayed", element.isDisplayed());
    }
}
public void validatedeleteicon() {
	boolean iconisdisabled = deleteicon.isEnabled();
    Assert.assertTrue(iconisdisabled, "Delete icon is disabled");
    Assert.assertTrue(deleteicon.isDisplayed(), "Disabled Delete icon is not displayed ");
}
public void clickdeleteicon() {
	deleteicon.click();
}
public void validatenewuserbutton() {
	boolean btnuser=btnaddnewuser.isEnabled();
	Assert.assertTrue(btnuser,"+AddNewUser button is enabled");
	Assert.assertTrue(btnaddnewuser.isDisplayed(), "addnewuser button is displayed");
}
public void clickAddNewUserbutton() {
	btnaddnewuser.click();
}

public void validateassignstaffbutton() {
	Assert.assertTrue(btnassignstaff.isDisplayed(), "assignstaff button is displayed");
	}	

public void validatesearchbox() {
	Assert.assertTrue(searchbox.isDisplayed(), "Search box is displayed");
}
public void validatecheckbox() {
	for (WebElement row: rows){
        WebElement cellEntry = row.findElement(By.xpath("//td[@class='entry-cell']"));
        String cellText = cellEntry.getText();
        if(!cellText.isEmpty()){
            WebElement checkbox = row.findElement(By.xpath("//button[@id='checkbox']"));
            Assert.assertTrue(checkbox.isDisplayed(), "Checkbox is displayed");
        }
    }
}
public void clickcheckbox() {
	
	checkbox.click();
}
public void validateedit() {
	for (WebElement row : rows) {
        WebElement cellEntry = row.findElement(By.xpath("//td[@class='entry-cell']"));
        String celltext = cellEntry.getText();
        if (celltext.isEmpty()) {
            WebElement btnedit = row.findElement(By.xpath("//td[@class='edit-icon']"));
            Assert.assertTrue(btnedit.isEnabled(),"Edit icon is enabled ");
        }
    }	
}
public void clickeditbutton() {
	btnedit.click();
}
	
public void validatedeletebutton() {
	for (WebElement row : rows) {
        WebElement cellEntry = row.findElement(By.xpath("//td[@class='entry-cell']"));
        String celltext = cellEntry.getText();
        if (celltext.isEmpty()) {
            WebElement btndelete = row.findElement(By.xpath("//a[btn()='delete']"));
            Assert.assertTrue(btndelete.isEnabled(),"Delete icon is enabled ");
        }
    }
}
public void clickdeletebutton() {
	btndelete.click();
}



public void SearchUserName(){

    searchbox.click();
    
}

public void validatepopup() {
	
	String Mainwindow = driver.getWindowHandle();
    Set<String> set = driver.getWindowHandles();
    for(String win: set){
    if(!Mainwindow.contentEquals(win)) {
    driver.switchTo().window(win);
    String popupheadingText = popupheading.getText();
    String expectedheading = "User Details";
    Assert.assertEquals(expectedheading, popupheadingText);
        Loggerload.info("Popup window is displayed");
    }
    }
}
public void validatefields() {
	WebElement[] elementsToAssert = {
           firstnametext,lastnametext,middlenametext,phonenumbertext,locationtext,linkdntext,emailtext,
           usercommentstext,timezonetext,postgraduatetext,undergraduatetext,
    };

    for(WebElement element:elementsToAssert ){
        String elementName = element.getAttribute("name");
        Assert.assertTrue(element.isDisplayed(), "The"+elementName+ "is displayed");
    }
}
public void numberoffileds(){

    int numberOfTextboxes = driver.findElements(By.tagName("input")).size();
    int expected = 11;
    Assert.assertEquals(expected, numberOfTextboxes);
    Loggerload.info("Number of textboxes is as expected");
}
public void UserroleDD(){
	userroledropdown.click();
    List<WebElement> DDoptions = driver.findElements(By.tagName("options"));
    Assert.assertFalse(DDoptions.isEmpty(),"The options are displayed in the DropDown");
}
public void RolestatusDD(){
	rolestatusdropdown.click();
    List<WebElement> DDoptions = driver.findElements(By.tagName("options"));
    Assert.assertFalse(DDoptions.isEmpty(),"The options are displayed in the DropDown");
}
public void VisastatusDD(){
	visastatusdropdown.click();
    List<WebElement> DDoptions = driver.findElements(By.tagName("options"));
    Assert.assertFalse(DDoptions.isEmpty(),"The options are displayed in the DropDown");
}
public void fillMandatoryFields(String firstname,String lastname,String phonenumber,String userrole ,String visastatus,String rolestatus,String location){
	Select select1= new Select(userroledropdown);
	select1.selectByVisibleText(userrole);
	Select select2= new Select(rolestatusdropdown);
	select2.selectByVisibleText(rolestatus);
	Select select3= new Select(visastatusdropdown);
	select3.selectByVisibleText(visastatus);
	firstnametext.sendKeys(firstname);
	lastnametext.sendKeys(lastname);
	locationtext.sendKeys(location);
	phonenumbertext.sendKeys(phonenumber);
}
public void fillAllFields(String firstname,String middlename,String lastname,String phonenumber,String userrole ,String visastatus,String rolestatus,String location,String email,String linkdn,String undergraduate,String postgraduate, String timezone, String usercomments){
	Select select1= new Select(userroledropdown);
	select1.selectByVisibleText(userrole);
	Select select2= new Select(rolestatusdropdown);
	select2.selectByVisibleText(rolestatus);
	Select select3= new Select(visastatusdropdown);
	select3.selectByVisibleText(visastatus);
	firstnametext.sendKeys(firstname);
	middlenametext.sendKeys(middlename);
	linkdntext.sendKeys(linkdn);
	lastnametext.sendKeys(lastname);
	locationtext.sendKeys(location);
	phonenumbertext.sendKeys(phonenumber);
	emailtext.sendKeys(email);
	undergraduatetext.sendKeys(undergraduate);
	postgraduatetext.sendKeys(postgraduate);
	timezonetext.sendKeys(timezone);
	usercommentstext.sendKeys(usercomments);
}
public void clicksubmitbutton() {
	btnsubmit.click();
}

public void clickcancelbutton() {
	btncancel.click();
	Assert.assertTrue(btncancel.isDisplayed(), "cancel button is displayed");
}
public boolean addNewuserDisplay(String UserName) {
	boolean isFound=false;
	for(WebElement row:rows) {
		if(row.getText().equals(UserName))
				isFound=true;
		break;
	}
	return isFound;
	}

public String errormessage() {
	return  message.getText();
}

public void validatealert() {
	Alert a = driver.switchTo().alert();
	String s = a.getText();
	System.out.println("Alert text is: " + s);
	a.sendKeys("Confirm");
	
	
}
public void clickyesbutton() {
	
	driver.switchTo( ).alert( ).accept();
	btnyes.click();
}
public void clicknobutton() {
	driver.switchTo( ).alert( ).dismiss();
	btnno.click();
}
public void deletemessagedisplay() {
	
	
}
public void deleteRowdisplay() {
	int row = rows.size();
	for(int i=0;i<row;i++) {	
		if(row_delete_btn.isDisplayed())
			System.out.println("Delete Button is displayed for row "+(i+1));
			}
		}
public void clickrowdeletebutton() {
	row_delete_btn.click();
}
public void rowCheckboxdisplay() {
	int row = rows.size();
	for(int i=0;i<row;i++) {	
		if(row_checkbox_btn.isDisplayed())
			System.out.println("Checkbox Button is displayed for row "+(i+1));
			}
		}
public void clickrowcheckbox() {
	row_checkbox_btn.click();
}
public boolean updateuserdisplay(String UserName) {
	boolean isFound=false;
	for(WebElement row:rows) {
		if(row.getText().equals(UserName))
				isFound=true;
		break;
	}
	return isFound;
	}
	
		
/*public boolean adduserDisplay(String AssignmentName) {
	boolean isFound=false;
	for(WebElement row:Rows) {
		if(row.getText().equals(AssignmentName))
				isFound=true;
		break;
	}
	return isFound;
	}*/

public String Message() {
	
		return message.getText();
} 

}
