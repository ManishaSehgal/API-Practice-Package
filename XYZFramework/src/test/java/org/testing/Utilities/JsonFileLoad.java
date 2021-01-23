


package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileLoad {
	
	public static JSONTokener loadJsonFile(String filePathName) throws FileNotFoundException {
		File f = new File(filePathName);
		FileReader fr= new FileReader(f);
		JSONTokener jT = new JSONTokener(fr);
		return jT;
	}
	
	public static String loadJsonObjectFile(String filePathName) throws FileNotFoundException {
		
		JSONTokener jT = JsonFileLoad.loadJsonFile(filePathName);
		JSONObject jsObjData = new JSONObject(jT);
	    return jsObjData.toString();
	}
	
	public static String loadJsonArrayString(String filePathName) throws FileNotFoundException {
		JSONTokener jT = JsonFileLoad.loadJsonFile(filePathName);
		JSONArray jsArrData = new JSONArray(jT);
		return jsArrData.toString();
	}

}

