package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadJsonFile {
	
	public static String loadJsonFile(String filePathName) throws FileNotFoundException {
		
		File f = new File(filePathName);
		FileReader fr = new FileReader(f);
		JSONTokener jsT = new JSONTokener(fr);
		JSONObject jsObj = new JSONObject(jsT);
		
		return jsObj.toString();
	}

}