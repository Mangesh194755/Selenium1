package prac2021;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aug_03_2016 {
	//static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		new WebDriverWait(driver, Duration.ofSeconds(5)).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']")));

		String monthYearVal = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthYearVal);
		
		String month = monthYearVal.split(" ")[0];
		String year = monthYearVal.split(" ")[1];
		
		while (!(month.equals("June") && year.equals("2023"))) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthYearVal = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			System.out.println(monthYearVal);
			
			 month = monthYearVal.split(" ")[0];
			 year = monthYearVal.split(" ")[1];
		}
		driver.findElement(By.xpath("//a[text()='24']")).click();
		
		driver.quit();

}}