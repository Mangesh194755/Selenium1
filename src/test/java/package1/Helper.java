package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {

	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;

		je.executeScript("scroll(0,100)");

		je.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 2px solid red;')", element);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

		je.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", element);

	}

}
