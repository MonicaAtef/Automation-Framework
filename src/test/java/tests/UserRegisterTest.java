package tests;


import org.testng.annotations.Test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Pages.HomePage;
import utilities.BrowserActions;

public class UserRegisterTest {

	public String className;
	public String driverName;
	public BrowserActions browserAcrtions = new BrowserActions();

	@BeforeClass
	@Parameters("driver")
	public void setup(String driverName) {
		className =  "UserRegisterTest";
		driverName = "firefoxDriver";
		BrowserActions.driverSetup(className, driverName);

	}
	@Test
	public void HomePageSignIn() {
		String url="http://automationpractice.com/index.php";
		HomePage homePage = new HomePage(className);
		homePage.navigateToHomePage(url);
		homePage.pressOnSignInBtn();
	}
	@AfterClass
	void closeDriver() {
		BrowserActions.closeDriver(className);
	}

}
