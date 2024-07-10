package autoSuggestionHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Navigate to amazon.in
 * search for bluetooth earphones
 * capture all the earphones of boult
 * print them in console
 */

public class Search_Bluetooth_And_Capture {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.amazon.in/");
		
		//Enter the bluetooth earphones in search bar
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bluetooth earphones");
		
		//Click on search icon
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Capture all the Bluetooth earphones
		List<WebElement> bluetoothEarphone = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for(WebElement element:bluetoothEarphone)
		{
			System.out.println(element.getText());
		}
		
		driver.quit();
	}
}
