package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.Loginpage;

public class Testlogin {
	WebDriver driver;
	static
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	}
	@Test
	public void validateHomePageTitle() throws InterruptedException 
	{
		driver = new FirefoxDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		Loginpage login = new Loginpage(driver);
		System.out.println(login);
		//driver.navigate().refresh();
		
		System.out.println(login);
		login.passUsernameValue();
		Thread.sleep(5000);
		login.passPasswordValue();
		login.clickLogin();
	}
	

}
