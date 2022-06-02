package stepDefintion;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Actions.BrowserActions;
import Actions.SeleniumGridBrowserActions;
import Pages.CreateAccountPage;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class UserRegisteration extends AbstractTestNGCucumberTests{

	WebDriver driver;

	@BeforeClass
	public void setup() throws MalformedURLException {
		String driverName="chome";
		BrowserActions.driverSetup(className,driverName);
	}

	HomePage page;
	CreateAccountPage create_Account;

	@Given("^the user in the home page$")
	public void the_user_in_the_home_page() {
		page = new HomePage(className);
		create_Account= new CreateAccountPage(className);

		//Assert.assertEquals("My Store", driver.getTitle());
	//	BrowserActions.navigateToURL(url);
		page.pressOnSignInBtn();
		//Assert.assertEquals("Login - My Store", driver.getTitle());
		create_Account.enterCreateAccount("monicaatef46@gmail.com");	 
		throw new io.cucumber.java.PendingException();
	}
	@When("^I enter all the info$")
	public void i_enter_all_the_info() {
		//user_Registration= new UserRegisterPage(driver);   
		//	user_Registration.fillUserInfo("meko", "atef",
		//	"MonicaAtef1997", 0, 0, 0);

		//user_Registration.fillUserAddressInfo("Helioplis", "Cairo",
		//		"Egypt", "Cairo", 0, "255", 0,
		//		"01278937485", "HIIIIII");
		//throw new io.cucumber.java.PendingException();
		throw new io.cucumber.java.PendingException();
	}
	@Then("I register successfully")
	public void i_register_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@AfterClass
	void closeDriver() {
		BrowserActions.closeDriver(className);
	}
}
