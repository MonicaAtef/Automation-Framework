package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Actions.BrowserActions;
import utilities.Wait.ConditionsEnum;

public class Locaters {
	WebDriver driver;

	public Locaters(String testClassName) {
		this.driver = BrowserActions.mapper.get(testClassName);
	}

	public enum LocateStrategy {
		XPATH, ID, NAME, LINKTEXT
	}

	public By locatingStratgy(String elementIdentifier, LocateStrategy choice) {
		switch (choice) {
		case XPATH:
			return By.xpath(elementIdentifier);
		case ID:
			return By.id(elementIdentifier);
		case NAME:
			return By.name(elementIdentifier);
		case LINKTEXT:
			return By.linkText(elementIdentifier);
		default:
			System.out.println("Not supporetd");
		}
		return null;
	}

	public WebElement locateElement(String elementlocator, LocateStrategy choice, ConditionsEnum condition, int time) {
		By locatedElement = locatingStratgy(elementlocator, choice);
		new Wait().wait(driver, time, locatedElement, condition);
		return driver.findElement(locatedElement);

	}

	public List<WebElement> locateElements(String elementlocator, LocateStrategy choice, ConditionsEnum condition,
			int time) {
		By locatedElement = locatingStratgy(elementlocator, choice);
		new Wait().wait(driver, time, locatedElement, condition);
		return driver.findElements(locatedElement);

	}
}
