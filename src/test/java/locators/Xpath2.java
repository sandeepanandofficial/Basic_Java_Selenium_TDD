package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * xpath is a way that if we change the country name than its rating is highlighted
 */
public class Xpath2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[text()='Reject All'])[1]")).click();
		
		//Finding the element
		WebElement rating = driver.findElement(By.xpath("//span[text()='India']/ancestor::div/following-sibling::div[@class='si-table-data si-rating']"));
		
		rating.getText();
	}
}
