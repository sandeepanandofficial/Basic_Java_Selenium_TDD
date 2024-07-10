package autoSuggestionHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Navigate to amazon.in
 * search for laptops
 * capture all the laptops
 * print them in console
 */

public class Search_Laptops_And_Capture {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.amazon.in/");
		
		//Enter the Laptops in search bar and click on search icon
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Capture all the laptops
		List<WebElement> laptops = driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
		
		for(WebElement elements:laptops)
		{
			System.out.println(elements.getText());
		}
		
		driver.quit();
	}
}
