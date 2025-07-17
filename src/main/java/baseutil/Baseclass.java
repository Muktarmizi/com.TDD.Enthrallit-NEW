package baseutil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import commonAction.CommonAction;
import pages.LoginPage;

public class Baseclass {
	
	public WebDriver driver;
	public LoginPage login;
	public CommonAction ca;
	
  
	@BeforeClass
	
	public void setup() {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://enthrallit.com/accounts/login/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	allClass();
	
	
	}
	
	public void allClass() {
		
		login = new LoginPage(driver);
		ca= new CommonAction();
		
		
		
		
		
		
		
	}
	
	@AfterClass
	
	public void teardown() {
		driver.quit();
		
	}
	
	public void over() {
		driver.findElement(By.id("abc"));
		
	}

	
	
	
	
	
	
	

}
