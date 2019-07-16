package baseClass;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.cfg.BaseSettings;

public class BrowsersDetails {


//Application launching according to the browser details filled by the user
	public void setupbrowser(String Browser) {
		if (Browser.equalsIgnoreCase("chrome")) {
			//ChromeOptions option = new ChromeOptions();
		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\amaresh.rout\\Desktop\\chromedriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	//	capabilities.setPlatform(Platform.LINUX);
			//BaseDetails.driver = new ChromeDriver();
	 //driver = new RemoteWebDriver(new URL("http://172.25.220.189:4444/wd/hub"),capabilities);
			BaseDetails.driver.manage().window().maximize();
		} else if (Browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.chrome.driver", "/src/main/resources/drivers/geckodriver.exe");
			BaseDetails.driver= new FirefoxDriver();
		}

	}

}
