package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	public Properties pro ;

	public ConfigDataProvider() {
		//get file Location 
		File src = new File("src/test/resources/Config.properties");
		try {
			//transform file to bytes format 
			FileInputStream stream = new FileInputStream(src);
			pro = new Properties();
			pro.load(stream);
		} catch (Exception e) {
			System.out.println("Unable to read configration file" + e.getMessage());
		}

	}
	public String getDataFromConfig(String keyToSearch) {
		return pro.getProperty(keyToSearch);
	} 
}
