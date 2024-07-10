package pop_Ups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUp_Load_PopUps {
	
	public static void main(String[] args) throws IOException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Miximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://omayo.blogspot.com/");
		
		//Create an Object of Actions Class
		Actions actions = new Actions(driver);
		
		//Capture the target element
		WebElement uploadFile = driver.findElement(By.id("uploadfile"));
		
		//Click on the upload file element
		actions.moveToElement(uploadFile).click().sendKeys("C:\\Users\\Sandeep Anand\\Desktop\\company.txt").perform();
		
		
	}
}
