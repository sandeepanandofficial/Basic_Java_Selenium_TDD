package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Index {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://jqueryui.com/droppable/");
		
		/*Handle the Frame before element Identification*/
		//Frame Handling - Frame Index
		driver.switchTo().frame(0);
		
		//Identifying the element
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		
		//Create an Object of Actions Class
		Actions actions = new Actions(driver);
		
		//Drag and Drop
		actions.dragAndDrop(drag, drop).perform();
		System.out.println("Drag and Drop is completed");
		
		Thread.sleep(2000);
		
		//Back to main Frame
		driver.switchTo().defaultContent();
		System.out.println("Back to main frame successfully");
		
		Thread.sleep(2000);
		
		//Click on Accept
		driver.findElement(By.linkText("Accept")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
