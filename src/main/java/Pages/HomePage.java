package Pages;

import org.openqa.selenium.By;

import utilities.UIActions;

public class HomePage  {

	UIActions uiActions ;
	String testClassName;
	public HomePage(String testClassName)
	{
		this.testClassName = testClassName;
		uiActions = new UIActions(testClassName);
	}
   
	
	By signInButton = By.linkText("Sign in");

	public void navigateToHomePage(String url) {
		uiActions.navigateToURL(url);
	}
	public void pressOnSignInBtn() {
		uiActions.oneClick(signInButton);
	}
}
