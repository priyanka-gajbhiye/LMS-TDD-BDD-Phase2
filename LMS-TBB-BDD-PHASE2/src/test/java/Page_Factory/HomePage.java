package Page_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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

public class HomePage {
	
	 public static WebDriver driver=BrowserManager.getdriver();
	 String url=ConfigfileReader.getApplicationUrl();
	 String LinkURL = "";
	 String invalid_url=ConfigfileReader.getInvalidUrl();
	 HttpURLConnection huc = null;
     int respCode = 200;
	 
	 @FindBy (xpath  = "//a/button") WebElement loginbtn ;
	 @FindBy (xpath  = "//a[text()='Customers']") WebElement learningtext ;	
	 @FindBy (xpath  = "//a[text()='Management']") WebElement managementtext ;
	 @FindBy (xpath  = "//a[text()='Systems']") WebElement systemtext;
	 @FindBy (xpath  = "//a[text()='Login']") WebElement logintext ;
	 @FindBy (xpath  = "//icon") WebElement logoimage ;
	 
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void url() {
		driver.get(url);
	}
	
	public void invalid_url() {
		driver.get(invalid_url);
		System.out.println("Incorrect URL");
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
		 Assert.assertEquals("SYSTEM",textlogintext);
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

}
