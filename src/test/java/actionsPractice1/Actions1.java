package actionsPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act1 = new Actions(driver);
		
		act1.contextClick(driver.findElement(By.xpath("//span[text()=\"right click me\"]"))).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul//li//span[text()=\"Paste\"]")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		Thread.sleep(3);
		
		driver.quit();
		
		
		
		
	}

}
