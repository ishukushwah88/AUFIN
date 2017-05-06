package scrmpro.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="uclogin_tbUserName")
	public static WebElement txt_username;
	
	@FindBy(id="uclogin_tbPassword")
	public static WebElement txt_password;
	
	@FindBy(id="uclogin_btnLogin")
	public static WebElement btn_login;
	
	@FindBy(id="lnkBtnSales")
	public static WebElement link_Sales;
	
	@FindBy(xpath="//*[@id='lnkBtnSalesModule']")
	public static WebElement link_SalesModule;


}
