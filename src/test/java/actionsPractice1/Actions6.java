package actionsPractice1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions6 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		
		Actions act1 = new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
				
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//WebElement src = driver.findElement(By.xpath("//span[text()='Lawrence Block']"));
		
		//WebElement des = driver.findElement(By.xpath("//ul[@role=\"listbox\"]"));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("window.scroll(0,500)");		
		
		act1.clickAndHold(driver.findElement(By.xpath("//p[text()='Drag me to my target']")))
		.pause(Duration.ofSeconds(5))
		.moveToElement(driver.findElement(By.xpath("//p[text()='Drop here']")))
		.pause(Duration.ofSeconds(5))
		.release()
		.build()
		.perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
