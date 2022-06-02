package tests;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Actions.BrowserActions;
import utilities.ConfigDataProvider;
import utilities.ExcelDataProvider;

public class BaseTest {

	public String className;
	public String driverName="";
	public ConfigDataProvider Config;

	@DataProvider(name ="ExcelData")
	public Object[][] getDataExcel(ITestContext context) throws IOException 
	{	
		String sheetNameToParse = context.getAttribute("sheetName").toString();
		ExcelDataProvider usersData = new ExcelDataProvider();
		return usersData.getExcelData(sheetNameToParse);
	}
	@BeforeClass
	@Parameters("driver")
	public void setup(@Optional String driverName) 
	{
		Config = new ConfigDataProvider();
		className =  "UserRegisterTest";
		driverName = Config.getDataFromConfig("driver");
		BrowserActions.driverSetup(className,driverName );

	}
	@AfterClass
	void closeDriver() 
	{
		BrowserActions.closeDriver(className);
	}

}
