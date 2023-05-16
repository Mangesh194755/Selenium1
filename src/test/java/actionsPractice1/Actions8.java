package actionsPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions8 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown']//a"));
		
		int total_links = links.size();
		System.out.println("Total links are - "+total_links);
		
		for (WebElement topic : links)
		{
			String text = topic.getAttribute("innerHTML");
			
			if (text.equalsIgnoreCase("TestNG"))
			{
				topic.click();
				break;
			}
		}
		
		//div[@class='dropdown']//a
		//div[@class='dropdown']//a[text()='Selenium']
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
