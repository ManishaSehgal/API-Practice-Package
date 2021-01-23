package org.testing.Twitter;

import static com.jayway.restassured.RestAssured.*;



import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;


public class GetTwitterAPI {

	public static void main(String[] args) {
		/*
		 * String consumer_key = "dz4aDF9BxoDO2cy0Fo07uAflZ"; String consumer_secret =
		 * "xc7wC0FgWcqUbtX5b57gQnsDiBQ4gJuA4pecLeuPkKBZGfHzfe"; String token_key =
		 * "1272872420299292674-DWxUWU7beo04jFfYFyLBJN4moTa0dd"; String token_secret=
		 * "AAAAAAAAAAAAAAAAAAAAALJ2GwEAAAAAb1uviWFz8naHAZy7Tzd%2Bwi4Clls%3DRsyoQb5R9P1zDUx4Vx5Klx5I4XKPPUx4qBBw9AkcfVPWNrYrrk";
		 */
		
		String bearerToken = "AAAAAAAAAAAAAAAAAAAAALJ2GwEAAAAAb1uviWFz8naHAZy7Tzd%2Bwi4Clls%3DRsyoQb5R9P1zDUx4Vx5Klx5I4XKPPUx4qBBw9AkcfVPWNrYrrk";
		//RestAssured.baseURI = "https://api.twitter.com/1.1/statuses";
		
	   Response res=given().contentType(ContentType.JSON)
		.auth().oauth2(bearerToken)
		.queryParam("ids", "1228393702244134912,1227640996038684673,1199786642791452673")
		.when()
		.get("https://api.twitter.com/2/tweets");
	   
	     
	   
	   System.out.println(res.getStatusLine());
	   System.out.println("*******************************************");
	   System.out.println(res.asString());

	}

}
