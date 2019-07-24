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
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\amaresh.rout\\eclipse-workspace\\CucumberPOC\\src\\main\\Resouces\\chromedriver.exe");
			BaseDetails.driver= new ChromeDriver();
			BaseDetails.driver.manage().window().maximize();
		}   else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "/src/main/resources/drivers/geckodriver.exe");
			BaseDetails.driver = new FirefoxDriver();
		}

	}

}
