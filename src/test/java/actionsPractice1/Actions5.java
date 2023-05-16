package actionsPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions5 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();

//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		WebDriver driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Actions act1 = new Actions(driver);
		
//		cap.acceptInsecureCerts();
//		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		cap.setAcceptInsecureCerts(true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.switchTo().frame(0);
		
		WebElement src = driver.findElement(By.xpath("//span[text()='Lawrence Block']"));
		
		WebElement des = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));

		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,500)");
		
		Thread.sleep(2000);
		
		act1.dragAndDrop(src, des).perform();
				
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
