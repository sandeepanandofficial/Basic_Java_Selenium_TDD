package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://flipkart.com");
		
		//Capture the Electronic
		WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		
		
		//Create an Object of Actions Class
		Actions actions = new Actions(driver);
		
		actions.click(electronics).perform();
		
		//Capture the Electronic module
		WebElement electronic1 = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		//moveToElement() - Mouse Hovering
		actions.moveToElement(electronic1).perform();
		
		Thread.sleep(1000);
		
		WebElement appleProduct = driver.findElement(By.linkText("Apple Products"));
		actions.click(appleProduct).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
