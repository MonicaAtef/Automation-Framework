package utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public XSSFWorkbook wb;

	public ExcelDataProvider() {

		//get file Location 
		File src = new File("./testData/AutomationPracticeData.xlsx");
		try {
			//transform file to bytes format 
			FileInputStream stream = new FileInputStream(src);
			//workbook is first layer of excel sheet
			wb = new XSSFWorkbook(stream);
		} catch (Exception e) {
			System.out.println("Unable to read excel file" +e.getMessage());
		}

	}
	//get data in form of string
	public String getStringData(String sheetName,int rowIndex,int colIndex) {
		String output = wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getRichStringCellValue().getString();
		System.out.println(output);
		return	wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getRichStringCellValue().getString();
	}
	public String getStringData(int sheetIndex,int rowIndex,int colIndex) {
		return	wb.getSheetAt(sheetIndex).getRow(rowIndex).getCell(colIndex).getRichStringCellValue().toString();
	}
	//get data in form of double
	public int getNumericData(String sheetName,int rowIndex,int colIndex) {
		return (int)Math.round(wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue());
	}
	public int getNumericData(int sheetIndex,int rowIndex,int colIndex) {
		return	(int)Math.round(wb.getSheetAt(sheetIndex).getRow(rowIndex).getCell(colIndex).getNumericCellValue());
	}

}
