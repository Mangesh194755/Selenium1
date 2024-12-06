package test123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Calculatedate {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.calculator.net/date-calculator.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		Select startMonth = new Select(driver.findElement(By.xpath("//form[@name='calcf']//select[@id='today_Month_ID']")));
		startMonth.selectByVisibleText("Jun");
		Thread.sleep(1000);
		
		Select startDay = new Select(driver.findElement(By.xpath("//form[@name='calcf']//select[@id='today_Day_ID']")));
		startDay.selectByVisibleText("1");
		Thread.sleep(1000);
		
		Select endMonth = new Select(driver.findElement(By.xpath("//form[@name='calcf']//select[@id='ageat_Month_ID']")));
		endMonth.selectByVisibleText("Oct");
		Thread.sleep(1000);
		
		Select endDay = new Select(driver.findElement(By.xpath("//form[@name='calcf']//select[@id='ageat_Day_ID']")));
		endDay.selectByVisibleText("31");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='addendday']//span[@class='cbmark']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@name='calcf']//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		String output = driver.findElement(By.xpath("//p[@class='bigtext']/b")).getText();
		
		System.out.println(output);
				
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}