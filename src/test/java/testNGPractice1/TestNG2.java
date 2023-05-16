package testNGPractice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG2 {

	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/");
		Select tools = new Select (driver.findElement(By.cssSelector("#tools")));
		
		List<WebElement> myTools = tools.getOptions();

		List actualList = new ArrayList();
		
		for(WebElement ele : myTools)
		{
			String data = ele.getText();
			actualList.add(data);
		}
		List temp = new ArrayList();
		temp.addAll(actualList);
		
		Collections.sort(temp);
		
		Assert.assertTrue(actualList.equals(temp));
		
		
		driver.quit();
		
	}

}
