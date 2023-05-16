package jsExecuter1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSexecute4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/");

		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("scroll(0,400)");
		
		Thread.sleep(10000);

		driver.quit();
	}
}