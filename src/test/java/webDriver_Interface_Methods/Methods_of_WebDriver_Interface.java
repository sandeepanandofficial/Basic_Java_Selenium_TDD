package webDriver_Interface_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class Methods_of_WebDriver_Interface {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch any Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is Launched");
		
		Thread.sleep(1000);
		
		//Maximize the Browser
		driver.manage().window().maximize();	//1 method
		System.out.println("Browser is Maximized");
		
		Thread.sleep(1000);
		
		//Minimize the Browser
		driver.manage().window().minimize();	//1 method
		System.out.println("Browser is Minimized");
		
		Thread.sleep(1000);
		
		//Full Screen the Browser
		driver.manage().window().fullscreen();	//1 method
		System.out.println("Browser is full screen");
		
		Thread.sleep(1000);
		
		//Maximize the Browser
		driver.manage().window().maximize();	//1 method
		System.out.println("Browser is Maximized");
		
		Thread.sleep(1000);
		
		//Load the URL
		driver.get("https://www.dassault-aviation.com/en/");	//2 method
		System.out.println("URL is Loaded");
		
		Thread.sleep(1000);
		
		//Capture the Title
		String title = driver.getTitle();	//3 method
		System.out.println("Page title is : " + title);
		
		Thread.sleep(1000);
		
		//Capture the URL
		String url = driver.getCurrentUrl();	//4 method
		System.out.println("Current URL is : " + url);
		
		Thread.sleep(1000);
		
		//Capture the session ID of the page
		String sessionID_1 = driver.getWindowHandle();	//5 method
		System.out.println("Session ID of the page is : " + sessionID_1);
		
		Thread.sleep(1000);
		
		//Load other module of same URL
		driver.navigate().to("https://www.dassault-aviation.com/en/space/");	//6 method
		System.out.println("Other module URL is loaded");
		
		Thread.sleep(1000);
		
		//Browse back
		driver.navigate().back();	//6 method
		System.out.println("Browse back done");
		
		Thread.sleep(1000);
		
		//Browse forward
		driver.navigate().forward();	//6 method
		System.out.println("Browse forward done");
		
		Thread.sleep(1000);
		
		//Browse refresh
		driver.navigate().refresh();	//6 method
		System.out.println("Browse refresh done");
		
		Thread.sleep(1000);
		
		//Capture Browser session ID
		SessionId sessionID_2 = ((RemoteWebDriver)driver).getSessionId();
		System.out.println("Session ID of the browser is : " + sessionID_2);
		
		Thread.sleep(1000);
		
//		//Capture the source code
//		String sourceCode = driver.getPageSource();	//7
//		System.out.println("Source code is : " + sourceCode);
//		
//		Thread.sleep(1000);
		
		//Close the Browser
		driver.quit();
		System.out.println("Browser is closed");	//8
		
		/*
		 * 9 - getWindowHandles()
		 * 10 - close()
		 * 11 - stringTo() 
		 */
		
		
	}
}
