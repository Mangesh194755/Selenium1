package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioCheckboxButton1 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> radio =  driver.findElements(By.xpath("//input[(@name='lang') and (@type='radio')]"));
		
		for(int i=0; i<radio.size();i++)
		{
			WebElement local_radio = radio.get(i);
			
			String value = local_radio.getAttribute("value");
			
			System.out.println("Radio buttons are "+ value);
			
			if(value.equalsIgnoreCase("Python"))
			{
				local_radio.click();
			}
		}
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
		
		for(int i=0; i<checkbox.size(); i++)
		{
			WebElement local_checkbox = checkbox.get(i);
			
			String id = local_checkbox.getAttribute("id");
			
			System.out.println("Checkbox boxs are "+ id);
			
			if(id.equalsIgnoreCase("Coding"))
			{
				local_checkbox.click();
			}
		}
		
		driver.quit();	
		
	}

}
