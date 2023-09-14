package utilities;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;


public class ScreenShots_Utils {
	
public static void capturescreenshots (WebDriver driver, String filename) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./screenshots/"+filename+""));
}

public static void webeScreenshot(WebDriver driver, WebElement Element) throws IOException {
	Screenshot shot = new AShot().takeScreenshot(driver, Element);
	File image = new File("\\ElementImages\\logo.png");
	  
	  ImageIO.write(shot.getImage(), "PNG", image);
	//Getting Expected Image
	  BufferedImage expectedImg = ImageIO.read(image);
	  
	  //Getting Actual Image
	  BufferedImage actualImg = shot.getImage();
	  
	  //Image Comparison
	  ImageDiffer imgDiff = new ImageDiffer();
	  ImageDiff dif = imgDiff.makeDiff(expectedImg, actualImg);
	  if(dif.hasDiff()){
		  System.out.println("Both images are different");
	  }else {
		  System.out.println("Both images are same");
	  }
	  
	
}

}
