package stepDefintion;

import org.testng.Assert;

import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.UserRegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;

public class UserRegisteration extends BaseTest{

	HomePage page;
	CreateAccountPage create_Account;
	UserRegisterPage user_Registration;
	
	@Given("^the user in the home page$")
	public void the_user_in_the_home_page() {
		page = new HomePage(driver);
		create_Account= new CreateAccountPage(driver);
		
		//Assert.assertEquals("My Store", driver.getTitle());
		page.pressOnSignInBtn();
		Assert.assertEquals("Login - My Store", driver.getTitle());
		create_Account.enterCreateAccount("monicaatef46@gmail.com");	 
		throw new io.cucumber.java.PendingException();
	}
	@When("^I enter all the info$")
	public void i_enter_all_the_info() {
		user_Registration= new UserRegisterPage(driver);   
		user_Registration.fillUserInfo("meko", "atef",
				"MonicaAtef1997", 0, 0, 0);

		user_Registration.fillUserAddressInfo("Helioplis", "Cairo",
				"Egypt", "Cairo", 0, "255", 0,
				"01278937485", "HIIIIII");
		throw new io.cucumber.java.PendingException();
	}
	@Then("I register successfully")
	public void i_register_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
