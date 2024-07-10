package webElement_Interface_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement_findElements_findElement {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is Launched");
		
		//Maximized the Browser
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");
		
		//Load URL
		driver.get("http://localhost:8888/");
		System.out.println("URL is loaded");
		
		//Enter the Credentials
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).submit();
		
		//Click on Organization
		driver.findElement(By.linkText("Organizations")).click();
		
		//Capture all the Check box
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@name='selected_id']"));
		
		for(WebElement element:checkBox)
		{
			//click on all the check box
			element.click();
		}
		
		System.out.println("All the check box is checked");
		
		driver.quit();
	}
}
