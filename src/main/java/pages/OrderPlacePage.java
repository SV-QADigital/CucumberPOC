package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class OrderPlacePage {
	/*
	 * public static By xpathByText(String tag, String value) { return
	 * By.xpath("//+'"+tag+"'+[text()='"+value+"']"); }
	 * 
	 * public static void main(String[] args) {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\amaresh.rout\\eclipse-workspace\\CucumberPOC\\src\\main\\Resouces\\chromedriver.exe"
	 * ); WebDriver d = new ChromeDriver();
	 * d.get("http://demo.shopizer.com:8080/shop"); d.findElement(xpathByText("a",
	 * "Handbags")).click(); }
	 */

	@FindBy(xpath = "(//a[@href='/shop/product/vintage-courier-bag.html'])[1]")
	public static WebElement Orderitem;

	@FindBy(xpath = "(//button[contains(text(),'Add to cart')]")
	public static WebElement Addtocartbutton;

	@FindBy(xpath = "//span[@class='lnr lnr-cart']")
	public static WebElement ShoppingcartIcon;

	@FindBy(xpath = "//a[contains(text(),'Checkout')]")
	public static WebElement checkoutoption;

	@FindBy(xpath = "//a[contains(text(),'Continue shopping')]")
	public static WebElement ContinueshoppingButton;

	@FindBy(xpath = "//a[contains(text(),'Recalculate')]")
	public static WebElement RecalculateButton;

	@FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
	public static WebElement ProceedtoCheckoutButton;

}
