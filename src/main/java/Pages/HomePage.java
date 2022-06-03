package Pages;

import utilities.Locaters.LocateStrategy;
import utilities.Wait.ConditionsEnum;

public class HomePage extends BasePage {

	public HomePage(String testClassName) {
		super(testClassName);
	}

	String signInButton = "Sign in";

	public void pressOnSignInBtn() {

		uiAction.oneClick(signInButton, LocateStrategy.LINKTEXT, ConditionsEnum.presenceOfElementLocated, 20);
	}
}
