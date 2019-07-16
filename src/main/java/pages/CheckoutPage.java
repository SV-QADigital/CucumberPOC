package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {

	@FindBy(xpath = "//input[@id='customer.firstName']")
	public static WebElement CustomerFirstName;

	@FindBy(xpath = "//input[@id='customer.lastName']")
	public static WebElement CustomerLastName;

	@FindBy(xpath = "//input[@id='customer.billing.company']")
	public static WebElement BillingcompanyTextbox;

	@FindBy(xpath = "//input[@id='customer.billing.address']")
	public static WebElement BillingadressTextbox;

	@FindBy(xpath = "//input[@id='customer.billing.city']")
	public static WebElement BillingCityDDL;

	@FindBy(xpath = "//input[@id='billingStateProvince']")
	public static WebElement BillingState;

	@FindBy(xpath = "//input[@id='billingPostalCode']")
	public static WebElement BillingPostalcode;

	@FindBy(xpath = "//input[@id='customer.emailAddress']")
	public static WebElement BillingEmailAdress;

	@FindBy(xpath = "//input[@id='customer.billing.phone']")
	public static WebElement BillingPhonenumber;

}
