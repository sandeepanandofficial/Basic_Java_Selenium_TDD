package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class CssSelector {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is Launched");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");
		
		//Load the URL
		driver.get("https://www.dassault-aviation.com/en/");
		System.out.println("URL is loaded");
		
		//Capture the Title
		String title = driver.getTitle();
		System.out.println("Title is : " + title);
		
		//Capture the Current URL
		String url = driver.getCurrentUrl();
		System.out.println("url is : " + url);
		
		//Capture the session ID of the web page
		String sessionID = driver.getWindowHandle();
		System.out.println("Session ID of web page is : " + sessionID);
		
		//Capture the session ID of the Browser
		SessionId sessionID1 = ((RemoteWebDriver)driver).getSessionId();
		System.out.println("Session ID of browser is : " + sessionID1);
		
		//Reject the popup
		driver.findElement(By.cssSelector("a[id='wt-cli-reject-btn']")).click();
		System.out.println("Pop-up is rejected");
		
		//Navigate to Defence Module
		driver.findElement(By.cssSelector("li[id='menu-item-53473']")).click();
		System.out.println("Defence module is opened");
		
		//Navigate to Passion module
		driver.findElement(By.cssSelector("a[href='https://www.dassault-aviation.com/en/passion/']")).click();
		System.out.println("Passion module is opened");
		
		//Close all 
		driver.quit();
		System.out.println("Successfully closed");
		
	}
}
