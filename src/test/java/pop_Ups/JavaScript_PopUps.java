package pop_Ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_PopUps {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		//Locate the element and Click - Click Button to see alert
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(2000);
		
		/* ALERT POP UPS */
		//switch to alert
		Alert alert = driver.switchTo().alert();
		
		//Capture the text
		String text1 = alert.getText();
		System.out.println(text1);
		
		//Click on OK in popup
		alert.accept();
		
		System.out.println("Alert pop up successfully done");
		
		Thread.sleep(2000);
		
		//Locate the element and Click - On button click, alert will appear after 5 seconds
		driver.findElement(By.id("timerAlertButton")).click();
		
		Thread.sleep(7000);
		
		/* ALERT POP UPS */
		//switch to alert
		Alert timerAlert = driver.switchTo().alert();
		
		//Capture the text
		String text2 = timerAlert.getText();
		System.out.println(text2);
		
		//Click on OK in popup
		timerAlert.accept();
		
		System.out.println("Timer Alert pop up successfully done");
		
		Thread.sleep(2000);
		
		//Locate the element and click - On button click, confirm box will appear
		driver.findElement(By.id("confirmButton")).click();
		
		/* CONFIRMATION POP UP */
		//switch to alert
		Alert confirmAlert1 = driver.switchTo().alert();
		
		//Capture the text
		String text3 = confirmAlert1.getText();
		System.out.println(text3);
		
		Thread.sleep(2000);
		
		//Click on OK in popup
		confirmAlert1.accept();
		
		String text4_1 = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(text4_1);
		
		System.out.println("Confirmation Alert accept done");
		
		Thread.sleep(2000);
		
		//Locate the element and Click - On button click, confirm box will appear
		driver.findElement(By.id("confirmButton")).click();
		
		/* CONFIRMATION POP UP */
		//switch to alert
		Alert confirmAlert2 = driver.switchTo().alert();
		
		//Capture the text
		String text4 = confirmAlert2.getText();
		System.out.println(text4);
		
		Thread.sleep(2000);
		
		//Click on Cancel in popup
		confirmAlert2.dismiss();
		
		String text4_2 = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(text4_2);
		
		System.out.println("Confirmation Alert dismiss done");
		
		Thread.sleep(2000);
		
		//Locate the element and Click - On button click, prompt box will appear
		driver.findElement(By.id("promtButton")).click();
		
		/* PROMPT POP UP */
		//switch to alert
		Alert promptALert = driver.switchTo().alert();
		
		//Capture the text
		String text5 = promptALert.getText();
		System.out.println(text5);
		
		Thread.sleep(2000);
		
		promptALert.sendKeys("SDET");
		
		Thread.sleep(3000);
		
		promptALert.accept();
		
		String text5_1 = driver.findElement(By.id("promptResult")).getText();
		System.out.println(text5_1);
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
