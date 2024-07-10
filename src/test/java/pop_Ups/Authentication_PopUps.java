package pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_PopUps {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(2000);
		
		System.out.println("AuthenticationPopUps");
		
		//Browser Back
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		/* Authentication PopUps */
		//Load the URL with Authentication
		//--> Syntax --> https://username:password@test.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text = driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
