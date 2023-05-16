package switchToPractice1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames1 {
	
	WebDriver driver;
	
	@Test
	public void frame()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumbase.io/w3schools/iframes");
		driver.switchTo().frame("iframeResult");

		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title=\"Iframe Example\"]")));
		String iframename = driver.getTitle();
		
		System.out.println("IFrame name is - "+ iframename);
		
		driver.quit();
		
	}
		
	@Test
	public void frame1() 
	{

	}
				
}