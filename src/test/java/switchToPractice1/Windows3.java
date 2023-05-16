package switchToPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows3 {
	
	@Test()
	public void handleWindow() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-login-logo']")));
		
		
		if(ele.isDisplayed())
			{
				System.out.println("Landed on correct page");
			}
		else {
			{
				System.out.println("Landed on incorrect page");
			}
		}
		
		//Thread.sleep(2000);
		driver.quit();
		
	}

}
