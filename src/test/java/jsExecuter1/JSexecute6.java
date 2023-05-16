package jsExecuter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import package1.Helper;

public class JSexecute6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// JavascriptExecutor je = (JavascriptExecutor) driver;

		WebElement First = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Helper.highLightElement(driver, First);
		First.sendKeys("First");

		WebElement Last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Helper.highLightElement(driver, Last);
		Last.sendKeys("Last");

		WebElement Business = driver.findElement(By.xpath("//input[@placeholder='Business Name']"));
		Helper.highLightElement(driver, Business);
		Business.sendKeys("Business");

		WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		Helper.highLightElement(driver, Email);
		Email.sendKeys("Email");

		WebElement Button = driver.findElement(By.xpath("//button[@id='demo']"));
		Helper.highLightElement(driver, Button);
		Button.click();

		// je.executeScript("arguments[0].scrollIntoView(true)",ele);

		Thread.sleep(5000);

		driver.quit();
	}
}