package TestCases;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import aufin.utility.com.Log;
import aufin.utility.com.LoginExcel;

public  class LoginModule extends aufin.appmethods.com.LoginMethod {

	@Test(dataProvider = "Login", dataProviderClass = LoginExcel.class)
	public void validLogin(String username, String password) {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Valid Login TestCase Start Here:");

		Log.info("Enter Username");
		Enter_txtName(username);
		
		Log.info("Enter username is :" + " " + username);

		Log.info("Enter Password");
		Enter_txtPassword(password);
	
		Log.info("Entered Passowrd is :"+" "+ password);
		
		Log.info("Validate Login Button gets displayed");
		
		
		

	}
	
	
//	public void loginwithBranchManager(){
//		DOMConfigurator.configure("log.xml");
//		Log.startTestCase("Valid Login TestCase Start Here:");
//
//		Log.info("Enter Username");
//		Enter_txtName("branch manager 123");
//		
//		Log.info("Enter username is :");
//
//		Log.info("Enter Password");
//		Enter_txtPassword("acid_qa");
//	
//		Log.info("Entered Passowrd is :");
//		
//		Log.info("Validate Login Button gets displayed");
//		
//	}
//	


}
