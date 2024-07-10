package synchronization_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Wait {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch The Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://localhost:8888");
		
		//Enter the Credentials
		//User Name
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		//Java Wait
		Thread.sleep(2000);
		
		//User Password
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		//Java Wait
		Thread.sleep(2000);
		
		//Submit Button
		driver.findElement(By.id("submitButton")).click();
		
		//Java Wait
		Thread.sleep(2000);
		
		driver.quit();
	}
}
