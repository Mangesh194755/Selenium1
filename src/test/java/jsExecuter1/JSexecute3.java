package jsExecuter1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSexecute3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/");

		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		
		je.executeScript("arguments[0].value='test@test.com'", user);
		
		//WebElement chk1 = driver.findElement(By.xpath("//input[@name='persistent']"));
		
		je.executeScript("document.getElementById('persistent').click()");
		
		Thread.sleep(10000);

		driver.quit();
	}
}