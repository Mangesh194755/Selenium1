package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

final class Browser_launch {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");		
		driver.quit();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.co.in/");		
		driver1.quit();
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.google.co.in/");		
		driver2.quit();
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver3 = new ChromeDriver(opt);
		driver3.manage().window().maximize();
		driver3.get("https://www.google.co.in/");		
		driver3.quit();
		
		System.out.println("All browsers launched successfully");

	}

}
