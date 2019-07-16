package hooks;

import baseClass.BaseDetails;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Applicationhooks {
	
	@Before
	public void start()
	{
		
	}
	
	
	
	@After()
	public void Teardown()
	{
	//BaseDetails.driver.close();
	}
}
