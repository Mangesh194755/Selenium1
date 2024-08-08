package prac2021;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aug21 {

	@Test
	public void page1() throws InterruptedException 
	{

		WebDriverManager.chromiumdriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:/Program Files/BraveSoftware/Brave-Browser/Application/brave.exe");
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		// opt.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("http://seleniumpractise.blogspot.com/2021/08/");

		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Selenium Practise: August 2021");

		driver.findElement(By.xpath("(//a[text()='WebTable In HTML'])[1]")).click();

		String webTableUrl = driver.getCurrentUrl();

		if (webTableUrl.contains("webtable-in-html")) {
			System.out.println("Landed on correct URL");
		} else {
			System.out.println("Landed on wrong URL");
		}

		driver.navigate().back();

		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//th"));

		for (WebElement ele1 : headers) 
		{
			System.out.println("Table headers are " + ele1.getText());
		}
		
		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='customers']//td"));

		boolean status = false;
		for (WebElement ele2 : tableData) 
		{
			String value = ele2.getText();
			System.out.println("Table content is " + value);

			if (value.contains("Selenium"))
			{
				status = true;
				break;
			}
		}
		Assert.assertTrue(status, "Value does not exits");
		
		List<WebElement> tableRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		Assert.assertEquals(tableRow.size(), 7, "Table row is mismatched");
		
		List<WebElement> secondRowData = driver.findElements(By.xpath("//table[@id='customers']//td[2]"));
		
		for(WebElement ele2 : secondRowData)
		{
			System.out.println(ele2.getText());
		}
		
		driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();
		
		driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td//a[@href='https://www.olacabs.com/']")).click();
		
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.quit();

	}

}
