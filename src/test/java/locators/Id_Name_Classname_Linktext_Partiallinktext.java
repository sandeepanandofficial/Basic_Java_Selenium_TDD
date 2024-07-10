package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Name_Classname_Linktext_Partiallinktext {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is launched");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is maximized");
		
		//Load the URL
		driver.get("http://localhost:8888/");
		String title1 = driver.getTitle();
		System.out.println("URL is Loaded and title is : " + title1);
		
		//Enter the username and password
		driver.findElement(By.name("user_name")).sendKeys("admin");	//1
		driver.findElement(By.name("user_password")).sendKeys("admin");	//1
		driver.findElement(By.id("submitButton")).click();	//2
		
		//Click on calendar module
		driver.findElement(By.className("tabUnSelected")).click();	//3
		
		//Click on Leads module
		driver.findElement(By.linkText("Leads")).click();	//4
		
		//Click on Organizations module
		driver.findElement(By.partialLinkText("Org")).click();	//5
		
		//Close the Browser
		driver.quit();
		
		
		
	}
}
