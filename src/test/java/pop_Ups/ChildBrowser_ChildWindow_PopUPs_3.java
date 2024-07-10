package pop_Ups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_ChildWindow_PopUPs_3 {
	
	public static void main(String[] args) {
		
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
			String CurrentWinId = currentWindowId.getTitle();
			
			if (CurrentWinId.contains("Frames")) {
				System.out.println("Main Window");
				System.out.println(CurrentWinId);
			}
			else if (CurrentWinId.contains("Index")) {
				System.out.println("Child Window 1");
				System.out.println(CurrentWinId);
			}
			else {
				System.out.println("Child Window 2");
				System.out.println(CurrentWinId);
			}
			}
		
		driver.quit();
		}
	}

