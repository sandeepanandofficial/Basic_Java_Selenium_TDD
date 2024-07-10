package autoSuggestionHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Navigate to Flipkart.com
 * search for redMi phones
 * capture all the phones
 * print them in console
 */

public class Search_Redmi_And_Capture {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.flipkart.com/");
		
		//Navigate to search bar and enter Redmi phones
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redMi Phones");
		
		//click on search icon
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		//Capture the redmi phone
		List<WebElement> redmi = driver.findElements(By.xpath("//div[@class='col col-7-12']"));
		
		for(WebElement element:redmi)
		{
			System.out.println(element.getText());
		}
		
		driver.quit();
	}
}
