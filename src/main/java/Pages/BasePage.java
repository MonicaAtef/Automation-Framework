package Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import Actions.UIActions2;
import utilities.Locaters;

public class BasePage {
	RemoteWebDriver driver;
	UIActions2 uiActions2 ;
	String testClassName;
	Locaters locater;
	public BasePage(String testClassName)
	{
		this.testClassName = testClassName;
		uiActions2 = new UIActions2(testClassName);
		locater = new Locaters (testClassName);
	}
}
