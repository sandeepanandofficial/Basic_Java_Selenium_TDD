package pop_Ups;

import java.time.Duration;
import java.util.Date;

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
 * select Current Date
 */

public class Calendar_PopUps_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Create an Object of Date Class
		Date date = new Date();
		
		System.out.println(date);	//Fri May 10 15:09:29 IST 2024
		
		/*
		 * make My trip date format - Wed May 22 2024
		 */
		
		//Store date in String Array
		String[] dateArr = date.toString().split(" ");
		
		//Store date in required format
		String reqDateFormat = dateArr[0] + " " + dateArr[1] + " " + dateArr[2] + " " + dateArr[5];
		
		System.out.println(reqDateFormat);	//Fri May 10 2024
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(1000);
		
		//Create an Object of Action Class
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
				
		//Select the Date
		driver.findElement(By.xpath("//div[@aria-label='" + reqDateFormat + "']")).click();
				
		Thread.sleep(2000);
				
		//Click on search
		driver.findElement(By.xpath("//a[text()='Search']")).click();
				
		driver.quit();
	}
}
