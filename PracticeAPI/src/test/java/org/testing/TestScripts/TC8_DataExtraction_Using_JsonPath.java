package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC8_DataExtraction_Using_JsonPath {
	
public static void main(String[] args) {
    
	Response res = given().contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/employeesInfo/");

	//getting firstName of particular record
	
	String firstName= res.then().extract().jsonPath().get("[3].firstName");
	//String firstName= res.then().extract().path("[3].firstName");
	System.out.println(firstName);
	
	//get all Ids
	 System.out.println("*********************************************");
     ArrayList<String> idList = res.then().extract().jsonPath().get("id");
     int length= idList.size();
     try {
     for(String idValue: idList) {
    	 System.out.println(idValue);
     }
	 }
	 
	 catch (Exception e) {
		// TODO: handle exception
	}
     
     
     
   //name of last 2 elements
     System.out.println("**********Last two names*******************");
   		ArrayList<String> nameList = res.then().extract().jsonPath().get("firstName");
   		int sizeNameList = nameList.size();
   		try {
   		for(int i=sizeNameList-1; i>=sizeNameList-2; i--) {
   		System.out.println( nameList.get(i));
   		}
   		}
   		catch (Exception e) {
			// TODO: handle exception
		}
   		
   		
   	 //name of first two elements
   		System.out.println("************first two names********************");
   		ArrayList<String> nameList2 = res.then().extract().jsonPath().get("firstName");
   	//	int sizeNameList2 = nameList2.size();
   		try {
   		for(int i=0; i<=1; i++) {
   		System.out.println( nameList2.get(i));
   		}
   		}
   		catch (Exception e) {
   		// TODO: handle exception
   	}
  
}
}

     


