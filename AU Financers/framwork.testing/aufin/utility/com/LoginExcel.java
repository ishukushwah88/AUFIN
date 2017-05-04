package aufin.utility.com;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;

import aufin.reposrity.com.Properties;

public class LoginExcel implements Properties{

	@DataProvider(name="Login")
	public static Object[][] getLoginData() throws Exception {
		 
		  DataDrivenExcel userData = new DataDrivenExcel(
				  "‪C:/Users/Ishant Kushwaha/Desktop/AUFIN.xlsx", "Sheet1");
		 
		  ArrayList<Object> dataList = new ArrayList<Object>();
		 
		  int j = 1;// excluding header row
		  int i = j+1;
		  int totalRows = 2;
		  while (i < totalRows) {
		   System.out.println("loginToAppWithAllRoles : line : " + i);
		 
		   Object[] dataLine = new Object[2];
		   dataLine[0] = userData.getCell(i, 0);
		   dataLine[1] = userData.getCell(i, 1);
//		   dataLine[2] = userData.getCell(i, 2);
//		   dataLine[3] = userData.getCell(i, 3);
//		 
		   dataList.add(dataLine);
		 
		   i++;
		  }
		 
		  Object[][] data = new Object[dataList.size()][];
		  for (i = 0; i < dataList.size(); i++)
		   data[i] = (Object[]) dataList.get(i);
		 
		  return data;
		 }
	
	@DataProvider(name="invalid")
	public static Object[][] getInValidLoginData() throws Exception {
		 
		  DataDrivenExcel userData = new DataDrivenExcel(
		    "C:/Users/ISHANT/Desktop/test.xls", "Sheet1");
		 
		  ArrayList<Object> dataList = new ArrayList<Object>();
		 
		  int TestCaseHeading = 10;// excluding header row
		  int i = TestCaseHeading+1;
		  int totalRows=17;
		  while (i < totalRows) {
		   System.out.println("loginToApplication : line : " + i);
		 
		   Object[] dataLine = new Object[2];
		   dataLine[0] = userData.getCell(i, 0);
		   dataLine[1] = userData.getCell(i, 1);
//		   dataLine[2] = userData.getCell(i, 2);
//		   dataLine[3] = userData.getCell(i, 3);
//		 
		   dataList.add(dataLine);
		 
		   i++;
		  }
		 
		  Object[][] data = new Object[dataList.size()][];
		  for (i = 0; i < dataList.size(); i++)
		   data[i] = (Object[]) dataList.get(i);
		 
		  return data;
		 }
	
	
}

