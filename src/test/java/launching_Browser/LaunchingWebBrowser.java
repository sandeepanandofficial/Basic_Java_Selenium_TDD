package launching_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingWebBrowser {
	
	public static void main(String[] args) {
		
		//Launching Chrome Browser
		WebDriver driver1 = new ChromeDriver();
		System.out.println("Chrome Browser is Launched");
		
		//Launching FireFox Browser
		WebDriver driver2 = new FirefoxDriver();
		System.out.println("FireFox Browser is Launched");
		
		//Launching Edge Browser
		WebDriver driver3 = new EdgeDriver();
		System.out.println("Edge Browser is Launched");
		
		driver1.quit();
		driver2.quit();
		driver3.quit();
		
		
	}
}
