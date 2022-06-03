package stepDefintion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Actions.BrowserActions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.ConfigDataProvider;

public class TestBase extends AbstractTestNGCucumberTests {
	public String className;
	public String driverName;
	public ConfigDataProvider Config;

	@BeforeClass
	@Parameters("driver")
	public void setup(@Optional String driverName) {
		Config = new ConfigDataProvider();
		className = "UserRegisterTest";
		driverName = Config.getDataFromConfig("driver");
		BrowserActions.driverSetup(className, driverName);
		BrowserActions.navigateToURL("http://automationpractice.com/index.php");
	}

	@AfterClass
	void closeDriver() {
		BrowserActions.closeDriver(className);
	}

}
