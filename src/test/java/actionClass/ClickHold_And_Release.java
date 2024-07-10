package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHold_And_Release {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://demoqa.com/buttons");
		
		//Capture - click me
		WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		//Create an object of Actions Class
		Actions actions = new Actions(driver);
		
		//clickAndHold()
		actions.clickAndHold(clickme).perform();
		System.out.println("Successfully done click and hold");
		
		//release()
		actions.release(clickme).perform();
		System.out.println("Successfully done click and hold");
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
