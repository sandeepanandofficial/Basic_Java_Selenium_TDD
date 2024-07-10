package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Capture the 5th Organization Name
 */
public class Xpath1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://localhost:8888/");
		
		//Enter the Credentials
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).submit();
		
		//Click on Organization
		driver.findElement(By.linkText("Organizations")).click();
		
		//Capture all the Organization name
		List<WebElement> orgName = driver.findElements(By.xpath("//a[@title='Organizations']"));
		
		//Capture all the Organization check box
		List<WebElement> orgCheckName = driver.findElements(By.xpath("//input[@name='selected_id']"));
		
		
		String orgNameText = orgName.get(4).getText();
		System.out.println("5th Organization name is : " + orgNameText);
		
		orgCheckName.get(4).click();
		
		Thread.sleep(2000);
		
		orgCheckName.get(4).click();
		
		//Click and Capture the last Organization name
		
		String orgNameLastText = orgName.get(orgName.size()-1).getText();
		System.out.println("Last Organization name is : " + orgNameLastText);
		
		orgCheckName.get(orgCheckName.size()-1).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
