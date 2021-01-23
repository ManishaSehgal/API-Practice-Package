package org.testing.TestScripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.RestAssured;

public class TC6_DynamicValueAllocation {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("");
		FileReader fr = new FileReader(f);
		JSONTokener jT = new JSONTokener(fr);
		
		JSONObject obj = new JSONObject(jT);
		String data  = obj.toString();
		
		data = data.replaceAll(Pattern.quote("{{id}}"), "092822");
		data =data.replaceAll(Pattern.quote("{{firstName}}"), "Suresh");
		
		

	}

}
