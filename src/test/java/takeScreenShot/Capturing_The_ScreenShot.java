package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Capturing_The_ScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://localhost:8888/");
		
		//Enter all the credentials
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		System.out.println("Home page is displayed");
		
		//typecasting driver
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//Source Location 
		File sourceLocation = ts.getScreenshotAs(OutputType.FILE);
		
		//Target Location
		File targetLocation = new File(".\\ScreenShot\\ScreenShot1.png");
		
		Files.copy(sourceLocation, targetLocation);
		
		System.out.println("ScreenShot taken");
		
		driver.quit();
	}
}
