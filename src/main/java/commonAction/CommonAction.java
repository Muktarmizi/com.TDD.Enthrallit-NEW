package commonAction;

import org.openqa.selenium.WebElement;

import reporting.JavaLog;

public class CommonAction {

	
	public void clickmethod(WebElement element) {
		
		element.click();
		JavaLog.mylog(element + ">>>>>>> clicked");
		
	}
	
	public void inputText(WebElement element,String value) {
		element.sendKeys(value);
		JavaLog.mylog(element + ">>>>>>>" + value);
		
		
		
		
		
	}
	
}
