package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends PageBase {

	public CreateAccountPage(WebDriver ldriver) {
		super(ldriver);
	}

	@FindBy(id="email_create") 
	WebElement createAccountTxt;

	@FindBy(id="SubmitCreate") 
	WebElement createAccountBtn;
	
	public void enterCreateAccount(String email) {
		createAccountTxt.sendKeys(email);
		createAccountBtn.click();

	}

}
