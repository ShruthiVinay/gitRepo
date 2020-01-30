package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(name="user_name")
	private WebElement unTB;
	
	@FindBy(name="user_password")
	private WebElement pwTB;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserName() {
		return this.unTB;
	}
	
	public WebElement getPassword() {
		return this.pwTB;
	}
	
	public WebElement clickLogin() {
		return this.loginBtn;
	}

}
