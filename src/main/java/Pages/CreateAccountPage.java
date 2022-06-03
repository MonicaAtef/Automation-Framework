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

		uiAction.type(emailTxt, email, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 20);

		uiAction.oneClick(submitCreateAccount, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 20);

	}

}
