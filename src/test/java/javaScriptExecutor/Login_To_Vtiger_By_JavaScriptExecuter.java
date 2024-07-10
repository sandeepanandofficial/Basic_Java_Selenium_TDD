package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_To_Vtiger_By_JavaScriptExecuter {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://localhost:8888/");
		
		//Capture the username , userpassword and login button
		WebElement userName = driver.findElement(By.name("user_name"));
		WebElement userPassword = driver.findElement(By.name("user_password"));
		WebElement loginButton = driver.findElement(By.id("submitButton"));
		
		//typecasting driver
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//element.value and element.click()
		jse.executeScript("arguments[0].value='admin'", userName);
		jse.executeScript("arguments[0].value='admin'", userPassword);
		jse.executeScript("arguments[0].click()", loginButton);
		
		//Capture the page title
		String title = jse.executeScript("return document.title", "").toString();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
