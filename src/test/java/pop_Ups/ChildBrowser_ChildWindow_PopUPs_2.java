package pop_Ups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_ChildWindow_PopUPs_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		//Capture the Session ID of main window
		String sessionIdMain = driver.getWindowHandle();
		
		System.out.println("session Id of main window : " + sessionIdMain);
		
		//Click on Open New Seperate Windows
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		
		//Click on click button of open a new window with some specifications
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Thread.sleep(2000);
		
		//Capture both session id
		Set<String> windows = driver.getWindowHandles();
		
		Thread.sleep(2000);
		
		for (String string : windows) {
			if (!string.equals(sessionIdMain)) {
				System.out.println("Child Window session Id is : " + string);
				driver.switchTo().window(string); //switching to child window
				break;
			}
		}
		
		driver.quit();
	}
}
