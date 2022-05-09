package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	public  static void captureScreenShoot(WebDriver driver) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileHandler.copy(src, new File("./screenshots/Login.png"));
		} catch (IOException e) {
			
		     System.out.println("Cannot Capture screenshot"+ e.getMessage());	
		}
		
	}

}
