package actionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://flipkart.com");
		
		//Browse Back
		driver.navigate().back();
		
		//Browse forward
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		Actions actions = new Actions(driver);
		
		//moveByOffset()
		actions.moveByOffset(20, 20).click().perform();
		
		Thread.sleep(4000);
		
		driver.quit();
	}
}
