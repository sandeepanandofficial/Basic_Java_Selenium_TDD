package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//Capture the Capitals and Country
		WebElement rome = driver.findElement(By.id("box6"));
		
		WebElement itly = driver.findElement(By.id("box106"));
		
		//Create an Object of Actions Class
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(rome, itly).perform();
		System.out.println("Successfully done");
		
		Thread.sleep(1000);
		
		driver.quit();
	}
}
