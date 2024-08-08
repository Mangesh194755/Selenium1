package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorMsg1 {

	@Test
	public static void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		String actual_error = driver.findElement(By.xpath("//div[contains(text(),\"What's your name?\")]")).getText();
		String expected_error = "What's your name?";

		Assert.assertEquals(actual_error, expected_error);
		driver.quit();

	}

	@Test
	public static void test2() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		String actual_error = driver.findElement(By.xpath("//div[contains(text(),\"What's your name?\")]")).getText();
		String expected_error = "What's your name?";

		Assert.assertEquals(actual_error, expected_error, "Error matches");
		driver.quit();

	}

	@Test
	public static void test3() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		String actual_error = driver.findElement(By.xpath("//div[contains(text(),\"What's your name?\")]")).getText();
		// String expected_error = "What's your name?";

		Assert.assertTrue(actual_error.contains("What's your name?"));

		driver.quit();

	}

}
