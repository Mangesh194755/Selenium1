package screenShotPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot2 {
	
	WebDriver driver;
	
	@Test
	public void test2()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg/");
		
		//Utility.captureScreenshot(driver, "Loaded");
				
		driver.findElement(By.xpath("//button[@name='websubmit1']")).click();
		
		//Utility.captureScreenshot(driver, "Error");
		
	}

	@AfterMethod
	public void teardown(ITestResult result) throws Exception
	{
		if (ITestResult.FAILURE  == result.getStatus())
		{
			Utility.captureScreenshot(driver, result.getName());
			
			driver.quit();
			
		
		}
	}
	
}
