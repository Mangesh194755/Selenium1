package switchToPractice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows4 {
	
	@Test()
	public void handleWindow() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent window - "+parent);

		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		//driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
		//driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		//driver.switchTo().window(parent);
				
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> child = new ArrayList<>(allWindows);
		
		for(String windowName : child)
		{
			if(!parent.equalsIgnoreCase(windowName)) {

				System.out.println("Name of child windows are - "+ windowName);
				
			}
			
		}
		
		driver.switchTo().window(child.get(1));
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(child.get(2));
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(child.get(3));
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();
		
	}

}