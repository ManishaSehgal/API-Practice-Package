package org.testing.TestScript;

import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.testing.Utilities.JsonDataUpdateUsingOrgJSON;
import org.testing.Utilities.JsonFileLoad;

import com.github.fge.jsonschema.main.cli.Main;



public class TC_6 {
	
	public static void main(String[] args) throws FileNotFoundException { 
		
 
    String s= JsonFileLoad.loadJsonObjectFile("../XYZFramework/src/test/java/org/testing/Resources/dummyData.json");
    s=JsonDataUpdateUsingOrgJSON.updateJsonData(s, "phoneNumbers", "type", "android");
    s = JsonDataUpdateUsingOrgJSON.updateJsonData(s,"phoneNumbers" , "number", "93873635");
    System.out.println(s);
  }
}
