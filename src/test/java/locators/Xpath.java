package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Capture all the Organization
 */

public class Xpath {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is Launched");
		
		//Maximized the Browser
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");
		
		//Load the URL
		driver.get("http://localhost:8888/");
		System.out.println("URL is loaded");
		
		//Enter the credentials
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).submit();
		
		//Click on Organizations
		driver.findElement(By.linkText("Organizations")).click();
		
		//Capture the Organizations name
		List<WebElement> orgName = driver.findElements(By.xpath("//a[@title='Organizations']"));
		
		//Capture the Organization No
		List<WebElement> orgNo = driver.findElements(By.xpath("//span[@vtfieldname='account_no']/parent::td"));
		
		//Capture the Organization Check box
		List<WebElement> orgCheckBox = driver.findElements(By.xpath("//input[@name='selected_id']"));
		
		for(WebElement element1:orgCheckBox)
		{
			element1.click();
		}
		
		for(WebElement element2:orgNo)
		{
			System.out.println(element2.getText());
		}
		
		for(WebElement element3:orgName)
		{
			System.out.println(element3.getText());
		}
		
		driver.quit();
	}
}
