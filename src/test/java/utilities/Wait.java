package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public void wait(WebDriver driver, int time, By element, String condition) {
		switch (condition) {

		case "presenceOfElementLocated":
			new WebDriverWait(driver, Duration.ofSeconds(time))
					.until(ExpectedConditions.presenceOfElementLocated(element));
			break;
		case "invisibilityOf":
			new WebDriverWait(driver, Duration.ofSeconds(time))
					.until(ExpectedConditions.invisibilityOf((WebElement) element));
			break;
		case "invisibilityOfAllElements":
			new WebDriverWait(driver, Duration.ofSeconds(time))
					.until(ExpectedConditions.invisibilityOfAllElements((WebElement) element));
			break;
		default:
			System.out.println("Later");

		}

	}

}
