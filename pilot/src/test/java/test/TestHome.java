package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.Loginpage;

public class TestHome {
	WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	}
	@Test
	public void LaunchBrowxer()
	{
		driver = new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		Loginpage login = new  Loginpage(driver);
		System.out.println(login);
		driver.navigate().refresh();
		System.out.println(login);
		login.getUsername();
		login.getPassword();
		login.getLogin();
	}
		
}

