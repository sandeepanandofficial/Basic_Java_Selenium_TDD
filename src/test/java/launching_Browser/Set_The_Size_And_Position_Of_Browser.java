package launching_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

/*
 * Open the Browser
 * Delete all Cookies
 * Set size of the window
 * Set position of window
 * Maximize the window
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_The_Size_And_Position_Of_Browser {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		//Delete all the Cookies
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		
		//Create an Object of Dimension class
		Dimension dimentions = new Dimension(300, 400);
		
		//Set the size of the Browser
		driver.manage().window().setSize(dimentions);
		
		Thread.sleep(2000);
		
		//Create an Object of Point Class
		Point point = new Point(20, 40);
		
		//Set the position of the Browser
		driver.manage().window().setPosition(point);
		
		Thread.sleep(2000);
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
