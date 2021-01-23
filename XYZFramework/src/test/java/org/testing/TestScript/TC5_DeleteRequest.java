package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.PropertiesLoad;

import com.jayway.restassured.response.Response;

public class TC5_DeleteRequest {
	
	public void deleteRequest() throws IOException {
		Properties p = PropertiesLoad.loadProperties("../XYZFramework/URI.properties");
		
		HTTP_Methods deleteRequest = new HTTP_Methods(p);
		Response res =deleteRequest.deleteRequest("Employee_URI", "6357003");
	    System.out.println(res.statusLine());
	}

}
