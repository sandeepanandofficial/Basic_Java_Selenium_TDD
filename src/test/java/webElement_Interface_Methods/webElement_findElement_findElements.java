package webElement_Interface_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement_findElement_findElements {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is Launched");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is Maximized");
		
		//Load the URL
		driver.get("http://localhost:8888/");
		System.out.println("URL is Loaded");
		
		//Enter the credentials and click on Login
		//20.findElement()
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).submit();
		
		//Click on Organizations
		driver.findElement(By.linkText("Organizations")).click();
		
		//Capture all the Organization Name
		//21.findElements()
		List<WebElement> orgName = driver.findElements(By.xpath("//a[@title='Organizations']"));
		
		for(WebElement element:orgName)
		{
			System.out.println(element.getText());
		}
		
		driver.quit();
		System.out.println("Browser is closed");
	}
}
