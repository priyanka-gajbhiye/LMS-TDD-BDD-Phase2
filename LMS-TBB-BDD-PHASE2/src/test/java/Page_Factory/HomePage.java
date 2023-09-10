package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;

public class HomePage {

	public static WebDriver driver=BrowserManager.getdriver();
	 String url=ConfigfileReader.getApplicationUrl();
	 String invalid_url=ConfigfileReader.getInvalidUrl();
	 
	 @FindBy (xpath  = "//a/button") WebElement loginbtn ;
		
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void url() {
		driver.get(url);
	}
	
	public void invalid_url() {
		driver.get(invalid_url);
	}
}
