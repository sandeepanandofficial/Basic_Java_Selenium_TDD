package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		
		//Capture the + and - sign
		WebElement add = driver.findElement(By.id("add"));
		WebElement minus = driver.findElement(By.id("minus"));
		
		//Create an Object Actions class
		Actions actions = new Actions(driver);
		
		//doubleClick()
		actions.doubleClick(add).perform();
		System.out.println("first add double click is done");
		
		Thread.sleep(2000);
		
		actions.doubleClick(add).perform();
		System.out.println("second add double click is done");
		
		Thread.sleep(2000);
		
		actions.doubleClick(minus).perform();
		System.out.println("first minus double click is done");
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
