package stepDefintion;

import java.net.MalformedURLException;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import actions.BrowserActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import readers.ConfigarationReader;

public class TestBase extends AbstractTestNGCucumberTests {
	public String className;
	public String driverName;
	public ConfigarationReader Config;

	@Before
	@Parameters("driver")
	public void setup(@Optional String driverName) throws MalformedURLException {
		Config = new ConfigarationReader();
		className = "UserRegisterTest";
		driverName = Config.getDataFromConfig("driver");
		BrowserActions.driverSetup(className, driverName,false);
		BrowserActions.navigateToURL("http://automationpractice.com/index.php");
	}

	@After
	void closeDriver() {
		BrowserActions.closeDriver(className);
	}

}
