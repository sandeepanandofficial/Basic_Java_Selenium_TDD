package pop_Ups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_ChildWindow_PopUPs_4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
				
		//Maximize the Browser
		driver.manage().window().maximize();
				
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//Load the URL
		driver.get("https://demo.automationtesting.in/Windows.html");
				
		//Click on Open Seperate Multiple Windows
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
				
		//Click on Click the button to open multiple windows
		driver.findElement(By.xpath("//button[text()='click ']")).click();
				
		//Capture all window
		Set<String> windows = driver.getWindowHandles();
				
		for (String string : windows) {
			WebDriver currentWindowId = driver.switchTo().window(string);
			String currentWinId = currentWindowId.getTitle();
					
			if (currentWinId.contains("Frames")) {
				System.out.println("Main Window");
				System.out.println(currentWinId);
				break;
			}
		}
		
		System.out.println("Control is on Main Window");
		driver.findElement(By.xpath("//a[text()='WebTable']")).click();
		
		Thread.sleep(2000);
		
		for (String string : windows) {
			WebDriver currentWindowId = driver.switchTo().window(string);
			String currentWinId = currentWindowId.getTitle();
					
			if (currentWinId.contains("Index")) {
				System.out.println("Child Window 1");
				System.out.println(currentWinId);
				break;
			}
		}
		
		System.out.println("Control is on Child Window 1");
		driver.findElement(By.id("enterimg")).click();
		
		Thread.sleep(2000);
		
		for (String string : windows) {
			WebDriver currentWindowId = driver.switchTo().window(string);
			String currentWinId = currentWindowId.getTitle();
			
			if (currentWinId.contains("Selenium")) {
				System.out.println("Child Window 2");
				System.out.println(currentWinId);
				break;
			}
		}
		
		System.out.println("Control is on Child Window 2");		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}

