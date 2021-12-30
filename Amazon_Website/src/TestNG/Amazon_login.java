package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon_login
{

	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	public static WebElement signinbtn1;
	
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	public static WebElement email1;
	
	@FindBy(id="continue")
	public static WebElement continue1btn;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	public static WebElement password1;
	
	@FindBy(id="signInSubmit")
	public static WebElement signInSubmitbtn;
	
	
	
}
