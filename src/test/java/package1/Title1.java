package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title1 {

	@Test
	public static void test1()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		String siteTitle =  driver.getTitle();
		String expectedTitle = "Sign up for Facebook | Facebook";
		System.out.println("Title of this site is ===== "+ siteTitle);
		
		Assert.assertEquals(siteTitle, expectedTitle);
		
		driver.quit();
		
	}
	
	@Test
	public static void test2()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		String siteTitle =  driver.getTitle();
		String expectedTitle = "Sign up for Facebook | Facebook";
		System.out.println("Title of this site is ===== "+ siteTitle);
		
		Assert.assertEquals(siteTitle, expectedTitle, "Title matches");
		
		driver.quit();
		
	}
	
	@Test
	public static void test3()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		String siteTitle =  driver.getTitle();
		//String expectedTitle = "Sign up for Facebook | Facebook";
		System.out.println("Title of this site is ===== "+ siteTitle);
		
		Assert.assertTrue(siteTitle.contains("Sign up for"));
		
		driver.quit();
		
	}

}
