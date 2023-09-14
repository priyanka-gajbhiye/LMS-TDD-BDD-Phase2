package Page_Factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;

	
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import utilities.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	 public static WebDriver driver=BrowserManager.getdriver();
	 String url=ConfigfileReader.getApplicationUrl();
	 String LinkURL = "";
	 String invalid_url=ConfigfileReader.getInvalidUrl();
	 HttpURLConnection huc = null;
     int respCode = 200;
     Actions act = new Actions(driver);
     ExcelReader reader = new ExcelReader();
	 
	 @FindBy (xpath  = "//a/button") WebElement loginbtn ;
	 @FindBy (xpath  = "//a[text()='Customers']") WebElement learningtext ;	
	 @FindBy (xpath  = "//a[text()='Management']") WebElement managementtext ;
	 @FindBy (xpath  = "//a[text()='Systems']") WebElement systemtext;
	 @FindBy (xpath  = "//a[text()='Login']") WebElement logintext ;
	 @FindBy (xpath  = "//icon") WebElement logoimage ;
	 @FindBy (xpath  = "//loginpageheader") WebElement loginpageheader;
	 @FindBy (xpath  = "//loginpagetrailer") WebElement loginpagetrailer;
	 @FindBy (xpath  = "//user") WebElement loginuser;
	 @FindBy (xpath  = "//input[@type='text']") WebElement textcheckuser;
	 @FindBy (xpath  = "//input[@type='password']") WebElement textcheckpassword;
	 @FindBy (xpath  = "//a/button") WebElement loginpageloginbtn ;
	 @FindBy (xpath  = "//password") WebElement loginpassword;
	 @FindBy (xpath  = "//user//span[@class='Field_RequiredStar'][1]") WebElement loginuserasterick;
	 @FindBy (xpath  = "//password//span[@class='Field_RequiredStar'][1]") WebElement loginpasswordasterick;
	 @FindBy (xpath  = "//a/button") WebElement forgotUsernamePassword ;
	 @FindBy (xpath  = "//a[text()='Customers']") WebElement resetpassword ;
	 @FindBy (xpath  = "//a[text()='Email']") WebElement emailtext ;
	 @FindBy (xpath  = "//a[text()='SendLink']") WebElement sendlink ;
	 @FindBy (xpath  = "//a[text()='Email']") WebElement submitbtn ;
	 @FindBy (xpath  = "//a[text()='password']") WebElement resetnewpassword ;
	 @FindBy (xpath  = "//a[text()='password']") WebElement retypenewpassword ;
	 
	 
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void url() {
		driver.get(url);
	}
	
	public void invalid_url() {
		driver.get(invalid_url);

	}

	
	
	
	
	public void invalidURLstatus() {
		assertTrue(driver.getTitle().contains("404"));
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
	
	public void spellchecker() {
	 String textLearning = learningtext.getText();
	 Assert.assertEquals("LEARNING",textLearning);
		System.out.println(textLearning);
		
		String textmanagementtext = managementtext.getText();
		 Assert.assertEquals("MANAGEMENT",textmanagementtext);
		 System.out.println(textmanagementtext);
		
		 String textsystemtext = systemtext.getText();
		 Assert.assertEquals("SYSTEM",textsystemtext);
		 System.out.println(textsystemtext);
		 
		 String textlogintext = logintext.getText();
		 Assert.assertEquals("LOGIN",textlogintext);
		 System.out.println(textlogintext);
		
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
	
	public void correctlogo(WebElement img) throws IOException {
		img=logoimage;
		ScreenShots_Utils.webeScreenshot(driver,img);
	}
	
	public void loginbtncheck() {
		if(loginbtn.isDisplayed()) 
		{
		    System.out.println("Login button is Displayed");
		}
		else
		    System.out.println("Show more is not there");
	}
	public void logincheck() {
		loginbtn.click();
	}
	public void textcheck(int a) {
		List<WebElement> textfields = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		int size = textfields.size();
		if(size==a) {
			Loggerload.info("2 text feilds are present");
		}
		else {
			Loggerload.info("text feilds are not 2");
		}
	}
	public void getallText() {
		driver.getPageSource();
	}
	
	public void headerlogin(String string) {
		String expectedmsg = string;
		String actualmsg = loginpageheader.getText();
		Assert.assertEquals(expectedmsg,actualmsg);
		 System.out.println(actualmsg);
	}
	
	public void usertext(String string) {
  	  String expectedmsg = string;
		String actualmsg = loginuser.getText();
		Assert.assertEquals(expectedmsg,actualmsg);
		 System.out.println(actualmsg);
    }
    
    public void passwordtext(String string) {
  	  String expectedmsg = string;
		String actualmsg = loginpassword.getText();
		Assert.assertEquals(expectedmsg,actualmsg);
		 System.out.println(actualmsg);
    }
	
      public void astrikuser(String string) {
    	  String expectedmsg = string;
  		String actualmsg = loginuserasterick.getText();
  		Assert.assertEquals(expectedmsg,actualmsg);
  		 System.out.println(actualmsg);
      }
      
      public void astrikpassword(String string) {
    	  String expectedmsg = string;
  		String actualmsg = loginpasswordasterick.getText();
  		Assert.assertEquals(expectedmsg,actualmsg);
  		 System.out.println(actualmsg);
      }
      
      public void centrepage() {
          Dimension dimuser = loginuser.getSize();
          Dimension dimpassword = loginpassword.getSize();
         int heightuser= dimuser.height;
         int widthuser=dimuser.width;
         int heightpassword= dimpassword.height;
         int widthpassword=dimpassword.width;
         
         if (heightuser>30 & heightuser<60 & widthuser>400 & widthuser<600 & heightpassword >30 &heightpassword<60 
        		 & widthpassword>400 & widthpassword<600 ) {
        	Loggerload.info("Both text boxes are in page center");
         }  
      }
      
      public void centreloginbtn() {
          Dimension dimuser = loginbtn.getSize();
         int heightuser= dimuser.height;
         int widthuser=dimuser.width;
         
         if (heightuser>30 & heightuser<60 & widthuser>400 & widthuser<600  ) {
        	Loggerload.info("Login button in the centre");
         }  
      }
      
      public void usercolor() {
    	  String color = loginuser.getCssValue("color");
    	  String hex = Color.fromString(color).asHex();
    	  
    	  if (hex=="#808080" ) {
    		  Loggerload.info("User String is in grey color");
    	  }
    	  else {
    		  Loggerload.info("User String is not in grey color");
    	  }
      }
      
      public void passwordcolor() {
    	  String color = loginpassword.getCssValue("color");
    	  String hex = Color.fromString(color).asHex();
    	  
    	  if (hex=="#808080" ) {
    		  Loggerload.info("User String is in grey color");
    	  }
    	  else {
    		  Loggerload.info("User String is not in grey color");
    	  }
      }
      
      public void forgotUsernamePassword() {
  		if(forgotUsernamePassword.isDisplayed()) 
  		{
  		    Loggerload.info("Forgot Username & Password Link is Displayed");
  		}
  		else
  		{ Loggerload.info("Link is not available");
  	}
      }
      
      public void resetpassword() {
    		if(resetpassword.isDisplayed()) 
    		{
    		    Loggerload.info("Resetpassword Link is Displayed");
    		}
    		else
    		{ Loggerload.info("Link is not available");
    	}
        }
      
      public void validuser(String user) {
    	  loginuser.sendKeys(user);
      }
      
      public void validpassword(String password) {
    	  loginpassword.sendKeys(password);
      }
      public void loginpageloginbtn() {
    	  loginpageloginbtn.click();
      }
      public void invalidlogin(String user, String password) {
    	  loginuser.sendKeys(user);
    	  loginpassword.sendKeys(password);
    	  loginbtn.click();
      }
      public void keyboardaction() {	  
    	  act.moveToElement(loginpageloginbtn).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
      }

      public void mouseaction() {
    	  act.doubleClick(loginpageloginbtn).perform();
      }
      public void forgotUsernamePasswordbtn () {
    	  forgotUsernamePassword.click();
      }
      public void emailcolor() {
    	  String color = emailtext.getCssValue("color");
    	  String hex = Color.fromString(color).asHex();
  	  
    	  if (hex=="#808080" ) {
    		  Loggerload.info("Email String is in grey color");
    	  }
    	  else {
    		  Loggerload.info("Email String is not in grey color");
    	  }
      }
      
      public void sendlinkbtn() {
  		if(sendlink.isDisplayed()) 
  		{
  			Loggerload.info("Send link button is displayed");
  		}
  		else
  			Loggerload.info("Send link button is not displayed");
  	}
      public void astrikemail(String string) {
    	  String expectedmsg = string;
  		String actualmsg = emailtext.getText();
  		Assert.assertEquals(expectedmsg,actualmsg);
  		 System.out.println(actualmsg);
      }
      
      public void centresendlibtn() {
          Dimension dimuser = sendlink.getSize();
         int heightuser= dimuser.height;
         int widthuser=dimuser.width;
         
         if (heightuser>30 & heightuser<60 & widthuser>400 & widthuser<600  ) {
        	Loggerload.info("Login button in the centre");
         }  
      }
      public void validemail(String email) {
    	  emailtext.sendKeys(email);
      }
      
      public void invalidemail(String email) {
    	  emailtext.sendKeys(email);
      }
      public void resetpasswordclick() {
    	  resetpassword.click();
      }
      public void submitbtn() {
    		if(submitbtn.isDisplayed()) 
    		{
    		    Loggerload.info("Submit is button displayed");
    		}
    		else
    			Loggerload.info("Submit is not button displayed");
    	}
      public void centresubmitbtn() {
          Dimension dimuser = submitbtn.getSize();
         int heightuser= dimuser.height;
         int widthuser=dimuser.width;
         
         if (heightuser>30 & heightuser<60 & widthuser>400 & widthuser<600  ) {
        	Loggerload.info("Login button in the centre");
         }  
      }
      
      public void checklables( ) {
    	  List<WebElement> listlables = driver.findElements(By.xpath("//*[label]/td/b"));
    	  int labelsize = listlables.size();
    	  
    	  if (labelsize != 2) {
    		  Loggerload.info("These are not expected number of lables."); 
    	  }
    	  else
    	  {
            if (listlables.get(1).getText() == "Type in new password" ) {
            	Loggerload.info("Type in new password label is correct"); 	
            }
            else if (listlables.get(2).getText() == "Retype password")
            {
            	Loggerload.info("Retype password label is correct"); 
            }
    	    }
      }
      public void textenablement() {
  		if(!resetpassword.isEnabled()) 
  		{
  		    Loggerload.info("Text is Enabled");
  		}
  		else
  		{ Loggerload.info("Text is not Enabled");
  	}
      }
      public void enabletext() {
    	  resetpassword.click();
    		if(resetpassword.isEnabled()) 
    		{
    		    Loggerload.info("Text is Enabled");
    		}
    		else
    		{ Loggerload.info("Text is not Enabled");
    	}
        }
      public void enableretypetext() {
    	  retypenewpassword.click();
    		if(retypenewpassword.isEnabled()) 
    		{
    		    Loggerload.info("Text is Enabled");
    		}
    		else
    		{ Loggerload.info("Text is not Enabled");
    	}
        }
      public void newpassword(String newpassword) {
    	  loginuser.sendKeys(newpassword);
      }
      
      public void retypepassword(String retypepassword) {
    	  loginpassword.sendKeys(retypepassword);
      }
      
      public void submitbtnclick() {
    	  submitbtn.click();
      }

}
