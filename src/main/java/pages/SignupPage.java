package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseDetails;

public class SignupPage {

	@FindBy(xpath = "//*[@class='click_menu']")
	public static WebElement MyAccountMenu;

	@FindBy(xpath = "//a[@id='registerLink' and contains(text(),'Register')]")
	public static WebElement RegisterLink;

	@FindBy(xpath = "//input[@id='firstName']")
	public static WebElement FirstnameSignUP;

	@FindBy(xpath = "//input[@id='lastName']")
	public static WebElement LastnameSignUP;

	@FindBy(xpath = "//select[@id='registration_country']")
	public static WebElement SelectCountryDDL;

	@FindBy(xpath = "//input[@id='hidden_zones']")
	public static WebElement SignupState;

	@FindBy(xpath = "//input[@id='emailAddress']")
	public static WebElement SignupEmail;

	@FindBy(xpath = "//input[@id='password']")
	public static WebElement password;

	@FindBy(xpath = "//input[@id='passwordAgain']")
	public static WebElement Repeatpassword;

	@FindBy(xpath = "//button[contains(text(),'Create an account')]")
	public static WebElement createaccountbutton;

	public SignupPage(WebDriver driver) {

		PageFactory.initElements(BaseDetails.driver, this);

	}

	public void ClickMyAccount() {
		MyAccountMenu.click();
	}

	public void ClickRegisterLink() {
		RegisterLink.click();
	}

}
