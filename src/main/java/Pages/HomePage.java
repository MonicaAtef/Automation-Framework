package Pages;

import utilities.Locaters.LocateStrategy;
import utilities.Wait.ConditionsEnum;

public class HomePage extends BasePage {

	public HomePage(String testClassName) {
		super(testClassName);
	}

	String signIn = "Sign in";

	public void pressOnSignInBtn() {

		uiActions2.oneClick(signIn, LocateStrategy.LINKTEXT, ConditionsEnum.presenceOfElementLocated, 20);
	}
}
