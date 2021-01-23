package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDataUpdateUsingOrgJSON {
	
	public static String updateJsonData(String data, String arrKey, String searchKey, String replaceValue) {
		
		JSONObject jsObj = new JSONObject(data);
		JSONArray phoneNumArr = jsObj.getJSONArray(arrKey);
		int l = phoneNumArr.length();
		
		for(int i=0; i<l; i++) {
			JSONObject insideArrJs = phoneNumArr.getJSONObject(i);
			insideArrJs.put(searchKey, replaceValue);
		}
		
		return jsObj.toString();
				
	}

}
