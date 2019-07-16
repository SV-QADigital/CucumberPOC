package stepdefinations;

import baseClass.BaseDetails;
import baseClass.BrowsersDetails;

public class testclass {
	
	public static void main(String[] args) {
	
		new BrowsersDetails().setupbrowser("chrome");
		BaseDetails.driver.get("http://WWW.softvision.com");
		
		
	}

}
