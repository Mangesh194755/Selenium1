package switchToPractice1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows2 {
	
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
		Set<String> allWindows = driver.getWindowHandles();
		
		ArrayList<String> tabs = new ArrayList(allWindows);
		
		//WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
		//newTab.get("https://www.facebook.com/");


		driver.findElement(By.xpath("//a[@href=\"http://www.google.com\"]")).click();
		driver.switchTo().window(parent);

		driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com\"][1]")).click();
		driver.switchTo().window(parent);
		

		driver.findElement(By.xpath("//a[@href=\"http://www.yahoo.com\"]")).click();
		driver.switchTo().window(parent);

		driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com\"][2]")).click();
		//driver.switchTo().window(parent);
		Thread.sleep(2000);
		//driver.navigate().back();
		
		driver.switchTo().window(tabs.get(0));
		System.out.println("Tab name - "+ driver.getTitle());
		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(tabs.get(1));
		System.out.println("Tab name - "+ driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		System.out.println("Tab name - "+ driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		driver.quit();
//
//		driver.switchTo().window(tabs.get(0));
//		System.out.println("Tab name - "+ driver.getTitle());
		
		}
				
}