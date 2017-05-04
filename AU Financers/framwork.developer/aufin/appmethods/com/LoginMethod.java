package aufin.appmethods.com;

import aufin.common.com.Connectivity;
import aufin.pom.com.LoginPage;

public abstract class LoginMethod extends Connectivity{
	

	
	public static void Enter_txtName(String username){
		LoginPage.txt_username.sendKeys(username);
	}
	
	public static void Enter_txtPassword(String password){
		LoginPage.txt_password.sendKeys(password);
	}
	
	public static void click_LoginButton(){
		LoginPage.btn_login.click();
	}
	
	public static void click_LoginOutButton(){
		LoginPage.btn_logOut.click();
	}
	
	

}
