package managers;

import org.openqa.selenium.WebDriver;

import baseClass.BaseDetails;
import pages.LoginPage;
import pages.SignupPage;

public class PageObjectManagers {

	private static PageObjectManagers pageobjectmanager;
	private static LoginPage Loginpagebject;
	private static SignupPage signuppage;
	private WebDriver driver;

	private PageObjectManagers() {

	}

	public PageObjectManagers(WebDriver driver) {

		this.driver = driver;

	}

	public static PageObjectManagers getinstance() {
		PageObjectManagers pageObjectManagerObject = new PageObjectManagers();

		return pageObjectManagerObject;

	}

	public SignupPage getsignuppage() {

	return signuppage = new SignupPage(BaseDetails.driver);

	}

}
