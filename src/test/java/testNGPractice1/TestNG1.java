package testNGPractice1;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG1 

{		
			@Test
			public void firefox()
			{
				WebDriverManager.firefoxdriver().setup();
				FirefoxDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.co.in/");
				String firefoxTitle = driver.getTitle();
				Assert.assertEquals(firefoxTitle, "Google");
				driver.quit();
			}
			
			@Test
			public void chrome()
			{		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver1 = new ChromeDriver();
				driver1.manage().window().maximize();
				driver1.get("https://www.google.co.in/");	
				String chromeTitle = driver1.getTitle();
				Assert.assertEquals(chromeTitle, "Google");
				driver1.quit();
			}
			
			@Test
			public void edge()
			{
				WebDriverManager.edgedriver().setup();
				EdgeDriver driver2 = new EdgeDriver();
				driver2.manage().window().maximize();
				driver2.get("https://www.google.co.in/");	
				String edgeTitle = driver2.getTitle();
				Assert.assertEquals(edgeTitle, "Google");
				driver2.quit();
			}
			
			@Test
			public void brave()
			{
				WebDriverManager.chromedriver().setup();
				ChromeOptions opt = new ChromeOptions();
				opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
				ChromeDriver driver3 = new ChromeDriver(opt);
				driver3.manage().window().maximize();
				driver3.get("https://www.google.co.in/");	
				String braveTitle = driver3.getTitle();
				Assert.assertEquals(braveTitle, "Google");
				driver3.quit();
								
			}
			
			@Test
			public void text()
			{
				System.out.println("All browsers launched successfully");
			}
				
	}
