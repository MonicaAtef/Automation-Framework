package Actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilities.Locaters;
import utilities.Locaters.LocateStrategy;
import utilities.Wait.ConditionsEnum;

public class UIActions2 {

	WebDriver driver;
	Locaters locater;

	public UIActions2(String testClassName) {
		this.driver = BrowserActions.mapper.get(testClassName);
		locater = new Locaters(testClassName);
	}

	public enum SelectType {
		TEXT, VALUE, INDEX;
	}

	public void oneClick(String element, LocateStrategy strategy, ConditionsEnum condition, int time) {
		WebElement currentElement = locater.locateElement(element, strategy, condition, time);
		currentElement.click();
	}

	public void doubleClick(String element, LocateStrategy strategy, ConditionsEnum condition, int time) {
		Actions seleniumActions = new Actions(driver);
		WebElement currentElement = locater.locateElement(element, strategy, condition, time);
		seleniumActions.moveToElement(currentElement).doubleClick().perform();

	}

	public void dropDownSelect(String element, SelectType selectType, String option, LocateStrategy strategy,
			ConditionsEnum condition, int time) {

		WebElement currentElement = locater.locateElement(element, strategy, condition, time);
		Select selectObject = new Select(currentElement);

		switch (selectType) {
		case TEXT:
			selectObject.selectByVisibleText(option);
			break;
		case VALUE:
			selectObject.selectByValue(option);
			break;
		case INDEX:
			int index = Integer.parseInt(option);
			selectObject.selectByIndex(index);
			break;
		}

	}

	public void selectRadioButtonValue(String element, String valueToBeSelected, LocateStrategy strategy,
			ConditionsEnum condition, int time) {
		List<WebElement> elements = locater.locateElements(element, strategy, condition, time);
		for (WebElement ref : elements) {
			if (ref.getText().equalsIgnoreCase(valueToBeSelected)) {
				ref.click();
				break;
			}
		}
	}

	public void selectCheckboxes(String element, String checks, LocateStrategy strategy, ConditionsEnum condition,
			int time) {
		List<WebElement> elements = locater.locateElements(element, strategy, condition, time);
		String[] checkArray = checks.split(",");
		for (String str : checkArray) {
			for (WebElement ref : elements) {
				if (ref.getText().equalsIgnoreCase(str)) {
					ref.click();
					break;
				}
			}
		}
	}

	public void type(String element, String text, LocateStrategy strategy, ConditionsEnum condition, int time) {
		WebElement currentElement = locater.locateElement(element, strategy, condition, time);
		currentElement.clear();
		currentElement.sendKeys(text);
	}

	public String getText(String element, LocateStrategy strategy, ConditionsEnum condition, int time) {
		WebElement currentElement = locater.locateElement(element, strategy, condition, time);
		return currentElement.getText();
	}

}
