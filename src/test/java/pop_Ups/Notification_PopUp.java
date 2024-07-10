package pop_Ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_PopUp {
	
	public static void main(String[] args) {
		
		//Disable Notification Popup
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disible-notifications");
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver(options);
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://www.justdial.com/");
		
		driver.quit();
	}
}
