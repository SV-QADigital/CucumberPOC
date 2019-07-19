package baseClass;

import dataprovider.ConfigFileReader;
import enums.DriverType;

public class Testprop {

	public static void main(String[] args) {
	
		ConfigFileReader config= new ConfigFileReader();
		DriverType browser = config.getBrowser();
		System.out.println(browser);
		
		
		

	}

}
