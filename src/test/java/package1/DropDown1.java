package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://powerusers.microsoft.com/t5/Power-Automate-Desktop/Selecting-items-in-web-page-drop-down-list/td-p/1882165");
		// driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement board_dropdown = driver.findElement(By.xpath("//select[@id='searchGranularity']"));
		Thread.sleep(2000);
		Select board = new Select(board_dropdown);

		Thread.sleep(2000);
		board.selectByIndex(0);
		Thread.sleep(2000);

		board.selectByValue("user|user");
		Thread.sleep(2000);

		board.selectByVisibleText("This category");
		Thread.sleep(2000);

//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//		WebElement month_dropdown = driver.findElement(By.xpath("//div//select[@id='month']"));
//		Thread.sleep(2000);
//		Select month_dd = new Select (month_dropdown);
//		Thread.sleep(2000);
//		month_dd.selectByValue("6");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

		driver.quit();

	}

}
