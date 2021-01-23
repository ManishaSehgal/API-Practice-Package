package exporingGsonLibrary;

import com.google.gson.JsonObject;

public class AnotherGsonExample {

	public static void main(String[] args) {
		

		JsonObject addressObj = new JsonObject();
		addressObj.addProperty("houseNo", "123");
		addressObj.addProperty("sector", "14");
		
		
		JsonObject js = new JsonObject();
		js.addProperty("firstName", "Shivansh");
		js.addProperty("lastName", "Gupta");
		js.add("address", addressObj);
				
		System.out.println(js);
		
		System.out.println(js.getAsJsonObject("address"));
		
		System.out.println(js.get("firstName"));

	}

}
