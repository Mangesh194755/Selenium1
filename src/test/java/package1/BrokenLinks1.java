package package1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks1 {

	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links in are - " + links.size());

		for (WebElement ele : links) {
			String url = ele.getAttribute("href");
			verifyLinkActive(url);
		}
		driver.quit();
	}

	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			} else {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
			}

		} catch (Exception e) {

		}
	}
}
