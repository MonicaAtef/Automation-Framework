package pages;

import java.io.IOException;
import org.json.simple.parser.ParseException;

import org.openqa.selenium.remote.RemoteWebDriver;

import actions.UIActions;
import utilities.Locaters;

public class BasePage {
	RemoteWebDriver driver;
	UIActions uiAction ;
	String testClassName;
	Locaters locater;
	public BasePage(String testClassName)
	{
		this.testClassName = testClassName;
		uiAction = new UIActions(testClassName);
		locater = new Locaters (testClassName);
	}
	
}
