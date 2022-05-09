package tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.BrowserFactory;
import utilities.ConfigDataProvider;
import utilities.ExcelDataProvider;
import utilities.Helper;

public class BaseTest extends AbstractTestNGCucumberTests {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;

	@BeforeSuite
	public void setUpData() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.driverSetup(driver, config.getBrowser());
		BrowserFactory.getURL(driver,config.getApplicationURL());
	}
	@AfterClass
	public void tearDown() {
		BrowserFactory.CloseDriver(driver);
	}
	@AfterMethod
	public void takeScreenShotOnFaliure(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenShoot(driver);
		}
	}


}