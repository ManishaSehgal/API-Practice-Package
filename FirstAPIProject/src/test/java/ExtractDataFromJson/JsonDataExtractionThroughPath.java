package ExtractDataFromJson;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;

import com.jayway.restassured.http.ContentType;

public class JsonDataExtractionThroughPath {

	public static void main(String[] args) {
		String collegeName=given().contentType(ContentType.JSON)
				.when().get("http://localhost:3000/CollegeInfo/1")
				.then().extract().path("collegeName");
				
				System.out.println("college name is: "+collegeName);
				
				int cityRanking=given().contentType(ContentType.JSON)
				.when().get("http://localhost:3000/CollegeInfo/1")
				.then().extract().path("cityRanking");
				
				System.out.println("City ranking of college is: "+cityRanking);
				
				ArrayList<String> courseList= given().contentType(ContentType.JSON)
				.when().get("http://localhost:3000/CollegeInfo/1")
				.then().extract().path("courses");
				
				System.out.println("Courses are: ");
				
				//using for loop
				
				  int l = courseList.size();
				  for(int i=0; i<l;i++) {
				  System.out.println("             "+courseList.get(i)); 
				  }
				 
				
				 //using for each loop
				
				  for(String s:courseList)
				  { 
					  System.out.println(s);
				  }
				 
				
			}

	}

