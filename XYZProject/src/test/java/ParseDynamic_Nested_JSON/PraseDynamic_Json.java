package ParseDynamic_Nested_JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;






public class PraseDynamic_Json {
	
	
	public static void pasreObject(JSONObject jsObj, String key) {
		System.out.println(jsObj.getString(key));
	}
	
	public static void getKey(JSONObject jsObj, String key) throws FileNotFoundException {
		
	   Boolean assertion  = jsObj.has(key);
	   Iterator<?> keys;
	   String temp;
	  
	   
	   if(assertion==false) {
		   //System.out.println(jsObj.getString(key));
		   keys=jsObj.keys();
		   while(keys.hasNext()) {
			 temp=  (String)keys.next();
			 try {
				 if(jsObj.get(temp) instanceof JSONObject) {
					 if(assertion==false) {
						 getKey(jsObj.getJSONObject(temp), key );
					 }	
				 }
				 
				 else if(jsObj.get(temp) instanceof JSONArray) {
					JSONArray jsArr = jsObj.getJSONArray(temp);
					for(int i=0; i<jsArr.length(); i++) {
						String jsArrString= jsArr.get(i).toString();
						JSONObject innerJSON = new JSONObject(jsArrString);
						
						if(assertion==false) {
							getKey(innerJSON, key);
							
						}
						
					}
				 }
				
					 
			 }
			 catch (Exception e) {
				// TODO: handle exception
			}
		   }
			   
		   
	   }
	  
	  else
	  {
		  pasreObject(jsObj, key);
	  }
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("../XYZProject/Data.json");
		FileReader fr = new FileReader(f);
		JSONTokener jT = new JSONTokener(fr);
		JSONObject js = new JSONObject(jT);
		
		getKey(js, "IceCreamName");
		//getKey(js, "houseNo");
		
	}

}
