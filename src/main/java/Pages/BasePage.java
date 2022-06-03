package Pages;

import java.io.IOException;
import org.json.simple.parser.ParseException;

import org.openqa.selenium.remote.RemoteWebDriver;

import Actions.UIActions;
import utilities.JSONLocatersReader;
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
	 public String getLocatorsFromJsonFile(String keyword) throws IOException, ParseException {

	        return JSONLocatersReader.getLocatorsFromJsonFile(keyword, "src/main/resources/Locaters.JSON");
	    }
}
