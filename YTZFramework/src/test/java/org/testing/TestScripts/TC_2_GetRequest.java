package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

@Test
public class TC_2_GetRequest {
	
	public void TC2_GetRequest() throws IOException {
		Properties p = LoadPropertiesFile.loadProperties("../YTZFramework/Environment.properties");
		
		String idValue = TC1_PostRequest.idValue;
		
		HTTP_Methods get_Request = new HTTP_Methods(p);
		Response res =get_Request.getRequest("Employee_URI", idValue);
		
		System.out.println(res.asString());
		StatusCodeValidation.validateStatusCode(res, 200, res.getStatusCode());
		
		
	}

}
