 package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LocatorReader {
	
	private JSONObject locators;
	
	public LocatorReader(String filePath)
	{
		JSONParser parser = new JSONParser();
		try {
			locators = (JSONObject) parser.parse(new FileReader(filePath));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}	
			
	}
	
	public String getLoctorType(String key)
	{
		JSONObject locator = (JSONObject) locators.get(key);
		return (String) locator.get("type");
		
	}
	
	public String getLoctorValue(String key)
	{
		JSONObject locator = (JSONObject) locators.get(key);
		return (String) locator.get("value");
		
	}
	

}
