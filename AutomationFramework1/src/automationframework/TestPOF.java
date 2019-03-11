package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestPOF {

	
	static WebDriver driver;
	
	@FindBy(how=How.ID, using="nav-link-accountList")
	static WebElement sign_in;
	
	@FindBy(how=How.ID, using="account")
	static WebElement txt_account;
	
	@FindBy(how=How.ID, using="ap_email")
	static WebElement txtbx_username;
	
	@FindBy(how=How.ID, using="ap_password")
	static WebElement txtbx_password;
	
	@FindBy(how=How.ID, using="signInSubmit")
	static WebElement btn_submit;
	
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, TestPOF.class);
		
//		driver.findElement(By.id("account")).click();
//		driver.findElement(By.id("log")).sendKeys("TestUser");
//		driver.findElement(By.id("pwd")).sendKeys("test@123");	
//		driver.findElement(By.id("login")).click();
		
		sign_in.click();
		txtbx_username.sendKeys("TestUser");
		txtbx_password.sendKeys("test@123");
		btn_submit.click();
		
		System.out.println("Successfully logged in..");
		
		driver.close();
		
	}
	
	
	
}
