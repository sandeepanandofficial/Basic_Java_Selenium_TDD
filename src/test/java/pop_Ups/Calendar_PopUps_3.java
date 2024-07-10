package pop_Ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * SCENARIOS
 * Navigate to make My Trip.com
 * Choose from as Mumbai
 * Choose To as Guwathi
 * Click on departure
 * select August month date
 */

public class Calendar_PopUps_3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://www.makemytrip.com/");
		
		//Create an Object of Actions Class
		Actions actions = new Actions(driver);
		
		//Click any where to avoid the login pop ups - mouse hover - moveByOffset
		actions.moveByOffset(10, 10).click().perform();
		
		//Capture From and To element
		WebElement fromCity = driver.findElement(By.id("fromCity"));
						
		WebElement toCity = driver.findElement(By.id("toCity"));
						
		//Enter the City name in From element
		fromCity.sendKeys("Mumbai");
						
		//Click on it
		driver.findElement(By.xpath("//span[text()='BOM']")).click();
						
		//Enter the City name in To element
		toCity.sendKeys("Guwahati");
						
		//Click on it
		driver.findElement(By.xpath("//span[text()='GAU']")).click();
		
		//Selecting any Date  of August month
		
		while (true) {
			try {
				driver.findElement(By.xpath("//div[@aria-label='Thu Aug 15 2024']")).click();
				Thread.sleep(2000);
				System.out.println("Thu Aug 15 2024 is selected");
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		Thread.sleep(2000);
		
		//Click on search
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		Thread.sleep(2000);
				
		driver.quit();	
	}
}
