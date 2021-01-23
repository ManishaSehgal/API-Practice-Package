package org.testing.TestScript;

import java.io.FileNotFoundException;

import org.testing.Utilities.JsonDataUpdateUsingOrgJSON;
import org.testing.Utilities.JsonFileLoad;

public class TC_7 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		 String s= JsonFileLoad.loadJsonObjectFile("../XYZFramework/src/test/java/org/testing/Resources/dummyData.json");
		    s=JsonDataUpdateUsingOrgJSON.updateJsonData(s, "phoneNumbers", "landline", "011-376353");
		    System.out.println(s);
	}

}
