package actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {

	public static Map<String,WebDriver> mapper = new HashMap<String,WebDriver>();
	public static WebDriver driver;
	public static void  driverSetup(String className, String driverName,Boolean grid) throws MalformedURLException {

		if (driverName.equalsIgnoreCase("chromeDriver")) {
			if(Boolean.TRUE.equals(grid)) {
				addRemote(className, driverName);
			}
			else
			{
			WebDriverManager.chromedriver().setup();
			mapper.put(className,new ChromeDriver());
			driver = mapper.get(className);
			}
		}
		else if (driverName.equalsIgnoreCase("edgeDriver")) {
			if(Boolean.TRUE.equals(grid)) {
				addRemote(className, driverName);
			}
			else
			{
			WebDriverManager.edgedriver().setup();
			mapper.put(className,new EdgeDriver());
			driver = mapper.get(className);
			}
		}
		else if (driverName.equalsIgnoreCase("firefoxDriver")) {
			if(Boolean.TRUE.equals(grid)) {
				addRemote(className, driverName);
			}
			else
			{
			WebDriverManager.firefoxdriver().setup();
			mapper.put(className,new FirefoxDriver());
			driver = mapper.get(className);
			}
		} 
		else if (driverName.equalsIgnoreCase("Headless")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("disable-gpu");	
			mapper.put(className,new ChromeDriver(chromeOptions));
			driver = mapper.get(className);

		}
		else
			System.out.println("We don't support this browser");
	}
	public static void addRemote(String className, String driverName) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		if(driverName.equalsIgnoreCase("chromeDriver")) {
			ChromeOptions options = new ChromeOptions();
			options.merge(caps);
			mapper.put(className,
					new RemoteWebDriver( new URL("http://localhost:4444/"),options));
			driver = mapper.get(className);
		}
		else if (driverName.equalsIgnoreCase("edgeDriver")) {
			FirefoxOptions options = new FirefoxOptions();
			options.merge(caps);
			mapper.put(className,
					new RemoteWebDriver( new URL("http://localhost:4444/"),options));
			driver = mapper.get(className);
		}
		else if (driverName.equalsIgnoreCase("firefoxDriver")) {
			EdgeOptions options = new EdgeOptions();
			options.merge(caps);
			mapper.put(className,
					new RemoteWebDriver( new URL("http://localhost:4444/"),options));
			driver = mapper.get(className);
		}
	}
	public static void navigateToURL(String url) {
		driver.get(url);
	}
	public static void closeDriver(String classname)
	{
		mapper.get(classname).quit();
		mapper.remove(classname);
	}
}
