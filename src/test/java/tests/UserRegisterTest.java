package tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Pages.CreateAccountPage;
import Pages.HomePage;
import utilities.BrowserActions;

public class UserRegisterTest {

	public String className;
	public String driverName;

	@BeforeClass
	@Parameters("driver")
	public void setup(String driverName) {
		className =  "UserRegisterTest";
		driverName = "firefoxDriver";
		BrowserActions.driverSetup(className, driverName);

	}
	@Test
	public void PressOnSignInButtonTest() {
		String url="http://automationpractice.com/index.php";
		BrowserActions.navigateToURL(url);
		HomePage homePage = new HomePage(className);
		homePage.pressOnSignInBtn();
	}
	@Test(dependsOnMethods="PressOnSignInButtonTest")
	public void EnterCreateAccountEmail() {
		String url="http://automationpractice.com/index.php?controller=authentication&back=my-account";
		String email = "m@gamil.com";
		CreateAccountPage createAccount = new CreateAccountPage(className);
		BrowserActions.navigateToURL(url);
		createAccount.enterCreateAccount(email);
	}  
	@AfterClass
	void closeDriver() {
		BrowserActions.closeDriver(className);
	}

}
