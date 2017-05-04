package aufin.utility.com;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;

import aufin.reposrity.com.Properties;

public class LeadExcel implements Properties{

	@DataProvider(name="Lead")
	public static Object[][] getLoginData() throws Exception {
		 
		  DataDrivenExcel userData = new DataDrivenExcel(
		    TestDataSheet, "Sheet1");
		 
		  ArrayList<Object> dataList = new ArrayList<Object>();
		 
		  int j = 1;// excluding header row
		  int i = j+1;
		  int totalRows = 2;
		  while (i < totalRows) {
		   System.out.println("loginToAppWithAllRoles : line : " + i);
		 
		   Object[] dataLine = new Object[10];
		   dataLine[0] = userData.getCell(i, 0);
		   dataLine[1] = userData.getCell(i, 1);
		   dataLine[2] = userData.getCell(i, 2);
		   dataLine[3] = userData.getCell(i, 3);
		   dataLine[4] = userData.getCell(i, 4);
		   dataLine[5] = userData.getCell(i, 5);
		   dataLine[6] = userData.getCell(i, 6);
		   dataLine[7] = userData.getCell(i, 7);
		   dataLine[8] = userData.getCell(i, 8);
		   dataLine[9] = userData.getCell(i, 9);
		   dataLine[10] = userData.getCell(i, 10);
		   dataLine[11] = userData.getCell(i, 11);
		   dataLine[12] = userData.getCell(i, 12);
		   dataLine[13] = userData.getCell(i, 13);
		  
		   
	 
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

