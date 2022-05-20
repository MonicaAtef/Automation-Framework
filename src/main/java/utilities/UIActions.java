package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class UIActions {

	WebDriver driver;
	public UIActions(String testClassName) {
		this.driver = BrowserActions.mapper.get(testClassName);
	}
	public enum SelectType {
		TEXT, VALUE,INDEX;
	}

	public WebElement locateElement(By elementlocator) {
		return driver.findElement(elementlocator);


	}

	public void oneClick(By element) {
		WebElement currentElement = locateElement(element);
		currentElement.click();
	}
	public void doubleClick(By element) {
		Actions seleniumActions = new Actions(driver);
		WebElement currentElement = locateElement(element);
		seleniumActions.moveToElement(currentElement).doubleClick().perform();

	}
	public void dropDownSelect(By element, SelectType selectType,String option) {

		WebElement currentElement = locateElement(element);
		Select selectObject = new Select(currentElement);

		switch(selectType){
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
	public void type(By element,String text) {
		WebElement currentElement = locateElement(element);
		currentElement.clear();
		currentElement.sendKeys(text);
	}
	public void navigateToURL(String url) {
		driver.get(url);
	}
	
}

