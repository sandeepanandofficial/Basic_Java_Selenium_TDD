package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.selenium.dev/downloads/");
		
		//typecasting driver
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//scroll down
		jse.executeScript("window.scrollBy(0,1000)", "");
		
		Thread.sleep(4000);
		
		//scroll up
		jse.executeScript("window.scrollBy(0,-750)", "");
		
		Thread.sleep(4000);
		
		//scroll to the bottom of page
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);", "");
		
		Thread.sleep(4000);
		
		//scroll to the up of the page
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight);", "");
	}
}
