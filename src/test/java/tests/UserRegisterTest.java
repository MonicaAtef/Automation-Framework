package tests;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.UserRegisterPage;

public class UserRegisterTest extends BaseTest{
	@Test
	public void UserRegister() {

		HomePage Home_Page = PageFactory.initElements(driver, HomePage.class);
		
		CreateAccountPage Create_Account_Page = PageFactory.initElements(driver, CreateAccountPage.class);
		UserRegisterPage User_Register_Page = PageFactory.initElements(driver, UserRegisterPage.class);

		Home_Page.pressOnSignInBtn();
		Create_Account_Page.enterCreateAccount(excel.getStringData("enterCreateAccount", 0, 0));

		User_Register_Page.fillUserInfo(
				excel.getStringData("UserRigster", 0, 0),
				excel.getStringData("UserRigster",0, 1),
				excel.getStringData("UserRigster", 0, 2),
				(int)Math.round(excel.getNumericData("UserRigster",0, 3)),
				(int)Math.round(excel.getNumericData("UserRigster", 0, 4)),
				(int)Math.round(excel.getNumericData("UserRigster", 0, 5)));
		

		User_Register_Page.fillUserAddressInfo(
				excel.getStringData("UserRigster", 0, 6),
				excel.getStringData("UserRigster", 0, 7),
				excel.getStringData("UserRigster", 0, 8),
				excel.getStringData("UserRigster", 0, 9),
				(int)Math.round(excel.getNumericData("UserRigster",0, 10)),
				excel.getStringData("UserRigster",0, 11),
				(int)Math.round(excel.getNumericData("UserRigster",0, 12)),
				excel.getStringData("UserRigster", 0, 13),
				excel.getStringData("UserRigster", 0, 14));

	}
}
