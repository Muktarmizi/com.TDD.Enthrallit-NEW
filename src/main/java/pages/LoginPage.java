package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonAction.CommonAction;

import static commonAction.CommonAction.*;



public class LoginPage {
	
	
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@id='emails']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@id='login']")
	private WebElement LoginButton;
	
	
	public void login(CommonAction ca) {
		
		ca.inputText(Email, "mizimuktar0@gmail.com"); // customize method.
		Password.sendKeys("Password$1"); 
		ca.clickmethod(LoginButton);
		
	}
	
	
	
	
   

}
