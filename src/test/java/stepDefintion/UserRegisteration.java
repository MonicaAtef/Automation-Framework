package stepDefintion;

import pages.CreateAccountPage;
import pages.HomePage;
import pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegisteration extends TestBase {

	HomePage page;
	CreateAccountPage create_Account;
	RegisterPage Register;

	@Given("^the user in the home page$")
	public void the_user_in_the_home_page() {
		page = new HomePage(className);
		create_Account = new CreateAccountPage(className);
		page.pressOnSignInBtn();
		create_Account.enterCreateAccount("monicaatef46@gmail.com");
	}

	@When("^I enter all the info$")
	public void i_enter_all_the_info() {
		Register = new RegisterPage(className);
		Register.userRegister("Mrs.", "Monica", "Atef", "MonicaAtef1996",
				"0", "0", "0");

		// Register.fillUserAddressInfo("Helioplis", "Cairo", "Egypt", "Cairo", 0,
		// "255", 0, "01278937485", "HIIIIII");
	}

	@Then("I register successfully")
	public void i_register_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
