package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	public  static void captureScreenShoot(WebDriver driver) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileHandler.copy(src, new File("./screenshot/ " + getCurrentDateTime() + ".png"));
		} catch (IOException e) {
			
		     System.out.println("Cannot Capture screenshot"+ e.getMessage());	
		}
		
	}
	public static String getCurrentDateTime() {
		DateFormat CustomFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return CustomFormat.format(currentDate);
		
	}

}
