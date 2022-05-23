package Pages;

import org.openqa.selenium.By;

import utilities.UIActions;
import utilities.Wait.ConditionsEnum;

public class HomePage  {

	UIActions uiActions ;
	String testClassName;
	public HomePage(String testClassName)
	{
		this.testClassName = testClassName;
		uiActions = new UIActions(testClassName);
	}
   
	
	By signInButton = By.linkText("Sign in");
	public void pressOnSignInBtn() {
		uiActions.oneClick(signInButton,ConditionsEnum.ElementToBeClickable,10);
	}
}
