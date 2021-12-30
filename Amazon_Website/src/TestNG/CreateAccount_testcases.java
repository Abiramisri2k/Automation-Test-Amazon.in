package TestNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateAccount_testcases {
	@Test
	public void createAccount() {
		
		System.setProperty("webdriver.chrome.driver","D:\\java\\Amazon_Website\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		String oldwindow=driver.getWindowHandle();

		PageFactory.initElements(driver,Amazon_createAccount.class );

		Amazon_createAccount.signinbtn.click();		
		Amazon_createAccount.createAccountSubmit.click();	
		Amazon_createAccount.customername.sendKeys("abce");	
		Amazon_createAccount.phonenumber.sendKeys("9876545671");
		Amazon_createAccount.password.sendKeys("1234545");
		Amazon_createAccount.continuebtn.click();

		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		driver.navigate().to("https://www.amazon.in/");

		PageFactory.initElements(driver,Amazon_login.class );

		Amazon_login.signinbtn1.click();
		Amazon_login.email1.sendKeys("adc@gmail.com");
		Amazon_login.continue1btn.click();
		Amazon_login.password1.sendKeys("123456");
		Amazon_login.signInSubmitbtn.click();

		driver.navigate().to("https://www.amazon.in/");	
		
		PageFactory.initElements(driver,Add_To_Cart.class );
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Add_To_Cart.searchbox1.sendKeys("harry potter books set");
		
		Add_To_Cart.navbar.click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Add_To_Cart.searchelement.click();

		Set<String> handles = driver.getWindowHandles();

		for (String newpage : handles) {

			driver.switchTo().window(newpage);
		}
		driver.findElement(By.id("add-to-cart-button")).click();

}
}
