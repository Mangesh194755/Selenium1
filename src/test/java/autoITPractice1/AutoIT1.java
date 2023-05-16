package autoITPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT1 {
	
	
	public static void main(String[] arg) throws Exception 
	{
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#file-upload"));
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("D:\\AutoIT\\fileSci1.exe");
		
		Thread.sleep(5000);
		
		driver.quit();
	
	}

}
