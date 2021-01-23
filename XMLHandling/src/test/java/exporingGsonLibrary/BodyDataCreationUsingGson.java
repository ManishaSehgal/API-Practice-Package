package exporingGsonLibrary;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BodyDataCreationUsingGson {

	public static void main(String[] args) {
		
		String bodyData ="{\"firstName\" : \"Mithun\",\r\n" + 
				" \"lastName\" : \"Sharma\",\r\n" + 
				" \"id\" : \"28265\"\r\n" + 
				"}";
		
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		
		Gson gson=builder.create();
		
		ABC obj = gson.fromJson(bodyData, ABC.class);
		System.out.println(gson.toJson(obj ));
	}
}
