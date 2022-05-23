package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public enum ConditionsEnum{
		presenceOfElementLocated,
		ElementToBeClickable,
		invisibilityOfAllElements
		
	}
	public void wait(WebDriver driver,int time, By element, ConditionsEnum condition) {
		switch (condition) {

		case presenceOfElementLocated:
			new WebDriverWait(driver, Duration.ofSeconds(time))
					.until(ExpectedConditions.presenceOfElementLocated(element));
							break;
		case ElementToBeClickable:
			new WebDriverWait(driver, Duration.ofSeconds(time))
					.until(ExpectedConditions.elementToBeClickable(element));
			break;
		case invisibilityOfAllElements:
			new WebDriverWait(driver, Duration.ofSeconds(time))
					.until(ExpectedConditions.invisibilityOfElementLocated(element));
			break;
		default:
			System.out.println("Later");

		}

	}

}
