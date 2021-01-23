package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.PropertiesLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

@Test
public class TC_10_PatchRequest {
	
	public void patchRequest() throws IOException {
		Properties p = PropertiesLoad.loadProperties("../XYZFramework/URI.properties");
		String jsStr ="{\r\n"+
		               "\"firstName\" : \"Nilkamal\" }";
		
		HTTP_Methods patchObj = new HTTP_Methods(p);
		Response res =patchObj.patchRequest("Employee_URI", "1652342", jsStr);
		
		System.out.println(res.statusLine());
		System.out.println("*********************************************");
		System.out.println(res.asString());
		
		
	
				
				
				
	}

}
