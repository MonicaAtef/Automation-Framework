package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver  driverSetup(WebDriver driver, String driverName) {
		if (driverName.equals("chromeDriver")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		else if (driverName.equals("edgeDriver")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		else if (driverName.equals("firefoxDriver")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		else
			System.out.println("We don't support this browser");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		return driver;
	}

	public static void getURL(WebDriver driver, String URL) {
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	public static void CloseDriver(WebDriver driver) {
		driver.quit();
	}
}
