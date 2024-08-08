package test123;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calculate {
	
	public static void main(String[] args) throws Exception {

		WebDriver driver;
		ChromeOptions opt = new ChromeOptions();
		
		opt.setExperimentalOption("excludeSwitches",List.of("--disable-infobar","enable-automation"));
		opt.addArguments("--start-maximized");
		opt.addArguments("--incognito");
		driver = new ChromeDriver(opt);
		
		driver.get("https://www.timeanddate.com/date/duration.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@id='datetabs_duration']")).click();
		driver.findElement(By.xpath("//input[@id='d1']")).sendKeys("01");
		driver.findElement(By.xpath("//input[@id='m1']")).sendKeys("06");
		driver.findElement(By.xpath("//input[@id='y1']")).sendKeys("2015");
		
		driver.findElement(By.xpath("//a[@onclick='return settoday(2)']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
