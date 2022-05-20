package Pages;

import org.openqa.selenium.By;

import utilities.UIActions;

public class CreateAccountPage  {

	UIActions uiActions ;
	String testClassName;
	public CreateAccountPage(String testClassName)
	{
		this.testClassName = testClassName;
		uiActions = new UIActions(testClassName);
	}
   
	
	By emailCreateText = By.id("email_create"); 
	By submitCreateAccount = By.id("SubmitCreate"); 
	
	public void navigateToCreateAccount(String ur) {
		uiActions.navigateToURL(ur);
	}
	public void enterCreateAccount(String email) {
		uiActions.type(emailCreateText, email);
		uiActions.oneClick(submitCreateAccount);

	}

}
