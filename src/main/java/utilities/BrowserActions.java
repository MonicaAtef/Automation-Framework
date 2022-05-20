package utilities;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {

	public static HashMap<String,WebDriver> mapper = new HashMap<String,WebDriver>();
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
		else
			System.out.println("We don't support this browser");
	}
	public static void closeDriver(String classname)
	{
		driver.quit();
		mapper.remove(classname);
	}
}
