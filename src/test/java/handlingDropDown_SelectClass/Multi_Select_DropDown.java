package handlingDropDown_SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://demoqa.com/select-menu");
		
		//Locate and Capture the WebElement - cars
		WebElement fourWheeler = driver.findElement(By.id("cars"));
		
		//Create an Object of Select Class
		Select select = new Select(fourWheeler);
		
		//isMultiple()
		boolean isMultiple = select.isMultiple();
		if (isMultiple == true) {
			System.out.println("It is Multi select dropdown");
		} else {
			System.out.println("It is single select dropdown");
		}
		
		//selectByIndex()
		select.selectByIndex(3);
		System.out.println("select by index is done");
		
		Thread.sleep(2000);
		
		//selectByValue()
		select.selectByValue("opel");
		System.out.println("select by value is done");
		
		Thread.sleep(2000);
		
		//selectByVisible()
		select.selectByVisibleText("Volvo");
		System.out.println("select by text is done");
		
		Thread.sleep(2000);
		
		//deselectByValue()
		select.deselectByValue("opel");
		System.out.println("deselect by the value is done");
		
		//getOptions()
		List<WebElement> getAllOptions = select.getOptions();
		System.out.println("***All Options***");
		for (WebElement element : getAllOptions) {
			System.out.println(element.getText());
		}
		
		//getAllSelectedOptions()
		List<WebElement> getSelectedOptions = select.getAllSelectedOptions();
		System.out.println("***All Selected Options***");
		for (WebElement element : getSelectedOptions) {
			System.out.println(element.getText());
		}
		
		//getFirstSelectedOption()
		WebElement getFirstOptions = select.getFirstSelectedOption();
		System.out.println("***First Selected Option***");
		System.out.println(getFirstOptions.getText());
		
		//getWrappedElement()
		WebElement getWrapped = select.getWrappedElement();
		System.out.println("***Wrapped Element***");
		System.out.println(getWrapped.getText());
		
		driver.quit();
	}
	
}
