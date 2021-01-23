package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseCodeValidate;
import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.GenerateRandomString;
import org.testing.Utilities.JsonFileLoad;
import org.testing.Utilities.JsonVariableReplacement;
import org.testing.Utilities.PropertiesLoad;

import com.jayway.restassured.response.Response;

public class TC4_PutRequest {
	
	public void testCase4() throws IOException
	{
		Properties p = PropertiesLoad.loadProperties("../XYZFramework/URI.properties");
		String bodyDataForPut = JsonFileLoad.loadJsonObjectFile("../XYZFramework/src/test/java/org/testing/Resources/PutBodyData.json");
		String idValueForPut = TC1.idValue;
		
		String updatedBodyData=JsonVariableReplacement.replaceVariableInJson(bodyDataForPut, "idValue", idValueForPut);
		//System.out.println(updatedBodyData);
		
		String firstName=GenerateRandomString.generateRandomString(7);
		String newBodyData = JsonVariableReplacement.replaceVariableInJson(updatedBodyData, "firstNameValue", firstName);
		System.out.println(newBodyData);
		
		HTTP_Methods putRequest = new HTTP_Methods(p);
		Response res =putRequest.putRequest(newBodyData, idValueForPut, "Employee_URI");
		ResponseCodeValidate.validateResponseCode(200, res);		
	}

}
