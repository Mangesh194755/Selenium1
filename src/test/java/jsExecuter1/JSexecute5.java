package jsExecuter1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSexecute5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/");

		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Broken Links and Images']"));
		
		
		
		je.executeScript("arguments[0].scrollIntoView(true)",ele);
		
		Thread.sleep(10000);

		driver.quit();
	}
}