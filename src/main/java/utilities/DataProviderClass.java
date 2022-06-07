package utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import readers.ExcelReader;

public class DataProviderClass {
	@DataProvider(name = "ExcelData")
	public Object[][] getDataExcel(ITestContext context) throws IOException {
		String sheetNameToParse = context.getAttribute("sheetName").toString();
		ExcelReader usersData = new ExcelReader();
		return usersData.getExcelData(sheetNameToParse);
	}

}
