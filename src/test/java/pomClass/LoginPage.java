package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This POM class is for Login Page
 * POM class does not have main method
 * @author Sandeep Anand
 */

public class LoginPage {
	
	@FindBy(name = "username")
	private WebElement userNameTextField;
	
	@FindBy(name = "password")
	private WebElement passwordTextField;
	
	@FindBy(name = "submit")
	private WebElement submitButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //to initialize webelement in pom class
	}

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	//Business Library
	/**
	 * This is Business Library which is use to login the page
	 * @param USERNAME
	 * @param PASSWORD
	 */
	public void LoginToApp(String USERNAME, String PASSWORD)
	{
		userNameTextField.sendKeys(USERNAME);
		passwordTextField.sendKeys(PASSWORD);
		submitButton.click();
	}
	
	
	
}
