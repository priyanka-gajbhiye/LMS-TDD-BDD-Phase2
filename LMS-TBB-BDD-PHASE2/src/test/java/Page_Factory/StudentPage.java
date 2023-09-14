package Page_Factory;

import java.awt.Dimension;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.Color;
import utilities.ConfigfileReader;
import utilities.Loggerload;
import org.openqa.selenium.support.ui.Select;

public class StudentPage {
	public static WebDriver driver=BrowserManager.getdriver();
	 String url=ConfigfileReader.getApplicationUrl();
	 
	 String LinkURL = "";
	 String invalid_url=ConfigfileReader.getInvalidUrl();
	 HttpURLConnection huc = null;
     int respCode = 200;
	 String studentdetailUrl=ConfigfileReader.studentdetailUrl();
	 String dashboardlUrl=ConfigfileReader.dashboardUrl();
     long start;
     
     
     public void PagefactoryClass(WebDriver driver) {
	        StudentPage.driver = driver;
	        PageFactory.initElements(driver, this);
	 }
     
	
	 @FindBy(xpath = "//btn[text()='Student']") WebElement studentbutton;
	 List<WebElement> rows = driver.findElements(By.xpath("//table[@id='data-table']/tbody/tr"));
	 @FindBy(xpath="//*[text()='Student Name']") WebElement studentname;
		@FindBy (id  = "//*[text()=' Batch Id']") WebElement batchid ;
	 @FindBy(xpath="//*[text()='Student Details Page']") WebElement header;
	@FindBy (id  = "//a/dropdown- studentnamedropdown") WebElement studentnamedropdown ;
	@FindBy (id = "//a/dropdown- batchiddropdown") WebElement batchiddropdown ;
	@FindBy (xpath  = "//a/studentnamesearchbox") WebElement studentnamesearchbox ;
	@FindBy (xpath  = "//a/ batchidsearchbox") WebElement batchidsearchbox ;
	 @FindBy (xpath  = "//a[text()='LMS - Learning Management System']") WebElement LMStitle ;	
	 @FindBy (xpath  = "//a[text()='SelectStudentName']") WebElement studentnametext ;
	 @FindBy (xpath  = "//a[text()='SelectBatchId']") WebElement batchidtext;
	 @FindBy (id  = "//a[cssvalue()='graycolor']") WebElement studentnamecolor;
	 @FindBy (id  = "//a[cssvalue()='graycolor']") WebElement batchidcolor;
	 @FindBy (id  = "//a[scrolldown()='studentnamescrolldown']") WebElement studentnamescrolldown;
	 @FindBy (id  = "//a[scrolldown()='batchidscrolldown']") WebElement batchidscrolldown;
	 @FindBy(xpath = "//btn[text()='User']") WebElement userbutton;
	 @FindBy(xpath = "//btn[text()='Program']") WebElement programbutton;
	 @FindBy(xpath = "//btn[text()='Batch']") WebElement batchbutton;
	 @FindBy(xpath = "//btn[text()='Class']") WebElement classbutton;
	 @FindBy(xpath = "//btn[text()='Assignment']") WebElement assignmentbutton;
	 @FindBy(xpath = "//btn[text()='Attendance']") WebElement attendancebutton;
	 @FindBy(xpath = "//btn[text()='Logout']") WebElement logoutbutton;
	 
	 public void clickstudentPage() 
		{
		 studentbutton.click();
		}
	 public void managestudentdetailUrl() {
			driver.get(studentdetailUrl);
		}
	 
	public void validatestudentpagetitle() {
		
		        String studentpage = driver.getTitle();
		        String Title = "Student Details Page";
		        Assert.assertEquals(Title,studentpage);

		    }
	public String Header() {	
		return header.getText();
	}
		
