package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseCodeValidate;
import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.PropertiesLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC2_GetRequest {
	
	@Test
	public void testCase2() throws IOException {
		Properties p = PropertiesLoad.loadProperties("../XYZFramework/URI.properties");
		String idValueForGet =TC1.idValue;
		
		// hit get request
		HTTP_Methods getRequest = new HTTP_Methods(p);
		Response res =getRequest.getRequest(idValueForGet,"Employee_URI");
		
		ResponseCodeValidate.validateResponseCode(200, res);
		
		System.out.println(res.statusLine());
		System.out.println(res.asString());
		
		
	}

}
