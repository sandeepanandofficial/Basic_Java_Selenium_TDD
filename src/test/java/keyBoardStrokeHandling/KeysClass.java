package keyBoardStrokeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load URL
		driver.get("https://www.amazon.in/");
		
		//Enter Laptops in search bars
		//Keys Class is used
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.chord("Laptops"),Keys.ENTER);
		
		driver.quit();
	}
}
