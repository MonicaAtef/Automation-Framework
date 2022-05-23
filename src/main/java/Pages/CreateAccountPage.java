package Pages;

import org.openqa.selenium.By;

import utilities.UIActions;
import utilities.Wait.ConditionsEnum;

public class CreateAccountPage  {

	UIActions uiActions ;
	String testClassName;
	
	By emailCreateText = By.id("email_create"); 
	By submitCreateAccount = By.id("SubmitCreate");  
	
	public CreateAccountPage(String testClassName)
	{
		this.testClassName = testClassName;
		uiActions = new UIActions(testClassName);
	}
	public void enterCreateAccount(String email) {
		uiActions.type(emailCreateText, email,ConditionsEnum.ElementToBeClickable,10);
		uiActions.oneClick(submitCreateAccount,ConditionsEnum.ElementToBeClickable,10);

	}

}
