package pageTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseutil.Baseclass;

public class LoginPageTest extends Baseclass{
	
	@Override
	public void over() {
		driver.findElement(By.id("abcd"));  //Override
		
	}
	
	
	
	@Test (priority =1,invocationCount = 2,timeOut=10,groups="smoke")
	public void loginPageTest() {
		
		login.login(ca);
		
	}
	
	
	

}
