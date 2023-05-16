package jsExecuter1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSexecute1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		JavascriptExecutor je = (JavascriptExecutor) driver;

		je.executeScript("alert('Hello')");

		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		je.executeScript("prompt('Hey there')");

		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		je.executeScript("confirm('Fine?')");

		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.quit();
	}
}