package waitPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeOut4 {

	WebDriver driver;
	
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
				
		driver.findElement(By.xpath("//button[@onclick=\"timedText()\"]")).click();
	

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"WebDriver\"]")));
				
		
//		WebElement ele = driver.findElement(By.xpath("//p[text()=\"WebDriver\"]"));

//		wait.until(ExpectedConditions.visibilityOf(ele));

		boolean status = ele.isDisplayed();
		
		if(status)
		{
			System.out.println("Element displayed");
		}
		else
		{
			System.out.println("Element not dispayed");
		}
		
		System.out.println(ele.getText());
		
		driver.quit();
		
	}

}