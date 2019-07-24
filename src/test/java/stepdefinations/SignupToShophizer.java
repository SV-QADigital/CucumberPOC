package stepdefinations;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseDetails;
import baseClass.BrowsersDetails;
import baseClass.DBConnection;
import baseClass.PropertyfileReader;
//import baseClass.URL;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManagers;
import pages.SignupPage;
import utils.SelectDropDownList;

public class SignupToShophizer {

	SignupPage signuppage;
	PageObjectManagers pageobjectmanager;

	@Given("^I opened the browser$")
	public void i_opened_the_browser() throws MalformedURLException {
		new BrowsersDetails().setupbrowser("chrome");
		pageobjectmanager = PageObjectManagers.getinstance();
	}

	@When("^i enter the URL of the application$")
	public void i_enter_the_URL_of_the_application() throws FileNotFoundException, IOException {
		System.out.println("Entering url");
		BaseDetails.driver.get(PropertyfileReader.propertyreader(
				"C:\\Users\\amaresh.rout\\eclipse-workspace\\CucumberPOC\\src\\main\\propertyfiles\\ApplicationDetails.properties",
				"URL"));
	}

	@Then("^I should see the Login page of the application$")
	public void i_should_see_the_Login_page_of_the_application() {

	}

	@When("^I  navigate to the signup page$")
	public void i_navigate_to_the_signup_page() throws InterruptedException {

		System.out.println("Performing actions");
		pageobjectmanager.getsignuppage();
		Thread.sleep(10000);
		SignupPage.MyAccountMenu.click();
		SignupPage.RegisterLink.click();

	}

	@When("^I enter valid personal information$")
	public void i_enter_valid_personal_information() {
		DBConnection dbConnection = new DBConnection();
		SignupPage.FirstnameSignUP.sendKeys(dbConnection.DBconnect("FirstName"));
		SignupPage.LastnameSignUP.sendKeys(dbConnection.DBconnect("Lastname"));
		new SelectDropDownList().SelectUsingVisibleValue(SignupPage.SelectCountryDDL, dbConnection.DBconnect("Country"));
		SignupPage.SignupState.sendKeys(dbConnection.DBconnect("State"));
		SignupPage.SignupEmail.sendKeys(dbConnection.DBconnect("Email"));
		SignupPage.password.sendKeys(dbConnection.DBconnect("Password"));
		SignupPage.Repeatpassword.sendKeys(dbConnection.DBconnect("RepeatPassword"));

	}

	@When("^click on 'create an account' button$")
	public void click_on_create_an_account_button() {
		SignupPage.createaccountbutton.click();

	}

	@Then("^I should see the application should logged in\\.$")
	public void i_should_see_the_application_should_logged_in() {

	}

	@When("^I enter invalid  firname  \"([^\"]*)\"$")
	public void i_enter_invalid_firname(String arg1) {
		SignupPage.FirstnameSignUP.sendKeys("!@!@!");
	}

	@When("^I enter invalid  lastname \"([^\"]*)\"$")
	public void i_enter_invalid_lastname(String arg1) {
		SignupPage.LastnameSignUP.sendKeys("!!@!");
	}

	@When("^I enter country value$")
	public void i_enter_country_value() {
		new SelectDropDownList().SelectUsingVisibleValue(SignupPage.SelectCountryDDL, "India");
	}

	@When("^I enter state value$")
	public void i_enter_state_value() {
		SignupPage.SignupState.sendKeys("Odisha");
	}

	@When("^I enter Sign-in information$")
	public void i_enter_Sign_in_information() {
		SignupPage.createaccountbutton.click();

	}

	@Then("^Application should give error prompt on firstname,lastname fields\\.$")
	public void application_should_give_error_prompt_on_firstname_lastname_fields() {
		System.out.println("error");

	}

}
