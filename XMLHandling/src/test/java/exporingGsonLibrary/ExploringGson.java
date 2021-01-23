package exporingGsonLibrary;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class ExploringGson {
	
	public static void main(String[] args) {
		String bodyData ="{\"firstName\" : \"Mukesh\",\r\n" + 
				" \"lastName\" : \"Chauhan\",\r\n" + 
				" \"id\" : \"28265\"\r\n" + 
				"}";
		
	  GsonBuilder gsonBuilder = new GsonBuilder();
	  gsonBuilder.setPrettyPrinting();
	  Gson gsonObj =gsonBuilder.create();
	  
	  
	  ABC obj = gsonObj.fromJson(bodyData, ABC.class);
	  System.out.println(gsonObj.toJson(obj));// This line is important
	  
	  
	  
	}

}
