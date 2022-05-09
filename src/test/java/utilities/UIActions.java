package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UIActions {

	public void click(WebElement element, WebDriver driver) {
		Actions action = new Actions(driver);
		try {

			element.click();
			System.out.println("one click");
		} catch (Exception e) {
			System.out.println("need more than one click");
		}
		try {

			action.moveToElement(element).doubleClick();
			System.out.println("double click");
		} catch (Exception e) {
			System.out.println("need more than one click");
		}
		try {
			element.submit();
			System.out.println("submitted");
		} catch (Exception e) {
			System.out.println("Cannot be submiited");
		}
		try {
			element.sendKeys(Keys.ENTER);
			System.out.println("send keys Enter");
		} catch (Exception e) {
			System.out.println("Cannot send Keys");
		}

	}
}
