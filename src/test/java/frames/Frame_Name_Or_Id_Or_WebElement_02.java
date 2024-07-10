 package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Name_Or_Id_Or_WebElement_02 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://jqueryui.com/droppable/");
		
		//Click on Prevent Propagation
		driver.findElement(By.linkText("Prevent propagation")).click();
		
		/*Handle the Frame before alement Identification*/
		//Frame Handling - WebElement
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		//Identifying the element
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement dropOuter1 = driver.findElement(By.id("droppable"));
		WebElement dropInner1 = driver.findElement(By.id("droppable-inner"));
		WebElement dropOuter2 = driver.findElement(By.id("droppable2"));
		WebElement dropInner2 = driver.findElement(By.id("droppable2-inner"));
		
		Thread.sleep(2000);
		
		//Create an Object of Actions Class
		Actions actions = new Actions(driver);
		
		//Drag and Drop - drag to dragOuter1
		actions.dragAndDrop(drag, dropOuter1).perform();
		
		Thread.sleep(2000);
		
		//Drag and Drop - drag to dragInner1
		actions.dragAndDrop(drag, dropInner1).perform();
		
		Thread.sleep(2000);
		
		//Drag and Drop - drag to dragOuter2
		actions.dragAndDrop(drag, dropOuter2).perform();
		
		Thread.sleep(2000);
		
		//Drag and Drop - drag to dragInner2
		actions.dragAndDrop(drag, dropInner2).perform();
		
		Thread.sleep(2000);
		
		//Back to main frame
		driver.switchTo().defaultContent();
		
		//Click on Revert draggable position
		driver.findElement(By.linkText("Revert draggable position")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
