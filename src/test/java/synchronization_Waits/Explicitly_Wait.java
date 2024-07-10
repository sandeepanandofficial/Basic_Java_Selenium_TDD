package synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly_Wait {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("http://localhost:8888");
		
		//Enter the Credentials
		//User Name
		driver.findElement(By.name("user_name")).sendKeys("admin");
				
		//User Password
		driver.findElement(By.name("user_password")).sendKeys("admin");
				
		//Submit Button
		driver.findElement(By.id("submitButton")).click();
		
		//Capture the Contacts
		WebElement contacts = driver.findElement(By.linkText("Contacts"));
		
		//Explicitly Wait
		//-->Create an Object on WebDriverWait Class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//-->Conditions - titleContains - String title
		wait.until(ExpectedConditions.titleContains("Home"));
		
		//-->Conditions - visibilityOf - WebElement element
		wait.until(ExpectedConditions.visibilityOf(contacts));
		
		//-->Conditions - elementToBeClickable - WebElement element
		wait.until(ExpectedConditions.elementToBeClickable(contacts));
		
		//--Conditions - elementToBeClickable - locators
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Contacts")));
		
		//--Conditions - urlContains - String fraction
		wait.until(ExpectedConditions.urlContains("Home"));
		
		driver.quit();
		
	}
}
