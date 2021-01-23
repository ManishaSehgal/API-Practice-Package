package org.testing.Utilities;

import java.util.ArrayList;

import org.json.JSONArray;

import com.jayway.restassured.response.Response;

public class FetchAll_IDValues {

	public static ArrayList<String> fetchAllIdValues(Response res, String key){
		
		ArrayList<String> allIdValues_arr = new ArrayList<String>();
		
		JSONArray jsArr = new JSONArray(res.asString());
		int size = jsArr.length();
	
		
		for(int i=0; i<size; i++) {
			String valueOfkey = jsArr.getJSONObject(i).getString(key);
			allIdValues_arr.add(valueOfkey);
			
		}
		System.out.println(allIdValues_arr);
			
		return allIdValues_arr;
		
	}
}

