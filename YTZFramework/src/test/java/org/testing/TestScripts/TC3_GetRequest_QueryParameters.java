package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3_GetRequest_QueryParameters {
	
	@Test
	public void TC3_getRequestWithQueryParameters() throws IOException {
	 
		Properties p = LoadPropertiesFile.loadProperties("../YTZFramework/Environment.properties");
		String searchKeyValue = TC1_PostRequest.firstNameVal;
		
		HTTP_Methods getRequest = new HTTP_Methods(p);
		
		Response res  = getRequest.getRequestQueryParameters("Employee_URI", "firstName", searchKeyValue);
		System.out.println(res.asString());
		
		StatusCodeValidation.validateStatusCode(res, 200, res.getStatusCode());
		
		
	}

}
