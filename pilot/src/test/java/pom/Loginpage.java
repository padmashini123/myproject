package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	final String s = "username";
	@FindBy(id=s)
	private WebElement username;
	@FindBy(name = "pwd")
	private WebElement password;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	public Loginpage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
		System.out.println("constructor stmt");
		
	}
	public void passUsernameValue() {
		username.sendKeys("admin");
		
	}
	public void passPasswordValue() {
		password.sendKeys("manager");
	
}
	public void clickLogin() {
	login.click();
	}
	public WebElement getUsername() {
		return username;
	}
	public void setusername(WebElement username) {
		this.username = username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public String getS() {
		return s;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	}
	
