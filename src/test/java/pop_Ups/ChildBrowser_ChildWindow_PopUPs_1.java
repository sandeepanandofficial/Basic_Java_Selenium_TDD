package pop_Ups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_ChildWindow_PopUPs_1 {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		//Click on OK button of Open New Tabbed Window
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
		System.out.println("New tab window open");
		
		//Capture all window ID
		Set<String> windows = driver.getWindowHandles();
		
		for (String string : windows) {
			System.out.println(string);
		}
		
		driver.quit();
	}
}
