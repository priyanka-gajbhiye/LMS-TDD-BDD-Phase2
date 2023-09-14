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
			throw new RuntimeException("Invalid URL is empty");
	}
	
	
	public static String getManageClassUrl() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not available. ");
	}

}
