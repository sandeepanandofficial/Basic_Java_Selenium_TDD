package synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly_Wait {
	
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will wait and check all driver related operations
		
		//Load the URL
		driver.get("http://localhost:8888");
		
		//Enter the Credentials
		//User Name
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		//User Password
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		//Submit Button
		driver.findElement(By.id("submitButton")).click();
		
		driver.quit();
	}
}
