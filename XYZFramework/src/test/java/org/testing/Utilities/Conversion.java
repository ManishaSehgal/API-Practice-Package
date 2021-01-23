package org.testing.Utilities;


import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.XML;

public class Conversion {
	
	public static String XmlToJsonConverter() {
		
		String xmlData = 
				"<firstName>Vidit</firstName>\r\n" + 
				"<lastName>Kumar</lastName>\r\n" + 
				"<designation>Team Lead</designation>\r\n" + 
				"<id>833432</id>" ;
		
		JSONObject jsObj = XML.toJSONObject(xmlData);
		System.out.println(jsObj.toString());
		return jsObj.toString();
		
	}

	public static void jsonToXMLConversion(String jsonData) throws FileNotFoundException {
		JSONObject obj = new JSONObject(jsonData);
		String xml_data = XML.toString(obj);
		System.out.println(xml_data);
	}
}
