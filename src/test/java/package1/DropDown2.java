package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown2 {

	@Test
	public void test1() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverManager.firefoxdriver().setup();

		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/");
		Select tools = new Select(driver.findElement(By.cssSelector("#tools1")));
		List<WebElement> myTools = tools.getOptions();
		List<String> actualList = new ArrayList<>();
		for (WebElement ele : myTools) {
			String data = ele.getText();
			actualList.add(data);

			System.out.println("Actual list " + data);
		}
		List<String> temp = new ArrayList<>();
		temp.addAll(actualList);
		Thread.sleep(3000);
		Collections.sort(actualList);
		System.out.println("Actual list is : " + actualList);

		System.out.println("Temp list " + temp);

		Assert.assertFalse(actualList.equals(temp));

		driver.quit();

	}
}
