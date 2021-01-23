package POJO_NestedArray;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class NestArray_UsingPOJO {

	public static void main(String[] args) {
		AddressDetails[] homeAddress = new AddressDetails[2];
		
		homeAddress[0] = new AddressDetails();
		homeAddress[0].setHouseNo("154");
		homeAddress[0].setStreetNo("6");
		homeAddress[0].setSector("14");
		homeAddress[0].setCity("Karnal");
		
		homeAddress[1]= new AddressDetails();
		homeAddress[1].setHouseNo("155");
		homeAddress[1].setStreetNo("7");
		homeAddress[1].setSector("15");
		homeAddress[1].setCity("Karnal");
		
		CompanyAddress[] companyAddress = new CompanyAddress[2];
		companyAddress[0] = new CompanyAddress();
		companyAddress[0].setPlotNo("67");
		companyAddress[0].setStreetName("Jankidas Marg");
		companyAddress[0].setArea("Narsinghpur");
		companyAddress[0].setPinCode("121001");
		
		companyAddress[1] = new CompanyAddress();
		companyAddress[1].setPlotNo("67");
		companyAddress[1].setStreetName("Jankidas Marg");
		companyAddress[1].setArea("Narsinghpur");
		companyAddress[1].setPinCode("121001");
		
		AddressArray addressArr = new AddressArray();
		addressArr.setAddressDetails(homeAddress);
		addressArr.setCompanyAddresses(companyAddress);
		
		BasicInfo basicInfoObj = new BasicInfo();
		basicInfoObj.setFirstName("Tushar");
		basicInfoObj.setLastName("Sharama");
		basicInfoObj.setId("111");
		basicInfoObj.setAddArr(addressArr);
		
		
	   Response res= given().contentType(ContentType.JSON).body(basicInfoObj).log().all()
	    .when().post("http://localhost:3000/employeesInfo");
	   
	   System.out.println("****************************************************");
	   System.out.println(res.getStatusLine());
	

	}

}
