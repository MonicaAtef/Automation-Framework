package utilities;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONLocatersReader {

	private static JSONArray getAllUsersLocators(String JSON_PATH) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(JSON_PATH);
        //Read JSON file
        Object obj = jsonParser.parse(reader);
        JSONArray usersList = (JSONArray) obj;

        return usersList;
    }
	 public static String getLocatorsFromJsonFile(String keyword, String path) throws IOException, ParseException {
	        JSONArray usersList = getAllUsersLocators(path);
	        JSONObject jsonObject = (JSONObject) usersList.get(0);
	        return (String) jsonObject.get(keyword);

	    }
}
