/* Multiple file upload */

package autoITPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT2 {
	
	@Test
	
	public void multiFileUpload() throws Exception 
	{
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement ele = driver.findElement(By.cssSelector("#file-upload"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).click().perform();
		
		Runtime.getRuntime().exec("D:\\AutoIT\\fileSci1.exe" +" "+ "C:\\Users\\mange\\Desktop\\Testfile1.txt");
		
//
//		act.moveToElement(ele).click().perform();
//		
//		Thread.sleep(2000);
//		
//		Runtime.getRuntime().exec("D:\\AutoIT\\fileSci1.exe" +" "+ "D:\\AutoIT\\Testfile2.txt");
//		
//		act.moveToElement(ele).click().perform();
//		
//		Thread.sleep(2000);
//		
//		Runtime.getRuntime().exec("D:\\AutoIT\\fileSci1.exe" +" "+ "D:\\AutoIT\\Testfile3.txt");
//		
//		Thread.sleep(2000);
		
		//driver.quit();
	
	}

}
