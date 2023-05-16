package actionsPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/dblclick/");
		
		Actions act1 = new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		Thread.sleep(5000);
		
		act1.doubleClick(driver.findElement(By.xpath("//span[text()=\"Double click the block\"]//parent::body//div"))).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
