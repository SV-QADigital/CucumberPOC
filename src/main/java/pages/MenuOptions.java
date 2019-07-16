package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuOptions {
	
	@FindBy(xpath = "(//a[contains(text(),'Handbags')])[1]")
	public static WebElement HandbagMenu;
	
	
	@FindBy(xpath = "(//a[contains(text(),'Beach bags')])[1]")
	public static WebElement BeachBagMenu;
	
	
	@FindBy(xpath = "(//a[contains(text(),'Laptop bags')])[1]")
	public static WebElement LaptopbagMenu;
	
	
	@FindBy(xpath = "(//a[contains(text(),'Bags')])[1]")
	public static WebElement Bags;
	
	
	
}

