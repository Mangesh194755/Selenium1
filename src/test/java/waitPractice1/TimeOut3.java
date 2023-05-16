package waitPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeOut3 {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mu.ac.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.findElement(By.xpath("//a[text()=\"STUDENTS\"]")).click();
		
		driver.findElement(By.xpath("//a[text()=\"ADMISSION\"]")).click();
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
