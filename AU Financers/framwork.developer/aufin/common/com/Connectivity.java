package aufin.common.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import aufin.pom.com.LeadPage;
import aufin.pom.com.LoginPage;
import aufin.reposrity.com.Properties;

public class Connectivity implements Properties {

	public static WebDriver driver = null;

	@BeforeSuite
	public void launchBrowser() {
		System.setProperty(chromeDriver, chromepaths);
		driver = new ChromeDriver();
		driver.get(webSiteURL);
		driver.manage().window().maximize();
		new LoginPage(driver);
		new LeadPage(driver);

	}

}
