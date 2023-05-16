package actionsPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions7 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@name='email']"));
		
		Actions act1 = new Actions(driver);
		
		act1.sendKeys("Test")
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("123456")
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		
		Thread.sleep(10000);
		
		driver.quit();
		
	}

}
