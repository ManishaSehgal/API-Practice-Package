package org.testing.TestScript;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseCodeValidate;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.FetchAll_IDValues;
import org.testing.Utilities.PropertiesLoad;

import com.jayway.restassured.response.Response;

public class TC3_GetRequest_AllData {
	
	public void testCase3() throws IOException {

		Properties p = PropertiesLoad.loadProperties("../XYZFramework/URI.properties");
		
		HTTP_Methods getRequest_AllData_obj = new HTTP_Methods(p);
		Response res =getRequest_AllData_obj.getRequest_AllData("Employee_URI");
		
		ResponseCodeValidate.validateResponseCode(200, res);
		res.prettyPrint();
		
		ResponseDataValidation.validateResponseData(res, "Rohini", "[4].address.area");
		
		//fetch all ids
		ArrayList<String> all_Ids = FetchAll_IDValues.fetchAllIdValues(res, "id");
		
		//fetch all firstName
		try
		{
			ArrayList<String> all_FirstName = FetchAll_IDValues.fetchAllIdValues(res, "firstName");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
