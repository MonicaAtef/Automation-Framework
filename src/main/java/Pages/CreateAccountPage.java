package Pages;

import utilities.Locaters.LocateStrategy;
import utilities.Wait.ConditionsEnum;

public class CreateAccountPage extends BasePage {

	public CreateAccountPage(String testClassName) {
		super(testClassName);
	}

	String emailTxt = "email_create";
	String submitCreateAccount = "SubmitCreate";

	public void enterCreateAccount(String email) {

		uiActions2.type(emailTxt, email, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 20);

		uiActions2.oneClick(submitCreateAccount, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 20);

	}

}
