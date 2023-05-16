package screenShotPractice1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot1 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg/");
		
		Utility.captureScreenshot(driver, "Loaded");
				
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Utility.captureScreenshot(driver, "Error");

		driver.quit();
		
	}

}
