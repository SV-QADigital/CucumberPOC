package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownList {
	
	public void SelectUsingVisibleValue(WebElement element,String visibleValue) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleValue);
		
	}

}