	public void validateresponsetime() {
		
		//capture time after load
				long end=System.currentTimeMillis();
				//calculate time
				long pageload_time=end-start;
				
				long int1 = 0;
				if (pageload_time<int1) {
					Loggerload.info("Page Load time less than 30 miliseconds");
				}
				else
				{Loggerload.info("Page Load time more than 30 miliseconds");		
					
				}
	}
	 

public void broken_links() {
	 List<WebElement> links = driver.findElements(By.tagName("a"));
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
    	LinkURL = it.next().getAttribute("href");
        
        System.out.println(LinkURL);
	
	
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
public void validateLMStitle() {
	 LMStitle.getText();
	 String LMStitle = driver.getTitle();
     String Title = "LMS-Learning Management System";
     Assert.assertEquals(Title, LMStitle);
	
}
public  void centrealignstudentdetailpage() {
	
	Boolean studentpagePresent = (Boolean) ((JavascriptExecutor)driver)
			.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",header);
    
	if (!studentpagePresent)
    {
    System.out.println("Page not displayed.");
    }
    else
    {
    System.out.println("Page is displayed.");
    }
}

public void validatedropdown() {
	Boolean firstdropdownPresent = studentnamedropdown.isDisplayed (); 
	Boolean seconddropdownPresent = batchiddropdown.isDisplayed (); 
	if (firstdropdownPresent==true) 
	{ 
		System.out.println ("Dropdown is appearing"); } 
	else { System.out.println ("Dropdown is not appearing"); }

	

if(seconddropdownPresent==true)
{
	System.out.println ("Dropdown is appearing"); } 
else { System.out.println ("Dropdown is not appearing"); }

}
public void clickstudentdropdown() {
	studentnamedropdown.click();
}
public void clickbatchiddropdown() {
	batchiddropdown.click();
}
public void validatestudentnamesearchbox() {
	((WebElement) studentnamedropdown).click();
	Boolean firstsearchboxPresent = studentnamesearchbox.isDisplayed (); 
	 
	if (firstsearchboxPresent==true) 
	{ 
		System.out.println ("studentnamesearchbox is appearing"); } 
	else { System.out.println ("studentnamesearchbox is not appearing"); }

}
public void clickstudentserachbox() {
	studentnamesearchbox.click();
}
public void validatebatchidsearchbox() {
	batchiddropdown.click();
	Boolean secondsearchboxPresent = batchidsearchbox.isDisplayed (); 
	if(secondsearchboxPresent==true)
	{
		System.out.println ("batchidsearchbox is appearing"); } 
	else { System.out.println ("batchidsearchbox is not appearing"); }

}
public void clickbatchidserachbox() {
	batchidsearchbox.click();
}

public String studentnamespellcheck() {
	if(driver.getPageSource().contains(studentnametext.getText()))
		return studentnametext.getText();
	else 
		return "String not found";
	
}
public String batchidspellcheck()	{	
	if(driver.getPageSource().contains(batchidtext.getText()))
		return batchidtext.getText();
	else 
		return "String not found";
}		
		
		
	public void studentnamecolor() {
	  String color = studentnamecolor .getCssValue("color");
	  String hex = Color.fromString(color).asHex();
	  
	  if (hex=="#808080" ) {
		  Loggerload.info("StudentName String is in grey color");
	  }
	  else {
		  Loggerload.info("StudentName String is not in grey color");
	  }
}

	public void batchidcolor() {
		  String color = batchidcolor .getCssValue("color");
		  String hex = Color.fromString(color).asHex();
		  
		  if (hex=="#808080" ) {
			  Loggerload.info("BatchID String is in grey color");
		  }
		  else {
			  Loggerload.info("BatchID String is not in grey color");
		  }
	}
public void validatefirststudentnamelabel() {
	
	//WebElement element = driver.findElement(By.id("dropdown"));
	Select select = new Select(studentnamedropdown);
	List<WebElement> options = select.getOptions();
	boolean found = false;
	for (WebElement option : options) {
	    if (option.getText().equals("SelectStudentName")) {
	        found = true;
	        break;
	    }
	}
	if (found) {
	    System.out.println("SelectStudentName exists");
	} else {
	    System.out.println("SelectStudentName does not exist");
	}

	
		
	}

public void validatesecondbatchidlabel() {
	
	batchiddropdown.getText();
	//WebElement element = driver.findElement(By.id("dropdown"));
	Select select1 = new Select(batchiddropdown);
	List<WebElement> options = select1.getOptions();
	boolean found = false;
	for (WebElement option1 : options) {
	    if (option1.getText().equals("SelectbatchId")) {
	        found = true;
	        break;
	    }
	}
	if (found) {
	    System.out.println("SelectbatchId exists");
	} else {
	    System.out.println("SelectbatchId does not exist");
	}

	
}
	       
	 
public void validatestudentnamescrolldown() {
	List<WebElement> optionList = driver.findElements(By.xpath("//*[@id='studentlist-1277-listEl']/li"));
	((JavascriptExecutor)driver).executeScript("arguments[0 , 30].scrollIntoView(true);", optionList.get(4) );
	
		    }
    

public void validatebatchidscrolldown() {
	List<WebElement> optionList = driver.findElements(By.xpath("//*[@id='batchlist-1277-listE2']/li"));
	((JavascriptExecutor)driver).executeScript("arguments[0,30].scrollIntoView(true);", optionList.get(5) );
	
		    }

	
	
	public void validatebatchidnumbers() {
		WebElement dropdown = batchiddropdown;
		Select select = new Select(dropdown);
		select.selectByValue("1");

		String selectedOption = select.getFirstSelectedOption().getText();
		if (selectedOption.matches("\\d+")) {
		    System.out.println("Selected option is a number");
		} else {
		    System.out.println("Selected option is not a number");
		}

		
	}
	
	public void validatefadestudentname() {
		WebElement dropdown = studentnamedropdown;
		Select select = new Select(dropdown);
		select.selectByVisibleText("options");
		
	}
	public void validatefadebatchid() {
		WebElement dropdown = batchiddropdown;
		Select select = new Select(dropdown);
		select.selectByVisibleText("options");
	}
	public void verifyxalphabet() {
		WebElement element = studentnamesearchbox;
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		boolean found = false;
		for (WebElement option : options) {
		    if (option.getText().startsWith("x")) {
		        found = true;
		        break;
		    }
		}
		if (found) {
		    System.out.println("The dropdown contains an option starting with 'x'.");
		} else {
		    System.out.println("The dropdown does not contain an option starting with 'x'.");
		}

		
		
	}
	public void verifynumber() {
		
		WebElement element = batchidsearchbox;
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		boolean found = false;
		for (WebElement option : options) {
		    if (option.getText().startsWith("6")) {
		        found = true;
		        break;
		    }
		}
		if (found) {
		    System.out.println("The dropdown contains an option starting with '6'.");
		} else {
		    System.out.println("The dropdown does not contain an option starting with '6'.");
		}

		
		
	}
	public void clickprogrambutton(){
		
			programbutton.click();
	}
	public void clickbatchbutton(){
		
		batchbutton.click();
}
public void clickclassbutton(){
		
		classbutton.click();
}
	public void clickuserbutton(){
		
		userbutton.click();
}
	public void clickassignmentbutton(){
		
		assignmentbutton.click();
}
	public void clickattendancebutton(){
		
		attendancebutton.click();
}
	public void clicklogoutbutton(){
		
		logoutbutton.click();
}
				
	
	public void PageDisplay() 
	{
		
	}
	public void fillAllFields(String studentname,String batchid) {
		
		Select select1= new Select(studentnamedropdown);
		select1.selectByVisibleText(studentname);
		Select select2= new Select(batchiddropdown);
		select2.selectByValue(batchid);
	}
		public boolean studentDisplay(String StudentDetails) {
			boolean isFound=false;
			for(WebElement row:rows) {
				if(row.getText().equals(StudentDetails))
						isFound=true;
				break;
			}
			
			return isFound;
			}
		
		public boolean studentdisplay(StudentPage StudentDetails) {
			boolean isFound=false;
			for(WebElement row:rows) {
				if(row.getText().equals(StudentDetails))
						isFound=true;
				break;
			}
			return isFound;
			}	
}
	




