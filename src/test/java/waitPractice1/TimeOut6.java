package waitPractice1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeOut6 {

	WebDriver driver;
	
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
				
		driver.findElement(By.xpath("//button[@onclick=\"timedText()\"]")).click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(15 ))
		       .pollingEvery(Duration.ofSeconds(2))
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() 
		   {
		     public WebElement apply(WebDriver driver) 
		     {
		       return driver.findElement(By.xpath("//p[text()='WebDriver']"));
		     }
		     }
		   );
		   
		   if(element.isDisplayed())  
		   {
			   System.out.println("Element is present");
		   }
		   else
		   {
			   System.out.println("Element is not present");
		   }

			
		driver.quit();
		
	}

}