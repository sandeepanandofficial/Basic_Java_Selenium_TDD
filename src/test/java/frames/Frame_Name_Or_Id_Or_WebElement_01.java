package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Name_Or_Id_Or_WebElement_01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://jqueryui.com/droppable/");
		
		//Click on Accept module
		driver.findElement(By.linkText("Accept")).click();
		
		/*Handle the Frame before alement Identification*/
		//Frame Handling - WebElement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//Identifying the element
		WebElement dragNonValid = driver.findElement(By.id("draggable-nonvalid"));
		WebElement dragValid = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//Create an Object on Actions class
		Actions actions = new Actions(driver);
		
		//Drag and Drop - dragNonValid
		actions.dragAndDrop(dragNonValid, drop).perform();
		
		Thread.sleep(2000);
		
		//remove because not droppable
		actions.dragAndDropBy(dragNonValid, -300, 0).perform();
		
		Thread.sleep(2000);
		
		//Drag and Drop - dragValid
		actions.dragAndDrop(dragValid, drop).perform();
		
		//Come Back to Main Frame
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		//Click on Prevent Propagation
		driver.findElement(By.linkText("Prevent propagation")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
}
