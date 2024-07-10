package handlingDropDown_SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximized the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://demoqa.com/select-menu");
		
		//Locate and capture the WebElement - Old Style Select Menu
		WebElement oldStyleSelectMenu = driver.findElement(By.id("oldSelectMenu"));
		
		//Create an Object of Select Class
		Select select = new Select(oldStyleSelectMenu);
		
		/*Select Method*/
		//selectByIndex()
		select.selectByIndex(4);
		System.out.println("Index 4 is selectd");
		
		Thread.sleep(2000);
		
		//selectByValue()
		select.selectByValue("6");
		System.out.println("Value 6 is selected");
		
		Thread.sleep(2000);
		
		//selectByVisibleText()
		select.selectByVisibleText("Magenta");
		System.out.println("Visible Text Magenta is selected");
		
		Thread.sleep(2000);
		
		//getOptions()
		List<WebElement> allOptions = select.getOptions();
		int count=0;
		for (WebElement element : allOptions) {
			count++;
			System.out.println(element.getText());
		}
		System.out.println("total options are : " + count);
		
		//isMultiple()
		boolean isMultiple = select.isMultiple();
		if (isMultiple == true) {
			System.out.println("It is multi select dropdown");
		} else {
			System.out.println("It is single select dropdown");
		}
		
		driver.quit();
	}
}
