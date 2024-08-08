package prac2021;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aug_03_1_2016 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		new WebDriverWait(driver, Duration.ofSeconds(5)).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']")));
		
		//Aug_03_1_2016 obj = new Aug_03_1_2016();
		selectDate("28", "February", "2024");
		
	}

	public static String[] getMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	}

	public static void selectDate(String expDate, String expMonth, String expYear) {
		
		// if the year is divided by 4
	    if (Integer.parseInt(expYear) % 4 == 0 && Integer.parseInt(expDate)>28) {

	      // if the year is century
	      if (Integer.parseInt(expYear) % 100 == 0 && Integer.parseInt(expDate)>28) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (Integer.parseInt(expYear) % 400 == 0 && Integer.parseInt(expDate)>28)
	        	System.out.println("Entered date "+expDate+" "+expMonth+" is wrong ");
	          return;
	      }
		
//		if(expMonth.equals("February")&& Integer.parseInt(expDate)>28) 
//		{
//			System.out.println("Entered date "+expDate+" "+expMonth+" is wrong ");
//			return;
//		}
		
		String monthYearVal = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthYearVal);

		while (!(getMonthYear(monthYearVal)[0].equals(expMonth) 
				&& 
				getMonthYear(monthYearVal)[1].equals(expYear))) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthYearVal = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		driver.findElement(By.xpath("//a[text()='" + expDate + "']")).click();
		
		driver.quit();
	}
}
}