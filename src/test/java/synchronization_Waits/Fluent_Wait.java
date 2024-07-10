package synchronization_Waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_Wait {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("http://localhost:8888");
		
		////Enter the Credentials
		//User Name
		driver.findElement(By.name("user_name")).sendKeys("admin");
				
		//User Password
		driver.findElement(By.name("user_password")).sendKeys("admin");
				
		//Submit Button
		driver.findElement(By.id("submitButton")).click();
		
		//Capture the Contacts
		WebElement contacts = driver.findElement(By.linkText("Contacts"));
		
		//Fluent Wait
		//--Create an Object of Fluent Wait Class
		FluentWait wait = new FluentWait(driver);
		
		//--Set the Polling time
		wait.pollingEvery(Duration.ofMillis(100));
		
		//--Set the waiting time
		wait.withTimeout(Duration.ofSeconds(5));
		
		//--Ignore the Exceptions
		wait.ignoring(NoAlertPresentException.class);
		wait.ignoring(NoSuchElementException.class);
		
		//--conditions
		wait.until(ExpectedConditions.visibilityOf(contacts));
		
		driver.quit();
	}
}
