package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigfileReader {
	
	private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/config/config.properties";

	public static void loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(" Not found Configuration.properties " + propertyFilePath);
		}
	}
	public static String getBrowserType() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not available. ");
	}

	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		System.out.println("URL is " +url);
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not available. ");
	}
	
	public static String getInvalidUrl() {
		String invalid_url = properties.getProperty("invalid_url");
		if (invalid_url != null)
			return invalid_url;
		else
			throw new RuntimeException("Invalid URL is empty ");
	}

	public static String getManageAssignmentUrl() {
		String url = properties.getProperty("manageassignment_url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("manage assignment url not available. ");
	}
	
  
	public static String getManageProgramUrl() {
		String url = properties.getProperty("manageprogram_url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("manage program url not available. ");
	}
	public static String getManageBatchUrl() {
		String url = properties.getProperty("managebatch_url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("manage batch url not available. ");
	}
	
	public static String studentdetailUrl() {
		String invalid_url = properties.getProperty("studenturl");
		if (invalid_url != null)
			return invalid_url;
		else
			throw new RuntimeException("studenturl is empty");
	}
	public static String manageuserUrl() {
		String invalid_url = properties.getProperty("manageuserurl");
		if (invalid_url != null)
			return invalid_url;
		else
			throw new RuntimeException("manageuserurl is empty");
	}
	public static String dashboardUrl() {
		String invalid_url = properties.getProperty("Dashboardurl");
		if (invalid_url != null)
			return invalid_url;
		else
			throw new RuntimeException("Dashboardurl is empty");
  }
    
	public static String getManageClassUrl() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not available. ");
  }
  public static String getManageAttendanceUrl() {
		String url = properties.getProperty("manageattendance_url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Manage Attendance url not available. ");
  }

	
}
