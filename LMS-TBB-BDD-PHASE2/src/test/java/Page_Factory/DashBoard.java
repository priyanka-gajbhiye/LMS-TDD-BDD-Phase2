package Page_Factory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.ConfigfileReader;
import utilities.ExcelReader;
import utilities.Loggerload;

public class DashBoard {
	
	public static WebDriver driver=BrowserManager.getdriver();
	 String url=ConfigfileReader.getApplicationUrl();
	 String LinkURL = "";
	 String invalid_url=ConfigfileReader.getInvalidUrl();
	 HttpURLConnection huc = null;
    int respCode = 200;
    Actions act = new Actions(driver);
    ExcelReader reader = new ExcelReader();
    long start; 
	
	
	@FindBy (xpath  = "//user") WebElement loginuser;
	@FindBy (xpath  = "//password") WebElement loginpassword;
	@FindBy(xpath="//*[text()='Header']") WebElement header;
	@FindBy (xpath  = "//user") WebElement loginbtn;
	@FindBy (xpath  = "//password") WebElement title;
	
	@FindBy (xpath  = "//a/href/label") WebElement navbar;
	@FindBy(xpath="//*[text()='LMS - Learning Management System']") WebElement navigation_header;
	@FindBy(xpath="//*[text()='Student']") WebElement student;
	@FindBy(xpath="//*[text()='Program']") WebElement program;
	@FindBy(xpath="//*[text()='Batch']") WebElement batch;
	@FindBy(xpath="//*[text()='Class']") WebElement class_nm;
	@FindBy(xpath="//*[text()='User']") WebElement user;
	@FindBy(xpath="//*[text()='Assignment']") WebElement assignment;
	@FindBy(xpath="//*[text()='Attendence']") WebElement attendence;
	@FindBy(xpath="//*[text()='Logout']") WebElement logout;
	
	
	public void url() {
		driver.get(url);
	}
	 
	
	public void validcredentials() throws InvalidFormatException, IOException {
		List<Map<String,String>> testData=reader.getData(".\\TestData\\Login.xlsx", "Login");
		String user=testData.get(1).get("User");
		String password=testData.get(1).get("Password");
		loginuser.sendKeys(user);
		loginpassword.sendKeys(password);
	}
	public void logincheck() {
		loginbtn.click();
		start = System.currentTimeMillis();
	
	}
	public String Header() {	
		return header.getText();
	}
	
	public void ResponseTime(Integer int1) {
		//capture time after load
		long end=System.currentTimeMillis();
		//calculate time
		long pageload_time=end-start;
		
		if (pageload_time<int1) {
			Loggerload.info("Page Load time less than 30 miliseconds");
		}
		else
		{Loggerload.info("Page Load time more than 30 miliseconds");		
			
		}
	}
	
	public void title(String string) {
		String title = driver.getTitle();
		Assert.assertEquals(string,title);
		System.out.println(title);		
		
	}
	public void broken_links() {
		//WebElement Link = driver.findElement(By.tagName("a"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
        	LinkURL = it.next().getAttribute("href");
            
            System.out.println(LinkURL);
		//String LinkURL = Link.getAttribute("href");
		
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
	public void titlelocationleft() {
		int winHeight = driver.manage().window().getSize().getHeight();
		int winWidth = driver.manage().window().getSize().getWidth();
		
		int xPos = title.getLocation().getX();
		int yPos = title.getLocation().getY();
		int eleHeight = title.getSize().getHeight();
		int eleWidth = title.getSize().getWidth();
		
		if (((xPos + eleWidth) <= winWidth/2) && ( (yPos + eleHeight) <= winHeight/2)) {
	        Loggerload.info("Title is NOT in the upper left quadrant");
		}
		else {
			Loggerload.info("Title is in the upper left quadrant");
		}
	}
	
	public void titlelocationright() {
		int winHeight = driver.manage().window().getSize().getHeight();
		int winWidth = driver.manage().window().getSize().getWidth();
		
		int xPos = student.getLocation().getX();
		int yPos = student.getLocation().getY();
		int eleHeight = student.getSize().getHeight();
		int eleWidth = student.getSize().getWidth();
		
		if (((xPos + eleWidth) >= winWidth/2) && ( (yPos + eleHeight) >= winHeight/2)) {
	        Loggerload.info("Navigation Bar is NOT in the upper right quadrant");
		}
		else {
			Loggerload.info("Navigation Bar is in the upper right quadrant");
		}
	}
	
	public void validatenavbar(Integer int1 ) {
		 List<WebElement> links = driver.findElements(By.xpath("//a/href"));
		 
		 for (int i= 0 ; i <= links.size(); i++) {
		 switch(int1) {
		  case 0:
		    if (links.get(i).getText() == "Students") {
		    	Loggerload.info("Admin is able to see Students in 1st place ");
		    }
		    break;
		  case 1:
			  if (links.get(i).getText() == "Program") {
			    	Loggerload.info("Admin is able to see Program in 2nd place ");
			    }
		    break;
		  case 2:
			  if (links.get(i).getText() == "Batch") {
			    	Loggerload.info("Admin is able to see Batch in 3rd place ");
			    }
			    break;
		  case 3:
			  if (links.get(i).getText() == "Class") {
			    	Loggerload.info("Admin is able to see Class in 4th place ");
			    }
			    break;
		  case 4:
			  if (links.get(i).getText() == "User") {
			    	Loggerload.info("Admin is able to see USer in 5th place ");
			    }
			    break;
		  case 5:
			  if (links.get(i).getText() == "Assignment") {
			    	Loggerload.info("Admin is able to see Assignment in 6th place ");
			    }
			    break;
		  case 6:
			  if (links.get(i).getText() == "Attendence") {
			    	Loggerload.info("Admin is able to see Attendence in 7th place ");
			    }
			    break;
		  case 7:
			  if (links.get(i).getText() == "Logout") {
			    	Loggerload.info("Admin is able to see Logout in 8th place ");
			    }
			    break;  	  	    
		  default:
			  Loggerload.info("Navigation Bar alignment is incorrect ");
		}
	}
	
	}
	
	public void logout() {
		logout.click();
		
	}
	
	public String spellcheck() {
		if(driver.getPageSource().contains(navigation_header.getText()))
			return navigation_header.getText();
		if(driver.getPageSource().contains(student.getText()))
			return student.getText();
		if(driver.getPageSource().contains(program.getText()))
			return program.getText();
		if(driver.getPageSource().contains(batch.getText()))
			return batch.getText();
		if(driver.getPageSource().contains(class_nm.getText()))
			return class_nm.getText();
		if(driver.getPageSource().contains(user.getText()))
			return user.getText();
		if(driver.getPageSource().contains(assignment.getText()))
			return assignment.getText();
		if(driver.getPageSource().contains(attendence.getText()))
			return attendence.getText();
		if(driver.getPageSource().contains(logout.getText()))
			return logout.getText();
		else 
			return "String not found";
		}
}
