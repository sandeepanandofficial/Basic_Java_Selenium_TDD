package synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_Wait {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
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
		
		//Calling the Method - Custom Wait method
		customWait(contacts);
		
		driver.quit();
	}

	public static void customWait(WebElement contacts) throws InterruptedException {
		
		int count = 0;
		
		while(count<10)
		{
			try {
				contacts.click();
				System.out.println("Element is clicked successfully");
				break;
			} catch (Exception e) {
				Thread.sleep(2000);
				count++;
			}
		}
	}
}
