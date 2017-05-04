package aufin.utility.com;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDrivenExcel {

	private Workbook wb;
	 private Sheet ws;
	 
	 /**
	  * Opens a excel sheet
	  * 
	  * @param fileName
	  *            name of the file where you want data
	  * @param sheetName
	  *            name of the sheet in the excel file
	  */
	 public DataDrivenExcel(String fileName, String sheetName) {
	  try {
	   if (fileName.indexOf("xlsx") < 0) { //for .xls format
	    wb = new HSSFWorkbook(new FileInputStream(new File(fileName)));
	    ws = wb.getSheet(sheetName);
	   } else { //for .xlsx format
	    wb = new XSSFWorkbook(fileName);
	    ws = (XSSFSheet) wb.getSheet(sheetName);
	   }
	  } catch (IOException io) {
	   System.err.println("Invalid file '" + fileName
	     + "' or incorrect sheet '" + sheetName
	     + "', enter a valid one");
	  }
	 }
	 
	 /**
	  * Gets a cell value from the opened sheet
	  * 
	  * @param rowIndex
	  *            starting with 0 index
	  * @param columnIndex
	  *            starting with 0 index
	  * @return
	  */
	 public String getCell(int rowIndex, int columnIndex) {
	  Cell cell = null;
	  try {
	    cell = ws.getRow(rowIndex).getCell(columnIndex);
	  } catch (Exception e) {
	   System.err.println("The cell with row '" + rowIndex + "' and column '"
	     + columnIndex + "' doesn't exist in the sheet");
	  }
	  return new DataFormatter().formatCellValue(cell);
	 }
}
