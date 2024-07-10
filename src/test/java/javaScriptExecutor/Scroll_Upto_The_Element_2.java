package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Upto_The_Element_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.selenium.dev/downloads/");
		
		//Capture the location where we have to scroll
		WebElement targetLocation = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
		
		int yAxis = targetLocation.getRect().getY();
				
		//Capture the element
		WebElement targetElement = driver.findElement(By.xpath("//img[@alt='Avo Automation']"));
		
		//typecasting driver
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(4000);
		
		//scrollInto()
		jse.executeScript("window.scrollBy(0,"+yAxis+");", targetLocation);
		
		Thread.sleep(4000);
		
		//element.click()
		targetElement.click();
		
		Thread.sleep(4000);
		
		driver.quit();
	}
}
