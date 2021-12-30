package TestNG;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class Amazon_createAccount
{

	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	public static WebElement signinbtn;

	@FindBy(xpath="//*[@id=\"createAccountSubmit\"]")
	public static WebElement createAccountSubmit;

	@FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	public static WebElement customername;

	@FindBy(xpath="//*[@id=\"ap_phone_number\"]")
	public static WebElement phonenumber;

	@FindBy(xpath="//*[@id=\"ap_password\"]")
	public static WebElement password;

	@FindBy(xpath="//*[@id=\"continue\"]")
	public static WebElement continuebtn;


}




