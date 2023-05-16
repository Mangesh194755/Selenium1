package screenShotPractice1;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver, String screenShotName) throws Exception 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./ScreenShots/"+ screenShotName +".png"));
		
		
	}

}
