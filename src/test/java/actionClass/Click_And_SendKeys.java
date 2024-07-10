package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_And_SendKeys {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://localhost:8888");
		
		//Capture the User name and login
		WebElement username = driver.findElement(By.name("user_name"));
		WebElement login = driver.findElement(By.id("submitButton"));
		
		//Create an object of Action Class
		Actions action =new Actions(driver);
		
		//Enter the Credentials
		action.sendKeys(username, "admin",Keys.TAB,"admin").perform();
		action.click(login).perform();
		
		System.out.println("Login completed");
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}
}
