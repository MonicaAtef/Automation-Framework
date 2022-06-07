package tests;

import java.net.MalformedURLException;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import actions.BrowserActions;
import readers.ConfigarationReader;

public class BaseTest {

	public String className;
	public String driverName = "";
	public ConfigarationReader Config;

	@BeforeClass
	@Parameters({"driver","grid"})
	public void setup(@Optional String driverName, @Optional Boolean grid,final ITestContext testContext) throws MalformedURLException {
		className = testContext.getAllTestMethods()[0].getTestClass().getName();
		Config = new ConfigarationReader();
		driverName = Config.getDataFromConfig("driver");
		BrowserActions.driverSetup(className, driverName, grid);
	}

	@AfterClass
	void closeDriver() {
		BrowserActions.closeDriver(className);
	}

}
