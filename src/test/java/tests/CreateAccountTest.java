package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.CreateAccountPage;
import utilities.BrowserActions;

public class CreateAccountTest {
	public String className;
	public String driverName;
	public BrowserActions browserAcrtions = new BrowserActions();

	@BeforeClass
	@Parameters("driver")
	public void setup(String driverName) {
		className =  "CreateAccountTest";
		//driverName = "edgeDriver";
		BrowserActions.driverSetup(className, driverName);
	}
	@Test
	public void HomePageSignIn() {
		String url="http://automationpractice.com/index.php?controller=authentication&back=my-account";
		String email = "m@gamil.com";
		CreateAccountPage createAccount = new CreateAccountPage(className);
		createAccount.navigateToCreateAccount(url);
		createAccount.enterCreateAccount(email);
	}
	@AfterClass
	void closeDriver() {
		BrowserActions.closeDriver(className);
	}

}
