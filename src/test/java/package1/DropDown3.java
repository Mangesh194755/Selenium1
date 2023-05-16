package package1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown3 {

	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/");
		
		driver.findElement(By.cssSelector("#menu1")).click();
		List<WebElement> DDmenu =  driver.findElements(By.xpath("//a[@role='menuitem']"));
		
			for(WebElement ele : DDmenu)
			{
				String innerHTML = ele.getAttribute("innerHTML");

				if(innerHTML.contains("JavaScript"))
				{
					ele.click();
					break;
				}
				
				System.out.println("Values in boot strap dropdown menu are "+ innerHTML);
				
			}
			driver.quit();
		}
		
}