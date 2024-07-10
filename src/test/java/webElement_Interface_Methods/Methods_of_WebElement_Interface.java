package webElement_Interface_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_of_WebElement_Interface {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is Launched");
		
		//Maximized the Browser
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is Maximized");
		
		//Load the URL
		driver.get("http://localhost:8888/");
		System.out.println("URL is loaded");
		
		//1.getText()
		String text = driver.findElement(By.xpath("(//div[@class='label'])[1]")).getText();
		System.out.println("Text is : " + text);
		
		//2.getLocation()
		Point location = driver.findElement(By.name("user_name")).getLocation();
		System.out.println("location is : " + location);
		int x = location.getX();	//2.1
		System.out.println("x is : " + x);
		int y = location.getY();	//2.2
		System.out.println("y is : " + y);
		
		//3.getSize()
		Dimension size = driver.findElement(By.name("user_name")).getSize();
		System.out.println("size is : " + size);
		int height = size.getHeight();	//3.1
		System.out.println("height is : " + height);
		int width = size.getWidth();	//3.2
		System.out.println("width is : " + width);
		
		//4.getRect()
		Rectangle rect = driver.findElement(By.id("submitButton")).getRect();
		System.out.println("Rect is : " + rect);
		Dimension dimension = rect.getDimension();
		System.out.println("Dimension is : " + dimension);
		int height1 = rect.getHeight();
		System.out.println("Height is : " + height1);
		int width1 = rect.getWidth();
		System.out.println("Width is : " + width1);
		Point point = rect.getPoint();
		System.out.println("Point is : " + point);
		int x1 = rect.getX();
		System.out.println("X is : " + x1);
		int y1 = rect.getY();
		System.out.println("Y is : " + y1);
		
		//5.getCssValue(String cssPropertyName)
		String cssValue = driver.findElement(By.id("submitButton")).getCssValue("text-align");
		System.out.println("CSS Value is : " + cssValue);
		
		//6.getAriaRole()
		String ariaRole = driver.findElement(By.id("submitButton")).getAriaRole();
		System.out.println("Aria Role is : " + ariaRole);
		String ariaRole1 = driver.findElement(By.name("user_name")).getAriaRole();
		System.out.println("Aria Role is : " + ariaRole1);
		
		//7.getAccessibleName()
		String accessibleName = driver.findElement(By.id("submitButton")).getAccessibleName();
		System.out.println("Accessible Name is : " + accessibleName);
		
		//8.sendKeys()
		driver.findElement(By.name("user_name")).sendKeys("abx");
		
		Thread.sleep(1000);
		
		//9.clear()
		driver.findElement(By.name("user_name")).clear();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		//10.getAttribute()
		String attribute = driver.findElement(By.name("user_name")).getAttribute("type");
		System.out.println("Attribute value is : " + attribute);
		
		//11.getTagName()
		String tagName = driver.findElement(By.name("user_name")).getTagName();
		System.out.println("Tag Name is : " + tagName);
		
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		//12.getShadowRoot()
//		SearchContext shadowRoot = driver.findElement(By.name("user_password")).getShadowRoot();
//		System.out.println("Shadow Root is : " + shadowRoot);
		
		//13.submit()
		driver.findElement(By.id("submitButton")).submit();
		
		System.out.println("Login is successful");
		
		//14.isDisplayed()
		boolean displayed = driver.findElement(By.xpath("//a[text()='Calendar']")).isDisplayed();
		if(displayed == true)
		{
			System.out.println("Yes Calendar is displayed");
			
			//15.click()
			driver.findElement(By.xpath("//a[text()='Calendar']")).click();
			System.out.println("Calendar is opened");
		}
		else
		{
			System.out.println("Not displayed");
		}
		
		//16.isEnabled()
		boolean enabled = driver.findElement(By.xpath("//a[text()='Contacts']")).isEnabled();
		if(enabled == true)
		{
			System.out.println("Yes Contacts is enabled");
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			System.out.println("Contacts is opened");
		}
		else
		{
			System.out.println("Not Enabled");
		}
		
		//17.isSelected()
		boolean selected = driver.findElement(By.xpath("//a[text()='Products']")).isSelected();
		if(selected == true)
		{
			System.out.println("Yes Products is selected");
			driver.findElement(By.xpath("//a[text()='Products']")).click();
			System.out.println("Products is opened");
		}
		else
		{
			System.out.println("Not Selected");
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Calendar']")).click();
		
		//18.getDomAttribute()
		String domAttribute = driver.findElement(By.xpath("//a[text()='Calendar']")).getDomAttribute("class");	
		System.out.println("DOM Attribute is : " + domAttribute);
		
		//19.getDomProperty()
		String domProperty = driver.findElement(By.xpath("//a[text()='Calendar']")).getDomProperty("hidden");
		System.out.println("DOM Property is : " + domProperty);
		
		driver.quit();
		System.out.println("Browser is Closed");
		
		
		
	}
}
