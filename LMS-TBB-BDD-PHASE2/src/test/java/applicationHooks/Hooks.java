package applicationHooks;

import org.openqa.selenium.WebDriver;
import Page_Factory.BrowserManager;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utilities.ConfigfileReader;
import utilities.Loggerload;

public class Hooks {

	private static WebDriver driver;
	private static BrowserManager browsermanager;
	static Scenario scenario;

	@BeforeAll
	public static void before() throws Throwable {
		
		ConfigfileReader.loadConfig();
		String browser = ConfigfileReader.getBrowserType();
		Loggerload.info("Test is running on "+browser);
		
		browsermanager = new BrowserManager();
		driver = browsermanager.initializeDrivers(browser);
		
		Loggerload.info("Driver is Intialized");
	}

}
