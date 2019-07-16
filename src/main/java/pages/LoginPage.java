package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath = "//a[@id='registerLink' and contains(text(),'Sign in')]")
	public static WebElement Signin;
	
	@FindBy(xpath = "//input[@id='signin_userName']")
	public static WebElement signinemail;
	
	
	@FindBy(xpath = "//input[@id='signin_password']")
	public static WebElement signinPassword;
	
	
	

}
