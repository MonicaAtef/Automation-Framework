package tests;

import org.testng.annotations.Test;

import org.testng.Reporter;
import actions.BrowserActions;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.RegisterPage;
import utilities.DataProviderClass;

public class UserRegisterTest extends BaseTest {

	@Test
	public void PressOnSignInButtonTest() {
		String url = Config.getDataFromConfig("applicationURL");
		BrowserActions.navigateToURL(url);
		HomePage homePage = new HomePage(className);
		homePage.pressOnSignInBtn();
		String tabName = "account";
		Reporter.getCurrentTestResult().getTestContext().setAttribute("sheetName", tabName);
	}

	@Test(dependsOnMethods = "PressOnSignInButtonTest", dataProvider = "ExcelData",dataProviderClass=DataProviderClass.class)
	public void EnterCreateAccountEmail(String email){
		CreateAccountPage createAccount = new CreateAccountPage(className);
		createAccount.enterCreateAccount(email);
		createAccount.submitButton();
		String tabName = "UserData";
		Reporter.getCurrentTestResult().getTestContext().setAttribute("sheetName", tabName);
	}

	@Test(dependsOnMethods = "EnterCreateAccountEmail", dataProvider = "ExcelData",dataProviderClass=DataProviderClass.class)
	public void EnterUserData(String gender, String firstName, String lastName, String password, String daysIndex,
			String month, String yearIndex, String addressFName, String addressLName, String address, String city,
			String stateIndex, String postalCode, String country, String phone, String alias) {
		RegisterPage regPage = new RegisterPage(className);
		regPage.userRegister(gender, firstName, lastName, password, daysIndex, month, yearIndex);
		regPage.addressFill(addressFName, addressLName, address, city, stateIndex, postalCode, country, phone, alias);
	}
}