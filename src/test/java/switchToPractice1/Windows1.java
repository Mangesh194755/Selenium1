package switchToPractice1;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows1 {
	
	WebDriver driver;
	
	@Test
	public void window() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window is - "+ parent);
		driver.findElement(By.xpath("//a[@href=\"http://www.google.com\"]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total windows are "+count);
		
		for (String child :allWindows ) 
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				Thread.sleep(3000);
				
				driver.close();
			}
		}

		driver.switchTo().window(parent);
		driver.close();
		
	}
		
	@Test
	public void window1() 
	{
			
	}
				
}