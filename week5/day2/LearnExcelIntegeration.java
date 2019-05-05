package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcelIntegeration {
	public static String[][] readExcel(String fileName) throws InvalidFormatException, IOException {
		XSSFWorkbook workbook = new XSSFWorkbook
				(new File("./data/"+fileName+".xlsx")); //		1. Using file location, navigate and open the workbook
		XSSFSheet worksheet = workbook.getSheetAt(0); 	//		2. Navigate to worksheet         alter: workbook.getSheet("Sheet1")		
		int rowCount = worksheet.getLastRowNum();	   //		3. Determine the number of rows in the sheet      worksheet.getPhysicalNumberOfRows() will get all the rows without ignoring the header row
		System.out.println("Row count "+ rowCount);
		int cellCount = worksheet.getRow(0).getLastCellNum();
		//		4. Determine the number of cells in the row
		System.out.println("Column Count "+ cellCount);
		String[][] data = new String[rowCount][cellCount];		
		for (int i = 1; i <= rowCount; i++) {		  //		5. Iterate and fetch data from Excel
			XSSFRow row = worksheet.getRow(i);
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		workbook.close();								//		6. Close the workbook
		return data;
	}

}
