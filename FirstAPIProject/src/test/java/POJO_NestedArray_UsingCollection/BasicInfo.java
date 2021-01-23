package POJO_NestedArray_UsingCollection;

import java.util.ArrayList;

public class BasicInfo {
	String firstName;
	String lastName;
	String id;
	ArrayList<AddressDetails> addressDetails;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<AddressDetails> getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(ArrayList<AddressDetails> addressDetails) {
		this.addressDetails = addressDetails;
	}

}
