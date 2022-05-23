package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilities.Wait.ConditionsEnum;


public class UIActions {

	WebDriver driver;
	public UIActions(String testClassName) {
		this.driver = BrowserActions.mapper.get(testClassName);
	}
	public enum SelectType {
		TEXT, VALUE,INDEX;
	}

	public WebElement locateElement(By elementlocator,ConditionsEnum condition,int time) {
		new Wait().wait( driver, time, elementlocator,condition);
		return driver.findElement(elementlocator);
		
	}
	public void oneClick(By element,ConditionsEnum condition,int time) {
		WebElement currentElement = locateElement(element,condition,time);
		currentElement.click();
	}
	public void doubleClick(By element,ConditionsEnum condition,int time) {
		Actions seleniumActions = new Actions(driver);
		WebElement currentElement = locateElement(element,condition,time);
		seleniumActions.moveToElement(currentElement).doubleClick().perform();

	}
	public void dropDownSelect(By element, SelectType selectType,String option,ConditionsEnum condition,int time) {

		WebElement currentElement = locateElement(element,condition,time);
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
	public void type(By element,String text,ConditionsEnum condition,int time) {
		WebElement currentElement = locateElement(element,condition,time);
		currentElement.clear();
		currentElement.sendKeys(text);
	}
	public String getText(By element,ConditionsEnum condition,int time) {
		WebElement currentElement = locateElement(element,condition,time);
		return currentElement.getText();		
	}  

}

