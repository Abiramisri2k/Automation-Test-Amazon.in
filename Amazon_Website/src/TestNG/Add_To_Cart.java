package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_To_Cart {
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	public static WebElement searchbox1;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	public static WebElement navbar;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")
	public static WebElement searchelement;
	
	

}
