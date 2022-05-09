package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver ldriver) {
		super(ldriver);
	}

	@FindBy(linkText="Sign in") 
	WebElement signInBtn;

	public void pressOnSignInBtn() {
		signInBtn.click();
	}
}
