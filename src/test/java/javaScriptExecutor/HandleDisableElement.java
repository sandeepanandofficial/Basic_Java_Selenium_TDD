package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://demoapp.skillrary.com/index.php");
		
		//Capture the disable element
		WebElement disableElement = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		//typecasting driver
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(4000);
		
		//element.value
		jse.executeScript("arguments[0].value='SDET'", disableElement);
		
		Thread.sleep(4000);
		
		//Capture the Login
		WebElement login = driver.findElement(By.xpath("//a[text()='LOGIN']"));
		
		//element.click()
		jse.executeScript("arguments[0].click()", login);
		
		Thread.sleep(3000);
		
		//Capture the email text field
		WebElement email = driver.findElement(By.id("email"));
		
		jse.executeScript("arguments[0].value='user'", email);
		
		Thread.sleep(3000);
		
		//Capture the password text field
		WebElement password = driver.findElement(By.id("password"));
		
		jse.executeScript("arguments[0].value='user'", password);
		
		Thread.sleep(3000);
		
		//Capture the Login button
		WebElement loginButton = driver.findElement(By.id("last"));
		
		jse.executeScript("arguments[0].click()", loginButton);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
