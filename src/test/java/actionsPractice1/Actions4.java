package actionsPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions4 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/draggable/");
		
		Actions act1 = new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		act1.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")), 200, 125).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
