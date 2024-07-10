package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Create an Object of Actions class
		Actions actions = new Actions(driver);
		
		//Capture right click me
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement quit = driver.findElement(By.xpath("//span[text()='Quit']"));
		
		//contectClick() - Right Click
		actions.contextClick(rightclick).contextClick(quit).perform();
		
		driver.quit();
	}
}
