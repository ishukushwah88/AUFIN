package aufin.common.com;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends Connectivity {

	public void ImplicityWait(int timeinsec) {
		driver.manage().timeouts().implicitlyWait(timeinsec, TimeUnit.SECONDS);
	}

	public void ExplicityWait(int time) {

		WebDriverWait wait = new WebDriverWait(driver, time);

	}

	public void TakeScreenshots() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile
			// //method
			FileUtils.copyFile(src, new File("C:/selenium/error.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void Datepicker(By locator, String col) {
		WebElement dateWidget = driver.findElement(locator);
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns) {
			// Select 13th Date
			if (cell.getText().equals(col)) {
				cell.findElement(By.linkText(col)).click();
				break;
			}
		}
	}
	
	public void downscroll(){
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	
	public void uploadIage(WebElement e){
	
		WebElement fileInput = e;
		fileInput.sendKeys("‪C:\\Users\\admin\\Desktop\\d1.pdf");
		
	}
	
	
	public void WelComeNote(){
		JOptionPane.showOptionDialog(null, "Automation Script Developed By: Ishant","WelCome", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
		
	}
}
