package utilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {

	public static Map<String,WebDriver> mapper = new HashMap<String,WebDriver>();
	public static WebDriver driver;
	public static void  driverSetup(String classname, String driverName) {

		if (driverName.equalsIgnoreCase("chromeDriver")) {
			WebDriverManager.chromedriver().setup();
			mapper.put(classname,new ChromeDriver());
			driver = mapper.get(classname);

		}
		else if (driverName.equalsIgnoreCase("edgeDriver")) {
			WebDriverManager.edgedriver().setup();
			mapper.put(classname,new EdgeDriver());
			driver = mapper.get(classname);

		}
		else if (driverName.equalsIgnoreCase("firefoxDriver")) {
			WebDriverManager.firefoxdriver().setup();
			mapper.put(classname,new FirefoxDriver());
			driver = mapper.get(classname);

		}
		else if (driverName.equalsIgnoreCase("Headless")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("disable-gpu");	
			mapper.put(classname,new ChromeDriver(chromeOptions));
			driver = mapper.get(classname);

		}
		else
			System.out.println("We don't support this browser");
	}
	public static void navigateToURL(String url) {
		driver.get(url);
	}
	public static void closeDriver(String classname)
	{
		mapper.get(classname).close();
		mapper.remove(classname);
	}
}
