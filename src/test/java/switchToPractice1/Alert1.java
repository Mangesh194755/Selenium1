package switchToPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {
	WebDriver driver;
	String alert_Msg;
	
	@Test
	public void handleAlert() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		Thread.sleep(2000);
		alert_Msg = driver.switchTo().alert().getText();
		System.out.println("Message displayed on alert popup is - "+ alert_Msg);

		driver.switchTo().alert().accept();
		driver.quit();
	}
		
	@Test
	public void handleAlert1() 
	{

		String expected_msg = "I am an alert box!";
		Assert.assertEquals(alert_Msg, expected_msg);
		
		driver.quit();	
	}
				
}