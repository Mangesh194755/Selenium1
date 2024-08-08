package test123;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Calculatedate2 {

	@Test
	public void result() {

		WebDriver driver;

		EdgeOptions opt = new EdgeOptions();
		opt.setExperimentalOption("excludeSwitches",
				Arrays.asList("--disable-infobar", "enable-automation"));

		opt.addArguments("--start-maximized");
		opt.addArguments("--guest");
		driver = new EdgeDriver(opt);

		driver.get("https://www.calculator.net/date-calculator.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		// opt.setExperimentalOption("excludeSwitches",
		// List.of("disable-popup-blocking", "enable-automation"));

		try {
			Select startMonth = new Select(
					driver.findElement(By.xpath("//form[@name='calcf']//select[@id='today_Month_ID']")));
			startMonth.selectByVisibleText("Jun");
			Thread.sleep(1000);

			Select startDay = new Select(
					driver.findElement(By.xpath("//form[@name='calcf']//select[@id='today_Day_ID']")));
			startDay.selectByVisibleText("1");
			Thread.sleep(1000);

			Select endMonth = new Select(
					driver.findElement(By.xpath("//form[@name='calcf']//select[@id='ageat_Month_ID']")));
			endMonth.selectByVisibleText("Oct");
			Thread.sleep(1000);

			Select endDay = new Select(
					driver.findElement(By.xpath("//form[@name='calcf']//select[@id='ageat_Day_ID']")));
			endDay.selectByVisibleText("31");
			Thread.sleep(1000);

			driver.findElement(By.xpath("//label[@for='addendday']//span[@class='cbmark']")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//form[@name='calcf']//input[@type='submit']")).click();
			Thread.sleep(1000);

			String output = driver.findElement(By.xpath("//h2[contains(text(),'Result')]")).getText();
			// assertEquals(output, "Result");

			assertEquals(output, "Result");

			System.out.println(output);

			Thread.sleep(2000);

			driver.quit();

		}

		catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}